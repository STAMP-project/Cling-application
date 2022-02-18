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
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
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
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((int) 'x', (int) (short) 0, 0, (int) ' ', (int) '4', (int) (byte) 100, 0, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localDateTime2.get(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        java.util.TimeZone timeZone0 = null;
        java.util.TimeZone.setDefault(timeZone0);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTimeFormatter2.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Appendable appendable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable3, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withDayOfMonth((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfMonth((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withEra(10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime7.toDateTime(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, (org.joda.time.ReadableInstant) dateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime2.withDate((int) (short) 0, (int) 'u', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Property[yearOfEra]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Property[yearOfEra]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withMonthOfYear((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withMinuteOfHour((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
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
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = dateTimeFormatter3.parseLocalTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        int int4 = localDateTime2.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withWeekOfWeekyear((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("yearOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: yearOfEra");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withWeekOfWeekyear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.DurationFieldType durationFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withFieldAdded(durationFieldType6, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.secondOfMinute();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.Chronology chronology12 = dateTimeFormatter10.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDateTime6.toString(dateTimeFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        java.util.Date date8 = localDateTime2.toDate();
        org.joda.time.DurationFieldType durationFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime2.withFieldAdded(durationFieldType9, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundFloorCopy();
        boolean boolean9 = strSet3.remove((java.lang.Object) localDateTime8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = localDateTime8.toString("zho");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronology();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minus(readableDuration10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withEra((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        int int15 = localDateTime11.indexOf(dateTimeFieldType14);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer6, (org.joda.time.ReadablePartial) localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Appendable appendable3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        long long8 = property7.remainder();
        java.util.Locale locale9 = java.util.Locale.PRC;
        java.util.Locale locale10 = locale9.stripExtensions();
        int int11 = property7.getMaximumShortTextLength(locale9);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime19.toDateTime(dateTimeZone25);
        long long27 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        int int28 = property7.getDifference((org.joda.time.ReadableInstant) dateTime26);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable3, (org.joda.time.ReadableInstant) dateTime26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMinuteOfHour(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.UK;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getLanguage();
        boolean boolean3 = locale0.equals((java.lang.Object) 9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en" + "'", str1, "en");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronology();
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer6, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNull(chronology5);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localDateTime2.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.minusMillis(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateTimeFormatter2.print((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = dateTimeFormatter0.parseLocalDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
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
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(3, (int) (byte) 0, (int) (short) -1, 10, 2000, 9, 10, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime2.withTime((int) (short) 0, (int) 'x', 4, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        org.joda.time.ReadWritableInstant readWritableInstant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dateTimeFormatter3.parseInto(readWritableInstant5, "", (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Appendable appendable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable4, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(2000, (int) '4', (int) (byte) 0, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        int int8 = localDateTime7.getDayOfYear();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime7.get(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        int int5 = localDateTime4.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withHourOfDay((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime2.withHourOfDay(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(0, (int) (short) 0, (int) (short) 0, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale2 = new java.util.Locale("1");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "1");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale[] localeArray7 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList8 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList8, localeArray7);
        java.util.Locale.FilteringMode filteringMode10 = null;
        java.util.List<java.util.Locale> localeList11 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList8, filteringMode10);
        boolean boolean12 = strSet3.removeAll((java.util.Collection<java.util.Locale>) localeList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = strSet3.add("ita");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("en");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style character: e");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        int int8 = localDateTime7.getDayOfYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withOffsetParsed();
        org.joda.time.Chronology chronology13 = dateTimeFormatter11.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localDateTime7.toString(dateTimeFormatter11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("eng", (double) 0L);
        java.lang.String str3 = languageRange2.getRange();
        boolean boolean5 = languageRange2.equals((java.lang.Object) 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTimeFormatter2.parseDateTime("en");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long10 = dateTimeZone7.adjustOffset((-1L), true);
        long long14 = dateTimeZone7.convertLocalToUTC(1L, false, (long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.yearOfEra();
        long long20 = property19.remainder();
        org.joda.time.LocalDateTime localDateTime21 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime24 = property22.addWrapFieldToCopy(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = dateTimeFormatter15.print((org.joda.time.ReadablePartial) localDateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.util.Locale locale2 = new java.util.Locale("Property[yearOfEra]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.joda.time.format.DateTimeFormat.patternForStyle("hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "property[yearofera]");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundFloorCopy();
        boolean boolean9 = strSet3.remove((java.lang.Object) localDateTime8);
        strSet3.clear();
        java.util.Collection<java.util.Locale> localeCollection11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = strSet3.retainAll(localeCollection11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long5 = dateTimeZone2.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long9 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 100.0f, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = dateTimeFormatter3.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean4 = dateTimeFormatter3.isOffsetParsed();
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime8.toDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime8.minusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long22 = dateTimeZone19.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long26 = dateTimeZone19.getMillisKeepLocal(dateTimeZone24, (long) (short) 100);
        org.joda.time.DateTime dateTime27 = localDateTime8.toDateTime(dateTimeZone24);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(stringBuffer5, (org.joda.time.ReadablePartial) localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        int int5 = dateTimeFormatter3.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = dateTimeFormatter3.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        int int7 = localDateTime6.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minus(readableDuration8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField11 = localDateTime9.getField((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (short) 100, 10, (int) 'x', 370, (int) ' ', 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 370 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("eng", (double) 0L);
        java.lang.String str3 = languageRange2.getRange();
        boolean boolean5 = languageRange2.equals((java.lang.Object) "ita");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        int int8 = localDateTime2.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withMillisOfSecond((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        java.lang.Appendable appendable1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadablePartial) localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 4);
        java.lang.String str3 = localDateTime1.toString("1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        boolean boolean11 = timeZone9.useDaylightTime();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime7.toDateTime(dateTimeZone13);
        long long15 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        int int16 = property3.getLeapAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = property3.setCopy("Taiwan");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Taiwan\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeFormatter2.print(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) locale0, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localDateTime4.toString("Taiwan");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMonths(9);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundFloorCopy();
        boolean boolean9 = strSet3.remove((java.lang.Object) localDateTime8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDateTime17.toDateTime(dateTimeZone23);
        long long25 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime8.plusMonths(70);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = localDateTime28.toString("zho");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((int) ' ', 3, (int) (short) 10, 1, 0, (int) 'u', (int) 'x', chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = localDateTime2.getClass();
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        java.lang.Appendable appendable1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withWeekOfWeekyear((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadablePartial) localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readableDuration8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(stringBuffer4, (org.joda.time.ReadablePartial) localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDateTime();
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfEra();
        long long5 = property4.remainder();
        java.util.Locale locale6 = java.util.Locale.PRC;
        java.util.Locale locale7 = locale6.stripExtensions();
        int int8 = property4.getMaximumShortTextLength(locale6);
        java.lang.String str9 = locale6.getISO3Language();
        boolean boolean10 = locale6.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.joda.time.format.DateTimeFormat.patternForStyle("+00:00", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: +00:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        org.joda.time.ReadWritableInstant readWritableInstant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dateTimeFormatter3.parseInto(readWritableInstant5, "1970-01-01T00:04:00.000", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        boolean boolean3 = dateTimeFormatter2.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = dateTimeFormatter2.parseLocalTime("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        int int12 = timeZone9.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.util.Locale locale6 = locale5.stripExtensions();
        int int7 = property3.getMaximumShortTextLength(locale5);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime15.toDateTime(dateTimeZone21);
        long long23 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime22);
        int int24 = property3.getDifference((org.joda.time.ReadableInstant) dateTime22);
        java.util.Locale locale27 = new java.util.Locale("69");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = property3.setCopy("yearOfEra", locale27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"yearOfEra\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals(locale27.toString(), "69");
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withYear(70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withDayOfWeek(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        java.util.Locale locale11 = java.util.Locale.ROOT;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale11.getDisplayCountry(locale12);
        java.lang.String str15 = timeZone9.getDisplayName(locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinated Universal Time" + "'", str15, "Coordinated Universal Time");
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        int int5 = dateTimeFormatter3.getDefaultYear();
        boolean boolean6 = dateTimeFormatter3.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTimeFormatter3.print((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateTimeFormatter2.print((long) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: UTC");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en" + "'", str1, "en");
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withChronology(chronology3);
        org.joda.time.ReadWritableInstant readWritableInstant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dateTimeFormatter4.parseInto(readWritableInstant5, "ita", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        boolean boolean6 = property3.equals((java.lang.Object) "en");
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2000, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) '#');
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfEra();
        long long15 = property14.remainder();
        org.joda.time.LocalDateTime localDateTime16 = property14.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.centuryOfEra();
        java.util.Date date18 = localDateTime16.toDate();
        boolean boolean19 = timeZone9.inDaylightTime(date18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("en");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'en' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
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
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en", (double) 292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.92278993E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int5 = dateTimeZone3.getOffset(1L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 70);
        long long11 = dateTimeZone3.convertLocalToUTC((long) 'a', true, 100L);
        java.util.TimeZone timeZone12 = dateTimeZone3.toTimeZone();
        java.util.Locale locale17 = new java.util.Locale("eng", "hi!");
        java.util.Locale locale21 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str22 = locale17.getDisplayVariant(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = timeZone12.getDisplayName(true, 9, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 79L + "'", long7 == 79L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals(locale17.toString(), "eng_HI!");
        org.junit.Assert.assertEquals(locale21.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("+00:00:00.009");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=+00:00:00.009");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(2000, (-1970), (int) (short) 1, (int) 'a', (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        int int4 = property3.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        int int13 = property3.compareTo((org.joda.time.ReadablePartial) localDateTime12);
        boolean boolean14 = property3.isLeap();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTimeFormatter3.parseDateTime("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeParser dateTimeParser1 = dateTimeFormatter0.getParser();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = dateTimeFormatter0.parseMillis("CHN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"CHN\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeParser1);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        int int4 = property3.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        int int13 = property3.compareTo((org.joda.time.ReadablePartial) localDateTime12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withSecondOfMinute(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusSeconds((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        int int18 = localDateTime12.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfEra();
        long long23 = property22.remainder();
        boolean boolean25 = property22.equals((java.lang.Object) "en");
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property22.getFieldType();
        org.joda.time.LocalDateTime.Property property27 = localDateTime12.property(dateTimeFieldType26);
        int int28 = localDateTime9.get(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime9.plusHours((-1));
        org.joda.time.DurationFieldType durationFieldType31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withFieldAdded(durationFieldType31, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1969 + "'", int28 == 1969);
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.util.Locale locale2 = new java.util.Locale("zho", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getUnicodeLocaleType("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: English (United States)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "zho");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        int int6 = localDateTime5.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withEra((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int12 = dateTimeZone10.getOffset(1L);
        long long14 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 70);
        long long18 = dateTimeZone10.convertLocalToUTC((long) 'a', true, 100L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter2.withZone(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTimeFormatter19.parseDateTime("English");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 79L + "'", long14 == 79L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        java.util.Date date8 = localDateTime2.toDate();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.fromDateFields(date8);
        int[] intArray10 = localDateTime9.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1970, 1, 1, 0]");
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = timeZone9.getOffset(70, (-1), 292278993, (int) 'u', (int) (byte) 100, (-1970));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 70");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int5 = dateTimeZone3.getOffset(1L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 70);
        long long11 = dateTimeZone3.convertLocalToUTC((long) 'a', true, 100L);
        java.util.TimeZone timeZone12 = dateTimeZone3.toTimeZone();
        java.lang.String str13 = timeZone12.getDisplayName();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 79L + "'", long7 == 79L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.withCenturyOfEra(3);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusHours(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField13 = localDateTime11.getField(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((-1970));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime9.withTime(2000, 370, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.withCenturyOfEra(3);
        int int10 = localDateTime9.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withMinuteOfHour(370);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 370 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 370 + "'", int10 == 370);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = dateTimeFormatter2.parseLocalTime("1970-01-01T00:04:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("CHN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'CHN' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int5 = dateTimeZone3.getOffset(1L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 70);
        long long11 = dateTimeZone3.convertLocalToUTC((long) 'a', true, 100L);
        java.util.TimeZone timeZone12 = dateTimeZone3.toTimeZone();
        java.time.ZoneId zoneId13 = timeZone12.toZoneId();
        java.lang.Object obj14 = timeZone12.clone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 79L + "'", long7 == 79L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int5 = dateTimeZone3.getOffset(1L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 70);
        long long11 = dateTimeZone3.convertLocalToUTC((long) 'a', true, 100L);
        java.util.TimeZone timeZone12 = dateTimeZone3.toTimeZone();
        java.time.ZoneId zoneId13 = timeZone12.toZoneId();
        int int14 = timeZone12.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 79L + "'", long7 == 79L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer6, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int5 = dateTimeZone3.getOffset(1L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 70);
        long long11 = dateTimeZone3.convertLocalToUTC((long) 'a', true, 100L);
        java.util.TimeZone timeZone12 = dateTimeZone3.toTimeZone();
        java.util.Locale locale18 = new java.util.Locale("hi!", "Property[yearOfEra]", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = timeZone12.getDisplayName(false, (-1), locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 79L + "'", long7 == 79L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals(locale18.toString(), "hi!_PROPERTY[YEAROFERA]");
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Chinese (China)' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setExtension(' ', "Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime7.toDateTime(dateTimeZone13);
        long long15 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property3.addWrapFieldToCopy(1970);
        java.lang.Class<?> wildcardClass18 = property3.getClass();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        int int10 = localDateTime2.size();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime19.toDateTime(dateTimeZone25);
        long long27 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        int int28 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime29 = localDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter32.withOffsetParsed();
        org.joda.time.Chronology chronology34 = dateTimeFormatter32.getChronolgy();
        boolean boolean35 = dateTimeFormatter32.isOffsetParsed();
        java.util.Locale locale36 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter32.withLocale(locale36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = localDateTime2.toString(dateTimeFormatter37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNull(chronology34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setVariant("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(1L, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withEra((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withOffsetParsed();
        org.joda.time.Chronology chronology6 = dateTimeFormatter4.getChronolgy();
        boolean boolean7 = dateTimeFormatter4.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter4.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int14 = dateTimeZone12.getOffset(1L);
        long long16 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 70);
        long long20 = dateTimeZone12.convertLocalToUTC((long) 'a', true, 100L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter4.withZone(dateTimeZone12);
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minus(readableDuration26);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) boolean22, chronology28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 79L + "'", long16 == 79L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(chronology28);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale.FilteringMode filteringMode6 = null;
        java.util.List<java.util.Locale> localeList7 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4, filteringMode6);
        java.util.Locale locale10 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundFloorCopy();
        boolean boolean17 = strSet11.remove((java.lang.Object) localDateTime16);
        java.util.Locale locale20 = new java.util.Locale("hi!", "");
        boolean boolean21 = strSet11.remove((java.lang.Object) locale20);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet11, filteringMode22);
        java.lang.Class<?> wildcardClass24 = strList23.getClass();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localeList7);
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode22.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("69");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=69");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(10, 292278993, (int) (short) 10, (int) (byte) 10, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear(0);
        java.lang.Appendable appendable8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfEra();
        long long13 = property12.remainder();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime18.toDateTime(dateTimeZone24);
        int int26 = property15.getDifference((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime29.toDateTime(dateTimeZone35);
        boolean boolean37 = dateTime25.isBefore((org.joda.time.ReadableInstant) dateTime36);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable8, (org.joda.time.ReadableInstant) dateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setScript("+00:00:00.032");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: +00:00:00.032 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        java.util.Locale locale3 = new java.util.Locale("eng", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.joda.time.format.DateTimeFormat.patternForStyle("1970-01-01T00:00:00.000Z", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: 1970-01-01T00:00:00.000Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "eng_HI!");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField15 = localDateTime13.getField(370);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 370");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int5 = dateTimeZone3.getOffset(1L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 70);
        long long11 = dateTimeZone3.convertLocalToUTC((long) 'a', true, 100L);
        java.util.TimeZone timeZone12 = dateTimeZone3.toTimeZone();
        java.util.Locale locale15 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = timeZone12.getDisplayName(true, 10, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 79L + "'", long7 == 79L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ja_JP");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(1L, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        java.util.TimeZone.setDefault(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        java.util.Date date20 = localDateTime14.toDate();
        boolean boolean21 = timeZone9.inDaylightTime(date20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear(0);
        java.io.Writer writer8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withMinuteOfHour(4);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer8, (org.joda.time.ReadablePartial) localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        int int8 = localDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfEra();
        long long13 = property12.remainder();
        boolean boolean15 = property12.equals((java.lang.Object) "en");
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property12.getFieldType();
        org.joda.time.LocalDateTime.Property property17 = localDateTime2.property(dateTimeFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime2.withDayOfMonth((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("English (United States)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english(unitedstates)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withDate(1970, 7, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime4.getFieldType((-1970));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1970");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        int int14 = localDateTime11.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minusMillis(10);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.year();
        int int18 = localDateTime16.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter8.getZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter8.print((long) 2922789);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localDateTime2.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.minusMillis(4);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMinutes((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int16 = dateTimeZone14.getOffset(1L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 'u', dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withChronology(chronology3);
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable5, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withChronology(chronology3);
        boolean boolean5 = dateTimeFormatter0.isPrinter();
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer6, (long) 370);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        java.util.TimeZone.setDefault(timeZone9);
        timeZone9.setID("English");
        java.lang.Object obj14 = timeZone9.clone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "java.util.SimpleTimeZone[id=English,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "java.util.SimpleTimeZone[id=English,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "java.util.SimpleTimeZone[id=English,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        int int7 = localDateTime6.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minus(readableDuration8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMinutes((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusDays(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withHourOfDay((-1970));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "zh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "zh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "zh");
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Etc/UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.util.Locale locale2 = new java.util.Locale("zho", "");
        boolean boolean3 = locale2.hasExtensions();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale[] localeArray7 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList8 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList8, localeArray7);
        java.util.Locale.FilteringMode filteringMode10 = null;
        java.util.List<java.util.Locale> localeList11 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList8, filteringMode10);
        java.util.Locale locale14 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.yearOfEra();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundFloorCopy();
        boolean boolean21 = strSet15.remove((java.lang.Object) localDateTime20);
        java.util.Locale locale24 = new java.util.Locale("hi!", "");
        boolean boolean25 = strSet15.remove((java.lang.Object) locale24);
        java.util.Locale.FilteringMode filteringMode26 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strSet15, filteringMode26);
        java.util.Locale locale30 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.yearOfEra();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundFloorCopy();
        boolean boolean37 = strSet31.remove((java.lang.Object) localDateTime36);
        strSet31.clear();
        java.lang.String str39 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strSet31);
        boolean boolean40 = locale2.equals((java.lang.Object) languageRangeList5);
        org.junit.Assert.assertEquals(locale2.toString(), "zho");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localeList11);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals(locale24.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + filteringMode26 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode26.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals(locale30.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = dateTimeFormatter2.parseLocalDateTime("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable7, (long) 1969);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = dateTimeFormatter0.parseLocalDate("French");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"French\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withChronology(chronology3);
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        long long10 = property9.remainder();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime15.toDateTime(dateTimeZone21);
        int int23 = property12.getDifference((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime26.toDateTime(dateTimeZone32);
        boolean boolean34 = dateTime22.isBefore((org.joda.time.ReadableInstant) dateTime33);
        java.util.Locale locale37 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.yearOfEra();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundFloorCopy();
        boolean boolean44 = strSet38.remove((java.lang.Object) localDateTime43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.yearOfEra();
        org.joda.time.LocalDateTime localDateTime49 = property48.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime52.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = localDateTime52.toDateTime(dateTimeZone58);
        long long60 = property48.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime dateTime61 = localDateTime43.toDateTime((org.joda.time.ReadableInstant) dateTime59);
        boolean boolean62 = dateTime22.isBefore((org.joda.time.ReadableInstant) dateTime61);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer5, (org.joda.time.ReadableInstant) dateTime61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals(locale37.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int12 = dateTimeZone10.getOffset(1L);
        long long14 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 70);
        long long18 = dateTimeZone10.convertLocalToUTC((long) 'a', true, 100L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter2.withZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime22.toDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime22.minusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long36 = dateTimeZone33.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long40 = dateTimeZone33.getMillisKeepLocal(dateTimeZone38, (long) (short) 100);
        org.joda.time.DateTime dateTime41 = localDateTime22.toDateTime(dateTimeZone38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeFormatter2, dateTimeZone38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.format.DateTimeFormatter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 79L + "'", long14 == 79L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        java.util.TimeZone.setDefault(timeZone9);
        java.util.TimeZone.setDefault(timeZone9);
        java.lang.Object obj13 = timeZone9.clone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDateTime();
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, (long) 2070);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale2.getLanguage();
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet7 = locale2.getExtensionKeys();
        java.lang.String str8 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("1970-01-01T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 1970-01-01T00:00:00.000Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.setLanguage("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setLanguageTag("19");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 19 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeZone9.getOffset(0, 1969, 70, 10, 7, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale6.getUnicodeLocaleType("English");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: English");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale3 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        boolean boolean10 = strSet4.remove((java.lang.Object) localDateTime9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime18.toDateTime(dateTimeZone24);
        long long26 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime27 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        java.lang.String str28 = dateTimeFormatter0.print((org.joda.time.ReadableInstant) dateTime27);
        java.lang.StringBuffer stringBuffer29 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        java.util.Date date38 = localDateTime32.toDate();
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.fromDateFields(date38);
        int[] intArray40 = localDateTime39.getValues();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withMonthOfYear((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer29, (org.joda.time.ReadablePartial) localDateTime42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Thursday, January 1, 1970" + "'", str28, "Thursday, January 1, 1970");
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1970, 1, 1, 0]");
        org.junit.Assert.assertNotNull(localDateTime42);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        int int6 = localDateTime5.size();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusYears((int) (byte) 100);
        int int9 = localDateTime8.getYearOfEra();
        int int10 = localDateTime8.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy(8812800000L);
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withOffsetParsed();
        org.joda.time.Chronology chronology18 = dateTimeFormatter16.getChronolgy();
        boolean boolean19 = dateTimeFormatter16.isOffsetParsed();
        java.util.Locale locale20 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter16.withLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = localDateTime13.toString(dateTimeFormatter16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2070 + "'", int9 == 2070);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(chronology18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = localDateTime9.indexOf(dateTimeFieldType11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plus(readablePeriod13);
        int int15 = localDateTime14.getSecondOfMinute();
        int int16 = localDateTime14.size();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withDayOfYear((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withTime(100, 86300000, 70, 370);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("French");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeZone1.getOffset(1, (-1), (int) (byte) -1, 7, 19, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        java.util.TimeZone.setDefault(timeZone9);
        timeZone9.setID("English");
        int int15 = timeZone9.getOffset(10L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'English' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("1970-01-01T00:04:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1970-01-01t00:04:00.000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        boolean boolean6 = property3.equals((java.lang.Object) "en");
        org.joda.time.LocalDateTime localDateTime7 = property3.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        long long12 = property11.remainder();
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.util.Locale locale14 = locale13.stripExtensions();
        int int15 = property11.getMaximumShortTextLength(locale13);
        java.lang.String str16 = locale13.getISO3Language();
        java.lang.String str17 = property3.getAsShortText(locale13);
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale19.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = property3.setCopy("South Korea", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"South Korea\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970" + "'", str17, "1970");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ita" + "'", str20, "ita");
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        int int7 = localDateTime6.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minus(readableDuration8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMinutes((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusDays(9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localDateTime11.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2000, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.shortTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.dayOfYear();
        int int9 = localDateTime2.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.plusDays(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField13 = localDateTime11.getField(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int5 = dateTimeZone3.getOffset(1L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 70);
        long long11 = dateTimeZone3.convertLocalToUTC((long) 'a', true, 100L);
        java.util.TimeZone timeZone12 = dateTimeZone3.toTimeZone();
        java.time.ZoneId zoneId13 = timeZone12.toZoneId();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone(zoneId13);
        int int15 = timeZone14.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 79L + "'", long7 == 79L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withMonthOfYear(2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (byte) -1, (int) (byte) 100, 2922789, (int) (byte) -1, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("eng", (double) 0L);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] { languageRange2 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale8 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale[] localeArray13 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList14 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList14, localeArray13);
        java.util.Locale.FilteringMode filteringMode16 = null;
        java.util.List<java.util.Locale> localeList17 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList14, filteringMode16);
        boolean boolean18 = strSet9.removeAll((java.util.Collection<java.util.Locale>) localeList17);
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet9);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        long long24 = property23.remainder();
        org.joda.time.LocalDateTime localDateTime25 = property23.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime29.toDateTime(dateTimeZone35);
        int int37 = property26.getDifference((org.joda.time.ReadableInstant) dateTime36);
        boolean boolean38 = strSet9.equals((java.lang.Object) int37);
        java.util.Iterator<java.lang.String> strItor39 = strSet9.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = strSet9.add("+00:00:00.009");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localeList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strItor39);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minus(readableDuration4);
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) builder0, chronology6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale$Builder");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear(0);
        int int8 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = localDateTime11.getFieldTypes();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = localDateTime11.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2000 + "'", int8 == 2000);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (byte) 10, 2, 2922789, (int) (short) -1, 86300000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        long long9 = property8.remainder();
        java.util.Locale locale10 = java.util.Locale.PRC;
        java.util.Locale locale11 = locale10.stripExtensions();
        int int12 = property8.getMaximumShortTextLength(locale10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.yearOfEra();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDateTime20.toDateTime(dateTimeZone26);
        long long28 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        int int29 = property8.getDifference((org.joda.time.ReadableInstant) dateTime27);
        java.util.Locale locale32 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.yearOfEra();
        org.joda.time.LocalDateTime localDateTime38 = property37.roundFloorCopy();
        boolean boolean39 = strSet33.remove((java.lang.Object) localDateTime38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.yearOfEra();
        org.joda.time.LocalDateTime localDateTime44 = property43.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime47.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = localDateTime47.toDateTime(dateTimeZone53);
        long long55 = property43.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime56 = localDateTime38.toDateTime((org.joda.time.ReadableInstant) dateTime54);
        int int57 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Instant instant58 = dateTime27.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, (org.joda.time.ReadableInstant) instant58);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals(locale32.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(instant58);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        long long10 = property9.remainder();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime15.toDateTime(dateTimeZone21);
        int int23 = property12.getDifference((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime26.toDateTime(dateTimeZone32);
        boolean boolean34 = dateTime22.isBefore((org.joda.time.ReadableInstant) dateTime33);
        java.util.Locale locale37 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.yearOfEra();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundFloorCopy();
        boolean boolean44 = strSet38.remove((java.lang.Object) localDateTime43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.yearOfEra();
        org.joda.time.LocalDateTime localDateTime49 = property48.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime52.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = localDateTime52.toDateTime(dateTimeZone58);
        long long60 = property48.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime dateTime61 = localDateTime43.toDateTime((org.joda.time.ReadableInstant) dateTime59);
        boolean boolean62 = dateTime22.isBefore((org.joda.time.ReadableInstant) dateTime61);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer5, (org.joda.time.ReadableInstant) dateTime61);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals(locale37.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minus(readableDuration10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMinuteOfHour((int) '4');
        int int16 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.minusWeeks((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localDateTime18.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withPivotYear((int) '4');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter1.withChronology(chronology4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.parse("English", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"English\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        java.io.Writer writer9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        long long14 = property13.remainder();
        java.util.Locale locale15 = java.util.Locale.PRC;
        java.util.Locale locale16 = locale15.stripExtensions();
        int int17 = property13.getMaximumShortTextLength(locale15);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.yearOfEra();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime25.toDateTime(dateTimeZone31);
        long long33 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime32);
        int int34 = property13.getDifference((org.joda.time.ReadableInstant) dateTime32);
        java.util.Locale locale37 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.yearOfEra();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundFloorCopy();
        boolean boolean44 = strSet38.remove((java.lang.Object) localDateTime43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.yearOfEra();
        org.joda.time.LocalDateTime localDateTime49 = property48.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime52.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = localDateTime52.toDateTime(dateTimeZone58);
        long long60 = property48.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime dateTime61 = localDateTime43.toDateTime((org.joda.time.ReadableInstant) dateTime59);
        int int62 = dateTime32.compareTo((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Instant instant63 = dateTime32.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer9, (org.joda.time.ReadableInstant) dateTime32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals(locale37.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(instant63);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withChronology(chronology3);
        boolean boolean5 = dateTimeFormatter0.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = dateTimeFormatter0.parseMutableDateTime("Thursday, January 1, 1970");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Thursday, January 1, 1970\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(10, 9, (int) ' ', (-1970), 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundFloorCopy();
        boolean boolean9 = strSet3.remove((java.lang.Object) localDateTime8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDateTime17.toDateTime(dateTimeZone23);
        long long25 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.yearOfEra();
        long long31 = property30.remainder();
        org.joda.time.LocalDateTime localDateTime32 = property30.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = localDateTime36.toDateTime(dateTimeZone42);
        int int44 = property33.getDifference((org.joda.time.ReadableInstant) dateTime43);
        boolean boolean45 = dateTime24.isAfter((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Chronology chronology46 = dateTime24.getChronology();
        java.util.Locale locale49 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet50 = locale49.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.yearOfEra();
        org.joda.time.LocalDateTime localDateTime55 = property54.roundFloorCopy();
        boolean boolean56 = strSet50.remove((java.lang.Object) localDateTime55);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.yearOfEra();
        org.joda.time.LocalDateTime localDateTime61 = property60.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone63);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime64.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = localDateTime64.toDateTime(dateTimeZone70);
        long long72 = property60.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTime dateTime73 = localDateTime55.toDateTime((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone75);
        org.joda.time.LocalDateTime.Property property77 = localDateTime76.yearOfEra();
        long long78 = property77.remainder();
        org.joda.time.LocalDateTime localDateTime79 = property77.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property80 = localDateTime79.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone82 = null;
        org.joda.time.LocalDateTime localDateTime83 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone82);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime83.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone89 = null;
        org.joda.time.DateTime dateTime90 = localDateTime83.toDateTime(dateTimeZone89);
        int int91 = property80.getDifference((org.joda.time.ReadableInstant) dateTime90);
        boolean boolean92 = dateTime71.isAfter((org.joda.time.ReadableInstant) dateTime90);
        long long93 = dateTime71.getMillis();
        boolean boolean94 = dateTime24.isEqual((org.joda.time.ReadableInstant) dateTime71);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertEquals(locale49.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(localDateTime79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        int int14 = localDateTime11.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minusHours(0);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = property17.setCopy(0);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.secondOfMinute();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = property21.addToCopy((long) 2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292280800 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        boolean boolean6 = property3.equals((java.lang.Object) "en");
        org.joda.time.LocalDateTime localDateTime7 = property3.roundCeilingCopy();
        org.joda.time.Interval interval8 = property3.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property3.setCopy("CHN");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"CHN\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(interval8);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setLanguageTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        boolean boolean6 = property3.equals((java.lang.Object) "en");
        org.joda.time.LocalDateTime localDateTime7 = property3.roundCeilingCopy();
        java.util.Locale locale8 = java.util.Locale.US;
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str11 = property3.getAsShortText(locale8);
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale12.getISO3Language();
        java.lang.String str14 = locale8.getDisplayVariant(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = locale12.getUnicodeLocaleType("ita");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ita");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "eng" + "'", str9, "eng");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970" + "'", str11, "1970");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ita" + "'", str13, "ita");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        java.util.Locale locale2 = new java.util.Locale("eng", "hi!");
        java.util.Locale locale6 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.lang.Object obj8 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "eng_HI!");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "eng_HI!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "eng_HI!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "eng_HI!");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        int int6 = localDateTime5.size();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusSeconds(10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.minusDays((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withSecondOfMinute((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        int int6 = localDateTime5.size();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusYears((int) (byte) 100);
        int int9 = localDateTime8.getYearOfCentury();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 70 + "'", int9 == 70);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        int int5 = dateTimeFormatter3.getDefaultYear();
        boolean boolean6 = dateTimeFormatter3.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter3.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = dateTimeFormatter3.parseLocalDateTime("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dateTimeParser7);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = dateTimeFormatter2.parseMillis("1970");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.util.Locale locale1 = new java.util.Locale("69");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readableDuration5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withYearOfEra(4);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.yearOfEra();
        long long17 = property16.remainder();
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.util.Locale locale19 = locale18.stripExtensions();
        int int20 = property16.getMaximumShortTextLength(locale18);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.yearOfEra();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDateTime28.toDateTime(dateTimeZone34);
        long long36 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime35);
        int int37 = property16.getDifference((org.joda.time.ReadableInstant) dateTime35);
        java.util.Locale locale40 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.yearOfEra();
        org.joda.time.LocalDateTime localDateTime46 = property45.roundFloorCopy();
        boolean boolean47 = strSet41.remove((java.lang.Object) localDateTime46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.yearOfEra();
        org.joda.time.LocalDateTime localDateTime52 = property51.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone54);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime55.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = localDateTime55.toDateTime(dateTimeZone61);
        long long63 = property51.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateTime dateTime64 = localDateTime46.toDateTime((org.joda.time.ReadableInstant) dateTime62);
        int int65 = dateTime35.compareTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTime dateTime66 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime64);
        boolean boolean67 = locale1.equals((java.lang.Object) localDateTime8);
        org.junit.Assert.assertEquals(locale1.toString(), "69");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = property8.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfCentury(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.dayOfYear();
        int int9 = localDateTime2.getYearOfEra();
        int int10 = localDateTime2.getMinuteOfHour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.joda.time.format.DateTimeFormat.longDate();
        boolean boolean12 = localDateTime2.equals((java.lang.Object) dateTimeFormatter11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = dateTimeFormatter11.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        int int14 = localDateTime11.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minusMillis(10);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.year();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusMinutes(2);
        org.joda.time.DurationFieldType durationFieldType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime16.withFieldAdded(durationFieldType20, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        int int14 = localDateTime11.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minusHours(0);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = property17.setCopy(0);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.secondOfMinute();
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.util.Locale locale23 = locale22.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = property20.setCopy("Coordinated Universal Time", locale23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Coordinated Universal Time\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("Thursday, January 1, 1970 12:00:00 AM +00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: Thursday, January 1, 1970 12:00:00 AM +00:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        boolean boolean6 = property3.equals((java.lang.Object) "en");
        org.joda.time.LocalDateTime localDateTime7 = property3.roundCeilingCopy();
        int int8 = property3.getMinimumValueOverall();
        boolean boolean10 = property3.equals((java.lang.Object) 100.0d);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = property3.setCopy("\u4e2d\u6587\u53f0\u7063)", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"?? (??)\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CHN");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plus(readablePeriod14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withYear(70);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.hourOfDay();
        int int19 = localDateTime17.getMonthOfYear();
        boolean boolean20 = languageRange1.equals((java.lang.Object) localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 0);
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withWeekOfWeekyear((int) (byte) 1);
        int int10 = localDateTime9.size();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusSeconds(10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withDayOfYear((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer3, (org.joda.time.ReadablePartial) localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long10 = dateTimeZone7.adjustOffset((-1L), true);
        long long14 = dateTimeZone7.convertLocalToUTC(1L, false, (long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = dateTimeFormatter15.parseLocalDate("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale.FilteringMode filteringMode6 = null;
        java.util.List<java.util.Locale> localeList7 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4, filteringMode6);
        java.util.Locale locale10 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundFloorCopy();
        boolean boolean17 = strSet11.remove((java.lang.Object) localDateTime16);
        java.util.Locale locale20 = new java.util.Locale("hi!", "");
        boolean boolean21 = strSet11.remove((java.lang.Object) locale20);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet11, filteringMode22);
        java.util.Locale locale26 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.yearOfEra();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundFloorCopy();
        boolean boolean33 = strSet27.remove((java.lang.Object) localDateTime32);
        strSet27.clear();
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = strSet27.add("Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localeList7);
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode22.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals(locale26.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        boolean boolean6 = property3.equals((java.lang.Object) ' ');
        java.util.Locale locale8 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property3.setCopy("en", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"en\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.minusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        long long16 = property15.remainder();
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.util.Locale locale18 = locale17.stripExtensions();
        int int19 = property15.getMaximumShortTextLength(locale17);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDateTime27.toDateTime(dateTimeZone33);
        long long35 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        int int36 = property15.getDifference((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.yearOfEra();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.withMinuteOfHour(4);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime39.minusSeconds((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime49.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        int int55 = localDateTime49.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.yearOfEra();
        long long60 = property59.remainder();
        boolean boolean62 = property59.equals((java.lang.Object) "en");
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property59.getFieldType();
        org.joda.time.LocalDateTime.Property property64 = localDateTime49.property(dateTimeFieldType63);
        int int65 = localDateTime46.get(dateTimeFieldType63);
        boolean boolean66 = dateTime34.isSupported(dateTimeFieldType63);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime2.withField(dateTimeFieldType63, (int) (short) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter69 = null;
        org.joda.time.format.DateTimeParser dateTimeParser70 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter69, dateTimeParser70);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter71.withOffsetParsed();
        org.joda.time.Chronology chronology73 = dateTimeFormatter71.getChronolgy();
        boolean boolean74 = dateTimeFormatter71.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter75 = dateTimeFormatter71.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str76 = localDateTime68.toString(dateTimeFormatter71);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1969 + "'", int65 == 1969);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(dateTimeFormatter72);
        org.junit.Assert.assertNull(chronology73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(dateTimePrinter75);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone8);
        int int10 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy(292278993);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusSeconds(86300000);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusDays((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withDayOfWeek(2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long10 = dateTimeZone7.adjustOffset((-1L), true);
        long long14 = dateTimeZone7.convertLocalToUTC(1L, false, (long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = dateTimeFormatter15.parseLocalDate("+00:00:00.009");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(70, 1969);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 1969");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        int int6 = localDateTime5.size();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withYear((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = dateTimeFormatter14.getPrinter();
        int int16 = dateTimeFormatter14.getDefaultYear();
        boolean boolean17 = dateTimeFormatter14.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = localDateTime9.toString(dateTimeFormatter14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimePrinter15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2000 + "'", int16 == 2000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("Korean");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setExtension('4', "en");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfYear((int) 'a');
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minus(readableDuration9);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = dateTimeFormatter14.getPrinter();
        int int16 = dateTimeFormatter14.getDefaultYear();
        boolean boolean17 = dateTimeFormatter14.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = localDateTime10.toString(dateTimeFormatter14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimePrinter15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2000 + "'", int16 == 2000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDayOfYear((-1970));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1970 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone8);
        int int10 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy(292278993);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusSeconds(86300000);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = localDateTime13.toString("1970-01-01T00:04:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withWeekOfWeekyear((int) (byte) 1);
        int int8 = localDateTime7.size();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.plusYears((int) (byte) 100);
        int int11 = localDateTime10.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, (org.joda.time.ReadablePartial) localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2070 + "'", int11 == 2070);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        int int14 = localDateTime11.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minusHours(0);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime11.withMinuteOfHour(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime11.withDayOfMonth((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        boolean boolean3 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withChronology(chronology4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = dateTimeFormatter5.parseMutableDateTime("1970-01-01T00:00:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-01T00:00:00.000\" is malformed at \"-01-01T00:00:00.000\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        int int7 = localDateTime6.getYearOfCentury();
        int int8 = localDateTime6.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withMillisOfSecond(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale locale3 = locale1.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.joda.time.format.DateTimeFormat.patternForStyle("UTC", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: UTC");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ita" + "'", str2, "ita");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_US" + "'", str2, "en_US");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withZone(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = dateTimeFormatter3.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 0);
        java.io.Writer writer3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMinuteOfHour((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime9.toDateTime(readableInstant14);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer3, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfEra();
        long long5 = property4.remainder();
        boolean boolean7 = property4.equals((java.lang.Object) "en");
        org.joda.time.LocalDateTime localDateTime8 = property4.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfEra();
        long long13 = property12.remainder();
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.util.Locale locale15 = locale14.stripExtensions();
        int int16 = property12.getMaximumShortTextLength(locale14);
        java.lang.String str17 = locale14.getISO3Language();
        java.lang.String str18 = property4.getAsShortText(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.joda.time.format.DateTimeFormat.patternForStyle("UTC", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: UTC");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zho" + "'", str17, "zho");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970" + "'", str18, "1970");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("French");
        timeZone1.setRawOffset(70);
        java.lang.String str4 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Greenwich Mean Time" + "'", str4, "Greenwich Mean Time");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet1 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readableDuration5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withEra((int) (short) 0);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        int int18 = localDateTime12.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfEra();
        long long23 = property22.remainder();
        boolean boolean25 = property22.equals((java.lang.Object) "en");
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property22.getFieldType();
        org.joda.time.LocalDateTime.Property property27 = localDateTime12.property(dateTimeFieldType26);
        int int28 = localDateTime8.indexOf(dateTimeFieldType26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = strSet1.contains((java.lang.Object) int28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        int int7 = dateTimeFormatter6.getDefaultYear();
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfEra();
        long long13 = property12.remainder();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime18.toDateTime(dateTimeZone24);
        int int26 = property15.getDifference((org.joda.time.ReadableInstant) dateTime25);
        java.lang.String str27 = dateTime25.toString();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(stringBuffer8, (org.joda.time.ReadableInstant) dateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str27, "1970-01-01T00:00:00.000Z");
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        java.util.Locale locale8 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundFloorCopy();
        boolean boolean15 = strSet9.remove((java.lang.Object) localDateTime14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.yearOfEra();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime23.toDateTime(dateTimeZone29);
        long long31 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime32 = localDateTime14.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.yearOfEra();
        long long37 = property36.remainder();
        org.joda.time.LocalDateTime localDateTime38 = property36.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime42.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = localDateTime42.toDateTime(dateTimeZone48);
        int int50 = property39.getDifference((org.joda.time.ReadableInstant) dateTime49);
        boolean boolean51 = dateTime30.isAfter((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Chronology chronology52 = dateTime30.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(chronology52);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear(0);
        int int8 = dateTimeFormatter2.getDefaultYear();
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer9, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2000 + "'", int8 == 2000);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100, (int) 'a', 100, (int) 'x', (int) '4', (int) 'a', 999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        java.time.ZoneId zoneId11 = timeZone9.toZoneId();
        java.lang.String str12 = timeZone9.getDisplayName();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(zoneId11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Temps universel coordonn\351" + "'", str12, "Temps universel coordonn\351");
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeParser dateTimeParser1 = dateTimeFormatter0.getParser();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfEra();
        long long7 = property6.remainder();
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.util.Locale locale9 = locale8.stripExtensions();
        int int10 = property6.getMaximumShortTextLength(locale8);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime18.toDateTime(dateTimeZone24);
        long long26 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        int int27 = property6.getDifference((org.joda.time.ReadableInstant) dateTime25);
        java.lang.String str28 = dateTime25.toString();
        org.joda.time.Instant instant29 = dateTime25.toInstant();
        org.joda.time.Chronology chronology30 = instant29.getChronology();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(chronology30);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(1L, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter0.withChronology(chronology30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime35 = dateTimeFormatter0.parseMutableDateTime("ita");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ita\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeParser1);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str28, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese(taiwan)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("Korean");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setLanguageTag("South Korea");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: South Korea [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        java.lang.Appendable appendable3 = null;
        java.util.Locale locale6 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundFloorCopy();
        boolean boolean13 = strSet7.remove((java.lang.Object) localDateTime12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfEra();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDateTime21.toDateTime(dateTimeZone27);
        long long29 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime30 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.yearOfEra();
        long long35 = property34.remainder();
        org.joda.time.LocalDateTime localDateTime36 = property34.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDateTime40.toDateTime(dateTimeZone46);
        int int48 = property37.getDifference((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean49 = dateTime28.isAfter((org.joda.time.ReadableInstant) dateTime47);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable3, (org.joda.time.ReadableInstant) dateTime47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(86300000);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        int int7 = localDateTime6.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minus(readableDuration8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusYears(2000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withDayOfWeek((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plus(readablePeriod20);
        int int22 = localDateTime19.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.minusHours(0);
        org.joda.time.LocalDateTime.Property property25 = localDateTime19.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime19.withMinuteOfHour(3);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.yearOfEra();
        long long32 = property31.remainder();
        boolean boolean34 = property31.equals((java.lang.Object) "en");
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property31.getFieldType();
        org.joda.time.LocalDateTime.Property property36 = localDateTime19.property(dateTimeFieldType35);
        org.joda.time.Chronology chronology37 = localDateTime19.getChronology();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 2, chronology37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(0, 3, 999, (int) (byte) 10, 86300000, (int) (byte) -1, (-1970), chronology37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86300000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(chronology37);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(7, (int) (byte) 100, (int) (short) -1, (int) '4', 32, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        long long16 = property15.remainder();
        org.joda.time.LocalDateTime localDateTime17 = property15.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.centuryOfEra();
        java.util.Date date19 = localDateTime17.toDate();
        boolean boolean20 = timeZone9.inDaylightTime(date19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.util.Locale locale6 = locale5.stripExtensions();
        int int7 = property3.getMaximumShortTextLength(locale5);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime15.toDateTime(dateTimeZone21);
        long long23 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime22);
        int int24 = property3.getDifference((org.joda.time.ReadableInstant) dateTime22);
        java.lang.String str25 = dateTime22.toString();
        org.joda.time.Instant instant26 = dateTime22.toInstant();
        org.joda.time.Chronology chronology27 = instant26.getChronology();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.weekyear();
        int int30 = localDateTime28.getDayOfMonth();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str25, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("eng", (double) 0L);
        java.lang.String str3 = languageRange2.getRange();
        java.lang.String str4 = languageRange2.getRange();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfCentury();
        java.util.Locale locale18 = new java.util.Locale("zho", "");
        java.lang.String str19 = property15.getAsText(locale18);
        org.joda.time.LocalDateTime localDateTime20 = property15.roundHalfEvenCopy();
        boolean boolean21 = languageRange2.equals((java.lang.Object) property15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals(locale18.toString(), "zho");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "69" + "'", str19, "69");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter8.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        long long16 = property15.remainder();
        org.joda.time.LocalDateTime localDateTime17 = property15.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.centuryOfEra();
        java.util.Date date19 = localDateTime17.toDate();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.fromDateFields(date19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusHours((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer11, (org.joda.time.ReadablePartial) localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("French");
        timeZone1.setRawOffset(70);
        java.lang.Object obj4 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=70,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=70,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=70,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        java.io.Writer writer1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.yearOfEra();
        long long6 = property5.remainder();
        org.joda.time.LocalDateTime localDateTime7 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDateTime11.toDateTime(dateTimeZone17);
        int int19 = property8.getDifference((org.joda.time.ReadableInstant) dateTime18);
        java.lang.String str20 = dateTime18.toString();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, (org.joda.time.ReadableInstant) dateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str20, "1970-01-01T00:00:00.000Z");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withChronology(chronology3);
        boolean boolean5 = dateTimeFormatter0.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = dateTimeFormatter0.parseMutableDateTime("French");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"French\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plus(readablePeriod19);
        int int21 = localDateTime18.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.minusHours(0);
        org.joda.time.LocalDateTime.Property property24 = localDateTime18.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime18.withMinuteOfHour(3);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.yearOfEra();
        long long31 = property30.remainder();
        boolean boolean33 = property30.equals((java.lang.Object) "en");
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property30.getFieldType();
        org.joda.time.LocalDateTime.Property property35 = localDateTime18.property(dateTimeFieldType34);
        org.joda.time.Chronology chronology36 = localDateTime18.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((int) (short) 10, (int) (short) 100, 2922789, 11, 4, 0, 2070, chronology36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2070 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(chronology36);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(1970, (int) (byte) 1, (int) ' ', 7, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Greenwich Mean Time", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=greenwichmeantime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfYear((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = localDateTime8.indexOf(dateTimeFieldType9);
        int int11 = localDateTime8.getMonthOfYear();
        org.joda.time.DateTime dateTime12 = localDateTime8.toDateTime();
        int int13 = localDateTime8.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime8.withDayOfWeek(370);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 370 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.removeUnicodeLocaleAttribute("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh-CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setExtension(' ', "English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setRegion("jeudi 1 janvier 1970");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: jeudi 1 janvier 1970 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.lang.String[] strArray8 = new java.lang.String[] { "yearOfEra", "ita", "Property[yearOfEra]", "Property[yearOfEra]", "eng", "zho", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Iterator<java.lang.String> strItor11 = strSet9.iterator();
        java.util.Collection<java.util.Locale> localeCollection12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = strSet9.retainAll(localeCollection12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        java.lang.String str2 = dateTimeFormatter0.print((long) 19);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean5 = dateTimeZone4.isFixed();
        java.lang.String str6 = dateTimeZone4.getID();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        long long12 = property11.remainder();
        org.joda.time.LocalDateTime localDateTime13 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDateTime17.toDateTime(dateTimeZone23);
        int int25 = property14.getDifference((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDateTime28.toDateTime(dateTimeZone34);
        boolean boolean36 = dateTime24.isBefore((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.yearOfEra();
        long long41 = property40.remainder();
        org.joda.time.LocalDateTime localDateTime42 = property40.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDateTime46.toDateTime(dateTimeZone52);
        int int54 = property43.getDifference((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone56);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime57.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateTime dateTime64 = localDateTime57.toDateTime(dateTimeZone63);
        boolean boolean65 = dateTime53.isBefore((org.joda.time.ReadableInstant) dateTime64);
        int int66 = dateTime35.compareTo((org.joda.time.ReadableInstant) dateTime64);
        int int67 = dateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime35);
        long long69 = dateTimeZone4.convertUTCToLocal((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeFormatter0, dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.format.DateTimeFormatter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jeudi 1 janvier 1970 0 h 00 +00:00" + "'", str2, "jeudi 1 janvier 1970 0 h 00 +00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 10L + "'", long69 == 10L);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTimeFormatter2.parseDateTime("fr");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dateTimePrinter6);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        int int6 = localDateTime5.size();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusYears((int) (byte) 100);
        int int9 = localDateTime8.getYearOfEra();
        int int10 = localDateTime8.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField15 = localDateTime8.getField(70);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 70");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2070 + "'", int9 == 2070);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 0);
        java.lang.Appendable appendable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable3, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1970));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((-1970));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        int int14 = localDateTime11.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minusMillis(10);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withHourOfDay(366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.minusYears((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        int int13 = localDateTime11.indexOf(dateTimeFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMinuteOfHour(2070);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2070 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        org.joda.time.ReadWritableInstant readWritableInstant3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dateTimeFormatter2.parseInto(readWritableInstant3, "English", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Coordinated Universal Time", (double) (-1970));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1970.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("French");
        timeZone1.setRawOffset(70);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        long long8 = property7.remainder();
        org.joda.time.LocalDateTime localDateTime9 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.centuryOfEra();
        java.util.Date date11 = localDateTime9.toDate();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromDateFields(date11);
        boolean boolean13 = timeZone1.inDaylightTime(date11);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        java.util.TimeZone.setDefault(timeZone9);
        java.util.TimeZone.setDefault(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str14 = timeZone9.getDisplayName();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Temps universel coordonn\351" + "'", str14, "Temps universel coordonn\351");
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
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
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("jeudi 1 janvier 1970 0 h 00 +00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.centuryOfEra();
        java.util.Date date7 = localDateTime5.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromDateFields(date7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDate(366, (int) '4', 2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDateTime3.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime3.minusMillis(4);
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime3.withWeekyear(2922789);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plus(readablePeriod28);
        int int30 = localDateTime27.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.minusHours(0);
        org.joda.time.LocalDateTime.Property property33 = localDateTime27.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime35 = property33.setCopy(0);
        long long36 = property33.remainder();
        java.util.Locale locale37 = java.util.Locale.ROOT;
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale38.getLanguage();
        java.lang.String str40 = locale37.getDisplayCountry(locale38);
        java.lang.String str41 = locale38.getDisplayName();
        int int42 = property33.getMaximumTextLength(locale38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = localDateTime3.toString("1970-01-01T00:04:00.000", locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32000L + "'", long36 == 32000L);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "fr" + "'", str39, "fr");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "fran\347ais (Canada)" + "'", str41, "fran\347ais (Canada)");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long10 = dateTimeZone7.adjustOffset((-1L), true);
        long long14 = dateTimeZone7.convertLocalToUTC(1L, false, (long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone7);
        boolean boolean16 = dateTimeFormatter15.isOffsetParsed();
        java.lang.Appendable appendable17 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.yearOfEra();
        long long22 = property21.remainder();
        org.joda.time.LocalDateTime localDateTime23 = property21.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDateTime27.toDateTime(dateTimeZone33);
        int int35 = property24.getDifference((org.joda.time.ReadableInstant) dateTime34);
        java.lang.String str36 = dateTime34.toString();
        org.joda.time.Instant instant37 = dateTime34.toInstant();
        org.joda.time.ReadableInstant readableInstant38 = null;
        boolean boolean39 = instant37.isAfter(readableInstant38);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(appendable17, readableInstant38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str36, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundFloorCopy();
        boolean boolean9 = strSet3.remove((java.lang.Object) localDateTime8);
        strSet3.clear();
        boolean boolean11 = strSet3.isEmpty();
        int int12 = strSet3.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = strSet3.add("69");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.setLanguage("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setLanguage("+00:00:00.009");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: +00:00:00.009 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale2.getLanguage();
        java.util.Locale locale5 = locale2.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale6.getISO3Language();
        java.lang.String str8 = locale5.getDisplayCountry(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale5.getUnicodeLocaleType("Temps universel coordonn\351");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Temps universel coordonne?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ita" + "'", str7, "ita");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int12 = dateTimeZone10.getOffset(1L);
        long long14 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 70);
        long long18 = dateTimeZone10.convertLocalToUTC((long) 'a', true, 100L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter2.withZone(dateTimeZone10);
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatter19.getParser();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        java.util.Date date29 = localDateTime23.toDate();
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.fromDateFields(date29);
        int[] intArray31 = localDateTime30.getValues();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minus(readableDuration35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withDayOfYear((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        int int42 = localDateTime40.indexOf(dateTimeFieldType41);
        boolean boolean43 = localDateTime30.isAfter((org.joda.time.ReadablePartial) localDateTime40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = dateTimeFormatter19.print((org.joda.time.ReadablePartial) localDateTime40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 79L + "'", long14 == 79L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(dateTimeParser20);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1970, 1, 1, 0]");
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean4 = dateTimeFormatter3.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTimeFormatter3.parseDateTime("Thursday, January 1, 1970");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeFormatter2.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean4 = dateTimeFormatter3.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = dateTimeFormatter3.parseLocalDateTime("\u7f8e\u570b");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getUnicodeLocaleType("yearofera");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: yearofera");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1900, 4, 4, (int) '4', 2070, 69, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = property8.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField11 = localDateTime9.getField((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        java.util.TimeZone.setDefault(timeZone9);
        boolean boolean12 = timeZone9.useDaylightTime();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        int int14 = localDateTime11.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minusHours(0);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime11.withMinuteOfHour(3);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        long long24 = property23.remainder();
        boolean boolean26 = property23.equals((java.lang.Object) "en");
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property23.getFieldType();
        org.joda.time.LocalDateTime.Property property28 = localDateTime11.property(dateTimeFieldType27);
        org.joda.time.Chronology chronology29 = localDateTime11.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = localDateTime11.getFieldTypes();
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray30);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("0 h 04 ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 0 h 04  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDate();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = dateTimeFormatter0.parseMillis("yearOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"yearOfEra\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(dateTimeZone1);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        java.util.Locale locale5 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfEra();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundFloorCopy();
        boolean boolean12 = strSet6.remove((java.lang.Object) localDateTime11);
        java.util.Locale locale15 = new java.util.Locale("hi!", "");
        boolean boolean16 = strSet6.remove((java.lang.Object) locale15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter0.withLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = dateTimeFormatter0.parseLocalTime("\u4e2d\u6587\u53f0\u7063)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"?? (??)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 0);
        java.lang.Appendable appendable3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundFloorCopy();
        boolean boolean10 = property7.equals((java.lang.Object) ' ');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfEra();
        long long15 = property14.remainder();
        java.util.Locale locale16 = java.util.Locale.PRC;
        java.util.Locale locale17 = locale16.stripExtensions();
        int int18 = property14.getMaximumShortTextLength(locale16);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfEra();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime26.toDateTime(dateTimeZone32);
        long long34 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        int int35 = property14.getDifference((org.joda.time.ReadableInstant) dateTime33);
        java.util.Locale locale38 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.yearOfEra();
        org.joda.time.LocalDateTime localDateTime44 = property43.roundFloorCopy();
        boolean boolean45 = strSet39.remove((java.lang.Object) localDateTime44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.yearOfEra();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone52);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime53.toDateTime(dateTimeZone59);
        long long61 = property49.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTime dateTime62 = localDateTime44.toDateTime((org.joda.time.ReadableInstant) dateTime60);
        int int63 = dateTime33.compareTo((org.joda.time.ReadableInstant) dateTime62);
        long long64 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime62);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable3, (org.joda.time.ReadableInstant) dateTime62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        java.io.Writer writer3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfYear((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        int int14 = localDateTime12.indexOf(dateTimeFieldType13);
        int int15 = localDateTime12.getEra();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTime dateTime18 = localDateTime12.toDateTime(dateTimeZone17);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer3, (org.joda.time.ReadableInstant) dateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(2000, (int) '4', (int) ' ', (int) (byte) 100, 70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long10 = dateTimeZone7.adjustOffset((-1L), true);
        long long14 = dateTimeZone7.convertLocalToUTC(1L, false, (long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter2.withDefaultYear((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTimeFormatter2.parseDateTime("gioved\354 1 gennaio 1970 0.00.00 +00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.setLanguage("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.removeUnicodeLocaleAttribute("Thursday, January 1, 1970");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Thursday, January 1, 1970 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDate localDate1 = localDateTime0.toLocalDate();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        java.lang.String str4 = dateTimeFormatter0.print(97L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int10 = dateTimeZone8.getOffset(1L);
        long long12 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 70);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.withCenturyOfEra(3);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusHours(0);
        boolean boolean25 = dateTimeZone8.isLocalDateTimeGap(localDateTime22);
        java.lang.String str26 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDateTime22);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = dateTimeFormatter0.parseMillis("Taiwan");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Taiwan\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "01/01/70" + "'", str4, "01/01/70");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 79L + "'", long12 == 79L);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "01/01/70" + "'", str26, "01/01/70");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        int int14 = localDateTime11.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minusHours(0);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime18 = property17.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYearOfCentury((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("eng", (double) 0L);
        java.lang.String str3 = languageRange2.getRange();
        java.lang.String str4 = languageRange2.getRange();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withMinuteOfHour(4);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.minusSeconds((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        int int23 = localDateTime17.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.yearOfEra();
        long long28 = property27.remainder();
        boolean boolean30 = property27.equals((java.lang.Object) "en");
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property27.getFieldType();
        org.joda.time.LocalDateTime.Property property32 = localDateTime17.property(dateTimeFieldType31);
        int int33 = localDateTime14.get(dateTimeFieldType31);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime14.minusMinutes(0);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.minuteOfHour();
        boolean boolean37 = languageRange2.equals((java.lang.Object) localDateTime35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1969 + "'", int33 == 1969);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        java.io.Writer writer5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readableDuration12);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer5, (org.joda.time.ReadablePartial) localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        int int8 = localDateTime4.indexOf(dateTimeFieldType7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.minusHours((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfMonth(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("French");
        timeZone1.setRawOffset(70);
        timeZone1.setRawOffset(99);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = timeZone1.getDisplayName(false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str6 = nameProvider1.getShortName(locale2, "English", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.joda.time.format.DateTimeFormat.patternForStyle("1970", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: 1970");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long14 = dateTimeZone11.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone16, (long) (short) 100);
        java.util.TimeZone timeZone19 = dateTimeZone11.toTimeZone();
        int int20 = timeZone19.getRawOffset();
        boolean boolean21 = timeZone9.hasSameRules(timeZone19);
        timeZone9.setID("19");
        // The following exception was thrown during execution in test generation
        try {
            int int30 = timeZone9.getOffset(0, 32, 2070, 2922789, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfEra();
        long long13 = property12.remainder();
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.util.Locale locale15 = locale14.stripExtensions();
        int int16 = property12.getMaximumShortTextLength(locale14);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.yearOfEra();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDateTime24.toDateTime(dateTimeZone30);
        long long32 = property20.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        int int33 = property12.getDifference((org.joda.time.ReadableInstant) dateTime31);
        java.util.Locale locale36 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet37 = locale36.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.yearOfEra();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundFloorCopy();
        boolean boolean43 = strSet37.remove((java.lang.Object) localDateTime42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.yearOfEra();
        org.joda.time.LocalDateTime localDateTime48 = property47.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone50);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime51.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = localDateTime51.toDateTime(dateTimeZone57);
        long long59 = property47.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime60 = localDateTime42.toDateTime((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.yearOfEra();
        long long65 = property64.remainder();
        org.joda.time.LocalDateTime localDateTime66 = property64.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property67 = localDateTime66.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone69);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime70.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateTime dateTime77 = localDateTime70.toDateTime(dateTimeZone76);
        int int78 = property67.getDifference((org.joda.time.ReadableInstant) dateTime77);
        boolean boolean79 = dateTime58.isAfter((org.joda.time.ReadableInstant) dateTime77);
        long long80 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.Chronology chronology81 = dateTime77.getChronology();
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime(chronology81);
        org.joda.time.DateTime dateTime83 = localDateTime82.toDateTime();
        org.joda.time.DateTime dateTime84 = localDateTime5.toDateTime((org.joda.time.ReadableInstant) dateTime83);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime86 = localDateTime5.withEra(366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals(locale36.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(dateTime84);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withMinuteOfHour(4);
        int int9 = localDateTime8.getDayOfYear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfWeek();
        java.lang.String str11 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDateTime8);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer12, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04.00 " + "'", str11, "0.04.00 ");
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        int int6 = localDateTime5.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withMonthOfYear((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("Korean");
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.Chronology chronology9 = dateTimeFormatter7.getChronolgy();
        boolean boolean10 = dateTimeFormatter7.isOffsetParsed();
        java.util.Locale locale11 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withLocale(locale11);
        java.lang.String str13 = locale11.getDisplayCountry();
        java.util.Locale locale14 = locale11.stripExtensions();
        java.util.Locale.Builder builder15 = builder4.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder4.setRegion("CHN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: CHN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "South Korea" + "'", str13, "South Korea");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("monthOfYear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'monthOfYear' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        boolean boolean6 = property3.equals((java.lang.Object) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfEra();
        long long11 = property10.remainder();
        java.util.Locale locale12 = java.util.Locale.PRC;
        java.util.Locale locale13 = locale12.stripExtensions();
        int int14 = property10.getMaximumShortTextLength(locale12);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.yearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime22.toDateTime(dateTimeZone28);
        long long30 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        int int31 = property10.getDifference((org.joda.time.ReadableInstant) dateTime29);
        java.util.Locale locale34 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet35 = locale34.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.yearOfEra();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundFloorCopy();
        boolean boolean41 = strSet35.remove((java.lang.Object) localDateTime40);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.yearOfEra();
        org.joda.time.LocalDateTime localDateTime46 = property45.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime49.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = localDateTime49.toDateTime(dateTimeZone55);
        long long57 = property45.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime58 = localDateTime40.toDateTime((org.joda.time.ReadableInstant) dateTime56);
        int int59 = dateTime29.compareTo((org.joda.time.ReadableInstant) dateTime58);
        long long60 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime58);
        java.util.Locale.Builder builder61 = new java.util.Locale.Builder();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long66 = dateTimeZone63.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long70 = dateTimeZone63.getMillisKeepLocal(dateTimeZone68, (long) (short) 100);
        java.util.TimeZone timeZone71 = dateTimeZone63.toTimeZone();
        int int72 = timeZone71.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forTimeZone(timeZone71);
        java.util.Locale locale75 = java.util.Locale.ITALIAN;
        java.lang.String str76 = locale75.getISO3Language();
        java.lang.String str77 = dateTimeZone73.getShortName(1L, locale75);
        java.util.Locale.Builder builder78 = builder61.setLocale(locale75);
        int int79 = property3.getMaximumShortTextLength(locale75);
        java.lang.Object obj80 = locale75.clone();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 100L + "'", long70 == 100L);
        org.junit.Assert.assertNotNull(timeZone71);
        org.junit.Assert.assertEquals(timeZone71.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "it");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "ita" + "'", str76, "ita");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "+00:00" + "'", str77, "+00:00");
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 9 + "'", int79 == 9);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertEquals(obj80.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj80), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj80), "it");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("yearofera", (double) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=12.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        int int6 = localDateTime5.size();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusYears((int) (byte) 100);
        int int9 = localDateTime8.getYearOfEra();
        int int10 = localDateTime8.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property11.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = property11.setCopy((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2070 + "'", int9 == 2070);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(0, 1, 100, 0, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        java.util.Locale locale1 = new java.util.Locale("UTC");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "utc");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "utc");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "utc");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "utc");
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale2.getLanguage();
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        boolean boolean3 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withChronology(chronology4);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(writer6, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone8);
        int int10 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy(292278993);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusSeconds(86300000);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusDays((int) 'a');
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withDayOfWeek((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter8.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTimeFormatter8.parseDateTime("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNull(dateTimeParser10);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        java.lang.String str2 = dateTimeFormatter0.print((long) 19);
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        long long8 = property7.remainder();
        org.joda.time.LocalDateTime localDateTime9 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDateTime13.toDateTime(dateTimeZone19);
        int int21 = property10.getDifference((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDateTime24.toDateTime(dateTimeZone30);
        boolean boolean32 = dateTime20.isBefore((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.yearOfEra();
        long long37 = property36.remainder();
        org.joda.time.LocalDateTime localDateTime38 = property36.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime42.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = localDateTime42.toDateTime(dateTimeZone48);
        int int50 = property39.getDifference((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone52);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime53.toDateTime(dateTimeZone59);
        boolean boolean61 = dateTime49.isBefore((org.joda.time.ReadableInstant) dateTime60);
        int int62 = dateTime31.compareTo((org.joda.time.ReadableInstant) dateTime60);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer3, (org.joda.time.ReadableInstant) dateTime60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gioved\354 1 gennaio 1970 0.00.00 +00:00" + "'", str2, "gioved\354 1 gennaio 1970 0.00.00 +00:00");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.Locale locale13 = new java.util.Locale("zho", "");
        java.lang.String str14 = timeZone9.getDisplayName(locale13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals(locale13.toString(), "zho");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getDisplayLanguage(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withEra(365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withChronology(chronology3);
        java.lang.Appendable appendable5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minus(readableDuration9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        int int14 = localDateTime10.indexOf(dateTimeFieldType13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.minusHours((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusMillis((int) '#');
        int int19 = localDateTime16.getMonthOfYear();
        int int20 = localDateTime16.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable5, (org.joda.time.ReadablePartial) localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 69 + "'", int20 == 69);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        int int5 = dateTimeFormatter3.getDefaultYear();
        boolean boolean6 = dateTimeFormatter3.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = dateTimeFormatter3.parseLocalDate("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronology();
        java.lang.Appendable appendable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable2, 32000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        java.lang.String str11 = timeZone9.getDisplayName();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        boolean boolean6 = property3.equals((java.lang.Object) "en");
        org.joda.time.LocalDateTime localDateTime7 = property3.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        long long12 = property11.remainder();
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.util.Locale locale14 = locale13.stripExtensions();
        int int15 = property11.getMaximumShortTextLength(locale13);
        java.lang.String str16 = locale13.getISO3Language();
        java.lang.String str17 = property3.getAsShortText(locale13);
        org.joda.time.LocalDateTime localDateTime18 = property3.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withWeekyear((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withSecondOfMinute(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970" + "'", str17, "1970");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeFormatter7.print((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.parse("+00:00:00.009", dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale0.getDisplayVariant(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale4.getUnicodeLocaleType("1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(10L);
        org.joda.time.LocalTime localTime2 = localDateTime1.toLocalTime();
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longTime();
        java.lang.Appendable appendable1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        int int14 = localDateTime11.indexOf(dateTimeFieldType13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plus(readablePeriod15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.plusDays(9);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadablePartial) localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        java.util.Locale locale13 = new java.util.Locale("Coordinated Universal Time", "\u5357\u97d3", "Korean");
        java.lang.String str14 = timeZone9.getDisplayName(locale13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "\u5357\u97d3_Korean");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale13.getISO3Language();
        java.lang.String str15 = dateTimeZone11.getShortName(1L, locale13);
        java.lang.String str16 = locale13.toLanguageTag();
        java.util.Set<java.lang.String> strSet17 = locale13.getUnicodeLocaleKeys();
        java.lang.String str18 = locale13.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ita" + "'", str14, "ita");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "it" + "'", str16, "it");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "it" + "'", str18, "it");
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("eng", (double) 0L);
        java.lang.String str3 = languageRange2.getRange();
        boolean boolean5 = languageRange2.equals((java.lang.Object) 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("Korean");
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.Chronology chronology9 = dateTimeFormatter7.getChronolgy();
        boolean boolean10 = dateTimeFormatter7.isOffsetParsed();
        java.util.Locale locale11 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withLocale(locale11);
        java.lang.String str13 = locale11.getDisplayCountry();
        java.util.Locale locale14 = locale11.stripExtensions();
        java.util.Locale.Builder builder15 = builder4.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setRegion("70-01-01");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 70-01-01 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "South Korea" + "'", str13, "South Korea");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone8);
        int int10 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.yearOfEra();
        long long17 = property16.remainder();
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.util.Locale locale19 = locale18.stripExtensions();
        int int20 = property16.getMaximumShortTextLength(locale18);
        java.lang.String str21 = locale18.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = localDateTime2.toString("English", locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zho" + "'", str21, "zho");
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Locale locale3 = locale2.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("yearOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: yearOfEra");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("Korean");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setUnicodeLocaleKeyword("Temps universel coordonn\351", "Temps universel coordonn\351");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Temps universel coordonne? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        int int14 = localDateTime11.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minusHours(0);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime11.withMillisOfDay((int) (byte) 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter22.withOffsetParsed();
        org.joda.time.Chronology chronology24 = dateTimeFormatter22.getChronolgy();
        boolean boolean25 = dateTimeFormatter22.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = dateTimeFormatter22.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int32 = dateTimeZone30.getOffset(1L);
        long long34 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 70);
        long long38 = dateTimeZone30.convertLocalToUTC((long) 'a', true, 100L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter22.withZone(dateTimeZone30);
        org.joda.time.format.DateTimeParser dateTimeParser40 = dateTimeFormatter39.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = localDateTime19.toString(dateTimeFormatter39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNull(chronology24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dateTimePrinter26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 79L + "'", long34 == 79L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 97L + "'", long38 == 97L);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNull(dateTimeParser40);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Greenwich Mean Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Greenwich Mean Time' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        java.lang.Appendable appendable1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plus(readablePeriod14);
        int int16 = localDateTime13.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.minusHours(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime13.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadablePartial) localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withMinuteOfHour(4);
        int int9 = localDateTime8.getDayOfYear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfWeek();
        java.lang.String str11 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.ReadWritableInstant readWritableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dateTimeFormatter0.parseInto(readWritableInstant12, "Etc/UTC", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04.00 " + "'", str11, "0.04.00 ");
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = localDateTime4.getFields();
        int[] intArray9 = localDateTime4.getValues();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1970, 1, 1, 0]");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) 'x');
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long11 = dateTimeZone8.adjustOffset((-1L), true);
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale13.getISO3Language();
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str16 = dateTimeZone8.getShortName(0L, locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter6.withLocale(locale13);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeFormatter17.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = dateTimeFormatter17.parseLocalDateTime("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "eng" + "'", str14, "eng");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(dateTimeZone18);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long11 = dateTimeZone8.adjustOffset((-1L), true);
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale13.getISO3Language();
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str16 = dateTimeZone8.getShortName(0L, locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter6.withLocale(locale13);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeFormatter17.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = dateTimeFormatter17.parseLocalTime("1970-01-01T00:04:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "eng" + "'", str14, "eng");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(dateTimeZone18);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale1.getDisplayCountry(locale2);
        java.lang.String str5 = locale2.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.joda.time.format.DateTimeFormat.patternForStyle("Italian", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: Italian");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italian" + "'", str3, "Italian");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        java.lang.String str4 = property3.getName();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yearOfEra" + "'", str4, "yearOfEra");
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        java.io.Writer writer7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        long long12 = property11.remainder();
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.util.Locale locale14 = locale13.stripExtensions();
        int int15 = property11.getMaximumShortTextLength(locale13);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.yearOfEra();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime23.toDateTime(dateTimeZone29);
        long long31 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        int int32 = property11.getDifference((org.joda.time.ReadableInstant) dateTime30);
        java.util.Locale locale35 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.yearOfEra();
        org.joda.time.LocalDateTime localDateTime41 = property40.roundFloorCopy();
        boolean boolean42 = strSet36.remove((java.lang.Object) localDateTime41);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.yearOfEra();
        org.joda.time.LocalDateTime localDateTime47 = property46.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone49);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime50.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = localDateTime50.toDateTime(dateTimeZone56);
        long long58 = property46.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime59 = localDateTime41.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        int int60 = dateTime30.compareTo((org.joda.time.ReadableInstant) dateTime59);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, (org.joda.time.ReadableInstant) dateTime59);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localDateTime2.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.minusMillis(4);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMinutes((int) 'u');
        org.joda.time.DateTime dateTime13 = localDateTime10.toDateTime();
        int int14 = localDateTime10.getYearOfEra();
        java.lang.Class<?> wildcardClass15 = localDateTime10.getClass();
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1969 + "'", int14 == 1969);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        int int5 = dateTimeFormatter3.getDefaultYear();
        boolean boolean6 = dateTimeFormatter3.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter3.getParser();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = locale8.getDisplayCountry(locale9);
        java.lang.String str12 = locale9.getCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter3.withLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = dateTimeFormatter13.parseLocalDate("70-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italian" + "'", str10, "Italian");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.dayOfYear();
        int int9 = localDateTime2.getYearOfEra();
        int int10 = localDateTime2.getMinuteOfHour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.joda.time.format.DateTimeFormat.longDate();
        boolean boolean12 = localDateTime2.equals((java.lang.Object) dateTimeFormatter11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter11.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = dateTimeFormatter11.parseLocalDateTime("+00:00:00.032");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00:00.032\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateTimeZone13);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("Property[yearOfEra]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: Property[yearOfEra]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundFloorCopy();
        boolean boolean9 = strSet3.remove((java.lang.Object) localDateTime8);
        int int10 = localDateTime8.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDayOfYear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withOffsetParsed();
        org.joda.time.Chronology chronology5 = dateTimeFormatter3.getChronolgy();
        boolean boolean6 = dateTimeFormatter3.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int13 = dateTimeZone11.getOffset(1L);
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) 70);
        long long19 = dateTimeZone11.convertLocalToUTC((long) 'a', true, 100L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter3.withZone(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeFormatter0, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.format.DateTimeFormatter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dateTimePrinter7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 79L + "'", long15 == 79L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMonths(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute(999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        long long9 = property8.remainder();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property8.setCopy("it");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"it\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        java.lang.Object obj4 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "en_US");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        java.util.TimeZone.setDefault(timeZone9);
        java.util.TimeZone.setDefault(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long18 = dateTimeZone15.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long22 = dateTimeZone15.getMillisKeepLocal(dateTimeZone20, (long) (short) 100);
        java.util.TimeZone timeZone23 = dateTimeZone15.toTimeZone();
        int int24 = timeZone23.getRawOffset();
        java.util.TimeZone.setDefault(timeZone23);
        java.util.TimeZone.setDefault(timeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        boolean boolean28 = timeZone9.hasSameRules(timeZone23);
        java.util.Locale locale32 = new java.util.Locale("hi!", "en", "Property[yearOfEra]");
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleKeys();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        java.util.Date date42 = localDateTime36.toDate();
        boolean boolean43 = strSet33.remove((java.lang.Object) date42);
        boolean boolean44 = timeZone23.inDaylightTime(date42);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals(locale32.toString(), "hi!_EN_Property[yearOfEra]");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        int int10 = localDateTime2.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime2.withDayOfWeek((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfEra();
        long long5 = property4.remainder();
        java.util.Locale locale6 = java.util.Locale.PRC;
        java.util.Locale locale7 = locale6.stripExtensions();
        int int8 = property4.getMaximumShortTextLength(locale6);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime16.toDateTime(dateTimeZone22);
        long long24 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        int int25 = property4.getDifference((org.joda.time.ReadableInstant) dateTime23);
        java.lang.String str26 = dateTime23.toString();
        org.joda.time.Instant instant27 = dateTime23.toInstant();
        org.joda.time.Chronology chronology28 = instant27.getChronology();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(chronology28);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(1L, chronology28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withWeekOfWeekyear(2070);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2070 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str26, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
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
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        int int6 = localDateTime5.size();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusSeconds(10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMinuteOfHour(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYearOfCentury(1971);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1971 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        int int6 = property3.getLeapAmount();
        int int7 = property3.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime9 = property3.addToCopy((long) 999);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property3.setCopy(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale[] localeArray7 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList8 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList8, localeArray7);
        java.util.Locale.FilteringMode filteringMode10 = null;
        java.util.List<java.util.Locale> localeList11 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList8, filteringMode10);
        boolean boolean12 = strSet3.removeAll((java.util.Collection<java.util.Locale>) localeList11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.yearOfEra();
        long long17 = property16.remainder();
        org.joda.time.LocalDateTime localDateTime18 = property16.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.centuryOfEra();
        boolean boolean20 = strSet3.equals((java.lang.Object) property19);
        org.joda.time.LocalDateTime localDateTime22 = property19.addToCopy(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withDate(86300000, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) (short) 100, 2000, 50400000, 0, 69, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 0);
        java.io.Writer writer3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withCenturyOfEra(3);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer3, (org.joda.time.ReadablePartial) localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("Thursday, January 1, 1970");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Thursday, January 1, 1970' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMillisOfDay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("eng");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: eng");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        int int10 = localDateTime2.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime2.withEra(12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readableDuration5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfYear((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = localDateTime10.indexOf(dateTimeFieldType11);
        int int13 = localDateTime10.getEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plusWeeks((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, (org.joda.time.ReadablePartial) localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withPivotYear((int) '4');
        java.util.Locale locale6 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundFloorCopy();
        boolean boolean13 = strSet7.remove((java.lang.Object) localDateTime12);
        java.util.Locale locale16 = new java.util.Locale("hi!", "");
        boolean boolean17 = strSet7.remove((java.lang.Object) locale16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter1.withLocale(locale16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.parse("Property[yearOfEra]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Property[yearOfEra]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setScript("monthOfYear");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: monthOfYear [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        int int14 = localDateTime11.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = localDateTime17.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) property25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusSeconds((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        int int18 = localDateTime12.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfEra();
        long long23 = property22.remainder();
        boolean boolean25 = property22.equals((java.lang.Object) "en");
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property22.getFieldType();
        org.joda.time.LocalDateTime.Property property27 = localDateTime12.property(dateTimeFieldType26);
        int int28 = localDateTime9.get(dateTimeFieldType26);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minus(readableDuration32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withEra((int) (short) 0);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.secondOfMinute();
        org.joda.time.LocalDateTime.Property property37 = localDateTime35.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.plusMillis((int) (short) 1);
        boolean boolean40 = localDateTime9.isBefore((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long45 = dateTimeZone42.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long49 = dateTimeZone42.getMillisKeepLocal(dateTimeZone47, (long) (short) 100);
        java.util.TimeZone timeZone50 = dateTimeZone42.toTimeZone();
        int int51 = timeZone50.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone54);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime55.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray61 = localDateTime55.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime55.minusMillis(4);
        boolean boolean64 = dateTimeZone52.equals((java.lang.Object) localDateTime63);
        org.joda.time.DateTime dateTime65 = localDateTime9.toDateTime(dateTimeZone52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField67 = localDateTime9.getField(1969);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1969");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1969 + "'", int28 == 1969);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 100L + "'", long49 == 100L);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(dateTime65);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.lang.String str4 = nameProvider0.getName(locale1, "69", "yearOfEra");
        java.util.Locale locale7 = new java.util.Locale("eng", "hi!");
        java.lang.String str10 = nameProvider0.getShortName(locale7, "English (United States)", "yearOfEra");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale7.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for HI!");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals(locale7.toString(), "eng_HI!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime7.toDateTime(dateTimeZone13);
        long long15 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property3.addWrapFieldToCopy(1970);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusSeconds(2922789);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.monthOfYear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeField[] dateTimeFieldArray22 = localDateTime17.getFields();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeFieldArray22);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        int int6 = localDateTime5.size();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusYears((int) (byte) 100);
        int int9 = localDateTime8.getYearOfEra();
        int int10 = localDateTime8.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy(8812800000L);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) property14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2070 + "'", int9 == 2070);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        int int6 = property3.getLeapAmount();
        int int7 = property3.getMinimumValueOverall();
        java.lang.String str8 = property3.getAsString();
        int int9 = property3.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970" + "'", str8, "1970");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 292278993 + "'", int9 == 292278993);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        java.util.Date date8 = localDateTime2.toDate();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withDayOfYear(4);
        org.joda.time.LocalDateTime.Property property11 = localDateTime2.era();
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        boolean boolean3 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime7.toDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime7.minusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long21 = dateTimeZone18.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long25 = dateTimeZone18.getMillisKeepLocal(dateTimeZone23, (long) (short) 100);
        org.joda.time.DateTime dateTime26 = localDateTime7.toDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.yearOfEra();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = localDateTime34.toDateTime(dateTimeZone40);
        long long42 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime41);
        int int43 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime41);
        long long44 = dateTime26.getMillis();
        java.lang.String str45 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate47 = dateTimeFormatter2.parseLocalDate("Corea del Sud");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Corea del Sud\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "01/01/70" + "'", str45, "01/01/70");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("en_US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: en_US");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.setLanguage("French");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.removeUnicodeLocaleAttribute("yearofera");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: yearofera [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setUnicodeLocaleKeyword("69", "United States");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: United States [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        long long10 = dateTimeZone1.convertUTCToLocal(97L);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1971));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        java.lang.String str2 = dateTimeFormatter0.print((long) 19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withDefaultYear((int) (short) -1);
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plus(readablePeriod18);
        int int20 = localDateTime17.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.minusHours(0);
        org.joda.time.LocalDateTime.Property property23 = localDateTime17.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime17.withMinuteOfHour(3);
        org.joda.time.DateTimeField[] dateTimeFieldArray26 = localDateTime25.getFields();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer5, (org.joda.time.ReadablePartial) localDateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gioved\354 1 gennaio 1970 0.00.00 +00:00" + "'", str2, "gioved\354 1 gennaio 1970 0.00.00 +00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldArray26);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("Thursday, January 1, 1970");
        java.lang.String str3 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT+00:00" + "'", str3, "GMT+00:00");
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale2.getLanguage();
        java.util.Locale locale5 = locale2.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale6.getISO3Language();
        java.lang.String str8 = locale5.getDisplayCountry(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale6.getUnicodeLocaleType("yearOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: yearOfEra");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ita" + "'", str7, "ita");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(2);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = localDateTime9.indexOf(dateTimeFieldType11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plus(readablePeriod13);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.year();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = locale18.getLanguage();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        long long24 = property23.remainder();
        java.util.Locale locale25 = java.util.Locale.PRC;
        java.util.Locale locale26 = locale25.stripExtensions();
        int int27 = property23.getMaximumShortTextLength(locale25);
        java.lang.String str28 = locale18.getDisplayVariant(locale25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime29 = property16.setCopy("gioved\354 1 gennaio 1970", locale25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"giovedi? 1 gennaio 1970\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "it" + "'", str19, "it");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField12 = localDateTime9.getField(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 12");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withCenturyOfEra((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime6.year();
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDateTime6.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withEra(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes(1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMinuteOfHour((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.DateTime dateTime11 = localDateTime5.toDateTime(readableInstant10);
        long long12 = dateTime11.getMillis();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMonths(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withMinuteOfHour((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.fullDateTime();
        java.lang.String str3 = dateTimeFormatter1.print((long) 19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter1.withDefaultYear((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.parse("fr", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"fr\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gioved\354 1 gennaio 1970 0.00.00 +00:00" + "'", str3, "gioved\354 1 gennaio 1970 0.00.00 +00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long15 = dateTimeZone12.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long19 = dateTimeZone12.getMillisKeepLocal(dateTimeZone17, (long) (short) 100);
        java.util.TimeZone timeZone20 = dateTimeZone12.toTimeZone();
        int int21 = timeZone20.getRawOffset();
        java.util.TimeZone.setDefault(timeZone20);
        java.util.TimeZone.setDefault(timeZone20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        boolean boolean25 = timeZone9.hasSameRules(timeZone20);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long30 = dateTimeZone27.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long34 = dateTimeZone27.getMillisKeepLocal(dateTimeZone32, (long) (short) 100);
        java.util.TimeZone timeZone35 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long40 = dateTimeZone37.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long44 = dateTimeZone37.getMillisKeepLocal(dateTimeZone42, (long) (short) 100);
        java.util.TimeZone timeZone45 = dateTimeZone37.toTimeZone();
        int int46 = timeZone45.getRawOffset();
        boolean boolean47 = timeZone35.hasSameRules(timeZone45);
        boolean boolean48 = timeZone9.hasSameRules(timeZone35);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = timeZone9.getOffset(50400000, (int) 'u', 59, 5, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 50400000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withDefaultYear((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = dateTimeFormatter0.parseLocalTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        int int5 = dateTimeFormatter3.getDefaultYear();
        boolean boolean6 = dateTimeFormatter3.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter3.getParser();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getName(0L);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minus(readableDuration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withYearOfEra(4);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.yearOfEra();
        long long26 = property25.remainder();
        java.util.Locale locale27 = java.util.Locale.PRC;
        java.util.Locale locale28 = locale27.stripExtensions();
        int int29 = property25.getMaximumShortTextLength(locale27);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.yearOfEra();
        org.joda.time.LocalDateTime localDateTime34 = property33.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localDateTime37.toDateTime(dateTimeZone43);
        long long45 = property33.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime44);
        int int46 = property25.getDifference((org.joda.time.ReadableInstant) dateTime44);
        java.util.Locale locale49 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet50 = locale49.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.yearOfEra();
        org.joda.time.LocalDateTime localDateTime55 = property54.roundFloorCopy();
        boolean boolean56 = strSet50.remove((java.lang.Object) localDateTime55);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.yearOfEra();
        org.joda.time.LocalDateTime localDateTime61 = property60.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone63);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime64.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = localDateTime64.toDateTime(dateTimeZone70);
        long long72 = property60.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTime dateTime73 = localDateTime55.toDateTime((org.joda.time.ReadableInstant) dateTime71);
        int int74 = dateTime44.compareTo((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime75 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) dateTime73);
        int int76 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = dateTimeFormatter3.withZone(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals(locale49.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter77);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("yearOfEra", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=yearofera");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withPivotYear((int) '4');
        java.util.Locale locale6 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundFloorCopy();
        boolean boolean13 = strSet7.remove((java.lang.Object) localDateTime12);
        java.util.Locale locale16 = new java.util.Locale("hi!", "");
        boolean boolean17 = strSet7.remove((java.lang.Object) locale16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter1.withLocale(locale16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.parse("1969-01-01T00:00:00.000", dateTimeFormatter18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1969-01-01T00:00:00.000\" is malformed at \"69-01-01T00:00:00.000\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.util.Locale locale6 = locale5.stripExtensions();
        int int7 = property3.getMaximumShortTextLength(locale5);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime15.toDateTime(dateTimeZone21);
        long long23 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime22);
        int int24 = property3.getDifference((org.joda.time.ReadableInstant) dateTime22);
        java.lang.String str25 = property3.getAsShortText();
        org.joda.time.LocalDateTime localDateTime26 = property3.roundHalfEvenCopy();
        org.joda.time.DurationField durationField27 = property3.getDurationField();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970" + "'", str25, "1970");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setUnicodeLocaleKeyword("1970-01-01T00:04:00.000", "GMT+00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 1970-01-01T00:04:00.000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Taiwan");
        java.lang.String str2 = languageRange1.getRange();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDateTime11.toDateTime(dateTimeZone17);
        long long19 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTimeZone3.getOffset((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime23.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((-1970));
        boolean boolean33 = dateTimeZone3.isLocalDateTimeGap(localDateTime30);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.minus(readableDuration34);
        boolean boolean36 = languageRange1.equals((java.lang.Object) readableDuration34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "taiwan" + "'", str2, "taiwan");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfEra();
        long long11 = property10.remainder();
        java.util.Locale locale12 = java.util.Locale.PRC;
        java.util.Locale locale13 = locale12.stripExtensions();
        int int14 = property10.getMaximumShortTextLength(locale12);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.yearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime22.toDateTime(dateTimeZone28);
        long long30 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        int int31 = property10.getDifference((org.joda.time.ReadableInstant) dateTime29);
        java.lang.String str32 = dateTime29.toString();
        org.joda.time.Instant instant33 = dateTime29.toInstant();
        org.joda.time.Chronology chronology34 = instant33.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((int) (byte) 10, 1970, 99, 2070, (-1971), 252000000, (int) (short) 1, chronology34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2070 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str32, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(chronology34);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, 1, (int) (byte) 100, 1, (int) ' ', (-1971), 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1971 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withCenturyOfEra(50400000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50400000 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        int int8 = localDateTime7.getDayOfYear();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.dayOfWeek();
        java.util.Locale locale12 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfEra();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundFloorCopy();
        boolean boolean19 = strSet13.remove((java.lang.Object) localDateTime18);
        java.util.Locale locale22 = new java.util.Locale("hi!", "");
        boolean boolean23 = strSet13.remove((java.lang.Object) locale22);
        int int24 = property9.getMaximumShortTextLength(locale22);
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.lang.String str26 = locale22.getDisplayName(locale25);
        java.lang.String str27 = locale22.toString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals(locale22.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.setLanguage("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.removeUnicodeLocaleAttribute("jeudi 1 janvier 1970 0 h 00 +00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: jeudi 1 janvier 1970 0 h 00 +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        java.lang.String str2 = dateTimeFormatter0.print((long) 19);
        boolean boolean3 = dateTimeFormatter0.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = dateTimeFormatter0.parseLocalDateTime("\u4e2d\u6587\u53f0\u7063)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"?? (??)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Thursday, January 1, 1970 12:00:00 AM +00:00" + "'", str2, "Thursday, January 1, 1970 12:00:00 AM +00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.secondOfMinute();
        int int8 = property7.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        int int21 = localDateTime18.indexOf(dateTimeFieldType20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.plus(readablePeriod22);
        int int24 = localDateTime23.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.year();
        boolean boolean26 = property7.equals((java.lang.Object) property25);
        java.util.Locale locale28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime29 = property25.setCopy("eng", locale28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"eng\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.util.Locale locale6 = locale5.stripExtensions();
        int int7 = property3.getMaximumShortTextLength(locale5);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime15.toDateTime(dateTimeZone21);
        long long23 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime22);
        int int24 = property3.getDifference((org.joda.time.ReadableInstant) dateTime22);
        java.util.Locale locale27 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.yearOfEra();
        org.joda.time.LocalDateTime localDateTime33 = property32.roundFloorCopy();
        boolean boolean34 = strSet28.remove((java.lang.Object) localDateTime33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.yearOfEra();
        org.joda.time.LocalDateTime localDateTime39 = property38.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime42.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = localDateTime42.toDateTime(dateTimeZone48);
        long long50 = property38.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime dateTime51 = localDateTime33.toDateTime((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.yearOfEra();
        long long56 = property55.remainder();
        org.joda.time.LocalDateTime localDateTime57 = property55.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone60);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime61.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateTime dateTime68 = localDateTime61.toDateTime(dateTimeZone67);
        int int69 = property58.getDifference((org.joda.time.ReadableInstant) dateTime68);
        boolean boolean70 = dateTime49.isAfter((org.joda.time.ReadableInstant) dateTime68);
        long long71 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.Chronology chronology72 = dateTime68.getChronology();
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(chronology72);
        org.joda.time.DateTime dateTime74 = localDateTime73.toDateTime();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime73.plusMinutes(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime78 = localDateTime73.withHourOfDay(86300000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86300000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals(locale27.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(localDateTime76);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.setLanguage("French");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setUnicodeLocaleKeyword("", "Corea del Sud");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.setLanguage("eng");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("South Korea");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: South Korea [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("French");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: French");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime9.toDateTime(dateTimeZone15);
        int int17 = property6.getDifference((org.joda.time.ReadableInstant) dateTime16);
        java.lang.String str18 = dateTime16.toString();
        org.joda.time.Instant instant19 = dateTime16.toInstant();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        long long24 = property23.remainder();
        java.util.Locale locale25 = java.util.Locale.PRC;
        java.util.Locale locale26 = locale25.stripExtensions();
        int int27 = property23.getMaximumShortTextLength(locale25);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.yearOfEra();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime35.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDateTime35.toDateTime(dateTimeZone41);
        long long43 = property31.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime42);
        int int44 = property23.getDifference((org.joda.time.ReadableInstant) dateTime42);
        java.util.Locale locale47 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet48 = locale47.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.yearOfEra();
        org.joda.time.LocalDateTime localDateTime53 = property52.roundFloorCopy();
        boolean boolean54 = strSet48.remove((java.lang.Object) localDateTime53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone56);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.yearOfEra();
        org.joda.time.LocalDateTime localDateTime59 = property58.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone61);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime62.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = localDateTime62.toDateTime(dateTimeZone68);
        long long70 = property58.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.DateTime dateTime71 = localDateTime53.toDateTime((org.joda.time.ReadableInstant) dateTime69);
        int int72 = dateTime42.compareTo((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.Instant instant73 = dateTime42.toInstant();
        boolean boolean74 = instant19.isBefore((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int76 = dateTime42.get(dateTimeFieldType75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str18, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals(locale47.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(instant73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("kor", (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=35.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone8);
        int int10 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime14.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plus(readablePeriod24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.yearOfEra();
        long long30 = property29.remainder();
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.util.Locale locale32 = locale31.stripExtensions();
        int int33 = property29.getMaximumShortTextLength(locale31);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.yearOfEra();
        org.joda.time.LocalDateTime localDateTime38 = property37.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime41.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDateTime41.toDateTime(dateTimeZone47);
        long long49 = property37.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        int int50 = property29.getDifference((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime51 = localDateTime25.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        int int52 = property11.compareTo((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.LocalDateTime localDateTime53 = property11.roundHalfCeilingCopy();
        java.util.Locale locale56 = new java.util.Locale("", "");
        int int57 = property11.getMaximumShortTextLength(locale56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime59 = property11.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTimeFormatter7.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDateTime();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = dateTimeFormatter0.parseLocalTime("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Etc/UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(dateTimeZone1);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime7.toDateTime(dateTimeZone13);
        long long15 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property3.addWrapFieldToCopy(1970);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusSeconds(2922789);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.monthOfYear();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfMonth();
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter26.withOffsetParsed();
        org.joda.time.Chronology chronology28 = dateTimeFormatter26.getChronolgy();
        boolean boolean29 = dateTimeFormatter26.isOffsetParsed();
        java.util.Locale locale30 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter26.withLocale(locale30);
        java.lang.String str32 = locale30.getDisplayCountry();
        java.util.Locale locale33 = locale30.stripExtensions();
        java.lang.String str34 = locale30.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime35 = property22.setCopy("UTC", locale30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"UTC\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(chronology28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "South Korea" + "'", str32, "South Korea");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "kor" + "'", str34, "kor");
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundFloorCopy();
        boolean boolean9 = strSet3.remove((java.lang.Object) localDateTime8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDateTime17.toDateTime(dateTimeZone23);
        long long25 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime8.plus(readablePeriod27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = localDateTime8.withWeekOfWeekyear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = dateTimeFormatter7.parseLocalTime("Property[weekOfWeekyear]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        java.time.ZoneId zoneId11 = timeZone9.toZoneId();
        boolean boolean12 = timeZone9.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long17 = dateTimeZone14.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long21 = dateTimeZone14.getMillisKeepLocal(dateTimeZone19, (long) (short) 100);
        java.util.TimeZone timeZone22 = dateTimeZone14.toTimeZone();
        int int23 = timeZone22.getRawOffset();
        java.time.ZoneId zoneId24 = timeZone22.toZoneId();
        boolean boolean25 = timeZone9.hasSameRules(timeZone22);
        timeZone22.setRawOffset(59);
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale30.getLanguage();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.yearOfEra();
        long long36 = property35.remainder();
        java.util.Locale locale37 = java.util.Locale.PRC;
        java.util.Locale locale38 = locale37.stripExtensions();
        int int39 = property35.getMaximumShortTextLength(locale37);
        java.lang.String str40 = locale30.getDisplayVariant(locale37);
        java.lang.String str41 = timeZone22.getDisplayName(true, (int) (short) 1, locale30);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "yearofera");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "yearofera" + "'", str31, "yearofera");
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Coordinated Universal Time" + "'", str41, "Coordinated Universal Time");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = dateTimeFormatter2.parseLocalTime("yearofera");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int5 = dateTimeZone3.getOffset(1L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 70);
        long long11 = dateTimeZone3.convertLocalToUTC((long) 'a', true, 100L);
        java.util.TimeZone timeZone12 = dateTimeZone3.toTimeZone();
        java.util.Locale locale15 = new java.util.Locale("eng", "hi!");
        java.util.Locale locale19 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str20 = locale15.getDisplayVariant(locale19);
        java.util.Set<java.lang.String> strSet21 = locale15.getUnicodeLocaleKeys();
        java.lang.String str22 = timeZone12.getDisplayName(locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 79L + "'", long7 == 79L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals(locale15.toString(), "eng_HI!");
        org.junit.Assert.assertEquals(locale19.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coordinated Universal Time" + "'", str22, "Coordinated Universal Time");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long14 = dateTimeZone11.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone16, (long) (short) 100);
        java.util.TimeZone timeZone19 = dateTimeZone11.toTimeZone();
        int int20 = timeZone19.getRawOffset();
        boolean boolean21 = timeZone9.hasSameRules(timeZone19);
        timeZone9.setID("19");
        java.lang.Object obj24 = timeZone9.clone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "java.util.SimpleTimeZone[id=19,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "java.util.SimpleTimeZone[id=19,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "java.util.SimpleTimeZone[id=19,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.longTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("+00:00", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, readablePartial5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        boolean boolean6 = property3.equals((java.lang.Object) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfEra();
        long long11 = property10.remainder();
        java.util.Locale locale12 = java.util.Locale.PRC;
        java.util.Locale locale13 = locale12.stripExtensions();
        int int14 = property10.getMaximumShortTextLength(locale12);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.yearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime22.toDateTime(dateTimeZone28);
        long long30 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        int int31 = property10.getDifference((org.joda.time.ReadableInstant) dateTime29);
        java.util.Locale locale34 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet35 = locale34.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.yearOfEra();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundFloorCopy();
        boolean boolean41 = strSet35.remove((java.lang.Object) localDateTime40);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.yearOfEra();
        org.joda.time.LocalDateTime localDateTime46 = property45.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime49.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = localDateTime49.toDateTime(dateTimeZone55);
        long long57 = property45.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime58 = localDateTime40.toDateTime((org.joda.time.ReadableInstant) dateTime56);
        int int59 = dateTime29.compareTo((org.joda.time.ReadableInstant) dateTime58);
        long long60 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime58);
        java.util.Locale.Builder builder61 = new java.util.Locale.Builder();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long66 = dateTimeZone63.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long70 = dateTimeZone63.getMillisKeepLocal(dateTimeZone68, (long) (short) 100);
        java.util.TimeZone timeZone71 = dateTimeZone63.toTimeZone();
        int int72 = timeZone71.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forTimeZone(timeZone71);
        java.util.Locale locale75 = java.util.Locale.ITALIAN;
        java.lang.String str76 = locale75.getISO3Language();
        java.lang.String str77 = dateTimeZone73.getShortName(1L, locale75);
        java.util.Locale.Builder builder78 = builder61.setLocale(locale75);
        int int79 = property3.getMaximumShortTextLength(locale75);
        java.lang.String str80 = locale75.toString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 100L + "'", long70 == 100L);
        org.junit.Assert.assertNotNull(timeZone71);
        org.junit.Assert.assertEquals(timeZone71.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "it");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "ita" + "'", str76, "ita");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "+00:00" + "'", str77, "+00:00");
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 9 + "'", int79 == 9);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "it" + "'", str80, "it");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        int int5 = dateTimeFormatter3.getDefaultYear();
        boolean boolean6 = dateTimeFormatter3.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter3.getParser();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = locale8.getDisplayCountry(locale9);
        java.lang.String str12 = locale9.getCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter3.withLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeFormatter13.parseMillis("taiwan");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "yearofera");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "yearofera");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearofera" + "'", str10, "yearofera");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setScript("eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.util.Locale locale6 = locale5.stripExtensions();
        int int7 = property3.getMaximumShortTextLength(locale5);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime15.toDateTime(dateTimeZone21);
        long long23 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime22);
        int int24 = property3.getDifference((org.joda.time.ReadableInstant) dateTime22);
        java.lang.String str25 = dateTime22.toString();
        org.joda.time.Instant instant26 = dateTime22.toInstant();
        org.joda.time.Chronology chronology27 = instant26.getChronology();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.weekyear();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime32.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plus(readablePeriod42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.withYear(70);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.hourOfDay();
        int int47 = localDateTime45.getMonthOfYear();
        org.joda.time.DateTime dateTime48 = localDateTime45.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone50);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime51.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray57 = localDateTime51.getFieldTypes();
        org.joda.time.LocalDateTime.Property property58 = localDateTime51.year();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone60);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.yearOfEra();
        long long63 = property62.remainder();
        org.joda.time.LocalDateTime localDateTime64 = property62.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = property65.getFieldType();
        boolean boolean67 = localDateTime51.isSupported(dateTimeFieldType66);
        boolean boolean68 = dateTime48.isSupported(dateTimeFieldType66);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime70 = localDateTime28.withField(dateTimeFieldType66, 50400000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50400000 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str25, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        int int6 = localDateTime5.size();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withDayOfMonth(7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime5.withTime(59, 70, 100, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long14 = dateTimeZone11.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone16, (long) (short) 100);
        java.util.TimeZone timeZone19 = dateTimeZone11.toTimeZone();
        int int20 = timeZone19.getRawOffset();
        boolean boolean21 = timeZone9.hasSameRules(timeZone19);
        timeZone9.setID("19");
        timeZone9.setRawOffset((int) ' ');
        int int26 = timeZone9.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeParser dateTimeParser2 = dateTimeFormatter1.getParser();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        long long8 = property7.remainder();
        java.util.Locale locale9 = java.util.Locale.PRC;
        java.util.Locale locale10 = locale9.stripExtensions();
        int int11 = property7.getMaximumShortTextLength(locale9);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime19.toDateTime(dateTimeZone25);
        long long27 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        int int28 = property7.getDifference((org.joda.time.ReadableInstant) dateTime26);
        java.lang.String str29 = dateTime26.toString();
        org.joda.time.Instant instant30 = dateTime26.toInstant();
        org.joda.time.Chronology chronology31 = instant30.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(chronology31);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(1L, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter1.withChronology(chronology31);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 366, chronology31);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusMinutes(370);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeParser2);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str29, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(localDateTime37);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 10);
        org.joda.time.LocalDate localDate2 = localDateTime1.toLocalDate();
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        boolean boolean3 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime7.toDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime7.minusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long21 = dateTimeZone18.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long25 = dateTimeZone18.getMillisKeepLocal(dateTimeZone23, (long) (short) 100);
        org.joda.time.DateTime dateTime26 = localDateTime7.toDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.yearOfEra();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = localDateTime34.toDateTime(dateTimeZone40);
        long long42 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime41);
        int int43 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime41);
        long long44 = dateTime26.getMillis();
        java.lang.String str45 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime48.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = localDateTime48.toDateTime(dateTimeZone54);
        int int56 = localDateTime48.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property57 = localDateTime48.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone59);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime60.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime60.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.plus(readablePeriod70);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone73);
        org.joda.time.LocalDateTime.Property property75 = localDateTime74.yearOfEra();
        long long76 = property75.remainder();
        java.util.Locale locale77 = java.util.Locale.PRC;
        java.util.Locale locale78 = locale77.stripExtensions();
        int int79 = property75.getMaximumShortTextLength(locale77);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone81);
        org.joda.time.LocalDateTime.Property property83 = localDateTime82.yearOfEra();
        org.joda.time.LocalDateTime localDateTime84 = property83.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.LocalDateTime localDateTime87 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone86);
        org.joda.time.LocalDateTime localDateTime92 = localDateTime87.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone93 = null;
        org.joda.time.DateTime dateTime94 = localDateTime87.toDateTime(dateTimeZone93);
        long long95 = property83.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime94);
        int int96 = property75.getDifference((org.joda.time.ReadableInstant) dateTime94);
        org.joda.time.DateTime dateTime97 = localDateTime71.toDateTime((org.joda.time.ReadableInstant) dateTime94);
        int int98 = property57.compareTo((org.joda.time.ReadableInstant) dateTime97);
        java.lang.String str99 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime97);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1/1/70" + "'", str45, "1/1/70");
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 4 + "'", int56 == 4);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 9 + "'", int79 == 9);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertNotNull(localDateTime84);
        org.junit.Assert.assertNotNull(localDateTime92);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 0L + "'", long95 == 0L);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(dateTime97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "1/1/69" + "'", str99, "1/1/69");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("gioved\354 1 gennaio 1970", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=giovedi?1gennaio1970");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(writer4, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("French");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        java.util.Date date10 = localDateTime4.toDate();
        boolean boolean11 = timeZone1.inDaylightTime(date10);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.secondOfMinute();
        int int8 = localDateTime6.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 70 + "'", int8 == 70);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        int int9 = dateTimeFormatter8.getDefaultYear();
        java.io.Writer writer10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime18.toDateTime(dateTimeZone24);
        long long26 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DurationField durationField27 = property14.getDurationField();
        org.joda.time.LocalDateTime localDateTime28 = property14.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer10, (org.joda.time.ReadablePartial) localDateTime28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        java.util.Date date8 = localDateTime2.toDate();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.fromDateFields(date8);
        int[] intArray10 = localDateTime9.getValues();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.weekyear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = property12.setCopy("yearOfEra");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"yearOfEra\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1970, 1, 1, 0]");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale4 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundFloorCopy();
        boolean boolean11 = strSet5.remove((java.lang.Object) localDateTime10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime19.toDateTime(dateTimeZone25);
        long long27 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime28 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        int int29 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime26);
        int int31 = dateTimeZone1.getStandardOffset((long) 'x');
        java.lang.String str32 = dateTimeZone1.toString();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 19, dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withWeekOfWeekyear(1900);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1900 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronolgy();
        java.lang.StringBuffer stringBuffer2 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfEra();
        long long7 = property6.remainder();
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.util.Locale locale9 = locale8.stripExtensions();
        int int10 = property6.getMaximumShortTextLength(locale8);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime18.toDateTime(dateTimeZone24);
        long long26 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        int int27 = property6.getDifference((org.joda.time.ReadableInstant) dateTime25);
        java.util.Locale locale30 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.yearOfEra();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundFloorCopy();
        boolean boolean37 = strSet31.remove((java.lang.Object) localDateTime36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.yearOfEra();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime45.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = localDateTime45.toDateTime(dateTimeZone51);
        long long53 = property41.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTime dateTime54 = localDateTime36.toDateTime((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone56);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.yearOfEra();
        long long59 = property58.remainder();
        org.joda.time.LocalDateTime localDateTime60 = property58.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone63);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime64.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = localDateTime64.toDateTime(dateTimeZone70);
        int int72 = property61.getDifference((org.joda.time.ReadableInstant) dateTime71);
        boolean boolean73 = dateTime52.isAfter((org.joda.time.ReadableInstant) dateTime71);
        long long74 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime71);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer2, (org.joda.time.ReadableInstant) dateTime71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals(locale30.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone8);
        int int10 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy(292278993);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusSeconds(86300000);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusDays((int) 'a');
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.year();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusMinutes((int) 'a');
        java.lang.Class<?> wildcardClass21 = localDateTime17.getClass();
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.util.Locale locale3 = new java.util.Locale("eng", "hi!");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getLanguage();
        java.lang.String str7 = locale4.getDisplayCountry(locale5);
        java.lang.String str8 = locale3.getDisplayScript(locale5);
        java.lang.String str9 = locale3.toLanguageTag();
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = locale10.getDisplayCountry();
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.joda.time.format.DateTimeFormat.patternForStyle("Taiwan", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: Taiwan");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "eng_HI!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "yearofera");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "yearofera" + "'", str6, "yearofera");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "eng" + "'", str9, "eng");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Taiwan" + "'", str11, "Taiwan");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u6587" + "'", str12, "\u82f1\u6587");
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale2.getLanguage();
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale[] localeArray9 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = null;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Locale locale16 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.yearOfEra();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundFloorCopy();
        boolean boolean23 = strSet17.remove((java.lang.Object) localDateTime22);
        java.util.Locale locale26 = new java.util.Locale("hi!", "");
        boolean boolean27 = strSet17.remove((java.lang.Object) locale26);
        java.util.Locale.FilteringMode filteringMode28 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strSet17, filteringMode28);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Locale[] localeArray33 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList34 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList34, localeArray33);
        java.util.Locale.FilteringMode filteringMode36 = null;
        java.util.List<java.util.Locale> localeList37 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.util.Locale>) localeList34, filteringMode36);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Locale[] localeArray41 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList42 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList42, localeArray41);
        java.util.Locale.FilteringMode filteringMode44 = null;
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.util.Locale>) localeList42, filteringMode44);
        java.util.Locale locale48 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone51);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.yearOfEra();
        org.joda.time.LocalDateTime localDateTime54 = property53.roundFloorCopy();
        boolean boolean55 = strSet49.remove((java.lang.Object) localDateTime54);
        java.util.Locale locale58 = new java.util.Locale("hi!", "");
        boolean boolean59 = strSet49.remove((java.lang.Object) locale58);
        java.util.Locale.FilteringMode filteringMode60 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strSet49, filteringMode60);
        java.util.List<java.util.Locale> localeList62 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList34, filteringMode60);
        boolean boolean63 = strSet5.removeAll((java.util.Collection<java.util.Locale>) localeList34);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = strSet5.add("Korean");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals(locale26.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + filteringMode28 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode28.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localeList37);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(localeList45);
        org.junit.Assert.assertEquals(locale48.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals(locale58.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + filteringMode60 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode60.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(localeList62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDateTime();
        java.lang.Appendable appendable1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.yearOfEra();
        long long6 = property5.remainder();
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.util.Locale locale8 = locale7.stripExtensions();
        int int9 = property5.getMaximumShortTextLength(locale7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDateTime17.toDateTime(dateTimeZone23);
        long long25 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        int int26 = property5.getDifference((org.joda.time.ReadableInstant) dateTime24);
        java.util.Locale locale29 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.yearOfEra();
        org.joda.time.LocalDateTime localDateTime35 = property34.roundFloorCopy();
        boolean boolean36 = strSet30.remove((java.lang.Object) localDateTime35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.yearOfEra();
        org.joda.time.LocalDateTime localDateTime41 = property40.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime44.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = localDateTime44.toDateTime(dateTimeZone50);
        long long52 = property40.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime53 = localDateTime35.toDateTime((org.joda.time.ReadableInstant) dateTime51);
        int int54 = dateTime24.compareTo((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.Instant instant55 = dateTime24.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadableInstant) instant55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(instant55);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int3 = dateTimeZone1.getOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 2000);
        org.joda.time.tz.NameProvider nameProvider9 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str13 = nameProvider9.getName(locale10, "69", "yearOfEra");
        java.lang.String str14 = locale10.getDisplayName();
        java.lang.String str15 = dateTimeZone5.getShortName(0L, locale10);
        java.util.Locale locale18 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundFloorCopy();
        boolean boolean25 = strSet19.remove((java.lang.Object) localDateTime24);
        java.util.Locale locale28 = new java.util.Locale("hi!", "");
        boolean boolean29 = strSet19.remove((java.lang.Object) locale28);
        java.lang.String str30 = locale10.getDisplayCountry(locale28);
        java.lang.String str31 = locale28.getLanguage();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1991L + "'", long7 == 1991L);
        org.junit.Assert.assertNotNull(nameProvider9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinese (Taiwan)" + "'", str14, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.009" + "'", str15, "+00:00:00.009");
        org.junit.Assert.assertEquals(locale18.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals(locale28.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Taiwan" + "'", str30, "Taiwan");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfEra((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("jeudi 1 janvier 1970");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=jeudi1janvier1970");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(3, 19, (-1970), (int) (short) 0, 7, 5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (byte) 0, 370, 4040, 10, 4040);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4040 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        int int8 = localDateTime7.getDayOfYear();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusHours(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withEra((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        java.time.ZoneId zoneId11 = timeZone9.toZoneId();
        boolean boolean12 = timeZone9.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long17 = dateTimeZone14.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long21 = dateTimeZone14.getMillisKeepLocal(dateTimeZone19, (long) (short) 100);
        java.util.TimeZone timeZone22 = dateTimeZone14.toTimeZone();
        int int23 = timeZone22.getRawOffset();
        java.time.ZoneId zoneId24 = timeZone22.toZoneId();
        boolean boolean25 = timeZone9.hasSameRules(timeZone22);
        java.util.Locale locale28 = new java.util.Locale("", "");
        java.util.Locale locale29 = locale28.stripExtensions();
        java.lang.String str30 = timeZone22.getDisplayName(locale29);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Coordinated Universal Time" + "'", str30, "Coordinated Universal Time");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 59);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setRegion("gioved\354 1 gennaio 1970 0.00.00 +00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: giovedi? 1 gennaio 1970 0.00.00 +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 10, false, (long) (byte) 1);
        java.lang.String str6 = dateTimeZone1.toString();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.009" + "'", str6, "+00:00:00.009");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone8);
        int int10 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy(292278993);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusSeconds(86300000);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusDays((int) 'a');
        org.joda.time.ReadablePartial readablePartial18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = localDateTime17.isEqual(readablePartial18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int5 = dateTimeZone3.getOffset(1L);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 70);
        long long11 = dateTimeZone3.convertLocalToUTC((long) 'a', true, 100L);
        java.util.TimeZone timeZone12 = dateTimeZone3.toTimeZone();
        java.time.ZoneId zoneId13 = timeZone12.toZoneId();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone(zoneId13);
        boolean boolean15 = timeZone14.observesDaylightTime();
        int int17 = timeZone14.getOffset(32000L);
        java.util.TimeZone.setDefault(timeZone14);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = timeZone14.getOffset(1970, 575, 19, 70, (int) 'a', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 79L + "'", long7 == 79L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withLocale(locale6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withSecondOfMinute(4);
        java.lang.String str16 = localDateTime13.toString();
        org.joda.time.Chronology chronology17 = localDateTime13.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter2.withChronology(chronology17);
        org.joda.time.ReadWritableInstant readWritableInstant19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = dateTimeFormatter18.parseInto(readWritableInstant19, "zho", (-1970));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01T00:00:00.000" + "'", str16, "1970-01-01T00:00:00.000");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setRegion("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Etc/UTC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        int int5 = dateTimeFormatter3.getDefaultYear();
        boolean boolean6 = dateTimeFormatter3.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter3.getParser();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getName(0L);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minus(readableDuration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withYearOfEra(4);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.yearOfEra();
        long long26 = property25.remainder();
        java.util.Locale locale27 = java.util.Locale.PRC;
        java.util.Locale locale28 = locale27.stripExtensions();
        int int29 = property25.getMaximumShortTextLength(locale27);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.yearOfEra();
        org.joda.time.LocalDateTime localDateTime34 = property33.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localDateTime37.toDateTime(dateTimeZone43);
        long long45 = property33.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime44);
        int int46 = property25.getDifference((org.joda.time.ReadableInstant) dateTime44);
        java.util.Locale locale49 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet50 = locale49.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.yearOfEra();
        org.joda.time.LocalDateTime localDateTime55 = property54.roundFloorCopy();
        boolean boolean56 = strSet50.remove((java.lang.Object) localDateTime55);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.yearOfEra();
        org.joda.time.LocalDateTime localDateTime61 = property60.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone63);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime64.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = localDateTime64.toDateTime(dateTimeZone70);
        long long72 = property60.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTime dateTime73 = localDateTime55.toDateTime((org.joda.time.ReadableInstant) dateTime71);
        int int74 = dateTime44.compareTo((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime75 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) dateTime73);
        int int76 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = dateTimeFormatter3.withZone(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate79 = dateTimeFormatter3.parseLocalDate("1970-01-01T00:00:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals(locale49.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter77);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        java.lang.String str2 = dateTimeFormatter0.print((long) 19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withDefaultYear((int) (short) -1);
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale9 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundFloorCopy();
        boolean boolean16 = strSet10.remove((java.lang.Object) localDateTime15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.yearOfEra();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDateTime24.toDateTime(dateTimeZone30);
        long long32 = property20.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime33 = localDateTime15.toDateTime((org.joda.time.ReadableInstant) dateTime31);
        java.lang.String str34 = dateTimeFormatter6.print((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale38 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.yearOfEra();
        org.joda.time.LocalDateTime localDateTime44 = property43.roundFloorCopy();
        boolean boolean45 = strSet39.remove((java.lang.Object) localDateTime44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.yearOfEra();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone52);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime53.toDateTime(dateTimeZone59);
        long long61 = property49.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTime dateTime62 = localDateTime44.toDateTime((org.joda.time.ReadableInstant) dateTime60);
        int int63 = dateTimeZone35.getOffset((org.joda.time.ReadableInstant) dateTime60);
        boolean boolean64 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone66);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.yearOfEra();
        long long69 = property68.remainder();
        boolean boolean71 = property68.equals((java.lang.Object) "en");
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = property68.getFieldType();
        boolean boolean73 = dateTime33.isSupported(dateTimeFieldType72);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer5, (org.joda.time.ReadableInstant) dateTime33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Thursday, January 1, 1970 12:00:00 AM +00:00" + "'", str2, "Thursday, January 1, 1970 12:00:00 AM +00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Thursday, January 1, 1970" + "'", str34, "Thursday, January 1, 1970");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(19, 59, (int) (byte) -1, (int) (short) -1, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.util.Locale locale2 = new java.util.Locale("yearOfEra");
        java.util.Locale.setDefault(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.joda.time.format.DateTimeFormat.patternForStyle("gioved\354 1 gennaio 1970 0.00.00 +00:00", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: giovedi? 1 gennaio 1970 0.00.00 +00:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "yearofera");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = timeZone9.getID();
        java.lang.String str13 = timeZone9.getID();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = timeZone9.getOffset((int) (byte) 0, (int) (short) -1, 1970, 365, 1969, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minus(readableDuration10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMinuteOfHour((int) '4');
        int int16 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        int int17 = localDateTime11.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localDateTime11.getValue(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long15 = dateTimeZone12.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long19 = dateTimeZone12.getMillisKeepLocal(dateTimeZone17, (long) (short) 100);
        java.util.TimeZone timeZone20 = dateTimeZone12.toTimeZone();
        int int21 = timeZone20.getRawOffset();
        java.util.TimeZone.setDefault(timeZone20);
        java.util.TimeZone.setDefault(timeZone20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        boolean boolean25 = timeZone9.hasSameRules(timeZone20);
        java.util.Locale locale26 = java.util.Locale.PRC;
        java.util.Locale locale27 = locale26.stripExtensions();
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.lang.String str29 = timeZone9.getDisplayName(locale27);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u534f\u8c03\u4e16\u754c\u65f6\u95f4" + "'", str29, "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronology();
        org.joda.time.format.DateTimeParser dateTimeParser2 = dateTimeFormatter0.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = dateTimeFormatter0.parseLocalDate("English");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"English\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeParser2);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.fullDateTime();
        java.lang.String str3 = dateTimeFormatter1.print((long) 19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.parse("1969-12-31T23:59:59.999", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1969-12-31T23:59:59.999\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Thursday, January 1, 1970 12:00:00 AM +00:00" + "'", str3, "Thursday, January 1, 1970 12:00:00 AM +00:00");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale2.getLanguage();
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet7 = locale2.getExtensionKeys();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withWeekOfWeekyear((int) (byte) 1);
        int int14 = localDateTime13.size();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withDayOfMonth(7);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusSeconds(86300000);
        boolean boolean20 = locale2.equals((java.lang.Object) localDateTime17);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.setLanguage("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setScript("it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.setLanguage("eng");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.addUnicodeLocaleAttribute("jeudi 1 janvier 1970 0 h 00 +00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: jeudi 1 janvier 1970 0 h 00 +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withMinuteOfHour(19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime6.withTime(4, (-1), 32, 69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        int int9 = dateTimeFormatter8.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter8.print(2070L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        int int7 = dateTimeFormatter6.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withOffsetParsed();
        java.lang.Class<?> wildcardClass9 = dateTimeFormatter6.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("19");
        java.lang.String str3 = locale1.getUnicodeLocaleType("69");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getUnicodeLocaleType("1/1/70");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 1/1/70");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        boolean boolean6 = property3.equals((java.lang.Object) ' ');
        int int7 = property3.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property3.getFieldType();
        int int9 = property3.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime11 = property3.addToCopy((long) 2070);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withTime((int) 'a', 4, 50400000, 365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 292278993 + "'", int7 == 292278993);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter8.getParser();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfEra();
        long long15 = property14.remainder();
        java.util.Locale locale16 = java.util.Locale.PRC;
        java.util.Locale locale17 = locale16.stripExtensions();
        int int18 = property14.getMaximumShortTextLength(locale16);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfEra();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime26.toDateTime(dateTimeZone32);
        long long34 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        int int35 = property14.getDifference((org.joda.time.ReadableInstant) dateTime33);
        java.lang.String str36 = dateTime33.toString();
        org.joda.time.Instant instant37 = dateTime33.toInstant();
        org.joda.time.Chronology chronology38 = instant37.getChronology();
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now(chronology38);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(1L, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter8.withChronology(chronology38);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 366, chronology38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(252000000, 7, 10, 2922789, 2000, 50400000, (-1), chronology38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeParser9);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str36, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longTime();
        java.lang.Appendable appendable1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readableDuration5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withEra((int) (short) 0);
        int int9 = localDateTime8.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minus(readableDuration10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusDays(9);
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.yearOfEra();
        long long21 = property20.remainder();
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.util.Locale locale23 = locale22.stripExtensions();
        int int24 = property20.getMaximumShortTextLength(locale22);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.yearOfEra();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDateTime32.toDateTime(dateTimeZone38);
        long long40 = property28.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        int int41 = property20.getDifference((org.joda.time.ReadableInstant) dateTime39);
        java.lang.String str42 = dateTime39.toString();
        boolean boolean43 = dateTime16.isBefore((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Instant instant44 = dateTime39.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadableInstant) dateTime39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 70 + "'", int9 == 70);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str42, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(instant44);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(59);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDateTime();
        boolean boolean1 = dateTimeFormatter0.isPrinter();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer2, 999L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Locale[] localeArray4 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList5 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList5, localeArray4);
        java.util.Locale.FilteringMode filteringMode7 = null;
        java.util.List<java.util.Locale> localeList8 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList5, filteringMode7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap9);
        java.util.Locale locale13 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Locale[] localeArray18 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList19 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList19, localeArray18);
        java.util.Locale.FilteringMode filteringMode21 = null;
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList19, filteringMode21);
        boolean boolean23 = strSet14.removeAll((java.util.Collection<java.util.Locale>) localeList22);
        java.util.List<java.util.Locale> localeList24 = java.util.Locale.filter(languageRangeList10, (java.util.Collection<java.util.Locale>) localeList22);
        java.util.Locale locale27 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Locale[] localeArray32 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList33 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList33, localeArray32);
        java.util.Locale.FilteringMode filteringMode35 = null;
        java.util.List<java.util.Locale> localeList36 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.util.Locale>) localeList33, filteringMode35);
        boolean boolean37 = strSet28.removeAll((java.util.Collection<java.util.Locale>) localeList36);
        java.lang.String[] strArray38 = java.util.TimeZone.getAvailableIDs();
        java.lang.Comparable<java.lang.String>[] strComparableArray39 = strSet28.toArray((java.lang.Comparable<java.lang.String>[]) strArray38);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags(languageRangeList10, (java.util.Collection<java.lang.String>) strSet28, filteringMode40);
        java.util.Locale locale42 = java.util.Locale.ITALIAN;
        java.util.Locale locale45 = new java.util.Locale("hi!", "");
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.util.Locale locale49 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet50 = locale49.getUnicodeLocaleAttributes();
        java.util.Locale locale53 = new java.util.Locale("eng", "hi!");
        java.util.Locale locale54 = java.util.Locale.CHINESE;
        java.util.Locale locale55 = java.util.Locale.US;
        java.util.Locale locale58 = new java.util.Locale("", "");
        java.util.Locale locale59 = java.util.Locale.PRC;
        java.util.Locale locale60 = java.util.Locale.CHINESE;
        java.util.Locale locale64 = new java.util.Locale("hi!", "", "hi!");
        java.util.Locale locale68 = new java.util.Locale("hi!", "Property[yearOfEra]", "");
        java.util.Locale locale72 = new java.util.Locale("hi!", "Property[yearOfEra]", "");
        java.util.Locale locale73 = java.util.Locale.JAPAN;
        java.util.Locale locale74 = java.util.Locale.PRC;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.util.Locale locale76 = java.util.Locale.US;
        java.util.Locale[] localeArray77 = new java.util.Locale[] { locale42, locale45, locale46, locale49, locale53, locale54, locale55, locale58, locale59, locale60, locale64, locale68, locale72, locale73, locale75, locale76 };
        java.util.ArrayList<java.util.Locale> localeList78 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList78, localeArray77);
        java.util.stream.Stream<java.util.Locale> localeStream80 = localeList78.parallelStream();
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter(languageRangeList10, (java.util.Collection<java.util.Locale>) localeList78);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localeList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localeList24);
        org.junit.Assert.assertEquals(locale27.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strComparableArray39);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertEquals(locale45.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "yearofera");
        org.junit.Assert.assertEquals(locale49.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertEquals(locale53.toString(), "eng_HI!");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh");
        org.junit.Assert.assertEquals(locale64.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals(locale68.toString(), "hi!_PROPERTY[YEAROFERA]");
        org.junit.Assert.assertEquals(locale72.toString(), "hi!_PROPERTY[YEAROFERA]");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(localeStream80);
        org.junit.Assert.assertNotNull(localeList81);
    }
}
