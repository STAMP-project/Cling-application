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
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) 'a', (int) (byte) 10, (int) '4', (int) (byte) 1, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
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
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) '4', (int) (byte) 0, 7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-TW" + "'", str1, "zh-TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_TW" + "'", str2, "zh_TW");
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "ja_JP");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "ja_JP");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "ja_JP");
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coordinated Universal Time" + "'", str1, "Coordinated Universal Time");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTime0.toString("zh_TW", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localTime1.getValue(53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.Chronology chronology8 = dateTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((int) (short) 1, 1, 52, 52, 0, (int) (short) 1, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        java.lang.String str7 = localDateTime6.toString();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2017-02-21T14:53:41.457" + "'", str7, "2017-02-21T14:53:41.457");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = property1.setCopy("Coordinated Universal Time", locale3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Coordinated Universal Time\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"zh-TW\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds(10);
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale6.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localTime2.toString("zh-TW", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(39);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(39222286, (-1), (int) (short) 1, (int) (short) 100, 59, 10, (int) (byte) 100, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        java.lang.Class<?> wildcardClass6 = chronology5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Chronology chronology2 = dateTime0.getChronology();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = chronology2.get(readablePeriod3, (long) 53621236, (long) 48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDateTime0.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.Date date3 = localDate2.toDate();
        int int4 = date3.getMinutes();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        java.util.Date date8 = localDate7.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        java.util.Date date12 = localDate11.toDate();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 100, dateTimeZone14);
        java.util.Date date16 = localDate15.toDate();
        boolean boolean17 = date12.after(date16);
        boolean boolean18 = date8.before(date12);
        java.lang.Object obj19 = date12.clone();
        boolean boolean20 = date3.equals(obj19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) '4', 14, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(0);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis(8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime5.withHourOfDay(39222234);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39222234 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate.Property property6 = localDate4.era();
        java.util.Date date7 = localDate4.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate4.withDayOfMonth(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Mon Feb 09 00:00:00 UTC 1970");
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        int int2 = localDateTime0.getDayOfYear();
        int int3 = localDateTime0.getMillisOfDay();
        int int4 = localDateTime0.getSecondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = localDateTime0.getField(0);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.minusHours(0);
        java.util.Locale locale11 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localTime8, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53624000 + "'", int3 == 53624000);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 44 + "'", int4 == 44);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeZone0.getOffset((int) '#', (int) 'a', (int) (short) 100, 53623891, 53621236, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(2);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate2.withDayOfMonth(39222493);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39222493 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 100, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(39);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 10, chronology6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = calendar1.getMaximum((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withCenturyOfEra(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField10 = localDateTime6.getField(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("minutes", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder8 = builder4.setDate((int) (byte) 10, 17, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder10 = builder8.setInstant((long) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusWeeks((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfMonth(45);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 45 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        int int3 = calendar1.get(9);
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.Chronology chronology4 = localDate2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = chronology4.getDateTimeMillis((long) (short) 100, 707, (int) ' ', 100, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 707 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        int int8 = dateTimeField6.getMaximumValue((long) 2022);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeField6.set((long) 39222234, 53625146);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53625146 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate5 = localDate2.withFieldAdded(durationFieldType3, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withYearOfCentury(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds(10);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withField(dateTimeFieldType7, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.minusYears(5);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        int int14 = localDateTime12.getDayOfYear();
        int int15 = localDateTime12.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withMinuteOfHour(17);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localTime2.compareTo((org.joda.time.ReadablePartial) localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53626145 + "'", int15 == 53626145);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType((int) (byte) 1);
        int int9 = localTime4.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime2.property(dateTimeFieldType8);
        int int11 = property10.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 100, dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.plusDays(39);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = property10.compareTo((org.joda.time.ReadablePartial) localDate16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = calendar1.getDisplayName(48, 39223083, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateTime2.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime localTime8 = localTime6.plusSeconds(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = localTime6.getFieldType(0);
        int int11 = dateMidnight3.get(dateTimeFieldType10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        int int14 = dateTimeZone12.getOffsetFromLocal((long) 'a');
        org.joda.time.DateTime dateTime15 = dateMidnight3.toDateTime(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime15.withDate(11, (int) 'u', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = dateTimeFormatter2.parseLocalDate("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer3, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate5 = localDate2.withFieldAdded(durationFieldType3, 0);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = localTime13.getFieldType((int) (byte) 1);
        int int16 = localTime11.get(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property17 = localTime9.property(dateTimeFieldType15);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale20 = java.util.Locale.TAIWAN;
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.util.Set<java.lang.Character> charSet22 = locale19.getExtensionKeys();
        java.lang.String str23 = property17.getAsShortText(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = localDate5.toString("zh-TW", locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charSet22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "53" + "'", str23, "53");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDateTime2.getFieldType(53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate5 = localDate2.withFieldAdded(durationFieldType3, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withMonthOfYear(41);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 41 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        int int9 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) dateTime8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((int) '#', 46, (int) '#', 958, 9, 53620371, 59, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 958 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType((int) (byte) 1);
        int int9 = localTime4.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime2.property(dateTimeFieldType8);
        int int11 = property10.getMaximumValueOverall();
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = property10.setCopy("millisOfDay", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"millisOfDay\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyear();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        int int8 = localDateTime7.getSecondOfMinute();
        int[] intArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            chronology5.validate((org.joda.time.ReadablePartial) localDateTime7, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 47 + "'", int8 == 47);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale1);
        java.lang.Object obj5 = calendar4.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645455227587,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=47,MILLISECOND=587,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj5);
// flaky:         org.junit.Assert.assertEquals(obj5.toString(), "java.util.GregorianCalendar[time=1645455227587,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=47,MILLISECOND=587,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "java.util.GregorianCalendar[time=1645455227587,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=47,MILLISECOND=587,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "java.util.GregorianCalendar[time=1645455227587,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=47,MILLISECOND=587,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone0.hasSameRules(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        java.util.Date date8 = localDate7.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        java.util.Date date12 = localDate11.toDate();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 100, dateTimeZone14);
        java.util.Date date16 = localDate15.toDate();
        boolean boolean17 = date12.after(date16);
        boolean boolean18 = date8.before(date12);
        boolean boolean19 = timeZone3.inDaylightTime(date12);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withCenturyOfEra(100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMillis(0);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        int int12 = dateTime11.getDayOfYear();
        org.joda.time.DateTime dateTime14 = dateTime11.withYear(39220553);
        org.joda.time.DateTime dateTime16 = dateTime11.withMinuteOfHour(22);
        org.joda.time.DateTime dateTime17 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime10.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime10.withHourOfDay(53623610);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53623610 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone0.hasSameRules(timeZone3);
        java.lang.String str5 = timeZone3.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u5354\u5b9a\u4e16\u754c\u6642" + "'", str5, "\u5354\u5b9a\u4e16\u754c\u6642");
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight9 = dateTime8.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = localTime12.getFieldType(0);
        int int17 = dateMidnight9.get(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        int int20 = dateTimeZone18.getOffsetFromLocal((long) 'a');
        org.joda.time.DateTime dateTime21 = dateMidnight9.toDateTime(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((int) ' ', 45, 9, 0, 5, 7, dateTimeZone18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 45 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.add(11, 2022);
        java.util.Calendar.Builder builder5 = new java.util.Calendar.Builder();
        java.util.Calendar calendar6 = builder5.build();
        calendar6.add(11, 2022);
        int int10 = calendar1.compareTo(calendar6);
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=7279200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=85,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar6);
        org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=7279200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=85,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localTime3.getFieldType((int) (byte) 1);
        int int6 = localTime1.get(dateTimeFieldType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime1.getFieldType(39220553);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 39220553");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Chronology chronology2 = dateTime0.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = chronology2.getDateTimeMillis(53626596, (int) (short) 0, 32769, (int) 'a', 7, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateTime2.toDateMidnight();
        boolean boolean4 = dateTime2.isAfterNow();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.ReadWritableInstant readWritableInstant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dateTimeFormatter2.parseInto(readWritableInstant5, "2022-02-21T14:53:46.596", 39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        int int8 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) dateTime7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(39, 5, 32769, 17, 39221951, 1970, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39221951 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 100, dateTimeZone2);
        java.util.Date date4 = localDate3.toDate();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        java.util.Date date8 = localDate7.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        java.util.Date date12 = localDate11.toDate();
        boolean boolean13 = date8.after(date12);
        boolean boolean14 = date4.before(date8);
        int int15 = date4.getHours();
        int int16 = date4.getHours();
        boolean boolean17 = timeZone0.inDaylightTime(date4);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(39222286, 39228835, 53628, 7, 39, 0, (int) (short) 10, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39228835 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(0, 39221951, 41, 100, 53626645, (int) (short) 10, (int) (byte) 10, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.Date date3 = localDate2.toDate();
        org.joda.time.LocalDate localDate5 = localDate2.withCenturyOfEra((int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = localDate5.getFieldType((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate5.withEra(53621236);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53621236 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.withMillis((long) 11);
        org.joda.time.Instant instant8 = instant7.toInstant();
        boolean boolean9 = instant7.isAfterNow();
        org.joda.time.Instant instant12 = instant7.withDurationAdded((long) (short) 100, 8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) instant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(instant12);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate.Property property10 = localDate9.weekyear();
        org.joda.time.Chronology chronology11 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((int) '4', (int) ' ', 39222286, 2022, 39221951, 53624933, 46, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.minusWeeks(5);
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime4.withEra((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.add(11, 2022);
        int int5 = calendar1.getMinimalDaysInFirstWeek();
        java.util.Calendar.Builder builder6 = new java.util.Calendar.Builder();
        java.util.Calendar calendar7 = builder6.build();
        calendar7.add(11, 2022);
        int int11 = calendar1.compareTo(calendar7);
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=7279200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=85,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=7279200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=85,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.set(1, 32769, 53623610, 0, 5, 10);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.add(39222493, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=32769,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=53623610,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=5,SECOND=10,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        int int5 = localDate4.getDayOfMonth();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate4.withFieldAdded(durationFieldType6, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hours' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.centuries();
        long long9 = durationField6.getDifferenceAsLong((long) 53, 100L);
        long long12 = durationField6.add((long) 10, (long) 48);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = durationField6.getMillis(53628785);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 5362878500 * 31556952000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 151473369600010L + "'", long12 == 151473369600010L);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = dateTime1.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime1.withDayOfYear(53628225);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628225 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        int int11 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) instant8, dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(1, 4, 1970, 0, 53624933, 53623891, 53620371, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53624933 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        java.util.Calendar.Builder builder2 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder5 = builder0.setWeekDefinition(8, (-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = localTime1.toString("millisOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate5 = localDate2.withFieldAdded(durationFieldType3, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate2.withMonthOfYear((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusSeconds(14);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDateTime0.getValue(53627055);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53627055");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'zh-TW' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withField(dateTimeFieldType5, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.minusYears(5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.centuries();
        org.joda.time.DateTimeZone dateTimeZone7 = chronology5.getZone();
        org.joda.time.DurationField durationField8 = chronology5.eras();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withCenturyOfEra(100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMillis(0);
        int int11 = localDateTime6.getMillisOfSecond();
        java.lang.String str12 = localDateTime6.toString();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 427 + "'", int11 == 427);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2017-02-21T14:53:50.427" + "'", str12, "2017-02-21T14:53:50.427");
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder6 = builder4.setCalendarType("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: Coordinated Universal Time");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime10 = dateTime8.plusHours(53627055);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localTime2.getFieldType(0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localTime2.getValue(958);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 958");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        int int5 = localDate4.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate4.withEra(41);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 41 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
        int int4 = calendar2.get(11);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455231148,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=51,MILLISECOND=148,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14 + "'", int4 == 14);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
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
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime0.withZone(dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear(39229540);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39229540 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone0.hasSameRules(timeZone3);
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone0, locale5);
        boolean boolean7 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645455231662,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=51,MILLISECOND=662,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.util.Date date0 = new java.util.Date();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:53:51 UTC 2022");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime.Property property2 = localDateTime0.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField4 = localDateTime0.getField(53623891);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53623891");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withCenturyOfEra(100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDateTime8.getValue(39229540);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 39229540");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        boolean boolean5 = locale0.equals((java.lang.Object) dateTimeFormatter3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Chronology chronology2 = dateTime0.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = chronology2.getDateTimeMillis(39220553, 39, 53631365, 53631959, 14, (int) 'a', 53628785);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53631959 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder8 = builder4.setDate((int) (byte) 10, 17, (int) (byte) 1);
        java.util.Calendar.Builder builder12 = builder4.setTimeOfDay((int) (byte) -1, 53620371, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder15 = builder4.set(22, 53628225);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.time.ZoneId zoneId3 = timeZone0.toZoneId();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) zoneId3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.time.ZoneRegion");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(zoneId3);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.centuries();
        java.lang.String str7 = durationField6.getName();
        boolean boolean8 = durationField6.isPrecise();
        int int11 = durationField6.getDifference((long) (short) 0, (long) '4');
        int int13 = durationField6.getValue((long) 707);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "centuries" + "'", str7, "centuries");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        int int9 = dateTimeField6.getDifference((long) (-1), (long) 7);
        java.lang.String str11 = dateTimeField6.getAsText((long) 53628);
        org.joda.time.ReadablePartial readablePartial12 = null;
        java.util.Locale locale13 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeField6.getAsShortText(readablePartial12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6728\u66dc\u65e5" + "'", str11, "\u6728\u66dc\u65e5");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.Date date3 = localDate2.toDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        java.util.Date date7 = localDate6.toDate();
        boolean boolean8 = date3.after(date7);
        date7.setSeconds(53627022);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 100, dateTimeZone12);
        java.util.Date date14 = localDate13.toDate();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 100, dateTimeZone16);
        java.util.Date date18 = localDate17.toDate();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 100, dateTimeZone20);
        java.util.Date date22 = localDate21.toDate();
        boolean boolean23 = date18.after(date22);
        boolean boolean24 = date14.before(date18);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 100, dateTimeZone26);
        java.util.Date date28 = localDate27.toDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 100, dateTimeZone30);
        java.util.Date date32 = localDate31.toDate();
        boolean boolean33 = date28.after(date32);
        boolean boolean34 = date14.before(date28);
        int int35 = date7.compareTo(date28);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Mon Sep 13 16:23:42 UTC 1971");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDate2.getFields();
        org.joda.time.LocalDate.Property property6 = localDate2.monthOfYear();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property6.setCopy("+00:00", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"+00:00\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone3, locale4);
        calendar2.setTimeZone(timeZone3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = calendar2.getMaximum(292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 292278993");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455232974,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=52,MILLISECOND=974,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645455232975,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=52,MILLISECOND=975,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale4 = new java.util.Locale("+00:00", "");
        java.lang.String str7 = nameProvider1.getName(locale4, "hi!", "zh-TW");
        org.joda.time.tz.NameProvider nameProvider8 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.tz.NameProvider nameProvider9 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.tz.NameProvider[] nameProviderArray10 = new org.joda.time.tz.NameProvider[] { nameProvider1, nameProvider8, nameProvider9 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.NameProvider[] nameProviderArray11 = strSet0.toArray(nameProviderArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertEquals(locale4.toString(), "+00:00");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(nameProvider8);
        org.junit.Assert.assertNotNull(nameProvider9);
        org.junit.Assert.assertNotNull(nameProviderArray10);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"zh_TW\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeFormatter2.print((long) 53630311);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalTime localTime5 = localTime3.plus(readablePeriod4);
        org.joda.time.LocalTime localTime7 = localTime3.minusSeconds(5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 8);
        org.joda.time.DateTime dateTime11 = localTime3.toDateTimeToday(dateTimeZone10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localTime3.compareTo(readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.Date date3 = localDate2.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate2.withDayOfMonth(46);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.set(1, 32769, 53623610, 0, 5, 10);
        calendar1.setTimeInMillis((long) 9);
        java.util.Locale locale13 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap14 = calendar1.getDisplayNames(958, 39226059, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=9,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=9,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it_IT");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeFormatter2.print((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.parse("centuries", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.toLanguageTag();
        boolean boolean3 = locale0.hasExtensions();
        java.lang.String str4 = locale0.getDisplayScript();
        java.lang.String str5 = locale0.getDisplayName();
        java.util.Set<java.lang.String> strSet6 = locale0.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = strSet6.add("Property[minuteOfHour]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-TW" + "'", str2, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str5, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(2, 2, 3, 53625146, (int) '4', 39221951, 6, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53625146 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        int int2 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime1.withSecondOfMinute(39233664);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39233664 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"zh-TW\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.set(1, 32769, 53623610, 0, 5, 10);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromCalendarFields(calendar1);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withField(dateTimeFieldType12, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.minusYears(5);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.yearOfEra();
        int int19 = localDateTime17.getDayOfYear();
        int int20 = localDateTime17.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minus(readablePeriod22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withMillisOfDay(53620371);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = localTime9.compareTo((org.joda.time.ReadablePartial) localDateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=4657119840310000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=149548,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=94,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=5,SECOND=10,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 53634594 + "'", int20 == 53634594);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.Date date3 = localDate2.toDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        java.util.Date date7 = localDate6.toDate();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        java.util.Date date11 = localDate10.toDate();
        boolean boolean12 = date7.after(date11);
        boolean boolean13 = date3.before(date7);
        int int14 = date3.getHours();
        java.lang.Object obj15 = date3.clone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        int int9 = localDateTime7.getDayOfYear();
        int int10 = localDateTime7.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType15 = localDateTime13.getFieldType(53633045);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53633045");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53634691 + "'", int10 == 53634691);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(true);
        java.util.Calendar calendar3 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            calendar3.clear(46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 46");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        int int2 = localDateTime0.getDayOfYear();
        int int3 = localDateTime0.getWeekyear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.dayOfWeek();
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.monthOfYear();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.lang.String str10 = locale8.getDisplayCountry(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = localDateTime0.toString("1 Jan 1970 00:00:00 GMT", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        boolean boolean4 = instant2.isAfterNow();
        org.joda.time.Instant instant7 = instant2.withDurationAdded((long) (short) 100, 8);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant2.withDurationAdded(readableDuration8, 0);
        boolean boolean12 = instant2.equals((java.lang.Object) 86400000L);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder8 = builder4.setDate((int) (byte) 10, 17, (int) (byte) 1);
        java.util.Calendar.Builder builder12 = builder4.setTimeOfDay((int) (byte) -1, 53620371, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder14 = builder4.setCalendarType("2022-02-21T14:53:46.596");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: 2022-02-21T14:53:46.596");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateTime2.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime localTime8 = localTime6.plusSeconds(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = localTime6.getFieldType(0);
        int int11 = dateMidnight3.get(dateTimeFieldType10);
        int int12 = dateMidnight3.getYear();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        int int2 = localDateTime0.getDayOfYear();
        int int3 = localDateTime0.getWeekyear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.dayOfWeek();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property4.setCopy("2017-02-21T14:53:41.457", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2017-02-21T14:53:41.457\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = calendar2.getGreatestMinimum(53632527);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53632527");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455235210,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=55,MILLISECOND=210,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.Date date3 = localDate2.toDate();
        org.joda.time.LocalDate localDate5 = localDate2.withCenturyOfEra((int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = localDate5.getFieldType((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.minutes();
        java.lang.String str9 = durationFieldType8.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate5.withFieldAdded(durationFieldType8, 39233841);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minutes' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "minutes" + "'", str9, "minutes");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.minuteOfHour();
        int int6 = localDateTime0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDateTime0.getValue(39222493);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 39222493");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getScript();
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "it");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime localTime7 = localTime5.plusSeconds(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = localTime5.getFieldType(0);
        org.joda.time.LocalTime localTime11 = localTime5.withMinuteOfHour(5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.time.ZoneId zoneId3 = timeZone0.toZoneId();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = localTime13.getFieldType((int) (byte) 1);
        int int16 = localTime11.get(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property17 = localTime9.property(dateTimeFieldType15);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale20 = java.util.Locale.TAIWAN;
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.util.Set<java.lang.Character> charSet22 = locale19.getExtensionKeys();
        java.lang.String str23 = property17.getAsShortText(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = timeZone0.getDisplayName(false, (int) (short) -1, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645455235582,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=55,MILLISECOND=582,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charSet22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "53" + "'", str23, "53");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate.Property property6 = localDate4.era();
        org.joda.time.DurationField durationField7 = property6.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = durationField7.getMillis((long) 958);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.LocalDate localDate4 = property3.withMaximumValue();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        org.joda.time.LocalDate.Property property9 = localDate8.weekyear();
        org.joda.time.Chronology chronology10 = localDate8.getChronology();
        org.joda.time.DurationField durationField11 = durationFieldType5.getField(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate4.withFieldAdded(durationFieldType5, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minutes' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = chronology5.getDateTimeMillis(53630972, (int) (byte) 10, 39233664, 53626645);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39233664 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(0, (int) (short) 100, 5, 39234451, 2, 292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39234451 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        int int3 = localDate2.getEra();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDate2.getValue(39231790);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 39231790");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(0);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfSecond();
        org.joda.time.LocalTime.Property property5 = localTime3.millisOfSecond();
        org.joda.time.LocalTime localTime6 = property5.roundCeilingCopy();
        org.joda.time.LocalTime localTime7 = property5.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property5.setCopy(39231790);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39231790 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.dayOfMonth();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale12 = java.util.Locale.TAIWAN;
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str14 = locale11.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeField7.set((long) 53630692, "", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        java.util.Locale locale7 = dateTimeFormatter6.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = dateTimeFormatter6.parseLocalTime("1 Jan 1970 00:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.toLanguageTag();
        boolean boolean3 = locale0.hasExtensions();
        java.lang.String str4 = locale0.getDisplayScript();
        java.lang.String str5 = locale0.getDisplayName();
        java.util.Set<java.lang.String> strSet6 = locale0.getUnicodeLocaleAttributes();
        java.util.stream.Stream<java.lang.String> strStream7 = strSet6.stream();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-TW" + "'", str2, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str5, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strStream7);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("minutes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"minutes\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withWeekOfWeekyear(39222234);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39222234 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder4 = builder0.setCalendarType("DateTimeField[dayOfMonth]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: DateTimeField[dayOfMonth]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(39220553, 53633343, 39228524, 9, 53627055);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53627055 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType((int) (byte) 1);
        int int9 = localTime4.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime2.property(dateTimeFieldType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property10.setCopy(53626341);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626341 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = strSet1.add("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.DateTime.Property property10 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 100, dateTimeZone13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = localDate14.getFields();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        int int20 = dateTimeZone18.getOffsetFromLocal((long) 'a');
        long long23 = dateTimeZone18.convertLocalToUTC((long) 39220553, false);
        org.joda.time.DateTime dateTime24 = localDate14.toDateTimeAtStartOfDay(dateTimeZone18);
        boolean boolean25 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime.Property property26 = dateTime11.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = property26.setCopy("\u5fb7\u6587");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39237464 + "'", int4 == 39237464);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 39220553L + "'", long23 == 39220553L);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder8 = builder4.setDate((int) (byte) 10, 17, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder10 = builder8.setInstant((long) 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate5 = localDate2.withFieldAdded(durationFieldType3, 0);
        int int6 = localDate5.getYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean11 = localDate9.isSupported(dateTimeFieldType10);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localDate9.getFields();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        int int15 = dateTimeZone13.getOffsetFromLocal((long) 'a');
        long long18 = dateTimeZone13.convertLocalToUTC((long) 39220553, false);
        org.joda.time.DateTime dateTime19 = localDate9.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime20 = localDate5.toDateTimeAtMidnight(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = localDate5.toString("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 39220553L + "'", long18 == 39220553L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.minusHours((int) (short) 100);
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Instant instant8 = instant6.minus((long) 2);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant8.plus(readableDuration9);
        boolean boolean11 = dateTime3.isBefore((org.joda.time.ReadableInstant) instant10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) instant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyear();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.era();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = chronology5.get(readablePeriod9, (long) 53631365, (long) 53628);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.set(1, 32769, 53623610, 0, 5, 10);
        calendar1.setTimeInMillis((long) 9);
        java.lang.String str11 = calendar1.toString();
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=9,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=9,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.util.GregorianCalendar[time=9,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=9,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str11, "java.util.GregorianCalendar[time=9,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=9,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType((int) (byte) 1);
        int int9 = localTime4.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime2.property(dateTimeFieldType8);
        org.joda.time.LocalTime localTime11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime12 = property10.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((java.lang.Object) property10, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 100, dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.plusDays(39);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) property1, chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.add(11, 2022);
        int int5 = calendar1.getMinimalDaysInFirstWeek();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withField(dateTimeFieldType8, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minusYears(5);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusHours((int) '4');
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.weekyear();
        int int16 = localDateTime12.getMillisOfSecond();
        boolean boolean17 = calendar1.before((java.lang.Object) localDateTime12);
        boolean boolean18 = calendar1.isWeekDateSupported();
        // The following exception was thrown during execution in test generation
        try {
            calendar1.setWeekDate(39231678, 39228524, 41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 41");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=7279200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=85,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 287 + "'", int16 == 287);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        int int9 = dateTimeField6.getDifference((long) (-1), (long) 7);
        java.lang.String str11 = dateTimeField6.getAsText((long) 53628);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeField6.getAsText((int) 'x', locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 120");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6728\u66dc\u65e5" + "'", str11, "\u6728\u66dc\u65e5");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        int int7 = dateTimeFormatter2.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeFormatter2.print((long) 39221951);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale4.toLanguageTag();
        boolean boolean7 = locale4.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean9 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withOffsetParsed();
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer11, (long) 39232793);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        int int9 = dateTimeField6.getDifference((long) (-1), (long) 7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) int9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(53626341, 7, 16, (int) (byte) 1, (int) '#', 53630692);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53630692 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.time.ZoneId zoneId3 = timeZone0.toZoneId();
        java.util.Locale locale7 = new java.util.Locale("2017", "53", "");
        java.lang.String str8 = timeZone0.getDisplayName(locale7);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals(locale7.toString(), "2017_53");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.time.ZoneId zoneId3 = timeZone0.toZoneId();
        java.lang.Object obj4 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        int int7 = dateTimeFormatter2.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = dateTimeFormatter2.parseLocalTime("Property[minuteOfHour]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = durationField6.getMillis(53638763, (long) 39226059);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 5363876300");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate5 = localDate2.withFieldAdded(durationFieldType3, 0);
        int int6 = localDate5.getYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean11 = localDate9.isSupported(dateTimeFieldType10);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localDate9.getFields();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        int int15 = dateTimeZone13.getOffsetFromLocal((long) 'a');
        long long18 = dateTimeZone13.convertLocalToUTC((long) 39220553, false);
        org.joda.time.DateTime dateTime19 = localDate9.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime20 = localDate5.toDateTimeAtMidnight(dateTimeZone13);
        java.util.TimeZone timeZone21 = dateTimeZone13.toTimeZone();
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str24 = timeZone21.getDisplayName(locale23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 39220553L + "'", long18 == 39220553L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coordinated Universal Time" + "'", str24, "Coordinated Universal Time");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.minuteOfHour();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale12 = java.util.Locale.TAIWAN;
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str15 = locale11.getExtension('u');
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeField7.set((long) 40, "eng", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"eng\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.set(1, 32769, 53623610, 0, 5, 10);
        calendar1.setTimeInMillis((long) 9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=9,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=9,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        org.joda.time.LocalDate.Property property8 = localDate7.weekyear();
        org.joda.time.Chronology chronology9 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(43, (-292275054), 39232793, 12, 53633019, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53633019 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withEra((int) (byte) 0);
        org.joda.time.DateTime dateTime5 = dateTime0.withYearOfCentury(14);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.plusDays(39);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) 14, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(39);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.minuteOfDay();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology13);
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 100, dateTimeZone19);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate23 = localDate20.withFieldAdded(durationFieldType21, 0);
        int int24 = localDate23.getYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 100, dateTimeZone26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean29 = localDate27.isSupported(dateTimeFieldType28);
        org.joda.time.DateTimeField[] dateTimeFieldArray30 = localDate27.getFields();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        int int33 = dateTimeZone31.getOffsetFromLocal((long) 'a');
        long long36 = dateTimeZone31.convertLocalToUTC((long) 39220553, false);
        org.joda.time.DateTime dateTime37 = localDate27.toDateTimeAtStartOfDay(dateTimeZone31);
        org.joda.time.DateTime dateTime38 = localDate23.toDateTimeAtMidnight(dateTimeZone31);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime41 = dateTime39.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int43 = dateTime41.get(dateTimeFieldType42);
        org.joda.time.DateTime dateTime45 = dateTime41.minusMillis((int) '#');
        boolean boolean46 = dateTime41.isBeforeNow();
        org.joda.time.DateTime dateTime48 = dateTime41.plusMillis((int) (short) 1);
        org.joda.time.DateTime.Property property49 = dateTime41.dayOfWeek();
        org.joda.time.DateTime dateTime50 = property49.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) 100, dateTimeZone52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean55 = localDate53.isSupported(dateTimeFieldType54);
        org.joda.time.DateTimeField[] dateTimeFieldArray56 = localDate53.getFields();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.UTC;
        int int59 = dateTimeZone57.getOffsetFromLocal((long) 'a');
        long long62 = dateTimeZone57.convertLocalToUTC((long) 39220553, false);
        org.joda.time.DateTime dateTime63 = localDate53.toDateTimeAtStartOfDay(dateTimeZone57);
        boolean boolean64 = dateTime50.isAfter((org.joda.time.ReadableInstant) dateTime63);
        int int65 = dateTime38.compareTo((org.joda.time.ReadableInstant) dateTime50);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(stringBuffer17, (org.joda.time.ReadableInstant) dateTime38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 39220553L + "'", long36 == 39220553L);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 39239638 + "'", int43 == 39239638);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 39220553L + "'", long62 == 39220553L);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(39);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.minuteOfDay();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology13);
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer17, 39223083046L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        java.util.Locale locale8 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str10 = dateTimeField6.getAsText(100L, locale8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 100, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.plusDays(39);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = dateTimeField19.getType();
        int int22 = dateTimeField19.getLeapAmount((long) 39222493);
        java.util.Locale locale24 = java.util.Locale.US;
        java.lang.String str25 = dateTimeField19.getAsShortText(53628, locale24);
        java.lang.String str26 = locale24.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = dateTimeField6.set((long) (short) 100, "\u6728\u66dc\u65e5", locale24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"???\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6728\u66dc\u65e5" + "'", str10, "\u6728\u66dc\u65e5");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "53628" + "'", str25, "53628");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "eng" + "'", str26, "eng");
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate5 = localDate2.withFieldAdded(durationFieldType3, 0);
        int int6 = localDate5.getYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean11 = localDate9.isSupported(dateTimeFieldType10);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localDate9.getFields();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        int int15 = dateTimeZone13.getOffsetFromLocal((long) 'a');
        long long18 = dateTimeZone13.convertLocalToUTC((long) 39220553, false);
        org.joda.time.DateTime dateTime19 = localDate9.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime20 = localDate5.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = dateTime20.get(dateTimeFieldType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 39220553L + "'", long18 == 39220553L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.time.ZoneId zoneId3 = timeZone0.toZoneId();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone0);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale8.toLanguageTag();
        boolean boolean11 = locale8.hasExtensions();
        java.lang.String str12 = locale8.getDisplayScript();
        java.lang.String str13 = locale7.getDisplayName(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = calendar4.getDisplayName(53637618, 1970, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645455240007,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=7,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-TW" + "'", str10, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u5fb7\u6587" + "'", str13, "\u5fb7\u6587");
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusDays(5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate.Property property10 = localDate9.weekyear();
        org.joda.time.Chronology chronology11 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.secondOfMinute();
        org.joda.time.Chronology chronology13 = chronology11.withUTC();
        org.joda.time.DateTime dateTime14 = dateTime6.toDateTime(chronology11);
        org.joda.time.DateTime dateTime16 = dateTime6.plusMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39240364 + "'", int4 == 39240364);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType((int) (byte) 1);
        int int9 = localTime4.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime2.property(dateTimeFieldType8);
        org.joda.time.LocalTime localTime11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime12 = property10.getLocalTime();
        org.joda.time.LocalTime localTime13 = property10.getLocalTime();
        java.lang.String str14 = property10.getAsText();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 100, dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.plusDays(39);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.dayOfWeek();
        java.util.Locale locale24 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleAttributes();
        java.lang.String str26 = dateTimeField22.getAsText(100L, locale24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime27 = property10.setCopy("2022-02-21T14:53:46.596", locale24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:53:46.596\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54 + "'", int9 == 54);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "54" + "'", str14, "54");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u6728\u66dc\u65e5" + "'", str26, "\u6728\u66dc\u65e5");
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime3.withHourOfDay(39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.Date date3 = localDate2.toDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        java.util.Date date7 = localDate6.toDate();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        java.util.Date date11 = localDate10.toDate();
        boolean boolean12 = date7.after(date11);
        boolean boolean13 = date3.before(date7);
        java.lang.String str14 = date7.toGMTString();
        java.lang.String str15 = date7.toGMTString();
        int int16 = date7.getHours();
        java.lang.Object obj17 = date7.clone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str14, "1 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str15, "1 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime2.withDurationAdded(readableDuration10, 13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime12.withSecondOfMinute(53630692);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53630692 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39240859 + "'", int4 == 39240859);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(53640520, 11, 22, 1, 53637618, 0, 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637618 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyear();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.year();
        long long12 = chronology5.add((long) 53627022, (long) 39226059, 39234978);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = chronology5.add(readablePeriod13, (long) 3, 958);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = chronology5.get(readablePeriod17, (long) 53638763, (long) 39238880);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1539033615518724L + "'", long12 == 1539033615518724L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTime0.getZone();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getName((long) 53627022);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.set(1, 32769, 53623610, 0, 5, 10);
        calendar1.setMinimalDaysInFirstWeek((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.setWeekDate(0, 24, 39234519);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 39234519");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1,ERA=?,YEAR=1,MONTH=32769,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=53623610,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=5,SECOND=10,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(true);
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(12, 9, 41);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder8 = builder6.setCalendarType("14:53:47.032");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: 14:53:47.032");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        int int10 = dateTime2.getWeekyear();
        java.util.Locale locale11 = java.util.Locale.ROOT;
        java.util.Calendar calendar12 = dateTime2.toCalendar(locale11);
        java.util.Calendar.Builder builder13 = new java.util.Calendar.Builder();
        java.util.Calendar calendar14 = builder13.build();
        int int15 = calendar12.compareTo(calendar14);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39241654 + "'", int4 == 39241654);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1645095241654,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=17,DAY_OF_YEAR=48,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=54,SECOND=1,MILLISECOND=654,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = dateTimeField6.getType();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale11.toLanguageTag();
        boolean boolean14 = locale11.hasExtensions();
        java.lang.String str15 = locale11.getDisplayScript();
        java.lang.String str16 = locale10.getDisplayName(locale11);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dateTimeField6.set((long) 53627055, "hi!", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-TW" + "'", str13, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u5fb7\u6587" + "'", str16, "\u5fb7\u6587");
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        int int2 = localDateTime0.getDayOfYear();
        int int3 = localDateTime0.getMillisOfDay();
        int int4 = localDateTime0.getSecondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = localDateTime0.getField(0);
        long long8 = dateTimeField6.roundHalfEven((long) 0);
        long long10 = dateTimeField6.roundHalfCeiling((long) (-1));
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withField(dateTimeFieldType15, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.minusYears(5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withCenturyOfEra(100);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.minusMillis(0);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withPeriodAdded(readablePeriod24, 53625146);
        int[] intArray27 = localDateTime26.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = dateTimeField6.addWrapField(readablePartial11, 39223839, intArray27, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 39223839");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53641732 + "'", int3 == 53641732);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(intArray27);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[2017, 2, 21, 53641733]");
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.set(1, 32769, 53623610, 0, 5, 10);
        calendar1.set(6, 100, 53620371);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = calendar1.get(17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=4571084793910000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=146821,MONTH=10,WEEK_OF_YEAR=49,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=333,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=5,SECOND=10,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        boolean boolean2 = property1.isLeap();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone3, locale4);
        calendar2.setTimeZone(timeZone3);
        calendar2.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar2.getActualMinimum(53630311);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53630311");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645455242152,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=2,MILLISECOND=152,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.centuries();
        long long9 = durationField6.getDifferenceAsLong((long) 53, 100L);
        long long12 = durationField6.add((long) 10, (long) 48);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = durationField6.getMillis(39241374);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3924137400 * 31556952000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 151473369600010L + "'", long12 == 151473369600010L);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(39);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.dayOfWeek();
        org.joda.time.DurationField durationField14 = chronology12.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(53637074, 39241232, 0, 39229357, 53631365, 3, 2000, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39229357 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate12 = localDate9.withFieldAdded(durationFieldType10, 0);
        int int13 = localDate12.getYearOfEra();
        org.joda.time.LocalDate localDate14 = localDate6.withFields((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        int int17 = dateTimeZone15.getOffsetFromLocal((long) 'a');
        long long20 = dateTimeZone15.convertLocalToUTC((long) 39220553, false);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight22 = localDate12.toDateMidnight(dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(39227799, 53626596, 53630972, 53638763, 53630311, 53627022, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53638763 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 39220553L + "'", long20 == 39220553L);
        org.junit.Assert.assertNotNull(dateMidnight22);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateTime2.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime localTime8 = localTime6.plusSeconds(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = localTime6.getFieldType(0);
        int int11 = dateMidnight3.get(dateTimeFieldType10);
        int int12 = dateMidnight3.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(39);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 39, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 32769, chronology13);
        org.joda.time.DurationField durationField16 = chronology13.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(53634314, 39223083, 0, 53637074, 46, 39229315, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637074 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        int int8 = dateTimeField6.getMaximumValue((long) 2022);
        int int10 = dateTimeField6.get((long) (short) 0);
        java.util.Locale locale12 = java.util.Locale.US;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeField6.getAsText(39241508, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 39241508");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(true);
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(12, 9, 41);
        java.util.Calendar.Builder builder11 = builder0.setTimeOfDay(39230101, 39229540, 39233752, 53631736);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone12, locale13);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone15, locale16);
        calendar14.setTimeZone(timeZone15);
        java.util.Calendar.Builder builder19 = builder11.setTimeZone(timeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 100, dateTimeZone21);
        java.util.Date date23 = localDate22.toDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 100, dateTimeZone25);
        java.util.Date date27 = localDate26.toDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 100, dateTimeZone29);
        java.util.Date date31 = localDate30.toDate();
        boolean boolean32 = date27.after(date31);
        boolean boolean33 = date23.before(date27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder34 = builder19.setInstant(date27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455242547,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=2,MILLISECOND=547,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645455242547,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=2,MILLISECOND=547,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        int int2 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Instant instant3 = dateTime1.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime1.withTime((int) (byte) 1, 53640933, 10, 53632527);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53640933 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone0.hasSameRules(timeZone3);
        int int6 = timeZone3.getOffset((long) (byte) -1);
        java.lang.String str7 = timeZone3.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        int int9 = localDateTime7.getDayOfYear();
        int int10 = localDateTime7.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfDay(53620371);
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = dateTimeFormatter18.getPrinter();
        org.joda.time.Chronology chronology20 = dateTimeFormatter18.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = localDateTime13.toString(dateTimeFormatter18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53643069 + "'", int10 == 53643069);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNull(dateTimePrinter19);
        org.junit.Assert.assertNull(chronology20);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withCenturyOfEra(100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMillis(0);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        int int12 = dateTime11.getDayOfYear();
        org.joda.time.DateTime dateTime14 = dateTime11.withYear(39220553);
        org.joda.time.DateTime dateTime16 = dateTime11.withMinuteOfHour(22);
        org.joda.time.DateTime dateTime17 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withDayOfMonth(39227799);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39227799 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("it");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'it' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.LocalDate localDate4 = property3.withMaximumValue();
        org.joda.time.LocalDate localDate5 = property3.withMaximumValue();
        org.joda.time.LocalDate.Property property6 = localDate5.weekOfWeekyear();
        org.joda.time.LocalDate.Property property7 = localDate5.dayOfYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter10.getPrinter();
        boolean boolean12 = dateTimeFormatter10.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDate5.toString(dateTimeFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNull(dateTimePrinter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusWeeks((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMonthOfYear(53631736);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53631736 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withMonthOfYear(53637074);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637074 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime0.withHourOfDay(10);
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfMinute();
        org.joda.time.DateTime dateTime6 = property5.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime6.withField(dateTimeFieldType7, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = dateTimeField4.set((long) 11, "TWN");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"TWN\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.add(11, 2022);
        int int5 = calendar1.getMinimalDaysInFirstWeek();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withField(dateTimeFieldType8, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minusYears(5);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusHours((int) '4');
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.weekyear();
        int int16 = localDateTime12.getMillisOfSecond();
        boolean boolean17 = calendar1.before((java.lang.Object) localDateTime12);
        java.lang.Object obj18 = calendar1.clone();
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=7279200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=85,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 837 + "'", int16 == 837);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "java.util.GregorianCalendar[time=7279200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=85,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "java.util.GregorianCalendar[time=7279200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=85,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "java.util.GregorianCalendar[time=7279200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=85,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTimeFormatter2.print((long) 39237645);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(53630311, 0, 39244128, 24, 39236995, 43, 39231678);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 24 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale4.toLanguageTag();
        boolean boolean7 = locale4.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean9 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTimeFormatter11.parseDateTime("days");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.centuries();
        long long9 = durationField6.getDifferenceAsLong((long) 53, 100L);
        boolean boolean10 = durationField6.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = durationField6.add((long) 1970, (long) 53643934);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 5364393400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType((int) (byte) 1);
        int int9 = localTime4.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime2.property(dateTimeFieldType8);
        org.joda.time.LocalTime localTime11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime12 = property10.getLocalTime();
        org.joda.time.LocalTime localTime14 = property10.addCopy(10);
        java.util.Locale locale19 = new java.util.Locale("2017", "53", "");
        java.lang.String str20 = locale19.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = property10.setCopy("zh-TW", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"zh-TW\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54 + "'", int9 == 54);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertEquals(locale19.toString(), "2017_53");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "und" + "'", str20, "und");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.DateTime.Property property10 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(4);
        org.joda.time.DateTime.Property property13 = dateTime12.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dateTime12.get(dateTimeFieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39244468 + "'", int4 == 39244468);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateMidnight dateMidnight1 = localDate0.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 100, dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.plusDays(39);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.centuries();
        org.joda.time.DateTimeZone dateTimeZone9 = chronology7.getZone();
        org.joda.time.Interval interval10 = localDate0.toInterval(dateTimeZone9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate0.withField(dateTimeFieldType11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=isochronology[utc]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        int int9 = localDateTime7.getDayOfYear();
        int int10 = localDateTime7.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minus(readablePeriod14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        int int18 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime17);
        long long20 = dateTimeZone16.nextTransition((long) 39222286);
        org.joda.time.DateTime dateTime21 = localDateTime11.toDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes(40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = dateTime23.withDayOfYear(53628785);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628785 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53644609 + "'", int10 == 53644609);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 39222286L + "'", long20 == 39222286L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDate2.getFields();
        org.joda.time.LocalDate.Property property6 = localDate2.monthOfYear();
        org.joda.time.LocalDate localDate7 = property6.roundHalfFloorCopy();
        int int8 = localDate7.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate7.withEra(53633343);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53633343 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(39223839, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39223839 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.set(1, 32769, 53623610, 0, 5, 10);
        calendar1.set(6, 100, 53620371);
        calendar1.set(16, (int) (short) 100, 53620371, 39229315, 39226059, 39228835);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 100, dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.plusDays(39);
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = dateTimeField26.getType();
        int int29 = dateTimeField26.getLeapAmount((long) 39222493);
        java.util.Locale locale31 = java.util.Locale.US;
        java.lang.String str32 = dateTimeField26.getAsShortText(53628, locale31);
        boolean boolean33 = calendar1.before((java.lang.Object) locale31);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.roll(39227799, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=16,MONTH=100,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=53620371,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=39229315,MINUTE=39226059,SECOND=39228835,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "53628" + "'", str32, "53628");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate.Property property6 = localDate4.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate4.withField(dateTimeFieldType7, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\" is malformed at \":00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale0.getUnicodeLocaleType("und");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: und");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-TW" + "'", str2, "zh-TW");
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDate2.getFields();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDate2.get(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.add(11, 2022);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime11 = dateTime7.minusMillis((int) '#');
        boolean boolean12 = dateTime7.isBeforeNow();
        org.joda.time.DateTime dateTime14 = dateTime7.plusMillis((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime7.withDurationAdded(readableDuration15, 13);
        boolean boolean18 = calendar1.equals((java.lang.Object) 13);
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=7279200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=85,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 39245071 + "'", int9 == 39245071);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone0.hasSameRules(timeZone3);
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone0, locale5);
        java.util.TimeZone.setDefault(timeZone0);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645455245465,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=5,MILLISECOND=465,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        int int9 = localDateTime7.getDayOfYear();
        int int10 = localDateTime7.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withFields((org.joda.time.ReadablePartial) localDateTime7);
        int int12 = localDateTime11.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        java.lang.String str16 = property15.getName();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53645696 + "'", int10 == 53645696);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "yearOfEra" + "'", str16, "yearOfEra");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.toLanguageTag();
        boolean boolean8 = locale5.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withLocale(locale5);
        boolean boolean10 = dateTimeFormatter3.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter3.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.parse("zh_TW", dateTimeFormatter12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("TWN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"TWN\" is malformed at \"WN\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale3 = new java.util.Locale("+00:00", "");
        java.lang.String str6 = nameProvider0.getName(locale3, "hi!", "zh-TW");
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        int int11 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) instant8, dateTimeZone9);
        boolean boolean13 = locale3.equals((java.lang.Object) dateTimeZone9);
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertEquals(locale3.toString(), "+00:00");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyear();
        org.joda.time.DurationField durationField7 = chronology5.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = durationField7.getMillis(390);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateTime2.toDateMidnight();
        org.joda.time.DateTime dateTime5 = dateTime2.plusHours(39);
        org.joda.time.DateTime dateTime7 = dateTime2.plusMillis(707);
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours(219);
        boolean boolean11 = dateTime7.isEqual(100L);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateTime3.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        int int7 = dateMidnight5.get(dateTimeFieldType6);
        long long8 = dateMidnight5.getMillis();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 17 + "'", int4 == 17);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 24 + "'", int7 == 24);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1645056000000L + "'", long8 == 1645056000000L);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.plusSeconds((int) '#');
        org.joda.time.DateTime dateTime10 = dateTime8.minusMonths(6);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter13.getPrinter();
        org.joda.time.Chronology chronology15 = dateTimeFormatter13.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withPivotYear((java.lang.Integer) 53628785);
        int int18 = dateTimeFormatter13.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 100, dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.plusDays(39);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.minuteOfDay();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter13.withChronology(chronology24);
        boolean boolean28 = dateTimeFormatter27.isParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dateTime10.toString(dateTimeFormatter27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39246254 + "'", int4 == 39246254);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNull(dateTimePrinter14);
        org.junit.Assert.assertNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2000 + "'", int18 == 2000);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(39222493, 8, 39241508);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39222493 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyear();
        java.util.Locale locale7 = java.util.Locale.TAIWAN;
        int int8 = dateTimeField6.getMaximumShortTextLength(locale7);
        java.lang.String str9 = dateTimeField6.getName();
        int int11 = dateTimeField6.getMaximumValue(0L);
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = dateTimeField6.getAsText((long) 39231790, locale13);
        java.util.Locale locale15 = java.util.Locale.CANADA;
        boolean boolean16 = locale13.equals((java.lang.Object) locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "weekyear" + "'", str9, "weekyear");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 292278993 + "'", int11 == 292278993);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970" + "'", str14, "1970");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = chronology5.get(readablePeriod9, (long) 39234451);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.LocalDate localDate4 = property3.withMaximumValue();
        org.joda.time.LocalDate localDate5 = property3.withMaximumValue();
        org.joda.time.LocalDate localDate6 = property3.roundFloorCopy();
        java.lang.String str7 = property3.getAsString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970" + "'", str7, "1970");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        int int10 = dateTime2.getWeekyear();
        java.util.Locale locale11 = java.util.Locale.ROOT;
        java.util.Calendar calendar12 = dateTime2.toCalendar(locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime2.withMillisOfSecond(39241232);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39241232 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39246692 + "'", int4 == 39246692);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1645095246692,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=17,DAY_OF_YEAR=48,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=54,SECOND=6,MILLISECOND=692,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate.Property property6 = localDate4.era();
        java.util.Date date7 = localDate4.toDate();
        org.joda.time.LocalDate localDate9 = localDate4.withCenturyOfEra((int) ' ');
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withField(dateTimeFieldType12, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate4.withField(dateTimeFieldType12, 53627055);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Mon Feb 09 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        org.joda.time.Chronology chronology5 = dateTimeFormatter3.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 53628785);
        int int8 = dateTimeFormatter3.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.plusDays(39);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.minuteOfDay();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter3.withChronology(chronology14);
        boolean boolean18 = dateTimeFormatter17.isParser();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 100, dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.plusDays(39);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfWeek();
        org.joda.time.DurationField durationField26 = chronology24.weekyears();
        org.joda.time.DateTimeZone dateTimeZone27 = chronology24.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter17.withZone(dateTimeZone27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.parse("1970", dateTimeFormatter28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2000 + "'", int8 == 2000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        int int9 = localDateTime7.getDayOfYear();
        int int10 = localDateTime7.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minus(readablePeriod14);
        org.joda.time.DateTime dateTime16 = localDateTime11.toDateTime();
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime11.withCenturyOfEra(53627022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53627022 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53646920 + "'", int10 == 53646920);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusDays(5);
        int int7 = dateTime2.getHourOfDay();
        int int8 = dateTime2.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime2.withCenturyOfEra(39220553);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39220553 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39246945 + "'", int4 == 39246945);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDate2.getFields();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.minusHours((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localTime12.getFieldType((int) (byte) 1);
        int int15 = localTime10.get(dateTimeFieldType14);
        int int16 = dateTime8.get(dateTimeFieldType14);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localDate2.get(dateTimeFieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 54 + "'", int16 == 54);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.years();
        org.joda.time.DateTimeZone dateTimeZone7 = chronology5.getZone();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = chronology5.get(readablePeriod9, (long) 53643934);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 100, dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.plusDays(39);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 39, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 32769, chronology7);
        org.joda.time.DurationField durationField10 = chronology7.centuries();
        long long13 = durationField10.getValueAsLong((long) (short) 100, (long) 5);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        int int2 = localDateTime0.getDayOfYear();
        int int3 = localDateTime0.getMillisOfDay();
        int int4 = localDateTime0.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMinutes(14);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(20);
        org.joda.time.DateTime dateTime9 = localDateTime6.toDateTime(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDateTime6.getFieldType(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53647157 + "'", int3 == 53647157);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.Date date3 = localDate2.toDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        java.util.Date date7 = localDate6.toDate();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        java.util.Date date11 = localDate10.toDate();
        boolean boolean12 = date7.after(date11);
        boolean boolean13 = date3.before(date7);
        java.lang.String str14 = date7.toGMTString();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(20);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now(dateTimeZone16);
        java.util.Date date18 = localDate17.toDate();
        int int19 = date7.compareTo(date18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str14, "1 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Mon Feb 21 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(20);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate2.withCenturyOfEra(39241232);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39241232 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.withMillis((long) 11);
        org.joda.time.Instant instant8 = instant7.toInstant();
        boolean boolean9 = instant7.isAfterNow();
        org.joda.time.Instant instant12 = instant7.withDurationAdded((long) (short) 100, 8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        int int15 = dateTimeZone13.getOffsetFromLocal((long) 'a');
        long long18 = dateTimeZone13.convertLocalToUTC((long) 39220553, false);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime20 = instant7.toDateTime(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(0, 54, 53642440, 6, (int) (short) 10, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 39220553L + "'", long18 == 39220553L);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime2.withDurationAdded(readableDuration10, 13);
        org.joda.time.DateTime dateTime14 = dateTime2.withWeekOfWeekyear(43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime2.withDate((int) (byte) 100, 53628, 53623610);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39247343 + "'", int4 == 39247343);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusDays(5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate.Property property10 = localDate9.weekyear();
        org.joda.time.Chronology chronology11 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.secondOfMinute();
        org.joda.time.Chronology chronology13 = chronology11.withUTC();
        org.joda.time.DateTime dateTime14 = dateTime6.toDateTime(chronology11);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = chronology11.get(readablePeriod15, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39247458 + "'", int4 == 39247458);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone0.hasSameRules(timeZone3);
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone0, locale5);
        int int7 = calendar6.getMinimalDaysInFirstWeek();
        boolean boolean8 = calendar6.isLenient();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645455247549,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=7,MILLISECOND=549,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        int int9 = localDateTime7.getDayOfYear();
        int int10 = localDateTime7.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        int int14 = localDateTime11.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withWeekOfWeekyear(53642440);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53642440 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53647773 + "'", int10 == 53647773);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53647773 + "'", int14 == 53647773);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone3, locale4);
        calendar2.setTimeZone(timeZone3);
        calendar2.clear();
        // The following exception was thrown during execution in test generation
        try {
            calendar2.clear(39246516);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 39246516");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645455247841,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=7,MILLISECOND=841,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.plusDays(39);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(2017, 22, 548, (int) (short) 1, (int) (byte) -1, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.plusDays(39);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = dateTimeField11.getType();
        int int13 = localDate2.get(dateTimeFieldType12);
        int int14 = localDate2.getDayOfMonth();
        org.joda.time.LocalDate.Property property15 = localDate2.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = property15.setCopy(39234519);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39234519 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime2.withDurationAdded(readableDuration10, 13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime2.withEra(39243366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39243366 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39248197 + "'", int4 == 39248197);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        int int9 = localDateTime7.getDayOfYear();
        int int10 = localDateTime7.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minus(readablePeriod14);
        org.joda.time.DateTime dateTime16 = localDateTime11.toDateTime();
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = localDateTime11.isAfter(readablePartial17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53648267 + "'", int10 == 53648267);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale4.toLanguageTag();
        boolean boolean7 = locale4.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale4);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer9, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
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
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.plusDays(39);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(0, 575, 39222286, 53624933, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 575 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 100, dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.plusDays(39);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 39, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 32769, chronology7);
        org.joda.time.DurationField durationField10 = chronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = chronology7.get(readablePeriod11, (long) 12, (long) 39248615);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.add(11, 2022);
        int int5 = calendar1.getMinimalDaysInFirstWeek();
        int int6 = calendar1.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = calendar1.getGreatestMinimum(39223839);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 39223839");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=7279200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=85,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate.Property property6 = localDate4.era();
        org.joda.time.LocalDate localDate8 = localDate4.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        java.util.Date date12 = localDate11.toDate();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 100, dateTimeZone14);
        java.util.Date date16 = localDate15.toDate();
        boolean boolean17 = date12.after(date16);
        date16.setSeconds(53627022);
        boolean boolean20 = localDate4.equals((java.lang.Object) 53627022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = localDate4.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Mon Sep 13 16:23:42 UTC 1971");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate.Property property6 = localDate4.era();
        java.util.Date date7 = localDate4.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate4.withMonthOfYear(53643934);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53643934 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Mon Feb 09 00:00:00 UTC 1970");
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("2022-02-21T14:54:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-21t14:54:00.000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(58, 54484820, 390, 53623891, 53641601, 292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53623891 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        int int8 = dateTimeField6.getMaximumValue((long) 2022);
        long long10 = dateTimeField6.roundCeiling((long) 53);
        int int11 = dateTimeField6.getMinimumValue();
        long long14 = dateTimeField6.add(1539033615518724L, 53627055);
        long long17 = dateTimeField6.addWrapField(0L, 4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 6172411167518724L + "'", long14 == 6172411167518724L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-259200000L) + "'", long17 == (-259200000L));
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        java.lang.Appendable appendable4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withField(dateTimeFieldType7, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.minusYears(5);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        int int14 = localDateTime12.getDayOfYear();
        int int15 = localDateTime12.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.withFields((org.joda.time.ReadablePartial) localDateTime12);
        java.lang.String str17 = localDateTime12.toString();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable4, (org.joda.time.ReadablePartial) localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53649377 + "'", int15 == 53649377);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2022-02-21T14:54:09.377" + "'", str17, "2022-02-21T14:54:09.377");
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withCenturyOfEra(100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMillis(0);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withSecondOfMinute(39247057);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39247057 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.Interval interval5 = property3.toInterval();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(interval5);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.Date date3 = localDate2.toDate();
        org.joda.time.LocalDate localDate5 = localDate2.withCenturyOfEra((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withCenturyOfEra(39229357);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39229357 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(39229357, 16, 53641601);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime0.withHourOfDay(10);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.Chronology chronology7 = dateTime5.getChronology();
        org.joda.time.DateTime dateTime9 = dateTime5.plusDays(2);
        boolean boolean10 = dateTime0.isBefore((org.joda.time.ReadableInstant) dateTime9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime9.withEra(39228524);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39228524 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyear();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.year();
        long long12 = chronology5.add((long) 53627022, (long) 39226059, 39234978);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = chronology5.add(readablePeriod13, (long) 3, 958);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = chronology5.getDateTimeMillis(39234519, 53636904, 39233841, 32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53636904 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1539033615518724L + "'", long12 == 1539033615518724L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withCenturyOfEra(100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMillis(0);
        int int11 = localDateTime6.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime6.getFieldType(57);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 57");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.Date date3 = localDate2.toDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        java.util.Date date7 = localDate6.toDate();
        boolean boolean8 = date3.after(date7);
        java.lang.String str9 = date7.toGMTString();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 100, dateTimeZone11);
        java.util.Date date13 = localDate12.toDate();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        java.util.Date date17 = localDate16.toDate();
        boolean boolean18 = date13.after(date17);
        date17.setSeconds(53627022);
        boolean boolean21 = date7.after(date17);
        java.lang.String str22 = date17.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str9, "1 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 13 16:23:42 UTC 1971");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Mon Sep 13 16:23:42 UTC 1971" + "'", str22, "Mon Sep 13 16:23:42 UTC 1971");
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean9 = localDate7.isSupported(dateTimeFieldType8);
        int int10 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) int10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(39248167, 39239987, 53631736, 53630692, 240);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53630692 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 100, dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.plusDays(39);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 39, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 32769, chronology7);
        org.joda.time.DurationField durationField10 = chronology7.centuries();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withField(dateTimeFieldType14, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property17 = localDateTime12.minuteOfHour();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.util.Locale locale20 = java.util.Locale.CHINESE;
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone19, locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime12, 39233664, locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 39233664");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1645455250164,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=10,MILLISECOND=164,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        int int3 = localDate2.getEra();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        int int6 = dateTimeZone4.getOffsetFromLocal((long) 'a');
        long long9 = dateTimeZone4.convertLocalToUTC((long) 39220553, false);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone4);
        int int12 = dateTimeZone4.getOffset((long) ' ');
        org.joda.time.DateTime dateTime13 = localDate2.toDateTimeAtStartOfDay(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime13.withHourOfDay((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 39220553L + "'", long9 == 39220553L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localTime1.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime1.withMinuteOfHour(1439);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology5.days();
        long long11 = durationField8.getMillis((long) 39239987, (long) 54);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3390334876800000L + "'", long11 == 3390334876800000L);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate.Property property6 = localDate4.era();
        org.joda.time.LocalDate localDate8 = localDate4.withMonthOfYear((int) (short) 1);
        org.joda.time.LocalDate localDate10 = localDate8.withEra(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter13.getPrinter();
        org.joda.time.Chronology chronology15 = dateTimeFormatter13.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDate8.toString(dateTimeFormatter13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNull(dateTimePrinter14);
        org.junit.Assert.assertNull(chronology15);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        int int2 = localDateTime0.getDayOfYear();
        int int3 = localDateTime0.getMillisOfDay();
        int int4 = localDateTime0.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMinutes(14);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(20);
        org.joda.time.DateTime dateTime9 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withWeekyear(53634314);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField13 = localDateTime6.getField(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 17");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53650748 + "'", int3 == 53650748);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay3 = dateTime2.toTimeOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTimeISO();
        int int5 = dateTime2.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 39250770 + "'", int5 == 39250770);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateTime2.toDateMidnight();
        org.joda.time.DateTime dateTime5 = dateTime2.plusHours(39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime2.withTime(2017, 39233752, 53646462, 240);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2017 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime0.withDate((-292275054), 53630311, 53648953);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53630311 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        java.util.Locale locale7 = dateTimeFormatter6.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = dateTimeFormatter6.parseMutableDateTime("yearOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.set(1, 32769, 53623610, 0, 5, 10);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromCalendarFields(calendar1);
        java.lang.String str10 = calendar1.toString();
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=4657119840309988,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=149548,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=94,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=5,SECOND=10,MILLISECOND=0,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.util.GregorianCalendar[time=4657119840309988,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=149548,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=94,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=5,SECOND=10,MILLISECOND=0,ZONE_OFFSET=12,DST_OFFSET=0]" + "'", str10, "java.util.GregorianCalendar[time=4657119840309988,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=149548,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=94,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=5,SECOND=10,MILLISECOND=0,ZONE_OFFSET=12,DST_OFFSET=0]");
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.add(11, 2022);
        int int5 = calendar1.getMinimalDaysInFirstWeek();
        long long6 = calendar1.getTimeInMillis();
        // The following exception was thrown during execution in test generation
        try {
            calendar1.setWeekDate(56, 6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=7279199988,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=85,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 7279199988L + "'", long6 == 7279199988L);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(true);
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(12, 9, 41);
        java.util.Calendar.Builder builder11 = builder0.setTimeOfDay(39230101, 39229540, 39233752, 53631736);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone12, locale13);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone15, locale16);
        calendar14.setTimeZone(timeZone15);
        java.util.Calendar.Builder builder19 = builder11.setTimeZone(timeZone15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder21 = builder19.setInstant((long) 39245939);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455251160,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=172,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645455251160,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=172,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType((int) (byte) 1);
        int int9 = localTime4.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime2.property(dateTimeFieldType8);
        int int11 = property10.getMaximumValueOverall();
        org.joda.time.LocalTime localTime12 = property10.withMaximumValue();
        int int13 = property10.getLeapAmount();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54 + "'", int9 == 54);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyear();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.year();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        org.joda.time.Chronology chronology11 = chronology5.withZone(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology11.getDateTimeMillis(53630692, 0, 8, 575);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        int int8 = dateTimeField6.getMaximumValue((long) 2022);
        long long10 = dateTimeField6.roundCeiling((long) 53);
        long long12 = dateTimeField6.roundHalfEven((long) (-1));
        java.lang.String str14 = dateTimeField6.getAsShortText((long) 427);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withField(dateTimeFieldType17, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.minusYears(5);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        int int24 = localDateTime22.getDayOfYear();
        int int25 = localDateTime22.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int27 = localDateTime26.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 100, dateTimeZone30);
        java.lang.String str33 = dateTimeZone30.getName(100L);
        java.util.Locale locale38 = new java.util.Locale("", "2017", "minutes");
        java.lang.String str39 = dateTimeZone30.getName((long) (byte) -1, locale38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localDateTime26, 41, locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu" + "'", str14, "Thu");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 53651680 + "'", int25 == 53651680);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21 + "'", int27 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertEquals(locale38.toString(), "_2017_minutes");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        long long6 = java.util.Date.UTC(8, 39249034, (int) 'u', (int) (byte) 1, 53624933, 39249111);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 103216300431891000L + "'", long6 == 103216300431891000L);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.plusDays(39);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = dateTimeField11.getType();
        int int13 = localDate2.get(dateTimeFieldType12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate2.withPeriodAdded(readablePeriod14, 39222234);
        java.util.Date date17 = localDate16.toDate();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 100, dateTimeZone19);
        java.util.Date date21 = localDate20.toDate();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 100, dateTimeZone23);
        java.util.Date date25 = localDate24.toDate();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 100, dateTimeZone27);
        java.util.Date date29 = localDate28.toDate();
        boolean boolean30 = date25.after(date29);
        boolean boolean31 = date21.before(date25);
        java.lang.String str32 = date25.toGMTString();
        date25.setHours(11);
        int int35 = date17.compareTo(date25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 11:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "31 Dec 1969 23:59:59 GMT" + "'", str32, "31 Dec 1969 23:59:59 GMT");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyear();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.year();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        org.joda.time.Chronology chronology11 = chronology5.withZone(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = chronology5.getDateTimeMillis(24, 13, 39233841, (-1), 575, 39245370, 2017);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        int int9 = localDateTime7.getDayOfYear();
        int int10 = localDateTime7.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withMinuteOfHour(17);
        int int14 = localDateTime13.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withWeekyear(1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime localTime21 = localTime19.plusSeconds(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localTime19.getFieldType(0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((java.lang.Object) localTime19, dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean27 = localTime19.isSupported(dateTimeFieldType26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime29 = localDateTime16.withField(dateTimeFieldType26, 39250943);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39250943 for weekyearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53651842 + "'", int10 == 53651842);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale4.toLanguageTag();
        boolean boolean7 = locale4.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean9 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZoneUTC();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.minusHours((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = localTime19.getFieldType((int) (byte) 1);
        int int22 = localTime17.get(dateTimeFieldType21);
        int int23 = dateTime15.get(dateTimeFieldType21);
        int int24 = dateTime15.getDayOfYear();
        org.joda.time.DateTime dateTime26 = dateTime15.withYearOfEra(1);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuffer12, (org.joda.time.ReadableInstant) dateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 54 + "'", int22 == 54);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 54 + "'", int23 == 54);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 48 + "'", int24 == 48);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime0.withZone(dateTimeZone3);
        org.joda.time.DateTime dateTime7 = dateTime0.plusHours(53623610);
        boolean boolean8 = dateTime0.isEqualNow();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        long long6 = java.util.Date.UTC(53627055, 39245939, 53634768, 39251209, (int) (byte) -1, 39229357);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800286430061697000L + "'", long6 == 1800286430061697000L);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone0.hasSameRules(timeZone3);
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone0, locale5);
        int int7 = calendar6.getMinimalDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            calendar6.set(53651947, 958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53651947");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645455252126,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=12,MILLISECOND=138,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-1), 53628225, 43, 5, 13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628225 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.minuteOfHour();
        int int6 = localDateTime0.size();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withField(dateTimeFieldType9, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.minusYears(5);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusHours((int) '4');
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.weekyear();
        java.lang.String str17 = property16.getAsString();
        org.joda.time.LocalDateTime localDateTime19 = property16.setCopy(53);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfDay();
        java.lang.String str21 = dateTimeFieldType20.getName();
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.property(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime0.withField(dateTimeFieldType20, 39229357);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withHourOfDay(39234519);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39234519 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2017" + "'", str17, "2017");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "millisOfDay" + "'", str21, "millisOfDay");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusDays(5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate.Property property10 = localDate9.weekyear();
        org.joda.time.Chronology chronology11 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.secondOfMinute();
        org.joda.time.Chronology chronology13 = chronology11.withUTC();
        org.joda.time.DateTime dateTime14 = dateTime6.toDateTime(chronology11);
        org.joda.time.DateTimeZone dateTimeZone15 = chronology11.getZone();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withField(dateTimeFieldType18, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.minusYears(5);
        int int23 = localDateTime16.getYearOfCentury();
        int[] intArray27 = new int[] { 707, 39250502, 7 };
        // The following exception was thrown during execution in test generation
        try {
            chronology11.validate((org.joda.time.ReadablePartial) localDateTime16, intArray27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39250502 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39252248 + "'", int4 == 39252248);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 22 + "'", int23 == 22);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[707, 39250502, 7]");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        org.joda.time.DurationField durationField7 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.monthOfYear();
        long long12 = dateTimeField9.add((long) 54, 53627055);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 141025533321600054L + "'", long12 == 141025533321600054L);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        int int2 = localDateTime0.getDayOfYear();
        int int3 = localDateTime0.getMillisOfDay();
        int int4 = localDateTime0.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMinutes(14);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(20);
        org.joda.time.DateTime dateTime9 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withWeekyear(53634314);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMinuteOfHour(39228524);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39228524 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53652456 + "'", int3 == 53652456);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12 + "'", int4 == 12);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        org.joda.time.Chronology chronology5 = dateTimeFormatter3.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 53628785);
        int int8 = dateTimeFormatter3.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 100, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.plusDays(39);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.centuries();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology15.getZone();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter3.withChronology(chronology15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 100, dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.plusDays(39);
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.years();
        org.joda.time.DateTimeZone dateTimeZone27 = chronology25.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter19.withZone(dateTimeZone27);
        org.joda.time.Chronology chronology29 = dateTimeFormatter19.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant30 = org.joda.time.Instant.parse("AD", dateTimeFormatter19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2000 + "'", int8 == 2000);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.Chronology chronology4 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.secondOfMinute();
        org.joda.time.Chronology chronology6 = chronology4.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.year();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter10.getPrinter();
        org.joda.time.Chronology chronology12 = dateTimeFormatter10.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 53628785);
        int int15 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = dateTimeFormatter10.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 100, dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.plusDays(39);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology22.getZone();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter10.withChronology(chronology22);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 100, dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate29.plusDays(39);
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.years();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology32.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter26.withZone(dateTimeZone34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) chronology6, dateTimeZone34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNull(dateTimePrinter11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2000 + "'", int15 == 2000);
        org.junit.Assert.assertNull(dateTimePrinter16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.add(11, 2022);
        int int5 = calendar1.getMinimalDaysInFirstWeek();
        int int6 = calendar1.getWeeksInWeekYear();
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str11 = locale9.toLanguageTag();
        boolean boolean12 = locale9.hasExtensions();
        java.lang.String str13 = locale9.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = calendar1.getDisplayName(53644883, 53645696, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=7279199988,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=85,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-TW" + "'", str11, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.Chronology chronology4 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.secondOfMinute();
        long long8 = dateTimeField5.add((long) 46, 39223083);
        long long10 = dateTimeField5.roundFloor((long) 39229540);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 39223083046L + "'", long8 == 39223083046L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 39229000L + "'", long10 == 39229000L);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((java.lang.Object) category0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale$Category");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("java.util.GregorianCalendar[time=9,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=9,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.util.GregorianCalendar[time...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyear();
        int int7 = dateTimeField6.getMaximumValue();
        long long9 = dateTimeField6.roundHalfCeiling((long) 39241508);
        int int12 = dateTimeField6.getDifference((long) 32772, (long) 39243366);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 292278993 + "'", int7 == 292278993);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-259200000L) + "'", long9 == (-259200000L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.plusDays(39);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.centuries();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology14.getZone();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter2.withChronology(chronology14);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 100, dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.plusDays(39);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.years();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology24.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter18.withZone(dateTimeZone26);
        java.lang.StringBuffer stringBuffer28 = null;
        org.joda.time.ReadablePartial readablePartial29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter27.printTo(stringBuffer28, readablePartial29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        java.lang.Appendable appendable5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.plusDays(39);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.LocalDate.Property property12 = localDate10.era();
        java.util.Date date13 = localDate10.toDate();
        org.joda.time.LocalDate localDate15 = localDate10.withCenturyOfEra((int) ' ');
        int int16 = localDate10.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable5, (org.joda.time.ReadablePartial) localDate10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Mon Feb 09 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localTime2.getFieldType(0);
        org.joda.time.LocalTime localTime8 = localTime2.withMinuteOfHour(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime2.withHourOfDay(39249734);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39249734 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localTime2.getFieldType(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((java.lang.Object) localTime2, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime2.plusMinutes(56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((java.lang.Object) localTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(53645696, 39249034, 53626645, 53649937, 39226059, 53627022, 39247057);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53649937 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale4.toLanguageTag();
        boolean boolean7 = locale4.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean9 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        int int13 = dateTime12.getDayOfYear();
        org.joda.time.DateTime dateTime15 = dateTime12.withYear(39220553);
        org.joda.time.Instant instant16 = dateTime12.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(instant16);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone3, locale4);
        calendar2.setTimeZone(timeZone3);
        calendar2.clear();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int14 = dateTime12.get(dateTimeFieldType13);
        org.joda.time.DateTime dateTime16 = dateTime12.minusMillis((int) '#');
        boolean boolean17 = dateTime12.isBeforeNow();
        org.joda.time.DateTime dateTime19 = dateTime12.plusMillis((int) (short) 1);
        org.joda.time.DateTime.Property property20 = dateTime12.dayOfWeek();
        org.joda.time.DateTime dateTime21 = property20.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 100, dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean26 = localDate24.isSupported(dateTimeFieldType25);
        org.joda.time.DateTimeField[] dateTimeFieldArray27 = localDate24.getFields();
        org.joda.time.LocalDate.Property property28 = localDate24.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 8);
        org.joda.time.DateTime dateTime32 = localDate24.toDateTimeAtMidnight(dateTimeZone31);
        boolean boolean33 = property20.equals((java.lang.Object) dateTimeZone31);
        long long35 = dateTimeZone31.nextTransition(53636904L);
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = dateTimeZone31.getName((long) 39228524, locale37);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap39 = calendar2.getDisplayNames(53621236, 53628225, locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645455253695,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=13,MILLISECOND=707,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39253695 + "'", int14 == 39253695);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 53636904L + "'", long35 == 53636904L);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+10:08" + "'", str38, "+10:08");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone0.hasSameRules(timeZone3);
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone0, locale5);
        int int7 = calendar6.getMinimalDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = calendar6.isSet(53633045);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53633045");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645455253731,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=13,MILLISECOND=743,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        int int2 = localDateTime0.getDayOfYear();
        int int3 = localDateTime0.getMillisOfDay();
        int int4 = localDateTime0.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMinutes(14);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(20);
        org.joda.time.DateTime dateTime9 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withWeekyear(53634314);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withField(dateTimeFieldType15, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property18 = localDateTime13.minuteOfHour();
        java.lang.String str19 = property18.toString();
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = property18.getAsText(locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = localDateTime6.toString("hourOfHalfday", locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53653751 + "'", int3 == 53653751);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 13 + "'", int4 == 13);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Property[minuteOfHour]" + "'", str19, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "54" + "'", str23, "54");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((java.lang.Object) 43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        org.joda.time.DurationField durationField7 = chronology5.days();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        int int10 = dateTimeZone8.getOffsetFromLocal((long) 'a');
        long long13 = dateTimeZone8.convertLocalToUTC((long) 39220553, false);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) durationField7, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.PreciseDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 39220553L + "'", long13 == 39220553L);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(0L);
        org.joda.time.LocalDate.Property property2 = localDate1.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localDate1.get(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withWeekOfWeekyear(53631959);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53631959 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plus(readableDuration1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusSeconds(39221951);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withSecondOfMinute(39233841);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39233841 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("2022-02-17T10:53:52.077Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = dateTimeField6.getType();
        int int9 = dateTimeField6.getLeapAmount((long) 39222493);
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = dateTimeField6.getAsShortText(53628, locale11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 100, dateTimeZone14);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate18 = localDate15.withFieldAdded(durationFieldType16, 0);
        int int19 = localDate18.getYear();
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localDate18, (int) (short) 1, locale21);
        org.joda.time.LocalDate.Property property23 = localDate18.yearOfCentury();
        org.joda.time.LocalDate localDate25 = localDate18.plusMonths(427);
        org.joda.time.LocalDate localDate27 = localDate18.minusYears(59);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = localDate18.getValue(53628);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53628");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "53628" + "'", str12, "53628");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = property1.setCopy("2022-02-21T14:53:53.796Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:53:53.796Z\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        int int2 = localDateTime0.getDayOfYear();
        int int3 = localDateTime0.getMillisOfDay();
        int int4 = localDateTime0.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMinutes(14);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(20);
        org.joda.time.DateTime dateTime9 = localDateTime6.toDateTime(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withDayOfMonth(958);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 958 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53655045 + "'", int3 == 53655045);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMillisOfSecond(53626341);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626341 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime4.withMillisOfSecond(39230101);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39230101 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone3, locale4);
        calendar2.setTimeZone(timeZone3);
        calendar2.clear();
        calendar2.roll(0, 39226059);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = calendar2.getActualMinimum(53654705);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53654705");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645455255280,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=15,MILLISECOND=292,ZONE_OFFSET=12,DST_OFFSET=0]");
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.time.ZoneId zoneId3 = timeZone0.toZoneId();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = calendar4.getGreatestMinimum(56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 56");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645455255336,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=15,MILLISECOND=348,ZONE_OFFSET=12,DST_OFFSET=0]");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = dateTimeFormatter2.parseLocalDate("\u6728\u66dc\u65e5");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("31 Dec 1969 23:59:59 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=31dec196923:59:59gmt");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.time.ZoneId zoneId3 = timeZone0.toZoneId();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone(zoneId3);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = calendar5.isSet(53633019);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53633019");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645455255454,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=15,MILLISECOND=454,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate.Property property6 = localDate4.era();
        java.lang.Class<?> wildcardClass7 = localDate4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 53628785);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(0);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfSecond();
        org.joda.time.LocalTime.Property property5 = localTime3.millisOfSecond();
        org.joda.time.LocalTime localTime6 = property5.roundCeilingCopy();
        org.joda.time.LocalTime localTime8 = property5.addWrapFieldToCopy(39231678);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime10 = localTime8.plus(readablePeriod9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 100, dateTimeZone12);
        org.joda.time.LocalDate.Property property14 = localDate13.weekyear();
        org.joda.time.LocalDate localDate15 = property14.withMaximumValue();
        org.joda.time.LocalDate localDate16 = property14.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = localTime10.isEqual((org.joda.time.ReadablePartial) localDate16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        int int9 = localDateTime7.getDayOfYear();
        int int10 = localDateTime7.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minus(readablePeriod14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        int int18 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime17);
        long long20 = dateTimeZone16.nextTransition((long) 39222286);
        org.joda.time.DateTime dateTime21 = localDateTime11.toDateTime(dateTimeZone16);
        java.util.TimeZone timeZone22 = dateTimeZone16.toTimeZone();
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = timeZone22.getDisplayName(locale23);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53655819 + "'", int10 == 53655819);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 39222286L + "'", long20 == 39222286L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Temps universel coordonn\351" + "'", str24, "Temps universel coordonn\351");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 53630692);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        java.lang.String str2 = property1.getName();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yearOfEra" + "'", str2, "yearOfEra");
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate5 = localDate2.withFieldAdded(durationFieldType3, 0);
        int int6 = localDate5.getYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean11 = localDate9.isSupported(dateTimeFieldType10);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localDate9.getFields();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        int int15 = dateTimeZone13.getOffsetFromLocal((long) 'a');
        long long18 = dateTimeZone13.convertLocalToUTC((long) 39220553, false);
        org.joda.time.DateTime dateTime19 = localDate9.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime20 = localDate5.toDateTimeAtMidnight(dateTimeZone13);
        java.util.TimeZone timeZone21 = dateTimeZone13.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((java.lang.Object) dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 39220553L + "'", long18 == 39220553L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone3, locale4);
        calendar2.setTimeZone(timeZone3);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.roll(53645696, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455256224,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=16,MILLISECOND=236,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645455256224,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=16,MILLISECOND=236,ZONE_OFFSET=12,DST_OFFSET=0]");
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.Chronology chronology4 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.secondOfMinute();
        org.joda.time.Chronology chronology6 = chronology4.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.year();
        long long9 = dateTimeField7.remainder((long) 39246516);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 39246516L + "'", long9 == 39246516L);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(true);
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(12, 9, 41);
        java.util.Calendar.Builder builder11 = builder0.setTimeOfDay(39230101, 39229540, 39233752, 53631736);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone12, locale13);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone15, locale16);
        calendar14.setTimeZone(timeZone15);
        java.util.Calendar.Builder builder19 = builder11.setTimeZone(timeZone15);
        timeZone15.setRawOffset(12);
        java.util.TimeZone.setDefault(timeZone15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = timeZone15.getDisplayName(true, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455256262,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=16,MILLISECOND=274,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645455256262,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=16,MILLISECOND=274,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusDays(5);
        org.joda.time.DateTime.Property property7 = dateTime2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime2.withDayOfWeek(39251922);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39251922 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39256299 + "'", int4 == 39256299);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.minusWeeks(5);
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = property5.getMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = property5.setCopy("Oct 3, 6445 12:00:00 AM");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Oct 3, 6445 12:00:00 AM\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-292275054) + "'", int6 == (-292275054));
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(39);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.minuteOfDay();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology13);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 39226059);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dateTimeFormatter16.print((org.joda.time.ReadablePartial) localDate18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("yearOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"yearOfEra\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        int int5 = localDate4.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis((int) '#');
        boolean boolean14 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime16 = dateTime9.plusMillis((int) (short) 1);
        org.joda.time.DateTime.Property property17 = dateTime9.dayOfWeek();
        org.joda.time.DateTime dateTime18 = property17.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 100, dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean23 = localDate21.isSupported(dateTimeFieldType22);
        org.joda.time.DateTimeField[] dateTimeFieldArray24 = localDate21.getFields();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        int int27 = dateTimeZone25.getOffsetFromLocal((long) 'a');
        long long30 = dateTimeZone25.convertLocalToUTC((long) 39220553, false);
        org.joda.time.DateTime dateTime31 = localDate21.toDateTimeAtStartOfDay(dateTimeZone25);
        boolean boolean32 = dateTime18.isAfter((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime.Property property33 = dateTime18.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(20);
        org.joda.time.LocalDate localDate36 = org.joda.time.LocalDate.now(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime18.toMutableDateTime(dateTimeZone35);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = dateTimeFormatter6.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime37, "527", 53647322);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39256598 + "'", int11 == 39256598);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 39220553L + "'", long30 == 39220553L);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology5.getDateTimeMillis((long) 151383, 53654335, 0, 17, 39236284);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53654335 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime5.plus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime7.minusMillis((int) 'a');
        org.joda.time.LocalTime localTime11 = localTime9.withMinuteOfHour((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        boolean boolean13 = localTime9.isSupported(durationFieldType12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalTime localTime16 = localTime9.withField(dateTimeFieldType14, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.lang.String[] strArray25 = new java.lang.String[] { "53628", "zh_TW", "2017-02-21T14:53:50.427", "und", "\u5354\u5b9a\u4e16\u754c\u6642", "2017", "14:53:47.032", "days", "2022-02-21T14:53:53.796Z", "2022-02-21T14:53:46.596", "2017", "\u6728\u66dc\u65e5", "DateTimeField[dayOfMonth]", "2017", "53", "14:53:47.032", "2022-02-21T14:53:46.596", "2017-02-21T14:53:41.457", "2022-02-17T10:53:52.077Z", "centuries" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.Locale.FilteringMode filteringMode28 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList26, filteringMode28);
        java.util.stream.Stream<java.lang.String> strStream30 = strList26.parallelStream();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + filteringMode28 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode28.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strStream30);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone3, locale4);
        calendar2.setTimeZone(timeZone3);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        java.lang.String str8 = calendar2.getCalendarType();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calendar2.getMaximum(39250082);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 39250082");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455257256,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=17,MILLISECOND=268,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645455257256,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=17,MILLISECOND=268,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "gregory" + "'", str8, "gregory");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone3, locale4);
        calendar2.setTimeZone(timeZone3);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        java.lang.String str8 = calendar2.getCalendarType();
        java.lang.Object obj9 = null;
        boolean boolean10 = calendar2.equals(obj9);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455257282,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=17,MILLISECOND=294,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645455257282,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=17,MILLISECOND=294,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "gregory" + "'", str8, "gregory");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        org.joda.time.DurationField durationField7 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.monthOfYear();
        org.joda.time.DurationField durationField10 = chronology5.days();
        long long13 = durationField10.add((long) 53631959, 53641601);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 4634634380031959L + "'", long13 == 4634634380031959L);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyear();
        org.joda.time.DurationField durationField7 = chronology5.eras();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = durationField7.getDifference((long) 53628785, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyear();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.year();
        long long12 = chronology5.add((long) 53627022, (long) 39226059, 39234978);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = chronology5.add(readablePeriod13, (long) 3, 958);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = chronology5.getDateTimeMillis(12, 53644883, 707, 53653424);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53644883 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1539033615518724L + "'", long12 == 1539033615518724L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(39220553);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime0.plus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime9 = dateTime8.withEarlierOffsetAtOverlap();
        int int10 = dateTime9.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight11 = dateTime9.toDateMidnight();
        boolean boolean13 = dateTime9.isEqual((long) 13);
        int int14 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateTime9);
        java.util.GregorianCalendar gregorianCalendar15 = dateTime9.toGregorianCalendar();
        java.lang.String str16 = gregorianCalendar15.getCalendarType();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar15.clear(39248167);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 39248167");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 17 + "'", int10 == 17);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(gregorianCalendar15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "gregory" + "'", str16, "gregory");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone0.hasSameRules(timeZone3);
        int int6 = timeZone3.getOffset((long) (byte) -1);
        int int7 = timeZone3.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        java.util.Date date11 = localDate10.toDate();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 100, dateTimeZone13);
        java.util.Date date15 = localDate14.toDate();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 100, dateTimeZone17);
        java.util.Date date19 = localDate18.toDate();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 100, dateTimeZone21);
        java.util.Date date23 = localDate22.toDate();
        boolean boolean24 = date19.after(date23);
        boolean boolean25 = date15.before(date19);
        int int26 = date15.getHours();
        int int27 = date15.getHours();
        boolean boolean28 = date11.before(date15);
        java.time.Instant instant29 = date15.toInstant();
        date15.setMonth(39233841);
        boolean boolean32 = timeZone3.inDaylightTime(date15);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Oct 01 00:00:00 UTC 3271456");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.plusDays(39);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.centuries();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology14.getZone();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter2.withChronology(chronology14);
        java.lang.StringBuffer stringBuffer19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = localTime26.getFieldType((int) (byte) 1);
        int int29 = localTime24.get(dateTimeFieldType28);
        org.joda.time.LocalTime.Property property30 = localTime22.property(dateTimeFieldType28);
        org.joda.time.LocalTime localTime31 = property30.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer19, (org.joda.time.ReadablePartial) localTime31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 54 + "'", int29 == 54);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(true);
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(12, 9, 41);
        java.util.Calendar.Builder builder11 = builder0.setTimeOfDay(39230101, 39229540, 39233752, 53631736);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone12, locale13);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone15, locale16);
        calendar14.setTimeZone(timeZone15);
        java.util.Calendar.Builder builder19 = builder11.setTimeZone(timeZone15);
        java.util.Calendar.Builder builder21 = builder19.setLenient(true);
        java.util.Calendar calendar22 = builder19.build();
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale27 = java.util.Locale.TAIWAN;
        java.lang.String str28 = locale26.getDisplayCountry(locale27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = calendar22.getDisplayName(39241654, 53620371, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455257861,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=17,MILLISECOND=873,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645455257862,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=17,MILLISECOND=874,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(calendar22);
        org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=143621423383724,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=6521,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,DAY_OF_YEAR=66,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=49,SECOND=43,MILLISECOND=736,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean9 = localDate7.isSupported(dateTimeFieldType8);
        int int10 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate7);
        java.lang.String str11 = localDate7.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate7.withWeekOfWeekyear(53627022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53627022 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.set(1, 32769, 53623610, 0, 5, 10);
        calendar1.set(6, 100, 53620371);
        calendar1.set(17, 3, 39243366, 53, 11);
        int int19 = calendar1.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 100, dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean24 = localDate22.isSupported(dateTimeFieldType23);
        org.joda.time.DateTimeField[] dateTimeFieldArray25 = localDate22.getFields();
        boolean boolean26 = calendar1.equals((java.lang.Object) dateTimeFieldArray25);
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=3329003855469988,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=107461,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=7,DAY_OF_YEAR=341,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=11,SECOND=10,MILLISECOND=0,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 107461 + "'", int19 == 107461);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("2022-02-21T14:53:46.596");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T14:53:46.596\" is malformed at \"22-02-21T14:53:46.596\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.DateTimeZone dateTimeZone8 = chronology5.getZone();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = localTime16.getFieldType((int) (byte) 1);
        int int19 = localTime14.get(dateTimeFieldType18);
        org.joda.time.LocalTime.Property property20 = localTime12.property(dateTimeFieldType18);
        org.joda.time.LocalTime localTime21 = property20.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime22 = property20.withMaximumValue();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime24 = localTime22.plus(readablePeriod23);
        int[] intArray26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = dateTimeField9.add((org.joda.time.ReadablePartial) localTime22, 100, intArray26, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 54 + "'", int19 == 54);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.set(1, 32769, 53623610, 0, 5, 10);
        calendar1.set(6, 100, 53620371);
        calendar1.set(16, (int) (short) 100, 53620371, 39229315, 39226059, 39228835);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 100, dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.plusDays(39);
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = dateTimeField26.getType();
        int int29 = dateTimeField26.getLeapAmount((long) 39222493);
        java.util.Locale locale31 = java.util.Locale.US;
        java.lang.String str32 = dateTimeField26.getAsShortText(53628, locale31);
        boolean boolean33 = calendar1.before((java.lang.Object) locale31);
        calendar1.set(292278993, 7, (-1), 53633019, 2, 39228524);
        int int41 = calendar1.getFirstDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            calendar1.add(53631736, 53650441);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=292278993,MONTH=7,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=-1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=53633019,MINUTE=2,SECOND=39228524,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "53628" + "'", str32, "53628");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(39);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.minuteOfDay();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology13);
        org.joda.time.DateTimeZone dateTimeZone17 = chronology13.getZone();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = chronology13.get(readablePeriod18, (long) 32772, (long) 39245370);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.set(1, 32769, 53623610, 0, 5, 10);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromCalendarFields(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = calendar1.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=4657119840309988,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=149548,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=94,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=5,SECOND=10,MILLISECOND=0,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate5 = localDate2.withFieldAdded(durationFieldType3, 0);
        int int6 = localDate5.getYear();
        org.joda.time.LocalDate.Property property7 = localDate5.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = property7.setCopy(39233752);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39233752 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight11 = dateTime10.toDateMidnight();
        org.joda.time.MutableDateTime mutableDateTime12 = dateMidnight11.toMutableDateTime();
        int int13 = mutableDateTime12.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime12, "centuries", 53626645);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.LocalDate localDate4 = property3.withMaximumValue();
        org.joda.time.LocalDate localDate5 = property3.withMaximumValue();
        org.joda.time.LocalDate localDate6 = property3.withMinimumValue();
        int int7 = localDate6.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate6.withWeekOfWeekyear(53640933);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53640933 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-292275054) + "'", int7 == (-292275054));
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(70, 53641601, 39258598, 53634768, 32769, 53646462, 53646040);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53634768 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.minuteOfHour();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minus(readableDuration2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusHours(548);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime0.withSecondOfMinute(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = localTime2.withMinuteOfHour((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = dateTimeField6.getType();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minus(readableDuration10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minusMinutes(39233752);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 100, dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.plusDays(39);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.LocalDate.Property property21 = localDate19.era();
        java.util.Date date22 = localDate19.toDate();
        org.joda.time.LocalDate localDate24 = localDate19.withCenturyOfEra((int) ' ');
        java.util.Date date25 = localDate19.toDate();
        int int26 = localDate19.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate29 = localDate19.withPeriodAdded(readablePeriod27, 1);
        int[] intArray30 = localDate19.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray32 = dateTimeField6.addWrapPartial((org.joda.time.ReadablePartial) localDateTime13, 3, intArray30, 39229357);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Mon Feb 09 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Mon Feb 09 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 40 + "'", int26 == 40);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1970, 2, 9]");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        java.io.Writer writer9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        int int11 = dateTime10.getDayOfYear();
        org.joda.time.DateTime dateTime13 = dateTime10.withYear(39220553);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer9, (org.joda.time.ReadableInstant) dateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.Chronology chronology4 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.secondOfDay();
        org.joda.time.DurationField durationField6 = dateTimeField5.getDurationField();
        long long8 = durationField6.getMillis(1645455233953L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1645455233953000L + "'", long8 == 1645455233953000L);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        org.joda.time.Chronology chronology5 = dateTimeFormatter3.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 53628785);
        int int8 = dateTimeFormatter3.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 100, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.plusDays(39);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.centuries();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology15.getZone();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter3.withChronology(chronology15);
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatter3.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.parse("DateTimeField[dayOfMonth]", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2000 + "'", int8 == 2000);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(dateTimeParser20);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.set(1, 32769, 53623610, 0, 5, 10);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromCalendarFields(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.roll(958, 53638763);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=4657119840309988,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=149548,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=94,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=5,SECOND=10,MILLISECOND=0,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(53644883, 53644858, 39232793, 53653424, 39258803, 53625146, 53657099);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53653424 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(39);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.minuteOfDay();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology13);
        boolean boolean17 = dateTimeFormatter16.isParser();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight21 = dateTime20.toDateMidnight();
        org.joda.time.DateTime dateTime23 = dateTime20.plusHours(39);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        int int26 = dateTimeZone24.getOffset((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime27 = dateTime20.withZoneRetainFields(dateTimeZone24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dateTimeFormatter16.print((org.joda.time.ReadableInstant) dateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.add(11, 2022);
        int int6 = calendar1.getGreatestMinimum(11);
        long long7 = calendar1.getTimeInMillis();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withField(dateTimeFieldType12, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.minuteOfHour();
        java.lang.String str16 = property15.toString();
        java.util.Locale locale17 = java.util.Locale.JAPAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.lang.String str20 = property15.getAsText(locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap21 = calendar1.getDisplayNames((int) (byte) 100, 53646040, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=7279199988,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=85,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=12,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7279199988L + "'", long7 == 7279199988L);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Property[minuteOfHour]" + "'", str16, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "54" + "'", str20, "54");
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(107461, 53627055, 53623891, 39257497, 53640520, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39257497 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.set(1, 32769, 53623610, 0, 5, 10);
        calendar1.setMinimalDaysInFirstWeek((int) (short) -1);
        java.lang.Object obj11 = calendar1.clone();
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1,ERA=?,YEAR=1,MONTH=32769,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=53623610,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=5,SECOND=10,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1,ERA=?,YEAR=1,MONTH=32769,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=53623610,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=5,SECOND=10,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1,ERA=?,YEAR=1,MONTH=32769,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=53623610,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=5,SECOND=10,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=12,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1,ERA=?,YEAR=1,MONTH=32769,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=53623610,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=5,SECOND=10,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime2.withDurationAdded(readableDuration10, 13);
        org.joda.time.DateTime dateTime14 = dateTime2.withWeekOfWeekyear(43);
        org.joda.time.DateTime.Property property15 = dateTime2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = property15.setCopy(53625146);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53625146 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39260113 + "'", int4 == 39260113);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(39);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.dayOfWeek();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(39233841, 0, 53648953, 39258803, 5, 53643934, 39245745, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39258803 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        long long6 = java.util.Date.UTC(39232793, 39227799, 53637074, (int) (byte) 0, 39228835, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1345860900885300000L + "'", long6 == 1345860900885300000L);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(39);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfDay();
        org.joda.time.DurationField durationField14 = chronology12.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(24, 39234978, 53644883, 39249960, (int) '4', 39223839, 837, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39249960 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.minus((long) 2);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Instant instant5 = instant3.minus((long) 2);
        boolean boolean6 = instant2.isEqual((org.joda.time.ReadableInstant) instant3);
        boolean boolean7 = instant2.isEqualNow();
        long long8 = instant2.getMillis();
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1645455260264L + "'", long8 == 1645455260264L);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale0);
        boolean boolean3 = locale0.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.plusDays(39);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.year();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) boolean3, chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType((int) (byte) 1);
        int int9 = localTime4.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime2.property(dateTimeFieldType8);
        org.joda.time.LocalTime localTime11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime12 = property10.withMaximumValue();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime12.plus(readablePeriod13);
        org.joda.time.LocalTime.Property property15 = localTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withField(dateTimeFieldType18, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.minusYears(5);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusHours((int) '4');
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.weekyear();
        java.lang.String str26 = property25.getAsString();
        org.joda.time.LocalDateTime localDateTime28 = property25.setCopy(53);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusMinutes(0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = localTime14.compareTo((org.joda.time.ReadablePartial) localDateTime30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54 + "'", int9 == 54);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2017" + "'", str26, "2017");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        org.joda.time.Chronology chronology5 = dateTimeFormatter3.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 53628785);
        int int8 = dateTimeFormatter3.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.parse("2022-01-01T00:00:00.000", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2000 + "'", int8 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone0.hasSameRules(timeZone3);
        timeZone0.setRawOffset(39231678);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = timeZone0.getDisplayName(true, 39233664);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 39233664");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(20);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localDate2.getValue(990);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 990");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(411, 39248838, 39251209, 53633343, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53633343 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(true);
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(12, 9, 41);
        java.util.Calendar.Builder builder11 = builder0.setTimeOfDay(39230101, 39229540, 39233752, 53631736);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone12, locale13);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone15, locale16);
        calendar14.setTimeZone(timeZone15);
        java.util.Calendar.Builder builder19 = builder11.setTimeZone(timeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 100, dateTimeZone21);
        java.util.Date date23 = localDate22.toDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 100, dateTimeZone25);
        java.util.Date date27 = localDate26.toDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 100, dateTimeZone29);
        java.util.Date date31 = localDate30.toDate();
        boolean boolean32 = date27.after(date31);
        boolean boolean33 = date23.before(date27);
        java.lang.String str34 = date27.toGMTString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder35 = builder11.setInstant(date27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455260668,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=20,MILLISECOND=668,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645455260668,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=20,MILLISECOND=668,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str34, "1 Jan 1970 00:00:00 GMT");
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType((int) (byte) 1);
        int int9 = localTime4.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime2.property(dateTimeFieldType8);
        int int11 = property10.getMaximumValueOverall();
        org.joda.time.LocalTime localTime12 = property10.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int17 = dateTime15.get(dateTimeFieldType16);
        org.joda.time.DateTime dateTime19 = dateTime15.plusDays(5);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 100, dateTimeZone21);
        org.joda.time.LocalDate.Property property23 = localDate22.weekyear();
        org.joda.time.Chronology chronology24 = localDate22.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.secondOfMinute();
        org.joda.time.Chronology chronology26 = chronology24.withUTC();
        org.joda.time.DateTime dateTime27 = dateTime19.toDateTime(chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) localTime12, chronology24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54 + "'", int9 == 54);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 39260697 + "'", int17 == 39260697);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = dateTime9.plusDays(5);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate.Property property17 = localDate16.weekyear();
        org.joda.time.Chronology chronology18 = localDate16.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.secondOfMinute();
        org.joda.time.Chronology chronology20 = chronology18.withUTC();
        org.joda.time.DateTime dateTime21 = dateTime13.toDateTime(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(0, 53654775, 24, 8, 2, 53620371, 53631959, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53620371 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39260729 + "'", int11 == 39260729);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.util.Date date3 = new java.util.Date(39237670, 53652677, 14);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.plusDays(39);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfWeek();
        int int12 = dateTimeField10.getMaximumValue((long) 2022);
        long long14 = dateTimeField10.roundCeiling((long) 53);
        int int15 = dateTimeField10.getMinimumValue();
        int int18 = dateTimeField10.getDifference((long) 100, (long) 57);
        java.lang.String str19 = dateTimeField10.getName();
        boolean boolean20 = date3.equals((java.lang.Object) dateTimeField10);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Wed Jun 14 00:00:00 GMT 43710626");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 86400000L + "'", long14 == 86400000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "dayOfWeek" + "'", str19, "dayOfWeek");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        int int8 = dateTimeField6.getMaximumValue((long) 2022);
        long long10 = dateTimeField6.roundCeiling((long) 53);
        int int11 = dateTimeField6.getMinimumValue();
        long long14 = dateTimeField6.add(1539033615518724L, 53627055);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime18 = localTime16.minusSeconds(53626596);
        org.joda.time.LocalTime localTime20 = localTime16.minusHours(53653424);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withField(dateTimeFieldType24, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.minusYears(5);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withCenturyOfEra(100);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.minusMillis(0);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withPeriodAdded(readablePeriod33, 53625146);
        int[] intArray36 = localDateTime35.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray38 = dateTimeField6.add((org.joda.time.ReadablePartial) localTime16, 70, intArray36, 39260799);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 70");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 6172411167518724L + "'", long14 == 6172411167518724L);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(intArray36);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[2017, 2, 21, 53660829]");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(0);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfSecond();
        org.joda.time.LocalTime.Property property5 = localTime3.millisOfSecond();
        org.joda.time.LocalTime localTime6 = property5.roundCeilingCopy();
        org.joda.time.LocalTime localTime8 = property5.addWrapFieldToCopy(39231678);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime8.withHourOfDay(53655613);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53655613 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.plusDays(39);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = dateTimeField11.getType();
        int int13 = localDate2.get(dateTimeFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localDate2.getValue(39251209);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 39251209");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.Chronology chronology4 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.secondOfMinute();
        long long8 = dateTimeField5.add((long) 46, 39223083);
        long long10 = dateTimeField5.roundHalfFloor((long) 39237670);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 39223083046L + "'", long8 == 39223083046L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 39238000L + "'", long10 == 39238000L);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(true);
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(12, 9, 41);
        java.util.Calendar.Builder builder11 = builder0.setTimeOfDay(39230101, 39229540, 39233752, 53631736);
        java.util.Calendar.Builder builder16 = builder0.setTimeOfDay(39240195, 57, (int) (short) 0, 3);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = localTime20.getFieldType((int) (byte) 1);
        int int23 = localTime18.get(dateTimeFieldType22);
        org.joda.time.LocalTime localTime25 = localTime18.minusHours(39222493);
        int[] intArray26 = localTime25.getValues();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder27 = builder0.setFields(intArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 54 + "'", int23 == 54);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(intArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 54, 21, 285]");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.util.Date date1 = new java.util.Date((long) 53637618);
        java.lang.String str2 = date1.toString();
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 14:53:57 GMT 1970");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Thu Jan 01 14:53:57 GMT 1970" + "'", str2, "Thu Jan 01 14:53:57 GMT 1970");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.LocalDate localDate4 = property3.withMaximumValue();
        org.joda.time.LocalDate localDate5 = property3.withMaximumValue();
        java.util.Locale locale6 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        int int8 = property3.getMaximumTextLength(locale6);
        java.lang.String str9 = locale6.toLanguageTag();
        java.lang.Object obj10 = locale6.clone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-TW" + "'", str9, "zh-TW");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "zh_TW");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("1970", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1970");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.Date date3 = localDate2.toDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        java.util.Date date7 = localDate6.toDate();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        java.util.Date date11 = localDate10.toDate();
        boolean boolean12 = date7.after(date11);
        boolean boolean13 = date3.before(date7);
        java.lang.String str14 = date7.toGMTString();
        java.util.Date date15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = date7.after(date15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str14, "1 Jan 1970 00:00:00 GMT");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.plusSeconds((int) '#');
        int int9 = dateTime2.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime2.withCenturyOfEra(53644858);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53644858 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39261748 + "'", int4 == 39261748);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        int int8 = dateTimeField6.getMaximumValue((long) 2022);
        long long10 = dateTimeField6.roundCeiling((long) 53);
        long long12 = dateTimeField6.roundHalfEven((long) (-1));
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withField(dateTimeFieldType15, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.minusYears(5);
        int int20 = localDateTime13.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime13.plusMillis((int) ' ');
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime13.minus(readableDuration23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime13.minusHours(39237645);
        int[] intArray34 = new int[] { 39255025, 53650441, 53647322, 39222493, 39248615, (-292275054) };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = dateTimeField6.set((org.joda.time.ReadablePartial) localDateTime26, 39244958, intArray34, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[39255025, 53650441, 53647322, 39222493, 39248615, -292275054]");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getName(100L);
        long long14 = dateTimeZone8.convertLocalToUTC((long) 53636904, false);
        long long16 = dateTimeZone8.nextTransition(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(53623610, 39, 10, 11, 20, 53648953, 240, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53648953 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 53636904L + "'", long14 == 53636904L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(39250770, 39256654, 53654683, 39258455, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39258455 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(0);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfSecond();
        org.joda.time.LocalTime.Property property5 = localTime3.millisOfSecond();
        org.joda.time.LocalTime localTime6 = property5.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property8 = localTime6.property(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(true);
        java.util.Calendar calendar3 = builder0.build();
        int int4 = calendar3.getWeekYear();
        java.time.Instant instant5 = calendar3.toInstant();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        // The following exception was thrown during execution in test generation
        try {
            calendar3.add(53654335, 39246516);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("Mon Sep 13 16:23:42 UTC 1971");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Mon Sep 13 16:23:42 UTC 1971\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.add(11, 2022);
        boolean boolean5 = calendar1.isLenient();
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=7279200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=85,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("hourOfHalfday");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hourOfHalfday\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime2.withDurationAdded(readableDuration10, 13);
        org.joda.time.DateTime dateTime14 = dateTime2.withWeekOfWeekyear(43);
        org.joda.time.DateTime dateTime16 = dateTime14.withMillisOfSecond((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime16.withDayOfMonth(53627022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53627022 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39262176 + "'", int4 == 39262176);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone0.hasSameRules(timeZone3);
        int int6 = timeZone3.getOffset((long) (byte) -1);
        int int7 = timeZone3.getRawOffset();
        int int8 = timeZone3.getRawOffset();
        int int9 = timeZone3.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyear();
        int int7 = dateTimeField6.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withField(dateTimeFieldType10, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.minusYears(5);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withCenturyOfEra(100);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusMillis(0);
        int[] intArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = dateTimeField6.set((org.joda.time.ReadablePartial) localDateTime14, 39234451, intArray20, 39259994);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 292278993 + "'", int7 == 292278993);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 39241374);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = dateTimeFormatter6.parseMutableDateTime("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter7.getPrinter();
        org.joda.time.Chronology chronology9 = dateTimeFormatter7.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 53628785);
        int int12 = dateTimeFormatter7.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = dateTimeFormatter7.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(39);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology19.getZone();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter7.withChronology(chronology19);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 100, dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.plusDays(39);
        org.joda.time.Chronology chronology29 = localDate28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.years();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology29.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter23.withZone(dateTimeZone31);
        org.joda.time.Chronology chronology33 = dateTimeFormatter23.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = dateTime3.toString(dateTimeFormatter23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 17 + "'", int4 == 17);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNull(dateTimePrinter13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(chronology33);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyear();
        long long9 = dateTimeField6.getDifferenceAsLong((long) 100, (long) 39246516);
        long long11 = dateTimeField6.roundHalfCeiling((long) 39253386);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-259200000L) + "'", long11 == (-259200000L));
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("\u5fb7\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        int int8 = dateTimeField6.getMaximumValue((long) 2022);
        long long10 = dateTimeField6.roundCeiling((long) 53);
        long long12 = dateTimeField6.roundHalfEven((long) (-1));
        long long14 = dateTimeField6.roundCeiling((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withField(dateTimeFieldType17, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.minusYears(5);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        int int24 = localDateTime22.getDayOfYear();
        int int25 = localDateTime22.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int27 = localDateTime26.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.plusMinutes(39248615);
        java.util.Locale locale31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localDateTime26, 32769, locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32769");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 86400000L + "'", long14 == 86400000L);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 53662825 + "'", int25 == 53662825);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21 + "'", int27 == 21);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Instant instant2 = dateTime1.toInstant();
        org.joda.time.Chronology chronology3 = dateTime1.getChronology();
        boolean boolean4 = dateTime0.isEqual((org.joda.time.ReadableInstant) dateTime1);
        int int5 = dateTime1.getMonthOfYear();
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.time.ZoneId zoneId3 = timeZone0.toZoneId();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(zoneId3);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getName(100L);
        java.util.Locale locale9 = new java.util.Locale("", "2017", "minutes");
        java.lang.String str10 = dateTimeZone1.getName((long) (byte) -1, locale9);
        java.lang.String str11 = locale9.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertEquals(locale9.toString(), "_2017_minutes");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_2017_minutes" + "'", str11, "_2017_minutes");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(39);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.minuteOfDay();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology13);
        boolean boolean17 = dateTimeFormatter16.isParser();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 100, dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.plusDays(39);
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.dayOfWeek();
        org.joda.time.DurationField durationField25 = chronology23.weekyears();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology23.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter16.withZone(dateTimeZone26);
        java.lang.Appendable appendable28 = null;
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter27.printTo(appendable28, (org.joda.time.ReadableInstant) instant29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(instant29);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale4.toLanguageTag();
        boolean boolean7 = locale4.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale4);
        boolean boolean9 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.minus((long) 2);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Instant instant17 = instant15.minus((long) 2);
        boolean boolean18 = instant14.isEqual((org.joda.time.ReadableInstant) instant15);
        boolean boolean19 = instant14.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime20 = instant14.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = dateTimeFormatter11.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime20, "", 53657099);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(mutableDateTime20);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.lang.Object obj2 = calendar1.clone();
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj2);
// flaky:         org.junit.Assert.assertEquals(obj2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateTime2.toDateMidnight();
        org.joda.time.DateTime dateTime5 = dateTime2.plusHours(39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime5.withMillisOfSecond(53652385);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53652385 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.util.Locale locale2 = new java.util.Locale("\u5fb7\u6587", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getUnicodeLocaleType("1970-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 1970-01-01");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "\u5fb7\u6587_HI!");
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.Date date3 = localDate2.toDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        java.util.Date date7 = localDate6.toDate();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        java.util.Date date11 = localDate10.toDate();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 100, dateTimeZone13);
        java.util.Date date15 = localDate14.toDate();
        boolean boolean16 = date11.after(date15);
        boolean boolean17 = date7.before(date11);
        int int18 = date7.getHours();
        int int19 = date7.getHours();
        boolean boolean20 = date3.before(date7);
        java.time.Instant instant21 = date7.toInstant();
        date7.setMonth(39233841);
        java.lang.Object obj24 = date7.clone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Oct 01 00:00:00 GMT 3271456");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(obj24);
// flaky:         org.junit.Assert.assertEquals(obj24.toString(), "Wed Oct 01 00:00:00 GMT 3271456");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "Wed Oct 01 00:00:00 GMT 3271456");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "Wed Oct 01 00:00:00 GMT 3271456");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withCenturyOfEra(100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMillis(0);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        int int12 = dateTime11.getDayOfYear();
        org.joda.time.DateTime dateTime14 = dateTime11.withYear(39220553);
        org.joda.time.DateTime dateTime16 = dateTime11.withMinuteOfHour(22);
        org.joda.time.DateTime dateTime17 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime17.millisOfDay();
        java.util.GregorianCalendar gregorianCalendar19 = dateTime17.toGregorianCalendar();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime17.withSecondOfMinute(842);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 842 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(gregorianCalendar19);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.Locale locale12 = java.util.Locale.US;
        java.util.Locale locale13 = java.util.Locale.ROOT;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.lang.String str17 = locale15.toLanguageTag();
        boolean boolean18 = locale15.hasExtensions();
        java.lang.String str19 = locale15.getDisplayScript();
        java.lang.String str20 = locale15.getDisplayName();
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale23 = java.util.Locale.TAIWAN;
        java.lang.String str24 = locale22.getDisplayCountry(locale23);
        java.util.Set<java.lang.Character> charSet25 = locale22.getExtensionKeys();
        org.joda.time.tz.NameProvider nameProvider26 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale29 = new java.util.Locale("+00:00", "");
        java.lang.String str32 = nameProvider26.getName(locale29, "hi!", "zh-TW");
        java.util.Locale.Category category33 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale34 = java.util.Locale.getDefault(category33);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 100, dateTimeZone36);
        org.joda.time.LocalDate.Property property38 = localDate37.weekyear();
        org.joda.time.LocalDate localDate39 = property38.withMaximumValue();
        org.joda.time.LocalDate localDate40 = property38.withMaximumValue();
        java.util.Locale locale41 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        int int43 = property38.getMaximumTextLength(locale41);
        java.lang.String str44 = locale41.toLanguageTag();
        java.util.Locale locale45 = java.util.Locale.US;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 100, dateTimeZone47);
        org.joda.time.LocalDate.Property property49 = localDate48.weekyear();
        org.joda.time.LocalDate localDate50 = property49.withMaximumValue();
        org.joda.time.LocalDate localDate51 = property49.withMaximumValue();
        java.util.Locale locale52 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet53 = locale52.getUnicodeLocaleAttributes();
        int int54 = property49.getMaximumTextLength(locale52);
        java.util.Locale locale55 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet56 = locale55.getUnicodeLocaleAttributes();
        java.lang.String str57 = locale55.toLanguageTag();
        java.util.Locale locale59 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale60 = java.util.Locale.TAIWAN;
        java.lang.String str61 = locale59.getDisplayCountry(locale60);
        java.util.Set<java.lang.Character> charSet62 = locale59.getExtensionKeys();
        org.joda.time.format.DateTimePrinter dateTimePrinter63 = null;
        org.joda.time.format.DateTimeParser dateTimeParser64 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter63, dateTimeParser64);
        org.joda.time.format.DateTimePrinter dateTimePrinter66 = dateTimeFormatter65.getPrinter();
        java.util.Locale locale67 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet68 = locale67.getUnicodeLocaleAttributes();
        java.lang.String str69 = locale67.toLanguageTag();
        boolean boolean70 = locale67.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter65.withLocale(locale67);
        java.util.Locale locale72 = java.util.Locale.JAPAN;
        java.util.Locale locale73 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet74 = locale73.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale73);
        java.util.Locale locale76 = java.util.Locale.TAIWAN;
        java.lang.String str77 = locale76.toLanguageTag();
        java.lang.String str78 = locale76.toLanguageTag();
        java.util.Locale locale79 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet80 = locale79.getUnicodeLocaleAttributes();
        java.lang.String str81 = locale79.toLanguageTag();
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate84 = new org.joda.time.LocalDate((long) 100, dateTimeZone83);
        org.joda.time.LocalDate.Property property85 = localDate84.weekyear();
        org.joda.time.LocalDate localDate86 = property85.withMaximumValue();
        org.joda.time.LocalDate localDate87 = property85.withMaximumValue();
        java.util.Locale locale88 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet89 = locale88.getUnicodeLocaleAttributes();
        int int90 = property85.getMaximumTextLength(locale88);
        java.util.Locale locale93 = new java.util.Locale("+00:00", "");
        java.util.Locale[] localeArray94 = new java.util.Locale[] { locale12, locale13, locale15, locale22, locale29, locale34, locale41, locale45, locale52, locale55, locale59, locale67, locale72, locale73, locale76, locale79, locale88, locale93 };
        java.util.ArrayList<java.util.Locale> localeList95 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList95, localeArray94);
        java.util.Locale locale97 = java.util.Locale.lookup(languageRangeList11, (java.util.Collection<java.util.Locale>) localeList95);
        java.util.List<java.util.Locale> localeList98 = java.util.Locale.filter(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList95);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-TW" + "'", str17, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str20, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charSet25);
        org.junit.Assert.assertNotNull(nameProvider26);
        org.junit.Assert.assertEquals(locale29.toString(), "+00:00");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category33.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "zh-TW" + "'", str44, "zh-TW");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 9 + "'", int54 == 9);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "zh-TW" + "'", str57, "zh-TW");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(charSet62);
        org.junit.Assert.assertNull(dateTimePrinter66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "zh-TW" + "'", str69, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "zh-TW" + "'", str77, "zh-TW");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "zh-TW" + "'", str78, "zh-TW");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "zh-TW" + "'", str81, "zh-TW");
        org.junit.Assert.assertNotNull(dateTimeZone83);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(localDate86);
        org.junit.Assert.assertNotNull(localDate87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 9 + "'", int90 == 9);
        org.junit.Assert.assertEquals(locale93.toString(), "+00:00");
        org.junit.Assert.assertNotNull(localeArray94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNull(locale97);
        org.junit.Assert.assertNotNull(localeList98);
    }
}
