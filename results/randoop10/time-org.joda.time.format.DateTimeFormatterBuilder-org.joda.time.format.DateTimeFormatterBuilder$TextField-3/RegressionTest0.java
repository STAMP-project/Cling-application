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
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100, (int) (short) 0, (int) '4', (int) '4', 0, (int) 'a', (int) (byte) 10, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100, (int) (byte) 1, 10, (int) (short) -1, 0, (int) ' ', (int) 'a', dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) "hi!", chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = timeZone1.getDisplayName(false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMillisOfSecond((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localDateTime6.toString("1969-12-31T23:59:59.999Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.joda.time.Interval interval5 = property3.toInterval();
        long long6 = property3.remainder();
        java.util.Locale locale8 = new java.util.Locale("hi!");
        int int9 = property3.getMaximumShortTextLength(locale8);
        org.joda.time.Chronology chronology10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) int9, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86399999L + "'", long6 == 86399999L);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime6.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTime6.toString("1969-12-31T23:59:59.999Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str7, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        long long11 = dateTimeZone6.convertLocalToUTC(10L, false, (long) 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((int) 'a', (int) '#', (int) (byte) 1, (int) (byte) 0, (int) (short) -1, (int) (byte) 1, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTime9.toString("Property[dayOfYear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str7, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
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
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTime dateTime13 = localDateTime9.toDateTime(dateTimeZone11);
        int int15 = dateTimeZone11.getOffsetFromLocal((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((int) (short) 0, (int) (short) 100, (-1), (int) (byte) 10, (int) '#', (int) (short) 10, (int) 'a', dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        long long12 = dateTimeZone7.convertLocalToUTC(10L, false, (long) 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(0, (int) (byte) 0, 0, (-1), (int) '#', (-292275054), (int) (short) 1, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) dateTimeZone4, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(0, (int) (short) 100, (int) (byte) 0, 10, chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.joda.time.Interval interval5 = property3.toInterval();
        long long6 = property3.remainder();
        java.util.Locale locale8 = new java.util.Locale("hi!");
        int int9 = property3.getMaximumShortTextLength(locale8);
        org.joda.time.LocalDateTime localDateTime11 = property3.addToCopy((long) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withDate((-1), (int) '#', (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86399999L + "'", long6 == 86399999L);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMinuteOfDay((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 1);
        java.util.Locale locale6 = new java.util.Locale("", "1969-12-31T23:59:59.999Z", "1969-12-31T23:59:59.999Z");
        java.util.Locale locale7 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale7.getDisplayCountry();
        java.lang.String str10 = locale6.getDisplayScript(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = localDate1.toString("hi!", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale6.toString(), "_1969-12-31T23:59:59.999Z_1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Taiwan" + "'", str9, "Taiwan");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
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
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_TW" + "'", str2, "zh_TW");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("zho");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: zho");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        timeZone1.setRawOffset((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeZone1.getOffset(0, 0, (int) (byte) 0, (int) (short) 100, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((-292275054), (int) ' ', (int) (short) 1, (-1), (-292275054), (int) 'a', (int) (byte) 1, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localDate2.toString("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale4.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = timeZone1.getDisplayName(false, 23, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 23");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Taiwan" + "'", str6, "Taiwan");
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.secondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.Instant instant7 = mutableDateTime4.toInstant();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(instant7);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMinuteOfDay((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = property7.setCopy("zho", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"zho\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = dateTime1.withSecondOfMinute((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate localDate3 = localDate1.withDayOfYear((int) (byte) 10);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localDate1.toString("", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor2 = strSet1.iterator();
        java.lang.String[] strArray6 = new java.lang.String[] { "1969-12-31T23:59:59.999Z", "365", "1969-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        boolean boolean9 = strSet1.containsAll((java.util.Collection<java.lang.String>) strList7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = strSet1.add("365");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) -1, 10, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 10, (int) '#', (int) (byte) 100, (-1), (int) (short) 0, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate2.withEra((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 3, chronology7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType9.getDurationType();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType9.getRangeDurationType();
        boolean boolean12 = localDate8.isSupported(durationFieldType11);
        org.joda.time.LocalDate.Property property13 = localDate8.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localTime1.compareTo((org.joda.time.ReadablePartial) localDate8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localTime1.getValue(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2022");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.Chronology chronology6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(3, (int) (byte) 0, 1970, 4, 10, 0, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
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
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        int int7 = localTime6.getSecondOfMinute();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        boolean boolean10 = dateTimeZone5.isLocalDateTimeGap(localDateTime9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((int) ' ', (int) 'u', 2022, 10, 1, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr_FR" + "'", str1, "fr_FR");
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_EVEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        timeZone1.setRawOffset((int) (short) 10);
        java.util.Locale locale7 = new java.util.Locale("", "1969-12-31T23:59:59.999Z", "1969-12-31T23:59:59.999Z");
        java.lang.String str8 = timeZone1.getDisplayName(locale7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals(locale7.toString(), "_1969-12-31T23:59:59.999Z_1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        int int6 = localTime1.size();
        int int7 = localTime1.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime1.withHourOfDay(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTime dateTime12 = dateTime7.minusWeeks(10);
        boolean boolean14 = dateTime7.isBefore((long) (-1));
        boolean boolean15 = locale0.equals((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str8, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = dateTimeFormatter2.parseLocalDateTime("zho");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100, 1969, 4, (int) (short) 1, (int) '#', 10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer3, (long) 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        int int4 = dateTimeField2.getLeapAmount((long) (byte) 1);
        long long6 = dateTimeField2.remainder((long) (-292275054));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        boolean boolean12 = dateTimeZone7.isLocalDateTimeGap(localDateTime11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfEra((int) (byte) 10);
        int[] intArray22 = new int[] { 4, 2022, (short) -1, (short) -1, (short) 1, 292278993 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = dateTimeField2.addWrapField((org.joda.time.ReadablePartial) localDateTime14, (int) '#', intArray22, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 31243724946L + "'", long6 == 31243724946L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[4, 2022, -1, -1, 1, 292278993]");
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setHourOfDay((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("1969-12-31T23:59:59.999Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1969-12-31T23:59:59.999Z\" is malformed at \"T23:59:59.999Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(10, (int) ' ', (int) 'x', 1969, (int) (short) 0, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        org.joda.time.DateTime.Property property3 = dateTime1.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) property3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.lang.String str2 = timeZone1.getID();
        java.lang.Object obj3 = timeZone1.clone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Etc/UTC" + "'", str2, "Etc/UTC");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        boolean boolean7 = property5.isLeap();
        org.joda.time.LocalTime localTime8 = property5.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (-1), chronology12);
        boolean boolean14 = dateTimeZone9.isLocalDateTimeGap(localDateTime13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekyear();
        boolean boolean19 = dateTimeZone9.isLocalDateTimeGap(localDateTime17);
        long long21 = dateTimeZone9.nextTransition((long) 2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) localTime8, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2022L + "'", long21 == 2022L);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withMillisOfDay(5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime4.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        org.joda.time.DateTime dateTime7 = localTime6.toDateTimeToday();
        int int8 = localTime6.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType9.getDurationType();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType9.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime6.withFieldAdded(durationFieldType11, 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'years' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((java.lang.Object) "Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Coordinated Universal Time\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        timeZone1.setRawOffset((int) (short) 10);
        java.lang.Object obj4 = timeZone1.clone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "java.util.SimpleTimeZone[id=Etc/UTC,offset=10,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "java.util.SimpleTimeZone[id=Etc/UTC,offset=10,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "java.util.SimpleTimeZone[id=Etc/UTC,offset=10,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        int int6 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime8.add(readableDuration9, 100);
        boolean boolean12 = mutableDateTime5.isBefore((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = property13.set("1969-12-31T23:59:59.999Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1969-12-31T23:59:59.999Z\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDateTime7.toDateTime(dateTimeZone9);
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter4.withChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) strArray1, chronology12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: [Ljava.lang.String;");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) strSet1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Collections$EmptySet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime11 = dateTime9.withLaterOffsetAtOverlap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime11.withTime(5, 0, (int) 'u', (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str7, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withChronology(chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.parse("zho", dateTimeFormatter12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        boolean boolean13 = dateTime6.isBefore((long) (-1));
        int int14 = dateTime6.getYearOfEra();
        org.joda.time.DateTime dateTime16 = dateTime6.withYear((int) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime6.withDayOfYear((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime18.withMonthOfYear((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str7, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1969 + "'", int14 == 1969);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        boolean boolean17 = dateTimeZone12.isLocalDateTimeGap(localDateTime16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekyear();
        boolean boolean22 = dateTimeZone12.isLocalDateTimeGap(localDateTime20);
        long long24 = dateTimeZone12.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = dateTimeFormatter2.parseDateTime("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: hi!" + "'", str2, "java.io.IOException: hi!");
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        int int0 = org.joda.time.MutableDateTime.ROUND_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) "java.io.IOException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.io.IOException: hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withMillisOfDay(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime4.withEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        boolean boolean17 = dateTimeZone12.isLocalDateTimeGap(localDateTime16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekyear();
        boolean boolean22 = dateTimeZone12.isLocalDateTimeGap(localDateTime20);
        long long24 = dateTimeZone12.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone12);
        java.io.Writer writer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter25.printTo(writer26, (long) 365);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((-292275054), 0, 23, 2922750, (int) 'a', (int) (byte) -1, 31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922750 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        java.lang.Appendable appendable12 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekyear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withSecondOfMinute((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable12, (org.joda.time.ReadablePartial) localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        org.joda.time.DateTime dateTime7 = localTime6.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime7.withEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        timeZone1.setRawOffset((int) (short) 10);
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = timeZone1.getDisplayName(locale6);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Koordinierte Universalzeit" + "'", str8, "Koordinierte Universalzeit");
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Property[dayOfYear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=property[dayofyear]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withWeekOfWeekyear(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (byte) 1, 23, (int) (byte) -1, 2, 365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        int int6 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime5);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime5.setHourOfDay(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor2 = strSet1.iterator();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 3, chronology4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType6.getRangeDurationType();
        boolean boolean9 = localDate5.isSupported(durationFieldType8);
        org.joda.time.LocalDate.Property property10 = localDate5.centuryOfEra();
        org.joda.time.LocalDate localDate11 = property10.roundCeilingCopy();
        org.joda.time.LocalDate localDate12 = property10.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtCurrentTime(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) strItor2, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Collections$EmptyIterator");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField10 = chronology8.minutes();
        org.joda.time.DurationField durationField11 = chronology8.minutes();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 292278993, chronology8);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = chronology8.getDateTimeMillis((long) 59, (int) 'u', 1970, 31, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime1.withDate(1969, (int) (byte) 0, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology7.getDateTimeMillis((long) 19, (int) 'u', (int) (byte) 100, 0, 365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setYear((int) '#');
        mutableDateTime1.setYear(292278993);
        mutableDateTime1.setMillisOfSecond(59);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.copy();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDateTime((int) (short) 100, 31, 59, 69, 59, (-1), 69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        boolean boolean7 = property5.isLeap();
        java.util.Locale locale11 = new java.util.Locale("", "1969-12-31T23:59:59.999Z", "1969-12-31T23:59:59.999Z");
        java.lang.String str12 = property5.getAsShortText(locale11);
        org.joda.time.tz.NameProvider nameProvider13 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str16 = locale14.getDisplayScript();
        java.lang.String str19 = nameProvider13.getShortName(locale14, "zh-TW", "Koordinierte Universalzeit");
        boolean boolean20 = locale11.equals((java.lang.Object) "Koordinierte Universalzeit");
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "_1969-12-31T23:59:59.999Z_1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(nameProvider13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (short) 10, (int) 'u', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekyear();
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        boolean boolean13 = dateTimeZone1.isStandardOffset(86399999L);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(100L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusHours(0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDateTime14.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(292278993, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        boolean boolean17 = dateTimeZone12.isLocalDateTimeGap(localDateTime16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekyear();
        boolean boolean22 = dateTimeZone12.isLocalDateTimeGap(localDateTime20);
        long long24 = dateTimeZone12.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone12);
        java.lang.StringBuffer stringBuffer26 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime28.setTime(100L);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime28.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer26, (org.joda.time.ReadableInstant) mutableDateTime28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate localDate3 = localDate1.withDayOfYear((int) (byte) 10);
        org.joda.time.LocalDate localDate5 = localDate3.plusWeeks((-292275054));
        org.joda.time.LocalDate localDate7 = localDate5.withYearOfEra(10);
        org.joda.time.LocalDate.Property property8 = localDate5.yearOfCentury();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = property8.setCopy("1969-12-31T23:59:59.999Z", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1969-12-31T23:59:59.999Z\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = chronology7.get(readablePeriod11, (long) 'x', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localTime6.toString("Property[year]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 100, 0, 86399999, 292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        boolean boolean11 = property10.isLeap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = property10.setCopy("23:00:00.000");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"23:00:00.000\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str7, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusMinutes(1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
        org.joda.time.Interval interval10 = property8.toInterval();
        long long11 = property8.remainder();
        java.util.Locale locale13 = new java.util.Locale("hi!");
        int int14 = property8.getMaximumShortTextLength(locale13);
        java.lang.String str15 = locale13.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localTime1.toString("java.io.IOException: hi!", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 86399999L + "'", long11 == 86399999L);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        int[] intArray16 = new int[] { 4, '4' };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = dateTimeField8.add((org.joda.time.ReadablePartial) localDateTime11, 1, intArray16, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[4, 152]");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Etc/UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'CN' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundHalfCeilingCopy();
        int int9 = localDate8.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate8.withEra(4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        boolean boolean17 = dateTimeZone12.isLocalDateTimeGap(localDateTime16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekyear();
        boolean boolean22 = dateTimeZone12.isLocalDateTimeGap(localDateTime20);
        long long24 = dateTimeZone12.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone12);
        java.lang.Appendable appendable26 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (-1), chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.weekyear();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime.Property property33 = localDateTime29.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter25.printTo(appendable26, (org.joda.time.ReadablePartial) localDateTime29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setYear((int) '#');
        mutableDateTime1.addWeeks(292278993);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (-1), chronology11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = localDateTime12.toDateTime(dateTimeZone14);
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) 292278993, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology7.getDateTimeMillis(2922750, (int) (short) 10, (int) (short) -1, 23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        boolean boolean17 = dateTimeZone12.isLocalDateTimeGap(localDateTime16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekyear();
        boolean boolean22 = dateTimeZone12.isLocalDateTimeGap(localDateTime20);
        long long24 = dateTimeZone12.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withPivotYear(2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = dateTimeFormatter27.parseDateTime("00:00:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        java.util.GregorianCalendar gregorianCalendar20 = dateTime12.toGregorianCalendar();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str7, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "365" + "'", str19, "365");
        org.junit.Assert.assertNotNull(gregorianCalendar20);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.secondOfDay();
        org.joda.time.DurationField durationField13 = chronology11.minutes();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(86399999, 31, (-1), 100, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime4 = dateTimeFormatter2.parseMutableDateTime("365");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        int int8 = localDate2.getEra();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDate2.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getDisplayCountry();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone4 = dateTimeZone3.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) locale0, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Taiwan" + "'", str2, "Taiwan");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withMillisOfDay(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withSecondOfMinute((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusHours((-1));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone7.previousTransition((long) 1);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.withFields((org.joda.time.ReadablePartial) localDateTime10);
        int int12 = localDateTime10.getWeekyear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        org.joda.time.DateTime dateTime17 = property16.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField18 = property16.getField();
        java.util.Locale locale19 = null;
        int int20 = property16.getMaximumShortTextLength(locale19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = property16.addToCopy((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str7, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar12);
        org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=99,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((java.lang.Object) dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusMinutes((int) 'x');
        int int6 = localDateTime5.getYear();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime10 = localTime8.minusMinutes(1);
        org.joda.time.LocalTime localTime12 = localTime8.minusMinutes(31);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1969 + "'", int6 == 1969);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.joda.time.Interval interval5 = property3.toInterval();
        long long6 = property3.remainder();
        java.util.Locale locale8 = new java.util.Locale("hi!");
        int int9 = property3.getMaximumShortTextLength(locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property3.setCopy(2922750);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922750 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86399999L + "'", long6 == 86399999L);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime7 = localTime1.withMillisOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localTime7.get(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime8 = localTime6.minusSeconds((int) (short) 10);
        org.joda.time.LocalTime localTime10 = localTime6.minusSeconds((int) (byte) 100);
        java.lang.String str11 = localTime6.toString();
        org.joda.time.LocalTime localTime13 = localTime6.plusMillis(2922750);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, (org.joda.time.ReadablePartial) localTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00:00:00.000" + "'", str11, "00:00:00.000");
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        mutableDateTime1.setMillisOfDay((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDateTime((int) ' ', 23, (int) 'u', (int) 'a', 10, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale locale7 = new java.util.Locale("hi!");
        java.lang.String str8 = locale7.getScript();
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.util.Locale locale11 = new java.util.Locale("hi!");
        java.lang.String str12 = locale11.getScript();
        java.lang.String str13 = locale11.getDisplayLanguage();
        java.util.Locale locale15 = new java.util.Locale("hi!");
        java.lang.String str16 = locale15.getScript();
        java.lang.String str17 = locale15.getDisplayLanguage();
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale3, locale4, locale5, locale7, locale11, locale15 };
        java.util.ArrayList<java.util.Locale> localeList19 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList19, localeArray18);
        java.util.Locale.FilteringMode filteringMode21 = null;
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList19, filteringMode21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap23);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Locale locale28 = java.util.Locale.TAIWAN;
        java.util.Locale locale29 = java.util.Locale.GERMANY;
        java.util.Locale locale30 = java.util.Locale.GERMANY;
        java.util.Locale locale32 = new java.util.Locale("hi!");
        java.lang.String str33 = locale32.getScript();
        java.lang.String str34 = locale32.getDisplayLanguage();
        java.util.Locale locale36 = new java.util.Locale("hi!");
        java.lang.String str37 = locale36.getScript();
        java.lang.String str38 = locale36.getDisplayLanguage();
        java.util.Locale locale40 = new java.util.Locale("hi!");
        java.lang.String str41 = locale40.getScript();
        java.lang.String str42 = locale40.getDisplayLanguage();
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale28, locale29, locale30, locale32, locale36, locale40 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.Locale.FilteringMode filteringMode46 = null;
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList44, filteringMode46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, strMap48);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.util.Locale locale53 = java.util.Locale.TAIWAN;
        java.util.Locale locale54 = java.util.Locale.GERMANY;
        java.util.Locale locale55 = java.util.Locale.GERMANY;
        java.util.Locale locale57 = new java.util.Locale("hi!");
        java.lang.String str58 = locale57.getScript();
        java.lang.String str59 = locale57.getDisplayLanguage();
        java.util.Locale locale61 = new java.util.Locale("hi!");
        java.lang.String str62 = locale61.getScript();
        java.lang.String str63 = locale61.getDisplayLanguage();
        java.util.Locale locale65 = new java.util.Locale("hi!");
        java.lang.String str66 = locale65.getScript();
        java.lang.String str67 = locale65.getDisplayLanguage();
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale53, locale54, locale55, locale57, locale61, locale65 };
        java.util.ArrayList<java.util.Locale> localeList69 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList69, localeArray68);
        java.util.Locale.FilteringMode filteringMode71 = null;
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.util.Locale>) localeList69, filteringMode71);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.util.Locale locale76 = java.util.Locale.TAIWAN;
        java.util.Locale locale77 = java.util.Locale.GERMANY;
        java.util.Locale locale78 = java.util.Locale.GERMANY;
        java.util.Locale locale80 = new java.util.Locale("hi!");
        java.lang.String str81 = locale80.getScript();
        java.lang.String str82 = locale80.getDisplayLanguage();
        java.util.Locale locale84 = new java.util.Locale("hi!");
        java.lang.String str85 = locale84.getScript();
        java.lang.String str86 = locale84.getDisplayLanguage();
        java.util.Locale locale88 = new java.util.Locale("hi!");
        java.lang.String str89 = locale88.getScript();
        java.lang.String str90 = locale88.getDisplayLanguage();
        java.util.Locale[] localeArray91 = new java.util.Locale[] { locale76, locale77, locale78, locale80, locale84, locale88 };
        java.util.ArrayList<java.util.Locale> localeList92 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList92, localeArray91);
        java.util.Locale.FilteringMode filteringMode94 = null;
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.util.Locale>) localeList92, filteringMode94);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.List<java.util.Locale> localeList97 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList96);
        java.util.Locale locale98 = java.util.Locale.lookup(languageRangeList24, (java.util.Collection<java.util.Locale>) localeList97);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(localeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localeList22);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale32.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals(locale36.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(localeList47);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals(locale61.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals(locale65.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(localeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale80.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals(locale84.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertEquals(locale88.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertNotNull(localeArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNotNull(localeList96);
        org.junit.Assert.assertNotNull(localeList97);
        org.junit.Assert.assertNull(locale98);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(69, 100, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = dateTimeFormatter2.parseLocalDateTime("java.io.IOException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(2000);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (-1), chronology9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime14 = localDateTime10.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.secondOfDay();
        org.joda.time.DurationField durationField17 = chronology15.minutes();
        org.joda.time.DurationField durationField18 = chronology15.minutes();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 292278993, chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((int) (short) 10, (int) (short) 100, (int) (byte) 1, (int) (short) 10, 2000, (int) (byte) 10, (int) ' ', chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Property[year]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=property[year]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = dateTimeFormatter5.parseLocalDateTime("CN");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField1 = mutableDateTime0.getRoundingField();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDateTime(23, (-1), 2000, 69, 69, (-292275054), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeField1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime13 = dateTimeFormatter11.parseMutableDateTime("zho");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        boolean boolean7 = property5.isLeap();
        org.joda.time.LocalTime localTime8 = property5.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime8.withSecondOfMinute((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths(31);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight6 = localDate0.toDateMidnight(dateTimeZone4);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter9.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateMidnight6.toString(dateTimeFormatter9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNull(dateTimeParser10);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime1.setMillisOfDay(10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableDateTime1.add(readablePeriod4);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfYear(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        java.util.Locale locale15 = new java.util.Locale("", "1969-12-31T23:59:59.999Z", "1969-12-31T23:59:59.999Z");
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.lang.String str18 = locale16.getDisplayCountry();
        java.lang.String str19 = locale15.getDisplayScript(locale16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale16);
        boolean boolean21 = dateTimeFormatter2.isPrinter();
        java.io.Writer writer22 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.weekyear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        int int29 = property26.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        mutableDateTime31.add(readableDuration32, 100);
        boolean boolean35 = mutableDateTime28.isBefore((org.joda.time.ReadableInstant) mutableDateTime31);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer22, (org.joda.time.ReadableInstant) mutableDateTime28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertEquals(locale15.toString(), "_1969-12-31T23:59:59.999Z_1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Taiwan" + "'", str18, "Taiwan");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        int int4 = dateTimeField2.getLeapAmount((long) (byte) 1);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate localDate8 = localDate6.withDayOfYear((int) (byte) 10);
        org.joda.time.LocalDate localDate10 = localDate8.plusWeeks((-292275054));
        int int11 = dateTimeField2.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str16 = locale14.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dateTimeField2.set(10L, "millis", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"millis\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 292278993 + "'", int11 == 292278993);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-TW" + "'", str16, "zh-TW");
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeParser[] dateTimeParserArray3 = new org.joda.time.format.DateTimeParser[] { dateTimeParser2 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.append(dateTimePrinter1, dateTimeParserArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No parser supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeParserArray3);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Taiwan", (double) 0L);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.LocalDate localDate5 = dateTime4.toLocalDate();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfDay();
        int int7 = dateTime4.getYear();
        boolean boolean8 = languageRange2.equals((java.lang.Object) int7);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.secondOfDay();
        org.joda.time.DurationField durationField11 = chronology9.minutes();
        org.joda.time.DurationField durationField12 = chronology9.minutes();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 292278993, chronology9);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 'a', chronology9);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = chronology9.getDateTimeMillis((long) (byte) 0, (int) (short) 0, 100, 23, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        boolean boolean7 = property5.isLeap();
        org.joda.time.LocalTime localTime8 = property5.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = localTime8.plusHours((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = localTime10.toString("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime1.add(readablePeriod5, 4);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime1.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = property8.set("java.io.IOException: hi!");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"java.io.IOException: hi!\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(chronology10);
        org.joda.time.DateTimeField dateTimeField14 = chronology10.weekOfWeekyear();
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = dateTimeField14.getAsText((long) 292278993, locale16);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime21 = localTime19.minusSeconds((int) (short) 10);
        int int22 = localTime19.getMinuteOfHour();
        java.util.Locale.Category category23 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale24 = java.util.Locale.getDefault(category23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = dateTimeField14.getAsText((org.joda.time.ReadablePartial) localTime19, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekOfWeekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.FORMAT + "'", category23.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "hi!");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.add((long) 100);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        java.lang.String str10 = dateTime9.toString();
        org.joda.time.DateTime dateTime12 = dateTime9.plus((long) 100);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.util.Calendar calendar15 = dateTime12.toCalendar(locale14);
        int int16 = dateTime12.getMinuteOfHour();
        boolean boolean17 = mutableDateTime0.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime0.add(readableDuration18);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str10, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=99,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime13 = dateTime6.withDurationAdded((long) (short) -1, (int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime13.plusYears(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292280962 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str7, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime7 = property5.addCopy((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property5.setCopy("zh-TW");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"zh-TW\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) '4');
        long long7 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTimeField dateTimeField8 = property3.getField();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = localDateTime15.toDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter12.withChronology(chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology20.monthOfYear();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(chronology20);
        org.joda.time.DateTimeField dateTimeField24 = chronology20.weekOfWeekyear();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = dateTimeField24.getAsText((long) 292278993, locale26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = property3.setCopy("Coordinated Universal Time", locale26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Coordinated Universal Time\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1" + "'", str27, "1");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((-292275054), (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withWeekOfWeekyear(86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setMonthOfYear((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.hours();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = chronology7.add(readablePeriod9, (long) (short) 1, (int) '#');
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = chronology7.get(readablePeriod13, (long) (byte) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 9);
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekyear();
        org.joda.time.LocalDateTime localDateTime11 = property10.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer6, (org.joda.time.ReadablePartial) localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime dateTime17 = dateTime15.plus((long) (-292275054));
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes((int) (byte) -1);
        org.joda.time.DateTime dateTime21 = dateTime17.plusSeconds((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = dateTime17.withDayOfYear(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str7, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar12);
        org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=99,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "zh_TW");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale locale7 = new java.util.Locale("hi!");
        java.lang.String str8 = locale7.getScript();
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.util.Locale locale11 = new java.util.Locale("hi!");
        java.lang.String str12 = locale11.getScript();
        java.lang.String str13 = locale11.getDisplayLanguage();
        java.util.Locale locale15 = new java.util.Locale("hi!");
        java.lang.String str16 = locale15.getScript();
        java.lang.String str17 = locale15.getDisplayLanguage();
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale3, locale4, locale5, locale7, locale11, locale15 };
        java.util.ArrayList<java.util.Locale> localeList19 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList19, localeArray18);
        java.util.Locale.FilteringMode filteringMode21 = null;
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList19, filteringMode21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap23);
        java.util.Locale locale25 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor27 = strSet26.iterator();
        java.lang.String[] strArray31 = new java.lang.String[] { "1969-12-31T23:59:59.999Z", "365", "1969-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        boolean boolean34 = strSet26.containsAll((java.util.Collection<java.lang.String>) strList32);
        java.lang.Object[] objArray35 = strSet26.toArray();
        java.util.Locale locale36 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet37 = locale36.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor38 = strSet37.iterator();
        java.lang.String[] strArray42 = new java.lang.String[] { "1969-12-31T23:59:59.999Z", "365", "1969-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        boolean boolean45 = strSet37.containsAll((java.util.Collection<java.lang.String>) strList43);
        boolean boolean46 = strSet26.remove((java.lang.Object) strSet37);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet37);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = strSet37.add("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(localeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localeList22);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strList47);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.io.IOException iOException0 = new java.io.IOException();
        java.lang.String str1 = iOException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.io.IOException" + "'", str1, "java.io.IOException");
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withChronology(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        boolean boolean18 = dateTimeZone13.isLocalDateTimeGap(localDateTime17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (-1), chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.weekyear();
        boolean boolean23 = dateTimeZone13.isLocalDateTimeGap(localDateTime21);
        long long25 = dateTimeZone13.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter3.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter26.withPivotYear(2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.parse("clockhourOfHalfday", dateTimeFormatter26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DurationField durationField6 = property5.getDurationField();
        int int8 = durationField6.getValue((long) 1969);
        long long10 = durationField6.getMillis((int) 'u');
        long long13 = durationField6.getMillis((long) (byte) 100, (long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3692163384000L + "'", long10 == 3692163384000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3155760000000L + "'", long13 == 3155760000000L);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        timeZone1.setRawOffset((int) (short) 10);
        java.time.ZoneId zoneId4 = timeZone1.toZoneId();
        java.lang.String str5 = timeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Etc/UTC" + "'", str5, "Etc/UTC");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) 'a', (int) 'a', 70, (-1), (int) 'u', 4, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("2022-02-25T15:06:04.424Z", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-25t15:06:04.424z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localDate9.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime1.add(readablePeriod5, 4);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime1.millisOfSecond();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property11 = localDate9.property(dateTimeFieldType10);
        int int12 = mutableDateTime1.get(dateTimeFieldType10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.dayOfYear();
        mutableDateTime1.addDays(2);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-292275054) + "'", int12 == (-292275054));
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField1 = mutableDateTime0.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getDurationType();
        mutableDateTime0.add(durationFieldType3, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime15 = localDateTime11.toDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter8.withChronology(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.monthOfYear();
        org.joda.time.DurationField durationField19 = durationFieldType3.getField(chronology16);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = chronology16.add(readablePeriod20, (long) 0, 2022);
        org.junit.Assert.assertNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendSecondOfMinute(0);
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder0.appendOptional(dateTimeParser13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No parser supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatterBuilder9.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendCenturyOfEra(1969, 365);
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser[] dateTimeParserArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.append(dateTimePrinter14, dateTimeParserArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No parsers supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        org.joda.time.DateTime.Property property3 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime4 = property3.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime4.withDate(10, (int) 'u', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        org.joda.time.LocalTime localTime5 = localTime1.minusSeconds((int) (byte) 100);
        java.lang.String str6 = localTime1.toString();
        org.joda.time.LocalTime localTime8 = localTime1.plusMillis(2922750);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime1.withHourOfDay(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00:00:00.000" + "'", str6, "00:00:00.000");
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime11.withDate((int) (short) 100, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str7, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("ISOChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ISOChronology[Etc/UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        java.util.Locale locale15 = new java.util.Locale("", "1969-12-31T23:59:59.999Z", "1969-12-31T23:59:59.999Z");
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.lang.String str18 = locale16.getDisplayCountry();
        java.lang.String str19 = locale15.getDisplayScript(locale16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale16);
        boolean boolean21 = dateTimeFormatter2.isPrinter();
        java.io.Writer writer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer22, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertEquals(locale15.toString(), "_1969-12-31T23:59:59.999Z_1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Taiwan" + "'", str18, "Taiwan");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("00:00:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"00:00:00.000\" is malformed at \":00:00.000\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusSeconds((int) (byte) 100);
        int int5 = localDateTime4.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withField(dateTimeFieldType7, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime6 = property3.addToCopy((-1));
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (-1), chronology9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfYear();
        org.joda.time.DurationField durationField12 = property11.getLeapDurationField();
        org.joda.time.Interval interval13 = property11.toInterval();
        long long14 = property11.remainder();
        java.util.Locale locale16 = new java.util.Locale("hi!");
        int int17 = property11.getMaximumShortTextLength(locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = localDateTime6.toString("zh-TW", locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 86399999L + "'", long14 == 86399999L);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zh_TW", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh_tw");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 9);
        java.util.Locale locale7 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.parse("", dateTimeFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = dateTimeFormatter2.parseLocalDateTime("millisOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        boolean boolean17 = dateTimeZone12.isLocalDateTimeGap(localDateTime16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekyear();
        boolean boolean22 = dateTimeZone12.isLocalDateTimeGap(localDateTime20);
        long long24 = dateTimeZone12.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeFormatter25.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime28.set(dateTimeFieldType29, (-292275054));
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime28.yearOfEra();
        mutableDateTime28.setYear((int) '#');
        mutableDateTime28.setYear(292278993);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (-1), chronology41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone45 = dateTimeZone44.toTimeZone();
        org.joda.time.DateTime dateTime46 = localDateTime42.toDateTime(dateTimeZone44);
        java.lang.String str47 = dateTime46.toString();
        org.joda.time.DateTime dateTime49 = dateTime46.plus((long) 100);
        org.joda.time.DateTime.Property property50 = dateTime49.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.DateTime dateTime52 = dateTime49.plus(readableDuration51);
        boolean boolean53 = dateTimeZone38.equals((java.lang.Object) readableDuration51);
        mutableDateTime28.setZone(dateTimeZone38);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = dateTimeFormatter25.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime28, "DateTimeField[year]", 365);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str47, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime2.withTime((int) (short) -1, 1, (int) (short) 100, 23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.lang.String str5 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: hi!" + "'", str5, "java.io.IOException: hi!");
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.minusHours((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withTime((int) (short) 100, (int) 'x', 19, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.millisOfSecond();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(0L);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime2.compareTo((org.joda.time.ReadablePartial) localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime4 = dateTime1.withDurationAdded(3600000L, (int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime1.withDayOfWeek(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(5, (int) (byte) 10, 0, (int) (short) 1, (int) 'a', (int) (short) 0, 69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.withMonthOfYear(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime2.withDayOfWeek(365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField1 = mutableDateTime0.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getDurationType();
        mutableDateTime0.add(durationFieldType3, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime15 = localDateTime11.toDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter8.withChronology(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.monthOfYear();
        org.joda.time.DurationField durationField19 = durationFieldType3.getField(chronology16);
        org.joda.time.DateTimeField dateTimeField20 = chronology16.weekyear();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime24 = localTime22.minusSeconds((int) (short) 10);
        int int25 = localTime22.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        int int31 = dateTimeField29.getLeapAmount((long) (byte) 1);
        long long33 = dateTimeField29.remainder((long) (-292275054));
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) (-1), chronology35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.weekyear();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime36.minus(readablePeriod42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime36.withYearOfCentury(23);
        int[] intArray48 = new int[] { 4, (short) 1 };
        int int49 = dateTimeField29.getMaximumValue((org.joda.time.ReadablePartial) localDateTime36, intArray48);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray51 = dateTimeField20.addWrapField((org.joda.time.ReadablePartial) localTime22, (int) (short) 0, intArray48, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 31243724946L + "'", long33 == 31243724946L);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[14, 1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 292278993 + "'", int49 == 292278993);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        timeZone1.setRawOffset((int) (short) 10);
        java.time.ZoneId zoneId4 = timeZone1.toZoneId();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("java.io.IOException: hi!");
        boolean boolean7 = timeZone1.hasSameRules(timeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.hours();
        org.joda.time.DurationField durationField13 = chronology11.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(31, 292278993, (int) (short) 10, (int) 'a', chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        org.joda.time.LocalDate.Property property8 = localDate2.year();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.weekyear();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.minus(readablePeriod17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime11.withMonthOfYear(1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusMinutes(292278993);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localDate2.compareTo((org.joda.time.ReadablePartial) localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime dateTime17 = dateTime15.plus((long) (-292275054));
        org.joda.time.DateTime dateTime19 = dateTime15.minusSeconds(1969);
        org.joda.time.ReadableInstant readableInstant20 = null;
        boolean boolean21 = dateTime15.isEqual(readableInstant20);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str7, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar12);
        org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=99,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        int int8 = localDate2.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        boolean boolean15 = dateTimeZone10.isLocalDateTimeGap(localDateTime14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (-1), chronology17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.weekyear();
        boolean boolean20 = dateTimeZone10.isLocalDateTimeGap(localDateTime18);
        boolean boolean22 = dateTimeZone10.isStandardOffset(86399999L);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(100L, dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusHours(0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = localDate2.compareTo((org.joda.time.ReadablePartial) localDateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTime dateTime13 = localDateTime9.toDateTime(dateTimeZone11);
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime13.minusWeeks(10);
        boolean boolean20 = dateTime13.isBefore((long) (-1));
        int int21 = dateTime13.getYearOfEra();
        org.joda.time.DateTime dateTime23 = dateTime13.withYear((int) (byte) 0);
        int int24 = dateTime13.getDayOfWeek();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (-1), chronology26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.DateTime dateTime31 = localDateTime27.toDateTime(dateTimeZone29);
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.secondOfDay();
        org.joda.time.DurationField durationField34 = chronology32.minutes();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.weekyearOfCentury();
        org.joda.time.DateTime dateTime36 = dateTime13.withChronology(chronology32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(0, 2000, 52, (int) '#', 0, (int) (byte) 1, (int) (byte) 1, chronology32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str14, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1969 + "'", int21 == 1969);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(2, 54367285, 2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54367285 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.joda.time.Interval interval5 = property3.toInterval();
        long long6 = property3.remainder();
        java.util.Locale locale8 = new java.util.Locale("hi!");
        int int9 = property3.getMaximumShortTextLength(locale8);
        org.joda.time.LocalDateTime localDateTime11 = property3.addToCopy((long) 'u');
        int int12 = property3.getLeapAmount();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86399999L + "'", long6 == 86399999L);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = dateTimeFormatter2.parseLocalDateTime("CHN");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths(31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (byte) -1, (int) 'u', 1, (int) (byte) -1, 292278993, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        timeZone1.setRawOffset((int) (short) 10);
        java.time.ZoneId zoneId4 = timeZone1.toZoneId();
        java.time.ZoneId zoneId5 = timeZone1.toZoneId();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zoneId5);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
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
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.years();
        org.joda.time.LocalDate localDate8 = localDate0.withFieldAdded(durationFieldType6, (int) (byte) 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = localDateTime14.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter11.withChronology(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField23 = chronology19.millis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) localDate0, chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((-1));
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = localDateTime8.toDateTime(dateTimeZone10);
        java.lang.String str13 = dateTime12.toString();
        org.joda.time.DateTime dateTime15 = dateTime12.plus((long) 100);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.util.Calendar calendar18 = dateTime15.toCalendar(locale17);
        int int19 = dateTime15.getMinuteOfHour();
        org.joda.time.DateTime dateTime21 = dateTime15.withYearOfEra((int) 'u');
        org.joda.time.DateTime dateTime23 = dateTime21.plus((long) (-292275054));
        org.joda.time.DateTime dateTime25 = dateTime23.minusMinutes((int) (byte) -1);
        org.joda.time.DateTime dateTime27 = dateTime23.plusSeconds((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer5, (org.joda.time.ReadableInstant) dateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str13, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar18);
        org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=99,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime1.add(readablePeriod5, 4);
        int int8 = mutableDateTime1.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfMonth((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 86399999 + "'", int8 == 86399999);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.io.IOException\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds(0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withChronology(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime11.plusMinutes(2);
        org.joda.time.DateTime dateTime17 = dateTime15.minus((long) 1970);
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime17.withMinuteOfHour((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str7, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime12 = dateTime9.withWeekyear((int) 'x');
        org.joda.time.DateTime dateTime14 = dateTime12.plusWeeks((int) (byte) 0);
        org.joda.time.DateTime.Property property15 = dateTime12.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime12.withMonthOfYear(366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str7, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatterBuilder9.toFormatter();
        boolean boolean11 = dateTimeFormatter10.isParser();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer12, 31556952000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendTimeZoneId();
        boolean boolean11 = dateTimeFormatterBuilder10.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendClockhourOfHalfday(86399999);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendHourOfDay((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (-1), chronology20);
        boolean boolean22 = dateTimeZone17.isLocalDateTimeGap(localDateTime21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.weekyear();
        boolean boolean27 = dateTimeZone17.isLocalDateTimeGap(localDateTime25);
        long long29 = dateTimeZone17.nextTransition((long) 2022);
        long long31 = dateTimeZone17.nextTransition(3600000L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((java.lang.Object) (short) 0, dateTimeZone17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 2022L + "'", long29 == 2022L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 3600000L + "'", long31 == 3600000L);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"zh-TW\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        boolean boolean17 = dateTimeZone12.isLocalDateTimeGap(localDateTime16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekyear();
        boolean boolean22 = dateTimeZone12.isLocalDateTimeGap(localDateTime20);
        long long24 = dateTimeZone12.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeFormatter25.getZone();
        java.lang.StringBuffer stringBuffer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter25.printTo(stringBuffer27, (long) 54367285);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        java.util.Locale locale15 = new java.util.Locale("", "1969-12-31T23:59:59.999Z", "1969-12-31T23:59:59.999Z");
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.lang.String str18 = locale16.getDisplayCountry();
        java.lang.String str19 = locale15.getDisplayScript(locale16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter20.withDefaultYear((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = dateTimeFormatter20.parseLocalTime("Property[year]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertEquals(locale15.toString(), "_1969-12-31T23:59:59.999Z_1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str18, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((java.lang.Object) "secondOfMinute", chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"secondOfMinute\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate10 = property7.addToCopy((int) ' ');
        org.joda.time.LocalDate localDate11 = property7.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDate11.getValue(70);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 70");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DurationField durationField10 = chronology7.minutes();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter13.withChronology(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.clockhourOfHalfday();
        org.joda.time.DurationField durationField25 = chronology21.days();
        long long28 = durationField25.subtract((long) (-292275054), (long) 10);
        int int29 = durationField10.compareTo(durationField25);
        java.lang.String str30 = durationField25.toString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1156275054L) + "'", long28 == (-1156275054L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "DurationField[days]" + "'", str30, "DurationField[days]");
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.joda.time.Interval interval5 = property3.toInterval();
        long long6 = property3.remainder();
        java.util.Locale locale8 = new java.util.Locale("hi!");
        int int9 = property3.getMaximumShortTextLength(locale8);
        org.joda.time.LocalDateTime localDateTime11 = property3.addToCopy((long) 'u');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withWeekyear(100);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = property14.getLocalDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86399999L + "'", long6 == 86399999L);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusHours(0);
        int int9 = localDateTime4.getHourOfDay();
        org.joda.time.LocalDateTime.Property property10 = localDateTime4.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField12 = localDateTime4.getField((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 23 + "'", int9 == 23);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(0, 52, (int) (short) 1, 54367285, 0, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54367285 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
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
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("365");
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate1.withYearOfCentury(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.lang.String str3 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u534f\u8c03\u4e16\u754c\u65f6\u95f4" + "'", str3, "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withChronology(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        boolean boolean18 = dateTimeZone13.isLocalDateTimeGap(localDateTime17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (-1), chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.weekyear();
        boolean boolean23 = dateTimeZone13.isLocalDateTimeGap(localDateTime21);
        long long25 = dateTimeZone13.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter3.withZone(dateTimeZone13);
        long long28 = dateTimeZone13.nextTransition((long) (byte) -1);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 1970, dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = dateTime29.withEra(12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTime dateTime13 = localDateTime9.toDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfDay();
        org.joda.time.DurationField durationField16 = chronology14.minutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(1, 1969, (int) (byte) 10, 53, (int) (byte) -1, 366, (-292275054), chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        long long9 = dateTimeField7.roundCeiling(31243724946L);
        org.joda.time.DurationField durationField10 = dateTimeField7.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeField7.set(3600000L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 31244400000L + "'", long9 == 31244400000L);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatterBuilder9.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendCenturyOfEra(1969, 365);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendYear(0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder13.appendYearOfCentury((int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.minuteOfHour();
        int int4 = localDateTime2.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withYearOfCentury((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("DurationField[years]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"DurationField[years]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 19);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DurationField durationField6 = property5.getLeapDurationField();
        org.joda.time.Interval interval7 = property5.toInterval();
        long long8 = property5.remainder();
        java.lang.String str9 = property5.toString();
        org.joda.time.LocalDateTime localDateTime11 = property5.setCopy((int) (short) 1);
        int int12 = localDateTime11.getDayOfMonth();
        int int13 = localDateTime11.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = localDate1.isEqual((org.joda.time.ReadablePartial) localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNull(durationField6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 86399999L + "'", long8 == 86399999L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[dayOfYear]" + "'", str9, "Property[dayOfYear]");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 23 + "'", int13 == 23);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray17 = new int[] { 69, 0, 59, 52 };
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property21 = localDate19.property(dateTimeFieldType20);
        java.util.Locale locale25 = new java.util.Locale("Property[dayOfYear]", "");
        org.joda.time.LocalDate localDate26 = property21.setCopy("365", locale25);
        java.util.Locale locale28 = new java.util.Locale("hi!");
        java.lang.String str29 = locale28.getScript();
        java.util.Locale locale30 = locale28.stripExtensions();
        int int31 = property21.getMaximumShortTextLength(locale28);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray32 = dateTimeField10.set(readablePartial11, (int) 'a', intArray17, "millisOfDay", locale28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"millisOfDay\" for weekyearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[69, 0, 59, 52]");
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertEquals(locale25.toString(), "property[dayofyear]");
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertEquals(locale28.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean10 = localDateTime2.isSupported(dateTimeFieldType9);
        int int11 = localDateTime2.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = localDateTime2.toDate();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        org.joda.time.DateTime dateTime4 = dateTime1.minusDays((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime1.withDate(2922750, (int) (byte) 100, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withMillisOfDay(5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime9.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = chronology7.get(readablePeriod9, 3600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        int int4 = dateTimeZone2.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property7 = localTime5.property(dateTimeFieldType6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder1.appendFraction(dateTimeFieldType6, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatterBuilder10.toFormatter();
        boolean boolean12 = dateTimeFormatter11.isParser();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.parse("19", dateTimeFormatter11);
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer14, (long) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime1.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = mutableDateTime1.get(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField(chronology14);
        int int17 = dateTimeField15.getLeapAmount((long) (byte) 1);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusSeconds((int) (byte) 100);
        int int23 = localDateTime22.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.era();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (-1), chronology26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfYear();
        org.joda.time.DurationField durationField29 = property28.getLeapDurationField();
        org.joda.time.Interval interval30 = property28.toInterval();
        long long31 = property28.remainder();
        java.util.Locale locale33 = new java.util.Locale("hi!");
        int int34 = property28.getMaximumShortTextLength(locale33);
        java.lang.String str35 = locale33.getDisplayScript();
        java.lang.String str36 = dateTimeField15.getAsShortText((org.joda.time.ReadablePartial) localDateTime22, locale33);
        int int37 = mutableDateTime11.get(dateTimeField15);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime11.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime40 = property38.add(3155760000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Magnitude of add amount is too large: 3155760000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNull(durationField29);
        org.junit.Assert.assertNotNull(interval30);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 2L + "'", long31 == 2L);
        org.junit.Assert.assertEquals(locale33.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1969" + "'", str36, "1969");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
        org.junit.Assert.assertNotNull(property38);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(70, 9, 292278993, (int) (byte) -1, 23, 53, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds(0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withChronology(chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime(dateTimeZone18);
        java.lang.String str21 = dateTime20.toString();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.plus(readableDuration22);
        org.joda.time.Instant instant24 = dateTime20.toInstant();
        boolean boolean25 = dateTime13.isEqual((org.joda.time.ReadableInstant) instant24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = dateTime13.withDate((int) '#', (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str21, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.io.IOException\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTimeField dateTimeField20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dateTime12.get(dateTimeField20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeField must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "365" + "'", str19, "365");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.joda.time.Interval interval5 = property3.toInterval();
        long long6 = property3.remainder();
        java.lang.String str7 = property3.toString();
        java.lang.String str8 = property3.getAsText();
        boolean boolean9 = property3.isLeap();
        int int10 = property3.get();
        org.joda.time.LocalDateTime localDateTime11 = property3.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = property3.setCopy("clockhourOfHalfday");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"clockhourOfHalfday\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(interval5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[dayOfYear]" + "'", str7, "Property[dayOfYear]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekyear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.plusWeeks((int) (short) 1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime8.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.withMinuteOfHour(0);
        int int17 = localDateTime16.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withFieldAdded(durationFieldType18, 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (-1), chronology25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.DateTime dateTime30 = localDateTime26.toDateTime(dateTimeZone28);
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter23.withChronology(chronology31);
        org.joda.time.DurationField durationField33 = durationFieldType18.getField(chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((int) (short) 10, 16, 2, 2922750, 19, (int) (byte) 10, chronology31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922750 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 70 + "'", int17 == 70);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(timeZone29);
// flaky:         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.joda.time.Interval interval5 = property3.toInterval();
        long long6 = property3.remainder();
        java.lang.String str7 = property3.toString();
        java.lang.String str8 = property3.getAsText();
        boolean boolean9 = property3.isLeap();
        int int10 = property3.get();
        org.joda.time.LocalDateTime localDateTime11 = property3.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDateTime11.toString("Property[dayOfYear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(interval5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[dayOfYear]" + "'", str7, "Property[dayOfYear]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMillisOfSecond((int) (byte) 100);
        int int7 = localDateTime4.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 69 + "'", int7 == 69);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 9);
        java.util.Locale locale7 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.parse("Koordinierte Universalzeit", dateTimeFormatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.joda.time.Interval interval5 = property3.toInterval();
        long long6 = property3.remainder();
        java.lang.String str7 = property3.toString();
        java.lang.String str8 = property3.getAsText();
        boolean boolean9 = property3.isLeap();
        int int10 = property3.get();
        org.joda.time.LocalDateTime localDateTime11 = property3.withMaximumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 3, chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType15.getRangeDurationType();
        boolean boolean18 = localDate14.isSupported(durationFieldType17);
        org.joda.time.LocalDate.Property property19 = localDate14.centuryOfEra();
        org.joda.time.LocalDate.Property property20 = localDate14.year();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDate14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(interval5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[dayOfYear]" + "'", str7, "Property[dayOfYear]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendSecondOfMinute(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendEraText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap14 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendTimeZoneName(strMap14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder13.appendTimeZoneOffset("java.io.IOException", false, (int) (byte) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withPeriodAdded(readablePeriod11, 2922750);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withEra(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField3 = localDateTime1.getField(54367285);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 54367285");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=coordinated universal time");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime6.plusSeconds(1970);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = localDateTime14.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.hours();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        java.lang.String str30 = dateTime29.toString();
        org.joda.time.DateTime dateTime32 = dateTime29.plus((long) 100);
        org.joda.time.DateTime dateTime34 = dateTime32.minusSeconds(0);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.withChronology(chronology35);
        org.joda.time.DateTime dateTime38 = dateTime34.plusMinutes(2);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime34.minus(readablePeriod39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int42 = dateTime34.get(dateTimeFieldType41);
        org.joda.time.DateTime.Property property43 = dateTime34.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType45 = dateTimeFieldType44.getRangeDurationType();
        java.lang.String str46 = dateTimeFieldType44.getName();
        org.joda.time.DateTime.Property property47 = dateTime34.property(dateTimeFieldType44);
        int int48 = localDateTime22.get(dateTimeFieldType44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime50 = dateTime11.withField(dateTimeFieldType44, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str30, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "clockhourOfHalfday" + "'", str46, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDateTime7.toDateTime(dateTimeZone9);
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfDay();
        org.joda.time.DurationField durationField14 = chronology12.minutes();
        org.joda.time.DurationField durationField15 = chronology12.minutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((int) (short) 1, 31, 2922750, 3, 70, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.joda.time.Interval interval5 = property3.toInterval();
        long long6 = property3.remainder();
        java.lang.String str7 = property3.toString();
        org.joda.time.LocalDateTime localDateTime9 = property3.setCopy((int) (short) 1);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime13 = localTime11.minusSeconds((int) (short) 10);
        org.joda.time.LocalTime localTime15 = localTime11.minusSeconds((int) (byte) 100);
        java.lang.String str16 = localTime11.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(interval5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[dayOfYear]" + "'", str7, "Property[dayOfYear]");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00:00:00.003" + "'", str16, "00:00:00.003");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds(0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withChronology(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime11.plusMinutes(2);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime11.minus(readablePeriod16);
        org.joda.time.DateTime dateTime19 = dateTime11.minusMonths(23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime19.withSecondOfMinute(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minusMillis(1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withMillisOfDay(31);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDateTime10.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime7 = property5.addCopy((int) 'u');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.parse("365");
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths((int) 'u');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate9.withPeriodAdded(readablePeriod12, (int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int16 = localDate14.get(dateTimeFieldType15);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localTime7.compareTo((org.joda.time.ReadablePartial) localDate14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        boolean boolean13 = dateTime6.isBefore((long) (-1));
        int int14 = dateTime6.getYearOfEra();
        org.joda.time.DateTime dateTime16 = dateTime6.withYear((int) (byte) 0);
        int int17 = dateTime6.getDayOfWeek();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        org.joda.time.DateTime dateTime24 = localDateTime20.toDateTime(dateTimeZone22);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.secondOfDay();
        org.joda.time.DurationField durationField27 = chronology25.minutes();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.weekyearOfCentury();
        org.joda.time.DateTime dateTime29 = dateTime6.withChronology(chronology25);
        org.joda.time.DateTimeField dateTimeField30 = chronology25.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long35 = chronology25.getDateTimeMillis((int) (byte) -1, 2022, 3, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime1.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = mutableDateTime1.get(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField(chronology14);
        int int17 = dateTimeField15.getLeapAmount((long) (byte) 1);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusSeconds((int) (byte) 100);
        int int23 = localDateTime22.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.era();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (-1), chronology26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfYear();
        org.joda.time.DurationField durationField29 = property28.getLeapDurationField();
        org.joda.time.Interval interval30 = property28.toInterval();
        long long31 = property28.remainder();
        java.util.Locale locale33 = new java.util.Locale("hi!");
        int int34 = property28.getMaximumShortTextLength(locale33);
        java.lang.String str35 = locale33.getDisplayScript();
        java.lang.String str36 = dateTimeField15.getAsShortText((org.joda.time.ReadablePartial) localDateTime22, locale33);
        int int37 = mutableDateTime11.get(dateTimeField15);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime11.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = mutableDateTime11.toString("secondOfMinute");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNull(durationField29);
        org.junit.Assert.assertNotNull(interval30);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 2L + "'", long31 == 2L);
        org.junit.Assert.assertEquals(locale33.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1969" + "'", str36, "1969");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
        org.junit.Assert.assertNotNull(property38);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        boolean boolean8 = property7.isLeap();
        org.joda.time.LocalDate localDate10 = property7.setCopy(365);
        java.lang.String str11 = localDate10.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDate10.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "36570-01-01" + "'", str11, "36570-01-01");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.lang.String str2 = timeZone1.getID();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 3, chronology4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType6.getRangeDurationType();
        boolean boolean9 = localDate5.isSupported(durationFieldType8);
        org.joda.time.LocalDate.Property property10 = localDate5.centuryOfEra();
        int int11 = localDate5.getEra();
        java.util.Date date12 = localDate5.toDate();
        boolean boolean13 = timeZone1.inDaylightTime(date12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.003" + "'", str2, "+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths(31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate2.withDayOfMonth((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendTimeZoneId();
        boolean boolean11 = dateTimeFormatterBuilder10.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property20 = localTime18.property(dateTimeFieldType19);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder14.appendFraction(dateTimeFieldType19, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatterBuilder23.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder23.appendCenturyOfEra(1969, 365);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder23.appendWeekOfWeekyear(292278993);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder23.appendMillisOfSecond(69);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder23.appendFixedDecimal(dateTimeFieldType32, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder13.appendFraction(dateTimeFieldType32, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        int int0 = org.joda.time.MutableDateTime.ROUND_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        boolean boolean13 = dateTime6.isBefore((long) (-1));
        int int14 = dateTime6.getYearOfEra();
        org.joda.time.DateTime dateTime16 = dateTime6.plusDays(1969);
        java.util.GregorianCalendar gregorianCalendar17 = dateTime6.toGregorianCalendar();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(gregorianCalendar17);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        org.joda.time.DateTime dateTime4 = dateTime1.minusDays((int) (byte) 0);
        int int5 = dateTime1.getMillisOfSecond();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 828 + "'", int5 == 828);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime7 = localTime1.withMillisOfDay((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localTime7.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime dateTime5 = dateTime2.withDurationAdded((long) (byte) 0, 292278993);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime2.withCenturyOfEra(86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        org.joda.time.LocalTime localTime5 = localTime1.minusSeconds((int) (byte) 100);
        java.lang.String str6 = localTime1.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getDurationType();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType7.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localTime1.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00:00:00.003" + "'", str6, "00:00:00.003");
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime12 = dateTime9.withWeekyear((int) 'x');
        org.joda.time.DateTime dateTime14 = dateTime9.minusMonths((int) (byte) -1);
        org.joda.time.DateTime dateTime16 = dateTime14.withDayOfMonth(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime14.withEra((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.joda.time.Interval interval5 = property3.toInterval();
        long long6 = property3.remainder();
        java.util.Locale locale8 = new java.util.Locale("hi!");
        int int9 = property3.getMaximumShortTextLength(locale8);
        java.lang.String str10 = locale8.getDisplayScript();
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.lang.String str12 = locale8.getDisplayVariant(locale11);
        java.lang.Object obj13 = locale11.clone();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(interval5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "en");
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((-1));
        java.io.Writer writer5 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime9 = localTime7.minusSeconds((int) (short) 10);
        int int10 = localTime7.getMinuteOfHour();
        int int11 = localTime7.size();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(writer5, (org.joda.time.ReadablePartial) localTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("DurationField[minutes]", (double) (-1156275054L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.156275054E9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withPeriodAdded(readablePeriod11, 2922750);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfCentury();
        java.lang.String str15 = property14.getAsString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "70" + "'", str15, "70");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        boolean boolean17 = dateTimeZone12.isLocalDateTimeGap(localDateTime16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekyear();
        boolean boolean22 = dateTimeZone12.isLocalDateTimeGap(localDateTime20);
        long long24 = dateTimeZone12.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = dateTimeFormatter25.parseDateTime("1970");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        org.joda.time.DateTime dateTime7 = localTime6.toDateTimeToday();
        int int8 = localTime6.size();
        int int9 = localTime6.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = localDateTime14.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.hours();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.secondOfMinute();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-1), chronology23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.weekyear();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusHours((-1));
        java.util.Locale locale28 = java.util.Locale.JAPANESE;
        java.lang.String str29 = dateTimeField21.getAsText((org.joda.time.ReadablePartial) localDateTime24, locale28);
        int int31 = dateTimeField21.getLeapAmount((long) (-1));
        int int32 = mutableDateTime11.get(dateTimeField21);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (-1), chronology34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        org.joda.time.DateTime dateTime39 = localDateTime35.toDateTime(dateTimeZone37);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(chronology40);
        org.joda.time.DateTime dateTime43 = mutableDateTime11.toDateTime(chronology40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((java.lang.Object) localTime6, chronology40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 23 + "'", int9 == 23);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 12 + "'", int32 == 12);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(timeZone38);
// flaky:         org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTime43);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime7 = property5.addCopy((int) 'u');
        int int8 = localTime7.size();
        org.joda.time.LocalTime localTime10 = localTime7.withMinuteOfHour(23);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime7.withField(dateTimeFieldType11, 54367285);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        java.lang.String str9 = dateTime8.toString();
        org.joda.time.DateTime dateTime11 = dateTime8.plus((long) 100);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        boolean boolean13 = strSet1.equals((java.lang.Object) dateTime11);
        boolean boolean14 = strSet1.isEmpty();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor17 = strSet16.iterator();
        java.lang.String[] strArray21 = new java.lang.String[] { "1969-12-31T23:59:59.999Z", "365", "1969-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        boolean boolean24 = strSet16.containsAll((java.util.Collection<java.lang.String>) strList22);
        java.lang.Object[] objArray25 = strSet16.toArray();
        java.util.Locale locale26 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor28 = strSet27.iterator();
        java.lang.String[] strArray32 = new java.lang.String[] { "1969-12-31T23:59:59.999Z", "365", "1969-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        boolean boolean35 = strSet27.containsAll((java.util.Collection<java.lang.String>) strList33);
        int int36 = strSet27.size();
        boolean boolean37 = strSet16.addAll((java.util.Collection<java.lang.String>) strSet27);
        boolean boolean38 = strSet1.containsAll((java.util.Collection<java.lang.String>) strSet16);
        org.joda.time.LocalDateTime[] localDateTimeArray39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime[] localDateTimeArray40 = strSet1.toArray(localDateTimeArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str9, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime6.withMinuteOfHour(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int1 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long5 = dateTimeZone0.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        timeZone6.setID("+00:00");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = timeZone6.getOffset(365, 4, (int) (byte) 10, 366, (int) (byte) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 365");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 7L + "'", long5 == 7L);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        boolean boolean7 = property5.isLeap();
        org.joda.time.LocalTime localTime8 = property5.roundFloorCopy();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = locale11.getCountry();
        java.util.Calendar calendar13 = mutableDateTime10.toCalendar(locale11);
        int int14 = property5.getMaximumShortTextLength(locale11);
        java.lang.Object obj15 = locale11.clone();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CN" + "'", str12, "CN");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.003,offset=3,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=2,ZONE_OFFSET=3,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "zh_CN");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        int int6 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime8.add(readableDuration9, 100);
        boolean boolean12 = mutableDateTime5.isBefore((org.joda.time.ReadableInstant) mutableDateTime8);
        mutableDateTime8.setTime(31243724946L);
        org.joda.time.Chronology chronology15 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField17 = mutableDateTime16.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        mutableDateTime16.add(durationFieldType19, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = null;
        org.joda.time.format.DateTimeParser dateTimeParser23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter22, dateTimeParser23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (-1), chronology26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.DateTime dateTime31 = localDateTime27.toDateTime(dateTimeZone29);
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter24.withChronology(chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.monthOfYear();
        org.joda.time.DurationField durationField35 = durationFieldType19.getField(chronology32);
        org.joda.time.DateTimeField dateTimeField36 = chronology32.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology32.year();
        org.joda.time.DateTimeField dateTimeField38 = chronology32.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime8.setRounding(dateTimeField38, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 59");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(timeZone30);
// flaky:         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(365, 1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        long long9 = dateTimeField7.roundCeiling(31243724946L);
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        int int11 = dateTimeField7.getMaximumShortTextLength(locale10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime15 = localTime13.minusSeconds((int) (short) 10);
        int int16 = localTime13.getMinuteOfHour();
        org.joda.time.LocalTime.Property property17 = localTime13.hourOfDay();
        org.joda.time.LocalTime localTime18 = property17.withMaximumValue();
        boolean boolean19 = property17.isLeap();
        org.joda.time.LocalTime localTime20 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime22 = localTime20.plusHours((int) (short) 1);
        org.joda.time.LocalTime localTime24 = localTime22.plusMillis((int) (short) 0);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.weekyear();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withSecondOfMinute((int) (short) 0);
        int[] intArray32 = localDateTime28.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray34 = dateTimeField7.set((org.joda.time.ReadablePartial) localTime22, 59, intArray32, 31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 31244400000L + "'", long9 == 31244400000L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(intArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1970, 1, 1, 2]");
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long5 = dateTimeZone0.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getScript();
        boolean boolean10 = locale8.hasExtensions();
        java.lang.String str11 = timeZone6.getDisplayName(locale8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 7L + "'", long5 == 7L);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GMT+00:00" + "'", str11, "GMT+00:00");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        java.lang.String str3 = dateTimeFieldType1.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "year" + "'", str3, "year");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusMinutes(1);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime.Property property5 = localTime3.secondOfMinute();
        java.lang.String str6 = property5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property5.setCopy("TWN");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"TWN\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[secondOfMinute]" + "'", str6, "Property[secondOfMinute]");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("365");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getDurationType();
        int int4 = localDate1.get(dateTimeFieldType2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate1.withWeekOfWeekyear(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 9);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer6, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withChronology(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        boolean boolean18 = dateTimeZone13.isLocalDateTimeGap(localDateTime17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (-1), chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.weekyear();
        boolean boolean23 = dateTimeZone13.isLocalDateTimeGap(localDateTime21);
        long long25 = dateTimeZone13.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter3.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeFormatter26.getZone();
        org.joda.time.Chronology chronology28 = dateTimeFormatter26.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.parse("2022", dateTimeFormatter26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3L + "'", long25 == 3L);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNull(chronology28);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = localDateTime2.toDateTime();
        int int8 = localDateTime2.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter5.withChronology(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = chronology13.days();
        org.joda.time.Chronology chronology18 = chronology13.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(364, (int) (byte) 1, 366, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable12, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.getLocalDate();
        int int10 = localDate9.getYear();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime14 = localTime12.minusSeconds((int) (short) 10);
        int int15 = localTime12.getMinuteOfHour();
        org.joda.time.LocalTime.Property property16 = localTime12.hourOfDay();
        org.joda.time.LocalTime localTime17 = property16.withMaximumValue();
        java.lang.String str18 = localTime17.toString();
        org.joda.time.LocalTime localTime20 = localTime17.minusMillis(0);
        org.joda.time.LocalTime.Property property21 = localTime20.minuteOfHour();
        org.joda.time.LocalTime localTime22 = property21.roundCeilingCopy();
        org.joda.time.LocalTime localTime24 = property21.addWrapFieldToCopy(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property31 = localTime29.property(dateTimeFieldType30);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder25.appendFraction(dateTimeFieldType30, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder25.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder25.appendSecondOfMinute(0);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        int int40 = dateTimeZone38.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property43 = localTime41.property(dateTimeFieldType42);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder25.appendFixedDecimal(dateTimeFieldType42, (int) (byte) 100);
        int int46 = localTime24.get(dateTimeFieldType42);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = localDate9.compareTo((org.joda.time.ReadablePartial) localTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "23:00:00.003" + "'", str18, "23:00:00.003");
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 23 + "'", int46 == 23);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localTime6.getValue(53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((-1), 20, 0, 364, 2, 100, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 364 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        boolean boolean10 = dateTimeZone5.isLocalDateTimeGap(localDateTime9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (-1), chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        boolean boolean15 = dateTimeZone5.isLocalDateTimeGap(localDateTime13);
        boolean boolean17 = dateTimeZone5.isStandardOffset(86399999L);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (-1), chronology21);
        boolean boolean23 = dateTimeZone18.isLocalDateTimeGap(localDateTime22);
        java.lang.String str25 = dateTimeZone18.getName((long) 4);
        long long27 = dateTimeZone5.getMillisKeepLocal(dateTimeZone18, 31244400000L);
        long long29 = dateTimeZone18.nextTransition((long) 365);
        java.lang.String str30 = dateTimeZone18.toString();
        java.util.TimeZone timeZone31 = dateTimeZone18.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((int) 'x', 12, (-292275054), (int) (byte) 0, 3, dateTimeZone18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.003" + "'", str25, "+00:00:00.003");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 31244400000L + "'", long27 == 31244400000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 365L + "'", long29 == 365L);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.003" + "'", str30, "+00:00:00.003");
        org.junit.Assert.assertNotNull(timeZone31);
// flaky:         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(53, (int) 'u', (int) 'x', 20, 100, (-292275054), 70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(2, (int) (short) 10, 3, (int) 'x', (int) (short) 100, 1970, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatterBuilder9.toFormatter();
        boolean boolean11 = dateTimeFormatter10.isParser();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter10.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = dateTimeFormatter10.parseLocalDate("clockhourOfHalfday");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"clockhourOfHalfday\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dateTimeZone12);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        int int8 = localDate2.getWeekyear();
        org.joda.time.LocalDate localDate10 = localDate2.withYearOfEra((int) 'a');
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = locale14.getCountry();
        java.util.Calendar calendar16 = mutableDateTime13.toCalendar(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = localDate10.toString("zh-TW", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CN" + "'", str15, "CN");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.003,offset=3,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=2,ZONE_OFFSET=3,DST_OFFSET=0]");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) '#', (int) 'u', (int) (short) 10, (-1), 0, 59, 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 9);
        boolean boolean6 = dateTimeFormatter2.isOffsetParsed();
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (-1), chronology9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime14 = localDateTime10.toDateTime(dateTimeZone12);
        java.lang.String str15 = dateTime14.toString();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.plus(readableDuration16);
        org.joda.time.DateTime dateTime19 = dateTime14.minusWeeks(10);
        org.joda.time.DateTime.Property property20 = dateTime14.hourOfDay();
        org.joda.time.DateTime dateTime22 = dateTime14.plusMillis((-292275054));
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer7, (org.joda.time.ReadableInstant) dateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str15, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property8 = localTime6.property(dateTimeFieldType7);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder2.appendFraction(dateTimeFieldType7, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatterBuilder11.toFormatter();
        boolean boolean13 = dateTimeFormatter12.isParser();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.parse("19", dateTimeFormatter12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.parse("Etc/UTC", dateTimeFormatter12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Etc/UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Chinese (Taiwan)' is not recognised");
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
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("70");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=70");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime6 = property3.addToCopy(50);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.weekyearOfCentury();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.year();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) chronology7, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getScript();
        boolean boolean3 = locale1.hasExtensions();
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((java.lang.Object) locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        boolean boolean17 = dateTimeZone12.isLocalDateTimeGap(localDateTime16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekyear();
        boolean boolean22 = dateTimeZone12.isLocalDateTimeGap(localDateTime20);
        long long24 = dateTimeZone12.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withPivotYear(2022);
        java.lang.Integer int28 = dateTimeFormatter25.getPivotYear();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime30.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration33 = null;
        mutableDateTime30.add(readableDuration33, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int37 = mutableDateTime30.get(dateTimeFieldType36);
        mutableDateTime30.addMinutes((-292275054));
        // The following exception was thrown during execution in test generation
        try {
            int int42 = dateTimeFormatter25.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime30, "1969-12-31T23:59:59.999Z", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        mutableDateTime5.add((long) 100);
        org.joda.time.Chronology chronology8 = null;
        mutableDateTime5.setChronology(chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        long long12 = dateTimeZone10.previousTransition((long) 1);
        mutableDateTime5.setZone(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(23, (-1), (int) (short) -1, (int) (byte) 0, (-1), dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.now(dateTimeZone1);
        java.util.Locale locale5 = new java.util.Locale("365");
        java.lang.String str6 = dateTimeZone1.getShortName((long) 3, locale5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekyear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (-1), chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTime dateTime17 = localDateTime13.toDateTime(dateTimeZone15);
        java.lang.String str18 = dateTime17.toString();
        org.joda.time.DateTime dateTime20 = dateTime17.plus((long) 100);
        org.joda.time.DateTime dateTime22 = dateTime20.withYear(10);
        int int23 = property10.getDifference((org.joda.time.ReadableInstant) dateTime20);
        int int24 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (-1), chronology26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.DateTime dateTime31 = localDateTime27.toDateTime(dateTimeZone29);
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = chronology32.add(readablePeriod34, (long) (-292275054), (int) '4');
        org.joda.time.DateTimeField dateTimeField38 = chronology32.halfdayOfDay();
        org.joda.time.DateTime dateTime39 = dateTime20.toDateTime(chronology32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((java.lang.Object) dateTimeFieldType0, chronology32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertEquals(locale5.toString(), "365");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.003" + "'", str6, "+00:00:00.003");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str18, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(timeZone30);
// flaky:         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-292275054L) + "'", long37 == (-292275054L));
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTime39);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds(0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withChronology(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime11.plusMinutes(2);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime11.minus(readablePeriod16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int19 = dateTime11.get(dateTimeFieldType18);
        org.joda.time.DateTime.Property property20 = dateTime11.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getRangeDurationType();
        java.lang.String str23 = dateTimeFieldType21.getName();
        org.joda.time.DateTime.Property property24 = dateTime11.property(dateTimeFieldType21);
        org.joda.time.DateTime dateTime26 = property24.addToCopy(86399999L);
        org.joda.time.DateTime dateTime27 = property24.getDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "clockhourOfHalfday" + "'", str23, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = dateTimeZone3.getName(99L, locale5);
        java.lang.String str8 = locale5.toString();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.003" + "'", str7, "+00:00:00.003");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh_TW" + "'", str8, "zh_TW");
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.weekyearOfCentury();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField12 = chronology7.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = chronology7.getDateTimeMillis((long) 365, 20, 10, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 59);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTime dateTime13 = localDateTime9.toDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter6.withChronology(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.monthOfYear();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(chronology14);
        org.joda.time.DateTimeField dateTimeField18 = chronology14.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(1969, 54367285, (int) (short) 0, (int) (short) 100, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DurationField durationField6 = property5.getDurationField();
        int int8 = durationField6.getValue((long) 1969);
        long long10 = durationField6.getMillis((int) 'u');
        long long11 = durationField6.getUnitMillis();
        long long14 = durationField6.getDifferenceAsLong((-292275054L), (long) (byte) 100);
        long long17 = durationField6.add((-1156275054L), (long) 23);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3692163384000L + "'", long10 == 3692163384000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 31556952000L + "'", long11 == 31556952000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 724690124946L + "'", long17 == 724690124946L);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("Property[secondOfMinute]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Property[secondOfMinute]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("java.io.IOException: hi!");
        timeZone1.setID("365");
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 5);
        java.util.Date date6 = localDate5.toDate();
        boolean boolean7 = timeZone1.inDaylightTime(date6);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DurationField durationField10 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = dateTimeField12.getLeapDurationField();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNull(durationField13);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        org.joda.time.DateTime dateTime4 = dateTime1.minusDays((int) (byte) 0);
        java.util.Date date5 = dateTime4.toDate();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate localDate8 = localDate6.withDayOfYear((int) (short) 100);
        org.joda.time.DateTime dateTime9 = localDate6.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime9.withDate(0, 2, 90);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 90 for dayOfMonth must be in the range [1,29]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Feb 21 15:06:15 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        int int4 = dateTimeField2.getLeapAmount((long) (byte) 1);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate localDate8 = localDate6.withDayOfYear((int) (byte) 10);
        org.joda.time.LocalDate localDate10 = localDate8.plusWeeks((-292275054));
        int int11 = dateTimeField2.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        java.lang.String str12 = dateTimeField2.toString();
        java.lang.String str13 = dateTimeField2.getName();
        org.joda.time.DurationField durationField14 = dateTimeField2.getRangeDurationField();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 292278993 + "'", int11 == 292278993);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateTimeField[year]" + "'", str12, "DateTimeField[year]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "year" + "'", str13, "year");
        org.junit.Assert.assertNull(durationField14);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 9);
        boolean boolean6 = dateTimeFormatter2.isOffsetParsed();
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 1, chronology9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone13);
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer7, (org.joda.time.ReadableInstant) dateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTime dateTime13 = localDateTime9.toDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((int) (byte) 10, (int) (short) -1, 22, 59, 365, (int) 'u', (int) (short) 1, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(59, 0, 16, chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withChronology(chronology11);
        java.util.Locale locale16 = new java.util.Locale("", "1969-12-31T23:59:59.999Z", "1969-12-31T23:59:59.999Z");
        java.util.Locale locale17 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleAttributes();
        java.lang.String str19 = locale17.getDisplayCountry();
        java.lang.String str20 = locale16.getDisplayScript(locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter3.withLocale(locale17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.parse("", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertEquals(locale16.toString(), "_1969-12-31T23:59:59.999Z_1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Taiwan" + "'", str19, "Taiwan");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 9);
        java.util.Locale locale6 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withLocale(locale6);
        java.util.Locale locale8 = dateTimeFormatter7.getLocale();
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable9, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        boolean boolean13 = dateTime6.isBefore((long) (-1));
        int int14 = dateTime6.getYearOfEra();
        org.joda.time.DateTime dateTime16 = dateTime6.withYear((int) (byte) 0);
        int int17 = dateTime6.getDayOfWeek();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        org.joda.time.DateTime dateTime24 = localDateTime20.toDateTime(dateTimeZone22);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.secondOfDay();
        org.joda.time.DurationField durationField27 = chronology25.minutes();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.weekyearOfCentury();
        org.joda.time.DateTime dateTime29 = dateTime6.withChronology(chronology25);
        org.joda.time.DateTime dateTime30 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime32 = dateTime30.plus(31243724949L);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayScript(locale2);
        java.lang.String str4 = locale2.getVariant();
        java.lang.Object obj5 = locale2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-TW" + "'", str1, "zh-TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "de_DE");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "de_DE");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "de_DE");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime9.withTime(23, 100, 59, 90);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=99,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.003,offset=3,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=102,ZONE_OFFSET=3,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "en_GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "en_GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "en_GB");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDate.Property property5 = localDate0.dayOfWeek();
        java.lang.String str7 = localDate0.toString("23:00:00.000");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDate0.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23:00:00.000" + "'", str7, "23:00:00.000");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.io.IOException\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        boolean boolean7 = property5.isLeap();
        org.joda.time.LocalTime localTime8 = property5.roundCeilingCopy();
        boolean boolean9 = property5.isLeap();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime11.set(dateTimeFieldType12, (-292275054));
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime11.yearOfEra();
        mutableDateTime11.setYear((int) '#');
        mutableDateTime11.setYear(292278993);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        java.lang.String str30 = dateTime29.toString();
        org.joda.time.DateTime dateTime32 = dateTime29.plus((long) 100);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime32.plus(readableDuration34);
        boolean boolean36 = dateTimeZone21.equals((java.lang.Object) readableDuration34);
        mutableDateTime11.setZone(dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = property5.getDifference((org.joda.time.ReadableInstant) mutableDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2562047773775");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str30, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime11.withDurationAdded(298080000000052L, 292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 298080000000052 * 292278993");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) '4');
        long long7 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property3.addToCopy(298080000000052L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 298080000000052");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths(31);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.millis();
        java.lang.String str4 = durationFieldType3.toString();
        boolean boolean5 = localDate0.isSupported(durationFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDate0.get(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdayOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "millis" + "'", str4, "millis");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) '4');
        long long7 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTimeField dateTimeField8 = property3.getField();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime15 = localDateTime11.toDateTime(dateTimeZone13);
        java.lang.String str16 = dateTime15.toString();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.plus(readableDuration17);
        org.joda.time.DateTime dateTime20 = dateTime15.minusWeeks(10);
        boolean boolean22 = dateTime15.isBefore((long) (-1));
        int int23 = dateTime15.getYearOfEra();
        org.joda.time.DateTime dateTime25 = dateTime15.withYear((int) (byte) 0);
        int int26 = dateTime15.getDayOfWeek();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (-1), chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTime dateTime33 = localDateTime29.toDateTime(dateTimeZone31);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.secondOfDay();
        org.joda.time.DurationField durationField36 = chronology34.minutes();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.weekyearOfCentury();
        org.joda.time.DateTime dateTime38 = dateTime15.withChronology(chronology34);
        int int39 = dateTime15.getEra();
        boolean boolean40 = property3.equals((java.lang.Object) int39);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str16, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(dateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(timeZone32);
// flaky:         org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.weekyearOfCentury();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField12 = chronology7.minuteOfDay();
        int int14 = dateTimeField12.getMinimumValue((long) 1969);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        mutableDateTime1.setDate((-1L));
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMillisOfSecond((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(3, (int) ' ', 70, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(1970, (int) (byte) 1, 19, (int) (short) 100, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        boolean boolean17 = dateTimeZone12.isLocalDateTimeGap(localDateTime16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekyear();
        boolean boolean22 = dateTimeZone12.isLocalDateTimeGap(localDateTime20);
        long long24 = dateTimeZone12.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withPivotYear(2022);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter27.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone29);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = dateTimeFormatter27.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime31, "+00:00:00.003", (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(timeZone30);
// flaky:         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendTimeZoneId();
        boolean boolean11 = dateTimeFormatterBuilder10.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendMonthOfYearText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder10.appendDayOfWeek((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        java.lang.String str11 = dateTime10.toString();
        org.joda.time.DateTime dateTime13 = dateTime10.plus((long) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.withYear(10);
        int int16 = property3.getDifference((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.LocalDateTime localDateTime18 = property3.setCopy(0);
        org.joda.time.LocalDateTime localDateTime19 = property3.withMinimumValue();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (-1), chronology21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfYear();
        org.joda.time.DurationField durationField24 = property23.getLeapDurationField();
        org.joda.time.Interval interval25 = property23.toInterval();
        long long26 = property23.remainder();
        java.lang.String str27 = property23.toString();
        org.joda.time.LocalDateTime localDateTime29 = property23.setCopy((int) (short) 1);
        int int30 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField32 = localDateTime29.getField((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str11, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNull(durationField24);
        org.junit.Assert.assertNotNull(interval25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Property[dayOfYear]" + "'", str27, "Property[dayOfYear]");
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDate.Property property5 = localDate0.dayOfWeek();
        java.lang.String str7 = localDate0.toString("23:00:00.000");
        org.joda.time.LocalDate.Property property8 = localDate0.era();
        java.lang.Class<?> wildcardClass9 = property8.getClass();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23:00:00.000" + "'", str7, "23:00:00.000");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getScript();
        boolean boolean3 = locale1.hasExtensions();
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        java.lang.Object obj5 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "hi!");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor2 = strSet1.iterator();
        java.lang.String[] strArray6 = new java.lang.String[] { "1969-12-31T23:59:59.999Z", "365", "1969-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        boolean boolean9 = strSet1.containsAll((java.util.Collection<java.lang.String>) strList7);
        java.util.Iterator<java.lang.String> strItor10 = strSet1.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator11 = strSet1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = strSet1.add("00:00:00.003");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(54367285, (int) (byte) 0, 1, 86399999, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        org.joda.time.DateTime dateTime7 = localTime6.toDateTimeToday();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property14 = localTime12.property(dateTimeFieldType13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder8.appendFraction(dateTimeFieldType13, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatterBuilder17.toFormatter();
        boolean boolean19 = dateTimeFormatter18.isParser();
        java.lang.String str20 = localTime6.toString(dateTimeFormatter18);
        org.joda.time.ReadablePartial readablePartial21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dateTimeFormatter18.print(readablePartial21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "000000833333" + "'", str20, "000000833333");
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(22, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        mutableDateTime1.add(readableDuration2, 100);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfDay();
        org.joda.time.DurationField durationField15 = chronology13.minutes();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.weekyearOfCentury();
        long long19 = dateTimeField16.addWrapField(1L, 100);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setRounding(dateTimeField16, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 23");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(2000, 52, 100, (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = dateTimeFormatter2.parseLocalDateTime("24");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        boolean boolean13 = dateTime6.isBefore((long) (-1));
        org.joda.time.DateTime dateTime15 = dateTime6.minusMinutes(23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime15.withDate(59, 12, 366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("36570-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=36570-01-01");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 9);
        java.util.Locale locale7 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime15 = localDateTime11.toDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.secondOfDay();
        org.joda.time.DurationField durationField18 = chronology16.minutes();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.weekyearOfCentury();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(chronology16);
        org.joda.time.DateTimeField dateTimeField21 = chronology16.minuteOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter6.withChronology(chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.parse("Coordinated Universal Time", dateTimeFormatter22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (short) -1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.halfdayOfDay();
        mutableDateTime1.setChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekyear();
        int int14 = dateTimeField12.getMaximumValue((long) 22);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 292278993 + "'", int14 == 292278993);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatterBuilder9.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendCenturyOfEra(1969, 365);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendTwoDigitYear((int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendLiteral('u');
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        int int22 = dateTimeZone20.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property25 = localTime23.property(dateTimeFieldType24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder19.appendFraction(dateTimeFieldType24, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder19.appendTimeZoneId();
        org.joda.time.format.DateTimeParser dateTimeParser30 = dateTimeFormatterBuilder19.toParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder17.append(dateTimePrinter18, dateTimeParser30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No printer supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeParser30);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) 'x', (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        boolean boolean8 = property7.isLeap();
        org.joda.time.LocalDate localDate10 = property7.setCopy(365);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate10.withEra((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        java.lang.String str7 = localTime6.toString();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime10 = localTime6.withPeriodAdded(readablePeriod8, 86399999);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (-1), chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        org.joda.time.LocalDateTime localDateTime15 = property14.withMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) '4');
        long long18 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.LocalDateTime localDateTime20 = property14.addToCopy((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = localTime10.isEqual((org.joda.time.ReadablePartial) localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23:00:00.003" + "'", str7, "23:00:00.003");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean10 = dateTimeField8.isLeap(100L);
        mutableDateTime1.setRounding(dateTimeField8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime1.add(readableDuration12, (int) 'u');
        mutableDateTime1.addWeeks(100);
        java.lang.Object obj17 = mutableDateTime1.clone();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int19 = mutableDateTime1.get(dateTimeFieldType18);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setTime(4, 2922750, 366, 2922750);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922750 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj17);
// flaky:         org.junit.Assert.assertEquals(obj17.toString(), "-292275053-01-01T00:00:00.000+00:00:00.003");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "-292275053-01-01T00:00:00.000+00:00:00.003");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "-292275053-01-01T00:00:00.000+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2922750 + "'", int19 == 2922750);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.joda.time.Interval interval5 = property3.toInterval();
        long long6 = property3.remainder();
        java.lang.String str7 = property3.toString();
        java.lang.String str8 = property3.getAsText();
        boolean boolean9 = property3.isLeap();
        int int10 = property3.get();
        org.joda.time.LocalDateTime localDateTime11 = property3.withMaximumValue();
        int int12 = localDateTime11.getMillisOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(interval5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[dayOfYear]" + "'", str7, "Property[dayOfYear]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = dateTime3.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeFieldType0, dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(8, 17, 2022, 2, (int) (byte) 0, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long5 = dateTimeZone0.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        java.lang.String str7 = timeZone6.getDisplayName();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 7L + "'", long5 == 7L);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT+00:00" + "'", str7, "GMT+00:00");
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        java.lang.String str7 = localTime6.toString();
        org.joda.time.LocalTime localTime9 = localTime6.minusMillis(0);
        org.joda.time.LocalTime.Property property10 = localTime9.minuteOfHour();
        org.joda.time.LocalTime localTime11 = property10.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = property10.addCopy(9223371986111999997L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 9223371986111999997 * 60000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23:00:00.003" + "'", str7, "23:00:00.003");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone5);
        long long10 = dateTimeZone5.convertLocalToUTC((long) (-292275054), false, (long) (short) 0);
        long long12 = dateTimeZone5.previousTransition((long) 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(53, (int) 'a', (int) (byte) 0, 69, 23, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-292275057L) + "'", long10 == (-292275057L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime7 = property5.addCopy((int) 'u');
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 3, chronology9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getDurationType();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType11.getRangeDurationType();
        boolean boolean14 = localDate10.isSupported(durationFieldType13);
        org.joda.time.LocalDate.Property property15 = localDate10.centuryOfEra();
        int int16 = localDate10.getWeekyear();
        org.joda.time.LocalDate localDate18 = localDate10.withYearOfEra((int) 'a');
        org.joda.time.LocalDate.Property property19 = localDate10.era();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = localTime7.compareTo((org.joda.time.ReadablePartial) localDate10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
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
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, (-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -292275054");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        long long9 = dateTimeField7.roundCeiling(31243724946L);
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        int int11 = dateTimeField7.getMaximumShortTextLength(locale10);
        java.lang.String str12 = locale10.toString();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 31244400000L + "'", long9 == 31244400000L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh_TW" + "'", str12, "zh_TW");
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((int) 'u', (int) (short) -1, (int) 'x', 9, 17, 1969, 2525, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendSecondOfMinute(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendDayOfYear(1970);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder12.appendLiteral("Taiwan");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder12.appendHourOfDay(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendCenturyOfEra((int) (short) -1, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor2 = strSet1.iterator();
        java.lang.String[] strArray6 = new java.lang.String[] { "1969-12-31T23:59:59.999Z", "365", "1969-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        boolean boolean9 = strSet1.containsAll((java.util.Collection<java.lang.String>) strList7);
        java.lang.Object[] objArray10 = strSet1.toArray();
        java.util.Locale locale11 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor13 = strSet12.iterator();
        java.lang.String[] strArray17 = new java.lang.String[] { "1969-12-31T23:59:59.999Z", "365", "1969-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        boolean boolean20 = strSet12.containsAll((java.util.Collection<java.lang.String>) strList18);
        int int21 = strSet12.size();
        boolean boolean22 = strSet1.addAll((java.util.Collection<java.lang.String>) strSet12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = strSet12.add("36570-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        org.joda.time.DateTime dateTime4 = dateTime1.minusDays((int) (byte) 0);
        java.util.Date date5 = dateTime4.toDate();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate localDate8 = localDate6.withDayOfYear((int) (short) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 5);
        org.joda.time.LocalDate localDate12 = localDate10.plusWeeks(1970);
        int int13 = localDate8.compareTo((org.joda.time.ReadablePartial) localDate10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate10.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Feb 21 15:06:19 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField(chronology8);
        int int11 = dateTimeField9.getLeapAmount((long) (byte) 1);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 10);
        org.joda.time.LocalDate localDate17 = localDate15.plusWeeks((-292275054));
        int int18 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property21 = localDate19.property(dateTimeFieldType20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.year();
        boolean boolean23 = localDate19.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate.Property property24 = localDate19.dayOfWeek();
        org.joda.time.LocalDate localDate25 = property24.roundCeilingCopy();
        java.util.Locale locale26 = java.util.Locale.ITALY;
        java.lang.String str27 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localDate25, locale26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType28.getDurationType();
        org.joda.time.LocalDate localDate31 = localDate25.withFieldAdded(durationFieldType29, 3);
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(2922750, 364, (int) 'x', 6, (int) 'x', (int) '#', 2, chronology32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 292278993 + "'", int18 == 292278993);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2022" + "'", str27, "2022");
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.003' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        int int4 = dateTimeField2.getLeapAmount((long) (byte) 1);
        long long6 = dateTimeField2.remainder((long) (-292275054));
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekyear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.minus(readablePeriod15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.withYearOfCentury(23);
        int[] intArray21 = new int[] { 4, (short) 1 };
        int int22 = dateTimeField2.getMaximumValue((org.joda.time.ReadablePartial) localDateTime9, intArray21);
        java.lang.String str23 = dateTimeField2.getName();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime27.set(dateTimeFieldType28, (-292275054));
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime27.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType32.getField(chronology33);
        boolean boolean36 = dateTimeField34.isLeap(100L);
        mutableDateTime27.setRounding(dateTimeField34);
        java.util.Locale locale38 = java.util.Locale.TAIWAN;
        java.lang.String str39 = locale38.toLanguageTag();
        java.util.Locale locale40 = java.util.Locale.GERMANY;
        java.lang.String str41 = locale38.getDisplayScript(locale40);
        java.util.Set<java.lang.Character> charSet42 = locale38.getExtensionKeys();
        int int43 = dateTimeField34.getMaximumShortTextLength(locale38);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = dateTimeField2.set((long) 'x', "halfdays", locale38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"halfdays\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 31243724949L + "'", long6 == 31243724949L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[4, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 292278993 + "'", int22 == 292278993);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "year" + "'", str23, "year");
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "zh-TW" + "'", str39, "zh-TW");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(charSet42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusHours((-1));
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        long long11 = dateTimeZone9.previousTransition((long) 1);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime17.set(dateTimeFieldType18, (-292275054));
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType22.getField(chronology23);
        boolean boolean26 = dateTimeField24.isLeap(100L);
        mutableDateTime17.setRounding(dateTimeField24);
        java.util.Locale locale28 = java.util.Locale.TAIWAN;
        java.lang.String str29 = locale28.toLanguageTag();
        java.util.Locale locale30 = java.util.Locale.GERMANY;
        java.lang.String str31 = locale28.getDisplayScript(locale30);
        java.util.Set<java.lang.Character> charSet32 = locale28.getExtensionKeys();
        int int33 = dateTimeField24.getMaximumShortTextLength(locale28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(724690124946L, chronology14, locale28, (java.lang.Integer) 69);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) (short) 1, chronology14);
        org.joda.time.DurationField durationField37 = chronology14.centuries();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh-TW" + "'", str29, "zh-TW");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charSet32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertNotNull(durationField37);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        org.joda.time.DateTime.Property property13 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime14 = property13.roundCeilingCopy();
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.DateTime dateTime16 = dateTime14.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=99,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.003,offset=3,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=102,ZONE_OFFSET=3,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        java.lang.String str11 = dateTime10.toString();
        org.joda.time.DateTime dateTime13 = dateTime10.plus((long) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.withYear(10);
        int int16 = property3.getDifference((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.LocalDateTime localDateTime18 = property3.setCopy(0);
        org.joda.time.LocalDateTime localDateTime19 = property3.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withDayOfYear(31);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minus(readableDuration22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str11, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfCentury((int) (short) 1);
        org.joda.time.DateTime.Property property8 = dateTime5.yearOfEra();
        int int9 = property8.get();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.add(0L);
        org.joda.time.DateTime dateTime3 = mutableDateTime0.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime4.withHourOfDay(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.set(10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime15 = localDateTime11.toDateTime(dateTimeZone13);
        java.lang.String str16 = dateTime15.toString();
        org.joda.time.DateTime dateTime18 = dateTime15.plus((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.withYear(10);
        int int21 = property8.getDifference((org.joda.time.ReadableInstant) dateTime18);
        boolean boolean22 = mutableDateTime4.isEqual((org.joda.time.ReadableInstant) dateTime18);
        mutableDateTime4.setDate((long) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime26.setTime((long) (short) 100);
        int int29 = mutableDateTime4.compareTo((org.joda.time.ReadableInstant) mutableDateTime26);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime4.setMillisOfSecond((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str16, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(10L);
        int int2 = localDate1.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        java.lang.String str4 = dateTimeFieldType3.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDate1.get(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hourOfHalfday" + "'", str4, "hourOfHalfday");
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withChronology(chronology11);
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(2022L, chronology11, locale13);
        java.lang.Object obj15 = null;
        boolean boolean16 = dateTimeParserBucket14.restoreState(obj15);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime21 = property19.addWrapField((-1));
        boolean boolean22 = dateTimeParserBucket14.restoreState((java.lang.Object) (-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket14.saveField(dateTimeFieldType23, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusHours(0);
        int int9 = localDateTime4.getHourOfDay();
        org.joda.time.LocalDateTime.Property property10 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = property10.addWrapFieldToCopy(86399999);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 86399999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 23 + "'", int9 == 23);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        boolean boolean7 = property5.isLeap();
        java.util.Locale locale11 = new java.util.Locale("", "1969-12-31T23:59:59.999Z", "1969-12-31T23:59:59.999Z");
        java.lang.String str12 = property5.getAsShortText(locale11);
        org.joda.time.LocalTime localTime13 = property5.withMinimumValue();
        int int14 = localTime13.getSecondOfMinute();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "_1969-12-31T23:59:59.999Z_1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean10 = dateTimeField8.isLeap(100L);
        mutableDateTime1.setRounding(dateTimeField8);
        long long14 = dateTimeField8.getDifferenceAsLong((long) 31, 31243724946L);
        long long17 = dateTimeField8.set((long) 31, 4);
        java.lang.String str19 = dateTimeField8.getAsText(724690124946L);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-62040988799969L) + "'", long17 == (-62040988799969L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1992" + "'", str19, "1992");
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localTime6.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime10 = localTime6.withPeriodAdded(readablePeriod8, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime6.withHourOfDay((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        boolean boolean8 = property7.isLeap();
        org.joda.time.LocalDate localDate10 = property7.setCopy(365);
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfEra(19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate10.withDayOfMonth(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter5.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = dateTimeFormatter5.parseLocalDateTime("Koordinierte Universalzeit");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        mutableDateTime9.add((long) 100);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = localDateTime14.toDateTime(dateTimeZone16);
        java.lang.String str19 = dateTime18.toString();
        org.joda.time.DateTime dateTime21 = dateTime18.plus((long) 100);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        java.util.Calendar calendar24 = dateTime21.toCalendar(locale23);
        int int25 = dateTime21.getMinuteOfHour();
        boolean boolean26 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Instant instant27 = mutableDateTime9.toInstant();
        long long28 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime9);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str19, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar24);
// flaky:         org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=99,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.003,offset=3,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=102,ZONE_OFFSET=3,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(instant27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1645455980018L) + "'", long28 == (-1645455980018L));
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Taiwan", (double) 0L);
        double double3 = languageRange2.getWeight();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime5.set(dateTimeFieldType6, (-292275054));
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.yearOfEra();
        org.joda.time.DurationField durationField10 = property9.getDurationField();
        int int12 = durationField10.getValue((long) 1969);
        boolean boolean13 = durationField10.isSupported();
        boolean boolean14 = languageRange2.equals((java.lang.Object) durationField10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatterBuilder9.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendCenturyOfEra(1969, 365);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder9.appendWeekOfWeekyear(292278993);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder9.appendMillisOfSecond(69);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder9.appendFractionOfHour((int) (byte) 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendFractionOfMinute((int) (short) -1, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean5 = localTime1.isSupported(dateTimeFieldType4);
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType4.getDurationType();
        java.lang.String str7 = dateTimeFieldType4.toString();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "weekyearOfCentury" + "'", str7, "weekyearOfCentury");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean10 = dateTimeField8.isLeap(100L);
        mutableDateTime1.setRounding(dateTimeField8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime1.add(readableDuration12, (int) 'u');
        mutableDateTime1.addWeeks(100);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (-1), chronology11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = localDateTime12.toDateTime(dateTimeZone14);
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter9.withChronology(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology17.days();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 2922750, chronology17);
        org.joda.time.DurationField durationField23 = chronology17.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(31, 100, 70, (int) 'x', (int) (short) 0, 365, chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long5 = dateTimeZone0.convertLocalToUTC(10L, false, (long) 3);
        boolean boolean6 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 7L + "'", long5 == 7L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusHours((-1));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone7.previousTransition((long) 1);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.withFields((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.days();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = chronology12.getDateTimeMillis(298080000000052L, 3, (int) (short) 100, 6, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatterBuilder9.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendCenturyOfEra(1969, 365);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendYear(0, (int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder13.appendFraction(dateTimeFieldType17, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        boolean boolean8 = property7.isLeap();
        org.joda.time.LocalDate localDate10 = property7.setCopy(365);
        org.joda.time.LocalDate localDate11 = property7.getLocalDate();
        int int12 = property7.get();
        org.joda.time.LocalDate localDate14 = property7.setCopy((int) 'x');
        org.joda.time.LocalDate localDate15 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDate.Property property16 = localDate15.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDate15.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.secondOfDay();
        org.joda.time.DurationField durationField11 = chronology9.minutes();
        org.joda.time.DurationField durationField12 = chronology9.minutes();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 292278993, chronology9);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 'a', chronology9);
        org.joda.time.DateTimeField dateTimeField15 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.era();
        org.joda.time.DurationField durationField17 = dateTimeField16.getRangeDurationField();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNull(durationField17);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.lang.String str5 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: hi!" + "'", str5, "java.io.IOException: hi!");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        boolean boolean17 = dateTimeZone12.isLocalDateTimeGap(localDateTime16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekyear();
        boolean boolean22 = dateTimeZone12.isLocalDateTimeGap(localDateTime20);
        long long24 = dateTimeZone12.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withPivotYear(2022);
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = null;
        org.joda.time.format.DateTimeParser dateTimeParser30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter29, dateTimeParser30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (-1), chronology33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.DateTime dateTime38 = localDateTime34.toDateTime(dateTimeZone36);
        org.joda.time.Chronology chronology39 = dateTime38.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter31.withChronology(chronology39);
        org.joda.time.DateTimeField dateTimeField41 = chronology39.monthOfYear();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.clockhourOfHalfday();
        org.joda.time.DurationField durationField43 = chronology39.millis();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 54367285, chronology39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = dateTimeFormatter25.print((org.joda.time.ReadableInstant) dateTime44);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(timeZone37);
// flaky:         org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationField43);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate localDate3 = localDate1.withDayOfYear((int) (byte) 10);
        org.joda.time.LocalDate localDate5 = localDate3.plusWeeks((-292275054));
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.LocalDate localDate8 = dateTime7.toLocalDate();
        org.joda.time.DateTime dateTime10 = dateTime7.minusDays((int) (byte) 0);
        java.util.Date date11 = dateTime10.toDate();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime10.getZone();
        org.joda.time.Interval interval13 = localDate3.toInterval(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate3.withEra(12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Feb 21 15:06:20 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(interval13);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.withMonthOfYear(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(292278993);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusYears((-292275054));
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.LocalDate localDate18 = dateTime17.toLocalDate();
        org.joda.time.DateTime dateTime20 = dateTime17.minusDays((int) (byte) 0);
        java.util.Date date21 = dateTime20.toDate();
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.fromDateFields(date21);
        org.joda.time.LocalDate localDate24 = localDate22.withDayOfYear((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = localDateTime13.compareTo((org.joda.time.ReadablePartial) localDate24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Mon Feb 21 15:06:20 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDate.Property property5 = localDate0.era();
        org.joda.time.LocalDate localDate6 = property5.roundCeilingCopy();
        org.joda.time.LocalDate localDate7 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate9 = localDate7.plusYears((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = localDate9.toString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        boolean boolean7 = property5.isLeap();
        java.util.Locale locale11 = new java.util.Locale("", "1969-12-31T23:59:59.999Z", "1969-12-31T23:59:59.999Z");
        java.lang.String str12 = property5.getAsShortText(locale11);
        org.joda.time.LocalTime localTime13 = property5.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localTime13.toString("1970-01-01T00:48:42.853");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "_1969-12-31T23:59:59.999Z_1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 19);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localDate1.getValue(86399999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 86399999");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.hours();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.secondOfMinute();
        org.joda.time.DurationField durationField16 = chronology13.months();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = chronology13.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(6, (int) (byte) 10, (int) '4', 3, 20, (int) '#', chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusSeconds((int) (byte) 100);
        int int5 = localDateTime4.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withDate(365, (int) '4', 365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withDate(59, 2, 2);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plus(readableDuration8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property10.setCopy("1970");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) property8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendSecondOfMinute(0);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property18 = localTime16.property(dateTimeFieldType17);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder0.appendFixedDecimal(dateTimeFieldType17, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder0.appendTwoDigitYear(2922750, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatterBuilder0.toFormatter();
        java.util.Locale locale25 = dateTimeFormatter24.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = dateTimeFormatter24.parseLocalDateTime("70");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"70\" is too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNull(locale25);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(53, 1, 5, (-9), 86399999, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -9 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DurationField durationField6 = property5.getDurationField();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime9 = property5.addWrapField(4);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setDateTime(0, (int) (byte) 0, 53, 17, 2525, 53, 828);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2525 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.hours();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfMinute();
        long long11 = dateTimeField9.roundHalfEven((long) 86399999);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        java.util.Locale locale16 = java.util.Locale.US;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = dateTimeField9.getAsShortText((org.joda.time.ReadablePartial) localDateTime14, locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localDateTime14.toString("ISOChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 86399997L + "'", long11 == 86399997L);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant1 = mutableDateTime0.toInstant();
        mutableDateTime0.setSecondOfDay((int) '#');
        mutableDateTime0.setYear(50);
        mutableDateTime0.addMinutes(1969);
        org.junit.Assert.assertNotNull(instant1);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"CN\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Koordinierte Universalzeit", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfCentury((int) (short) 1);
        org.joda.time.ReadablePartial readablePartial8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withFields(readablePartial8);
        org.joda.time.DateTime dateTime11 = dateTime9.withCenturyOfEra((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Taiwan", strMap1);
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor5 = strSet4.iterator();
        java.lang.String[] strArray9 = new java.lang.String[] { "1969-12-31T23:59:59.999Z", "365", "1969-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        boolean boolean12 = strSet4.containsAll((java.util.Collection<java.lang.String>) strList10);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList10);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDateTime7.toDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.minusMillis(1);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer4, (org.joda.time.ReadablePartial) localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant1 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = dateTimeZone2.getName((long) (byte) -1, locale5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTime dateTime13 = localDateTime9.toDateTime(dateTimeZone11);
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime13.minusWeeks(10);
        org.joda.time.DateTime.Property property19 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime21 = dateTime13.plusMillis((-292275054));
        int int22 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime21);
        mutableDateTime0.setZoneRetainFields(dateTimeZone2);
        mutableDateTime0.addSeconds((int) '4');
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.003" + "'", str6, "+00:00:00.003");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str14, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        boolean boolean10 = dateTimeZone5.isLocalDateTimeGap(localDateTime9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (-1), chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        boolean boolean15 = dateTimeZone5.isLocalDateTimeGap(localDateTime13);
        long long17 = dateTimeZone5.nextTransition((long) 2022);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(4, 10, 22, 59, 59, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2022L + "'", long17 == 2022L);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.String str3 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: hi!" + "'", str3, "java.io.IOException: hi!");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        org.joda.time.DateTime dateTime7 = localTime6.toDateTimeToday();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property14 = localTime12.property(dateTimeFieldType13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder8.appendFraction(dateTimeFieldType13, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatterBuilder17.toFormatter();
        boolean boolean19 = dateTimeFormatter18.isParser();
        java.lang.String str20 = localTime6.toString(dateTimeFormatter18);
        org.joda.time.Chronology chronology21 = dateTimeFormatter18.getChronology();
        java.lang.Appendable appendable22 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withDate(59, 2, 2);
        int int31 = localDateTime26.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter18.printTo(appendable22, (org.joda.time.ReadablePartial) localDateTime26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "000000833333" + "'", str20, "000000833333");
        org.junit.Assert.assertNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 19 + "'", int31 == 19);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekyear();
        boolean boolean10 = dateTimeZone0.isLocalDateTimeGap(localDateTime8);
        boolean boolean12 = dateTimeZone0.isStandardOffset(86399999L);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        boolean boolean18 = dateTimeZone13.isLocalDateTimeGap(localDateTime17);
        java.lang.String str20 = dateTimeZone13.getName((long) 4);
        long long22 = dateTimeZone0.getMillisKeepLocal(dateTimeZone13, 31244400000L);
        long long24 = dateTimeZone13.nextTransition((long) 365);
        java.lang.String str25 = dateTimeZone13.toString();
        java.util.TimeZone timeZone26 = dateTimeZone13.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId27 = timeZone26.toZoneId();
// flaky:             org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: +00:00:00.003");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.003" + "'", str20, "+00:00:00.003");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 31244400000L + "'", long22 == 31244400000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 365L + "'", long24 == 365L);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.003" + "'", str25, "+00:00:00.003");
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) 'u', 100, (int) (short) -1, 17, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime2.setWeekyear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        long long10 = dateTimeZone5.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        mutableDateTime2.setZone(dateTimeZone5);
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime16.set(dateTimeFieldType17, (-292275054));
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType21.getField(chronology22);
        boolean boolean25 = dateTimeField23.isLeap(100L);
        mutableDateTime16.setRounding(dateTimeField23);
        java.util.Locale locale27 = java.util.Locale.TAIWAN;
        java.lang.String str28 = locale27.toLanguageTag();
        java.util.Locale locale29 = java.util.Locale.GERMANY;
        java.lang.String str30 = locale27.getDisplayScript(locale29);
        java.util.Set<java.lang.Character> charSet31 = locale27.getExtensionKeys();
        int int32 = dateTimeField23.getMaximumShortTextLength(locale27);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 3, chronology34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType37 = dateTimeFieldType36.getDurationType();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType36.getRangeDurationType();
        boolean boolean39 = localDate35.isSupported(durationFieldType38);
        org.joda.time.LocalDate.Property property40 = localDate35.centuryOfEra();
        org.joda.time.LocalDate localDate41 = property40.roundCeilingCopy();
        java.util.Locale locale43 = new java.util.Locale("hi!");
        java.lang.String str44 = locale43.getScript();
        java.lang.String str45 = locale43.getDisplayLanguage();
        java.lang.String str46 = locale43.getDisplayCountry();
        java.util.Locale locale48 = new java.util.Locale("hi!");
        java.lang.String str49 = locale48.getScript();
        java.lang.String str50 = locale43.getDisplayName(locale48);
        java.lang.String str51 = dateTimeField23.getAsShortText((org.joda.time.ReadablePartial) localDate41, locale48);
        java.lang.String str52 = dateTimeZone5.getName(0L, locale48);
        java.lang.String str53 = timeZone0.getDisplayName(locale48);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 7L + "'", long10 == 7L);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zh-TW" + "'", str28, "zh-TW");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charSet31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 9 + "'", int32 == 9);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertEquals(locale43.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals(locale48.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2000" + "'", str51, "2000");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00:00.003" + "'", str52, "+00:00:00.003");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "GMT+00:00" + "'", str53, "GMT+00:00");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime7 = property5.addCopy((int) 'u');
        org.joda.time.LocalTime localTime9 = property5.setCopy((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) localTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        boolean boolean13 = dateTime6.isBefore((long) (-1));
        int int14 = dateTime6.getYearOfEra();
        org.joda.time.DateTime dateTime16 = dateTime6.withYear((int) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime16.withHourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter22.withChronology(chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone33 = dateTimeZone32.toTimeZone();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) (-1), chronology35);
        boolean boolean37 = dateTimeZone32.isLocalDateTimeGap(localDateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (-1), chronology39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekyear();
        boolean boolean42 = dateTimeZone32.isLocalDateTimeGap(localDateTime40);
        long long44 = dateTimeZone32.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter22.withZone(dateTimeZone32);
        long long47 = dateTimeZone32.nextTransition((long) (byte) -1);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) 1970, dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime18.toMutableDateTime(dateTimeZone32);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime49.setDate((int) (short) 0, 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(timeZone33);
// flaky:         org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 3L + "'", long44 == 3L);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertNotNull(mutableDateTime49);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (short) -1);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        mutableDateTime1.setRounding(dateTimeField6, (int) (short) 1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.weekyear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = localDateTime15.toDateTime(dateTimeZone17);
        java.lang.String str20 = dateTime19.toString();
        org.joda.time.DateTime dateTime22 = dateTime19.plus((long) 100);
        org.joda.time.DateTime dateTime24 = dateTime22.withYear(10);
        int int25 = property12.getDifference((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.LocalDateTime localDateTime27 = property12.setCopy(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType28.getField(chronology29);
        int int32 = dateTimeField30.getLeapAmount((long) (byte) 1);
        long long34 = dateTimeField30.remainder((long) (-292275054));
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (-1), chronology36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.weekyear();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime37.minus(readablePeriod43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime37.withYearOfCentury(23);
        int[] intArray49 = new int[] { 4, (short) 1 };
        int int50 = dateTimeField30.getMaximumValue((org.joda.time.ReadablePartial) localDateTime37, intArray49);
        int int51 = dateTimeField6.getMinimumValue((org.joda.time.ReadablePartial) localDateTime27, intArray49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) (-1), chronology53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone57 = dateTimeZone56.toTimeZone();
        org.joda.time.DateTime dateTime58 = localDateTime54.toDateTime(dateTimeZone56);
        org.joda.time.Chronology chronology59 = dateTime58.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField61 = chronology59.weekyear();
        org.joda.time.DurationField durationField62 = chronology59.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((java.lang.Object) intArray49, chronology59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: [I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str20, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 31243724949L + "'", long34 == 31243724949L);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[4, 1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 292278993 + "'", int50 == 292278993);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-292275054) + "'", int51 == (-292275054));
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(timeZone57);
// flaky:         org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(durationField62);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekyear();
        boolean boolean10 = dateTimeZone0.isLocalDateTimeGap(localDateTime8);
        long long12 = dateTimeZone0.nextTransition((long) 2022);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYearOfCentury(2922750);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922750 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2022L + "'", long12 == 2022L);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DurationField durationField6 = property5.getDurationField();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        long long9 = durationField7.getValueAsLong(1640995200097L);
        long long12 = durationField7.add((long) 86399999, 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 94780799999L + "'", long12 == 94780799999L);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatterBuilder9.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendCenturyOfEra(1969, 365);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder9.appendWeekOfWeekyear(292278993);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder9.appendMillisOfSecond(69);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder9.appendFractionOfHour((int) (byte) 100, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder9.appendMinuteOfDay(59);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        java.lang.String str30 = dateTime29.toString();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.plus(readableDuration31);
        org.joda.time.DateTime dateTime34 = dateTime29.minusWeeks(10);
        boolean boolean36 = dateTime29.isBefore((long) (-1));
        int int37 = dateTime29.getYearOfEra();
        org.joda.time.DateTime dateTime39 = dateTime29.withYear((int) (byte) 0);
        org.joda.time.DateTime dateTime41 = dateTime39.withHourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter43 = null;
        org.joda.time.format.DateTimeParser dateTimeParser44 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter43, dateTimeParser44);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) (-1), chronology47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone51 = dateTimeZone50.toTimeZone();
        org.joda.time.DateTime dateTime52 = localDateTime48.toDateTime(dateTimeZone50);
        org.joda.time.Chronology chronology53 = dateTime52.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter45.withChronology(chronology53);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone56 = dateTimeZone55.toTimeZone();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) (-1), chronology58);
        boolean boolean60 = dateTimeZone55.isLocalDateTimeGap(localDateTime59);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) (-1), chronology62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.weekyear();
        boolean boolean65 = dateTimeZone55.isLocalDateTimeGap(localDateTime63);
        long long67 = dateTimeZone55.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter45.withZone(dateTimeZone55);
        long long70 = dateTimeZone55.nextTransition((long) (byte) -1);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) 1970, dateTimeZone55);
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime41.toMutableDateTime(dateTimeZone55);
        boolean boolean74 = dateTimeZone55.isStandardOffset(86400000L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate((java.lang.Object) dateTimeFormatterBuilder9, dateTimeZone55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.format.DateTimeFormatterBuilder");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str30, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1970 + "'", int37 == 1970);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(timeZone51);
// flaky:         org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(timeZone56);
// flaky:         org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long67 + "' != '" + 3L + "'", long67 == 3L);
        org.junit.Assert.assertNotNull(dateTimeFormatter68);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L) + "'", long70 == (-1L));
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.hours();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfMinute();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (-1), chronology11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekyear();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusHours((-1));
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localDateTime12, locale16);
        java.lang.String str18 = dateTimeField9.getName();
        int int20 = dateTimeField9.getMaximumValue((long) (byte) 100);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (-1), chronology22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime27 = localDateTime23.toDateTime(dateTimeZone25);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.secondOfDay();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology28);
        java.lang.String str32 = chronology28.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) (byte) 100, chronology28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "secondOfMinute" + "'", str18, "secondOfMinute");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 59 + "'", int20 == 59);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ISOChronology[+00:00:00.003]" + "'", str32, "ISOChronology[+00:00:00.003]");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.set(10);
        org.joda.time.MutableDateTime mutableDateTime5 = property2.roundHalfEven();
        java.util.Locale locale8 = new java.util.Locale("365");
        java.lang.String str9 = locale8.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = property2.set("", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertEquals(locale8.toString(), "365");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2089-12-31T15:06:03.339Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2089-12-31T15:06:03.339Z\" is malformed at \"T15:06:03.339Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(6, (int) 'u', (int) (short) 0, 0, (int) ' ', 5, 35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minusMillis(1);
        int int9 = localDateTime2.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DurationField durationField10 = chronology7.months();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withDate(0, 0, 90);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.weekOfWeekyear();
        int int9 = property8.getMaximumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property8.setCopy("1970-01-01T00:00:32.002");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01T00:00:32.002\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = chronology10.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = chronology10.weekyears();
        long long17 = durationField14.getDifferenceAsLong(3692163384000L, 9223371985766399999L);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-292276906L) + "'", long17 == (-292276906L));
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.hours();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.secondOfMinute();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (-1), chronology25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.weekyear();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((-1));
        java.util.Locale locale30 = java.util.Locale.JAPANESE;
        java.lang.String str31 = dateTimeField23.getAsText((org.joda.time.ReadablePartial) localDateTime26, locale30);
        int int33 = dateTimeField23.getLeapAmount((long) (-1));
        int int34 = mutableDateTime13.get(dateTimeField23);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (-1), chronology36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone40 = dateTimeZone39.toTimeZone();
        org.joda.time.DateTime dateTime41 = localDateTime37.toDateTime(dateTimeZone39);
        org.joda.time.Chronology chronology42 = dateTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(chronology42);
        org.joda.time.DateTime dateTime45 = mutableDateTime13.toDateTime(chronology42);
        java.lang.String str46 = chronology42.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeFormatter11, chronology42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.format.DateTimeFormatter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 23 + "'", int34 == 23);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(timeZone40);
// flaky:         org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTime45);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ISOChronology[+00:00:00.003]" + "'", str46, "ISOChronology[+00:00:00.003]");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(109, 100, 292278993, 70, (int) 'a', (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale0.getUnicodeLocaleType("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: zh-TW");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor2 = strSet1.iterator();
        java.lang.String[] strArray6 = new java.lang.String[] { "1969-12-31T23:59:59.999Z", "365", "1969-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        boolean boolean9 = strSet1.containsAll((java.util.Collection<java.lang.String>) strList7);
        java.lang.Object[] objArray10 = strSet1.toArray();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (-1), chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTime dateTime17 = localDateTime13.toDateTime(dateTimeZone15);
        java.lang.String str18 = dateTime17.toString();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        boolean boolean21 = strSet1.equals((java.lang.Object) dateTime17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = strSet1.add("Property[yearOfCentury]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str18, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("year");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"year\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = chronology10.days();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime21 = localDateTime17.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.secondOfDay();
        org.joda.time.DurationField durationField24 = chronology22.minutes();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.weekyear();
        org.joda.time.LocalDateTime localDateTime30 = property29.withMaximumValue();
        long long32 = chronology22.set((org.joda.time.ReadablePartial) localDateTime30, 2022L);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(0L);
        int[] intArray35 = localTime34.getValues();
        // The following exception was thrown during execution in test generation
        try {
            chronology10.validate((org.joda.time.ReadablePartial) localDateTime30, intArray35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky:         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 9223371985766399999L + "'", long32 == 9223371985766399999L);
        org.junit.Assert.assertNotNull(intArray35);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 0, 3]");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DurationField durationField6 = property5.getDurationField();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        long long9 = durationField7.getValueAsLong(1640995200097L);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = durationField7.subtract((-9223372017043199003L), (long) 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275057 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDate.Property property5 = localDate0.dayOfWeek();
        java.lang.String str7 = localDate0.toString("23:00:00.000");
        org.joda.time.LocalDate.Property property8 = localDate0.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property8.addToCopy(53);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23:00:00.000" + "'", str7, "23:00:00.000");
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        org.joda.time.DateTime dateTime17 = property16.roundHalfEvenCopy();
        org.joda.time.DurationField durationField18 = property16.getLeapDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = property16.addToCopy(54367285L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=99,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.003,offset=3,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=102,ZONE_OFFSET=3,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNull(durationField18);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.add(0L);
        org.joda.time.DateTime dateTime3 = mutableDateTime0.toDateTimeISO();
        org.joda.time.DateTime.Property property4 = dateTime3.centuryOfEra();
        org.joda.time.DateTime dateTime6 = dateTime3.withYearOfEra(16);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) '#');
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withDurationAdded(readableDuration11, (int) 'u');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMonthOfYear(10);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusYears(0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withMinuteOfHour(3);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime13.withDurationAdded(readableDuration20, 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime13.withDayOfYear((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatterBuilder9.toFormatter();
        boolean boolean11 = dateTimeFormatter10.isParser();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter10.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeFormatter10.parseMillis("java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.io.IOException\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        boolean boolean17 = dateTimeZone12.isLocalDateTimeGap(localDateTime16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekyear();
        boolean boolean22 = dateTimeZone12.isLocalDateTimeGap(localDateTime20);
        long long24 = dateTimeZone12.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withPivotYear(2022);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = dateTimeFormatter25.parseMillis("19");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        int int4 = dateTimeField2.getLeapAmount((long) (byte) 1);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate localDate8 = localDate6.withDayOfYear((int) (byte) 10);
        org.joda.time.LocalDate localDate10 = localDate8.plusWeeks((-292275054));
        int int11 = dateTimeField2.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property14 = localDate12.property(dateTimeFieldType13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.year();
        boolean boolean16 = localDate12.isSupported(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property17 = localDate12.dayOfWeek();
        org.joda.time.LocalDate localDate18 = property17.roundCeilingCopy();
        java.util.Locale locale19 = java.util.Locale.ITALY;
        java.lang.String str20 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDate18, locale19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getDurationType();
        org.joda.time.LocalDate localDate24 = localDate18.withFieldAdded(durationFieldType22, 3);
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.eras();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = chronology25.get(readablePeriod27, 54367285L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 292278993 + "'", int11 == 292278993);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022" + "'", str20, "2022");
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.io.IOException iOException4 = new java.io.IOException("hi!");
        java.io.IOException iOException6 = new java.io.IOException("hi!");
        iOException4.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("1970-01-01T00:00:32.002", (java.lang.Throwable) iOException4);
        iOException1.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.String str10 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException: hi!" + "'", str10, "java.io.IOException: hi!");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withDate(59, 2, 2);
        int int8 = localDateTime3.getCenturyOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = localDateTime3.getFieldType(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withHourOfDay((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (-1), chronology11);
        boolean boolean13 = dateTimeZone8.isLocalDateTimeGap(localDateTime12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withSecondOfMinute((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime12.withDurationAdded(readableDuration19, (int) 'u');
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withMonthOfYear(10);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        long long29 = dateTimeZone24.convertLocalToUTC((long) (-292275054), false, (long) (short) 0);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        org.joda.time.DateTime dateTime32 = localDateTime21.toDateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime33 = localDateTime7.toDateTime(dateTimeZone24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime35 = dateTime33.withYearOfEra((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-292275057L) + "'", long29 == (-292275057L));
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DurationField durationField10 = chronology7.months();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology7);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = chronology7.get(readablePeriod12, 100L, (-1156275054L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusHours((-1));
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        long long11 = dateTimeZone9.previousTransition((long) 1);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime17.set(dateTimeFieldType18, (-292275054));
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType22.getField(chronology23);
        boolean boolean26 = dateTimeField24.isLeap(100L);
        mutableDateTime17.setRounding(dateTimeField24);
        java.util.Locale locale28 = java.util.Locale.TAIWAN;
        java.lang.String str29 = locale28.toLanguageTag();
        java.util.Locale locale30 = java.util.Locale.GERMANY;
        java.lang.String str31 = locale28.getDisplayScript(locale30);
        java.util.Set<java.lang.Character> charSet32 = locale28.getExtensionKeys();
        int int33 = dateTimeField24.getMaximumShortTextLength(locale28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(724690124946L, chronology14, locale28, (java.lang.Integer) 69);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) (short) 1, chronology14);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) (-1), chronology38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone42 = dateTimeZone41.toTimeZone();
        org.joda.time.DateTime dateTime43 = localDateTime39.toDateTime(dateTimeZone41);
        java.lang.String str44 = dateTime43.toString();
        org.joda.time.DateTime dateTime46 = dateTime43.plus((long) 100);
        org.joda.time.DateTime.Property property47 = dateTime43.millisOfSecond();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (short) 1, chronology49);
        org.joda.time.DateTime dateTime53 = dateTime50.withDurationAdded((long) (byte) 0, 292278993);
        int int54 = dateTime43.compareTo((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.DateTime dateTime57 = dateTime43.withPeriodAdded(readablePeriod55, 1);
        org.joda.time.DateTime dateTime58 = dateTime57.withTimeAtStartOfDay();
        int int59 = dateTime57.getMinuteOfHour();
        mutableDateTime36.setDate((org.joda.time.ReadableInstant) dateTime57);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh-TW" + "'", str29, "zh-TW");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charSet32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(timeZone42);
// flaky:         org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime43);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str44, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
// flaky:         org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((-1));
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter4.getZone();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.hours();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology13.add(readablePeriod15, (long) (short) 1, (int) '#');
        org.joda.time.DurationField durationField19 = chronology13.millis();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter4.withChronology(chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter4.withPivotYear(54367285);
        java.io.Writer writer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(writer23, 259199999L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "hi!");
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((-1));
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter4.getZone();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.hours();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology13.add(readablePeriod15, (long) (short) 1, (int) '#');
        org.joda.time.DurationField durationField19 = chronology13.millis();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter4.withChronology(chronology13);
        java.lang.StringBuffer stringBuffer21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        org.joda.time.LocalDate localDate24 = dateTime23.toLocalDate();
        org.joda.time.DateTime dateTime26 = dateTime23.minusDays((int) (byte) 0);
        java.util.Date date27 = dateTime26.toDate();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter20.printTo(stringBuffer21, (org.joda.time.ReadableInstant) dateTime26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Mon Feb 21 15:06:24 GMT+00:00 2022");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.property(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType5, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendSecondOfMinute(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendDayOfYear(1970);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendYear((int) (short) 10, (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendLiteral("\u53f0\u6e7e\u5730\u533a");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder18.appendLiteral('a');
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = dateTimeFormatterBuilder18.toPrinter();
        java.io.Writer writer24 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTime dateTime32 = localDateTime28.toDateTime(dateTimeZone30);
        java.lang.String str33 = dateTime32.toString();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime32.plus(readableDuration34);
        org.joda.time.DateTime dateTime37 = dateTime32.minusWeeks(10);
        boolean boolean39 = dateTime32.isBefore((long) (-1));
        int int40 = dateTime32.getYearOfEra();
        org.joda.time.DateTime dateTime42 = dateTime32.withYear((int) (byte) 0);
        int int43 = dateTime32.getDayOfWeek();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) (-1), chronology45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone49 = dateTimeZone48.toTimeZone();
        org.joda.time.DateTime dateTime50 = localDateTime46.toDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology51 = dateTime50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.secondOfDay();
        org.joda.time.DurationField durationField53 = chronology51.minutes();
        org.joda.time.DateTimeField dateTimeField54 = chronology51.weekyearOfCentury();
        org.joda.time.DateTime dateTime55 = dateTime32.withChronology(chronology51);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime58.setWeekyear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone62 = dateTimeZone61.toTimeZone();
        long long66 = dateTimeZone61.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone67 = dateTimeZone61.toTimeZone();
        mutableDateTime58.setZone(dateTimeZone61);
        org.joda.time.DateTime dateTime69 = org.joda.time.DateTime.now(dateTimeZone61);
        java.util.Locale locale70 = java.util.Locale.PRC;
        java.lang.String str71 = locale70.getCountry();
        java.util.Locale locale72 = locale70.stripExtensions();
        java.lang.String str73 = locale72.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter23.printTo(writer24, 14400000L, chronology51, 10, dateTimeZone61, locale72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimePrinter23);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(timeZone31);
// flaky:         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str33, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertNotNull(dateTime42);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(timeZone49);
// flaky:         org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(timeZone62);
// flaky:         org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + long66 + "' != '" + 7L + "'", long66 == 7L);
        org.junit.Assert.assertNotNull(timeZone67);
// flaky:         org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "CN" + "'", str71, "CN");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "CHN" + "'", str73, "CHN");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(chronology10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.era();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(364, 9, 59, 9, 102, (int) (short) 0, 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 102 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withPeriodAdded(readablePeriod11, 2922750);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        java.lang.String str15 = property14.getAsText();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970" + "'", str15, "1970");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.DateMidnight dateMidnight6 = localDate0.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime9.set(dateTimeFieldType10, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime9.add(readablePeriod13, 4);
        int int16 = mutableDateTime9.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime9.copy();
        int int19 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) mutableDateTime18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) localDate0, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = dateTimeFormatter2.parseLocalTime("1970-01-01T00:48:42.853");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) 9223371985766399999L);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMonthOfYear(365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        org.joda.time.DateTime.Property property13 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime14 = property13.roundCeilingCopy();
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime14.withHourOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=99,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.003,offset=3,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=102,ZONE_OFFSET=3,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(instant15);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        org.joda.time.DurationField durationField17 = property16.getLeapDurationField();
        org.joda.time.DateTime dateTime18 = property16.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = property16.setCopy("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Etc/UTC\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=99,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.003,offset=3,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=102,ZONE_OFFSET=3,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNull(durationField17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 5);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks((int) (byte) 1);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        int int7 = property6.get();
        org.joda.time.LocalDateTime localDateTime8 = property6.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType10 = localDateTime8.getFieldType(50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 50");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        int int14 = dateTime9.getEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str7, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=99,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.003,offset=3,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=102,ZONE_OFFSET=3,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("365");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate localDate5 = localDate3.withDayOfYear((int) (byte) 10);
        org.joda.time.LocalDate localDate7 = localDate5.plusWeeks((-292275054));
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.LocalDate localDate10 = dateTime9.toLocalDate();
        org.joda.time.DateTime dateTime12 = dateTime9.minusDays((int) (byte) 0);
        java.util.Date date13 = dateTime12.toDate();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime12.getZone();
        org.joda.time.Interval interval15 = localDate5.toInterval(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDate1.toDateTimeAtCurrentTime(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = localDate1.toString("hourOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Feb 21 15:06:25 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate localDate3 = localDate1.withDayOfYear((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDate1.getFieldType((int) (byte) 0);
        org.joda.time.DateTime dateTime6 = localDate1.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate1.withEra(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 9);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.year();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.set(10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (-1), chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime21 = localDateTime17.toDateTime(dateTimeZone19);
        java.lang.String str22 = dateTime21.toString();
        org.joda.time.DateTime dateTime24 = dateTime21.plus((long) 100);
        org.joda.time.DateTime dateTime26 = dateTime24.withYear(10);
        int int27 = property14.getDifference((org.joda.time.ReadableInstant) dateTime24);
        boolean boolean28 = mutableDateTime10.isEqual((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime10.toMutableDateTime();
        java.util.Date date30 = mutableDateTime29.toDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) mutableDateTime29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky:         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01T00:00:00.002+00:00:00.003" + "'", str22, "1970-01-01T00:00:00.002+00:00:00.003");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Fri Jan 03 00:00:00 GMT+00:00 10");
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.LocalDate localDate9 = dateTime8.toLocalDate();
        org.joda.time.DateTime dateTime11 = dateTime8.minusDays((int) (byte) 0);
        java.util.Date date12 = dateTime11.toDate();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime11.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(100, 7, 53, 12, 23, 9, 2922770, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922770 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Feb 21 15:06:25 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) '4', 10, 366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguageTag("19");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 19 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField1 = mutableDateTime0.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getDurationType();
        mutableDateTime0.add(durationFieldType3, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime15 = localDateTime11.toDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter8.withChronology(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.monthOfYear();
        org.joda.time.DurationField durationField19 = durationFieldType3.getField(chronology16);
        org.joda.time.DateTimeField dateTimeField20 = chronology16.millisOfDay();
        org.joda.time.DurationField durationField21 = dateTimeField20.getRangeDurationField();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-1), chronology23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.weekyear();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.plusWeeks((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (-1), chronology33);
        boolean boolean35 = dateTimeZone30.isLocalDateTimeGap(localDateTime34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property38 = localDateTime34.dayOfYear();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.withSecondOfMinute((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime34.withDurationAdded(readableDuration41, (int) 'u');
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withMonthOfYear(10);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(dateTimeZone46);
        long long51 = dateTimeZone46.convertLocalToUTC((long) (-292275054), false, (long) (short) 0);
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now(dateTimeZone46);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone46);
        org.joda.time.DateTime dateTime54 = localDateTime43.toDateTime(dateTimeZone46);
        org.joda.time.DateTime dateTime55 = localDateTime29.toDateTime(dateTimeZone46);
        int[] intArray59 = new int[] { 19, 69 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray61 = dateTimeField20.add((org.joda.time.ReadablePartial) localDateTime29, (int) (short) 0, intArray59, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(timeZone31);
// flaky:         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-292275057L) + "'", long51 == (-292275057L));
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[69, 12]");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDate.Property property5 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate6 = property5.roundCeilingCopy();
        org.joda.time.LocalDate localDate7 = property5.withMinimumValue();
        org.joda.time.LocalDate localDate8 = property5.getLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDate8.getValue(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
    }
}
