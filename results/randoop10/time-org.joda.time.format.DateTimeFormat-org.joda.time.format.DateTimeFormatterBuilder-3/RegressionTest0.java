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
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = property3.set("", locale5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) 10.0d, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
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
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) (byte) 100, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
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
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 10.0d, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localDateTime2.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
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
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = property3.setCopy("", locale5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekyear((int) (byte) 1);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (short) 100, (int) (short) 10, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("seconds", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) localTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Thursday");
        int int2 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDateTime((-1), (int) (short) 10, (int) ' ', (-1), 100, 8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
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
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone5.getMillisKeepLocal(dateTimeZone6, (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) localTime4, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 21, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate2.withDayOfWeek(8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 8 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.property(dateTimeFieldType6);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime5.setDateTime((int) ' ', (int) (byte) 0, (int) (short) 100, (int) (byte) 1, (int) ' ', (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.property(dateTimeFieldType6);
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = mutableDateTime5.toString("hi!", locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        int int6 = dateTime5.getDayOfMonth();
        org.joda.time.DateTime.Property property7 = dateTime5.year();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int12 = localTime8.get(dateTimeFieldType11);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = property7.compareTo((org.joda.time.ReadablePartial) localTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = localDate0.withMonthOfYear((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("1970-01-01T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '1970-01-01T00:00:00.000Z' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = localTime0.withMinuteOfHour((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int11 = localTime7.get(dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = localTime7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((int) (short) 0, 21, (int) (byte) 1, (int) (byte) 1, (int) (byte) 10, (int) (short) -1, 21, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        java.lang.Appendable appendable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable2, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale6.getDisplayName();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a', chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfEven();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime17 = property13.set("22", locale16);
        java.lang.String str18 = locale6.getDisplayScript(locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = localDateTime2.toString("1970-01-01T00:00:00.000Z", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English (Canada)" + "'", str9, "English (Canada)");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = property3.addNoWrapToCopy((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("22");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(10);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = localTime5.isEqual((org.joda.time.ReadablePartial) localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekyear((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfYear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 21, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str4 = durationFieldType3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate2.withFieldAdded(durationFieldType3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'seconds' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "seconds" + "'", str4, "seconds");
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        int[] intArray16 = new int[] { ' ', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            chronology5.validate((org.joda.time.ReadablePartial) localDateTime12, intArray16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 100]");
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        int int0 = org.joda.time.MutableDateTime.ROUND_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.property(dateTimeFieldType6);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime5.setDayOfWeek((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((int) (byte) 10, (int) (short) 100, 20, 8, (int) (short) 10, 2, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int7 = localTime3.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = localTime3.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((int) '#', (int) (byte) -1, (int) (short) 1, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone6.getMillisKeepLocal(dateTimeZone7, (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((int) (short) 0, (int) (byte) -1, (int) (byte) -1, (int) (short) 10, (int) (short) 10, (int) (byte) 1, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        java.lang.Appendable appendable1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, readableInstant2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = chronology5.getDateTimeMillis((int) (byte) 0, 1, 21, (int) (short) 100, (int) '#', (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Thursday");
        java.lang.Object obj2 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology4);
        boolean boolean6 = localTime2.isBefore((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime5.withFieldAdded(durationFieldType7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weeks' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(99);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int12 = localTime8.get(dateTimeFieldType11);
        org.joda.time.Chronology chronology13 = localTime8.getChronology();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology13, locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(0, (int) ' ', 0, (int) (byte) -1, (int) (byte) 10, 20, (int) (byte) 0, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours((int) ' ');
        org.joda.time.LocalDate localDate6 = dateTime5.toLocalDate();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime12 = localTime9.withPeriodAdded(readablePeriod10, (int) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localTime9.getFieldType(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property15 = localDate6.property(dateTimeFieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime8 = localTime6.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int10 = localTime6.get(dateTimeFieldType9);
        org.joda.time.Chronology chronology11 = localTime6.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.months();
        org.joda.time.DurationField durationField13 = chronology11.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(20, (int) (byte) 100, 0, (int) (byte) 1, (int) (short) 100, (int) (byte) 1, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = localTime2.getFieldType(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime2.withMinuteOfHour((-101));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -101 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int11 = localTime7.get(dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = localTime7.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.months();
        org.joda.time.DurationField durationField14 = chronology12.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((int) (short) 1, 2022, 20, 99, (int) (byte) 0, 2022, 0, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(8, (int) (short) 10, (int) (short) 0, (int) (short) -1, (int) (short) 1, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTime dateTime3 = localDate2.toDateTimeAtMidnight();
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = property4.setCopy("English (Canada)");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"English (Canada)\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int12 = localTime8.get(dateTimeFieldType11);
        org.joda.time.Chronology chronology13 = localTime8.getChronology();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology13, locale14);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(7, 0, (int) 'u', (int) 'a', (int) ' ', (int) (byte) -1, 0, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = dateTimeFormatter0.parseDateTime("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 'a', chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfEven();
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime8 = property4.set("22", locale7);
        mutableDateTime8.addYears(10);
        int int13 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime8, "seconds", (int) (short) 100);
        java.lang.Appendable appendable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable14, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-101) + "'", int13 == (-101));
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Locale locale9 = locale8.stripExtensions();
        boolean boolean10 = locale9.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = property4.setCopy("1970-01-01T00:00:00.000Z", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01T00:00:00.000Z\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = property1.setCopy("1970-01-01T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01T00:00:00.000Z\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Thursday");
        java.util.TimeZone timeZone2 = null;
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        int int4 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime1.withHourOfDay((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(20, (int) 'a', 2022, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime7 = property6.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property6.setCopy("seconds");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"seconds\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(0);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        org.joda.time.DurationField durationField7 = chronology5.days();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.minuteOfHour();
        java.util.Locale locale20 = new java.util.Locale("", "seconds");
        java.lang.String str21 = localDateTime15.toString("22", locale20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime15.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 'a', chronology26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        long long32 = dateTimeField29.set((long) 20, (int) (byte) 1);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(10, 2, (int) (short) 10, 21);
        int[] intArray44 = new int[] { (byte) 0, (byte) 0, 1, (byte) 0, (short) 1, 10 };
        int int45 = dateTimeField29.getMaximumValue((org.joda.time.ReadablePartial) localTime37, intArray44);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray47 = dateTimeField8.addWrapPartial((org.joda.time.ReadablePartial) localDateTime23, 2, intArray44, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Fields invalid for add");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals(locale20.toString(), "_SECONDS");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "22" + "'", str21, "22");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-259199980L) + "'", long32 == (-259199980L));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0, 0, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 7 + "'", int45 == 7);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getDisplayScript();
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en_CA" + "'", str3, "en_CA");
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str3 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Greenwich Mean Time" + "'", str3, "Greenwich Mean Time");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"seconds\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        long long7 = dateTimeField4.set((long) 20, (int) (byte) 1);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(10, 2, (int) (short) 10, 21);
        int[] intArray19 = new int[] { (byte) 0, (byte) 0, 1, (byte) 0, (short) 1, 10 };
        int int20 = dateTimeField4.getMaximumValue((org.joda.time.ReadablePartial) localTime12, intArray19);
        org.joda.time.DurationField durationField21 = dateTimeField4.getDurationField();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 'a', chronology23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime24.toMutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime27.property(dateTimeFieldType28);
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean34 = localTime32.isSupported(dateTimeFieldType33);
        boolean boolean35 = localTime30.equals((java.lang.Object) boolean34);
        boolean boolean36 = property29.equals((java.lang.Object) localTime30);
        org.joda.time.LocalTime localTime38 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime41 = localTime38.withField(dateTimeFieldType39, (int) '#');
        int int42 = localTime30.indexOf(dateTimeFieldType39);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) 'a', chronology45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField48 = property47.getField();
        long long51 = dateTimeField48.set((long) 20, (int) (byte) 1);
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime(10, 2, (int) (short) 10, 21);
        int[] intArray63 = new int[] { (byte) 0, (byte) 0, 1, (byte) 0, (short) 1, 10 };
        int int64 = dateTimeField48.getMaximumValue((org.joda.time.ReadablePartial) localTime56, intArray63);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray66 = dateTimeField4.addWrapPartial((org.joda.time.ReadablePartial) localTime30, (int) 'a', intArray63, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-259199980L) + "'", long7 == (-259199980L));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-259199980L) + "'", long51 == (-259199980L));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[0, 0, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 7 + "'", int64 == 7);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology4);
        boolean boolean6 = localTime2.isBefore((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime localTime8 = localTime5.plusSeconds((int) (short) 1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 'a', chronology10);
        mutableDateTime11.addWeekyears((int) (byte) -1);
        boolean boolean14 = localTime5.equals((java.lang.Object) mutableDateTime11);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime11.setSecondOfMinute((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        long long9 = dateTimeField6.add((-259199980L), (int) (short) 1);
        java.lang.String str10 = dateTimeField6.toString();
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.hourOfDay();
        int int17 = localDateTime15.getYearOfCentury();
        int[] intArray18 = localDateTime15.getValues();
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.ROOT;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.lang.String str24 = locale21.getDisplayName();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 'a', chronology26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfEven();
        java.util.Locale locale31 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime32 = property28.set("22", locale31);
        java.lang.String str33 = locale21.getDisplayScript(locale31);
        java.util.Locale locale34 = java.util.Locale.ROOT;
        java.lang.String str35 = locale31.getDisplayScript(locale34);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = dateTimeField6.set(readablePartial11, 100, intArray18, "hourOfDay", locale34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hourOfDay\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-259199979L) + "'", long9 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateTimeField[millisOfDay]" + "'", str10, "DateTimeField[millisOfDay]");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 70 + "'", int17 == 70);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "English (Canada)" + "'", str24, "English (Canada)");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone3);
        int int5 = localDateTime4.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean7 = localDateTime4.isSupported(dateTimeFieldType6);
        int int8 = localDateTime4.getWeekOfWeekyear();
        org.joda.time.LocalTime localTime9 = localDateTime4.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, (org.joda.time.ReadablePartial) localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int11 = localTime7.get(dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = localTime7.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.months();
        org.joda.time.DurationField durationField14 = chronology12.days();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology12.add(readablePeriod15, 1L, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((int) (short) 0, (int) (short) 10, 0, 3, (int) (short) -1, 1970, (-1), chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay6 = dateTime5.toTimeOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField8 = timeOfDay6.getField((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay6);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.lang.String str9 = dateTimeField6.getAsText(100L, locale8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate12 = localDate10.withDayOfYear((int) '4');
        org.joda.time.LocalDate localDate14 = localDate12.minusDays((int) 'a');
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 'a', chronology17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        long long23 = dateTimeField20.set((long) 20, (int) (byte) 1);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(10, 2, (int) (short) 10, 21);
        int[] intArray35 = new int[] { (byte) 0, (byte) 0, 1, (byte) 0, (short) 1, 10 };
        int int36 = dateTimeField20.getMaximumValue((org.joda.time.ReadablePartial) localTime28, intArray35);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray38 = dateTimeField6.addWrapField((org.joda.time.ReadablePartial) localDate12, 1, intArray35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-259199980L) + "'", long23 == (-259199980L));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.Locale locale3 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 'a', chronology5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfEven();
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime11 = property7.set("22", locale10);
        java.lang.String str12 = locale3.getDisplayScript(locale10);
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.lang.String str14 = locale10.getDisplayLanguage(locale13);
        java.lang.String str15 = timeZone1.getDisplayName(locale10);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str14, "\ud55c\uad6d\uc5b4");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc" + "'", str15, "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.DateTime dateTime11 = dateTime8.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime8.toMutableDateTime(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(0, 20, (-101), 0, (int) 'a', (int) (short) 10, 1, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.year();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology11);
        org.joda.time.LocalTime.Property property13 = localTime12.hourOfDay();
        org.joda.time.LocalTime localTime14 = property13.roundHalfEvenCopy();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 'a', chronology17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        long long23 = dateTimeField20.set((long) 20, (int) (byte) 1);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(10, 2, (int) (short) 10, 21);
        int[] intArray35 = new int[] { (byte) 0, (byte) 0, 1, (byte) 0, (short) 1, 10 };
        int int36 = dateTimeField20.getMaximumValue((org.joda.time.ReadablePartial) localTime28, intArray35);
        java.util.Locale locale38 = java.util.Locale.SIMPLIFIED_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = dateTimeField9.set((org.joda.time.ReadablePartial) localTime14, 100, intArray35, "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", locale38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"???????? ???????\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-259199980L) + "'", long23 == (-259199980L));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2000-02-21T15:05:38.021Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2000-02-21T15:05:38.021Z\" is malformed at \"Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 21, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate2.withMonthOfYear(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.year();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeField9.set((long) (byte) 1, "Thursday");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Thursday\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology6);
        boolean boolean9 = localTime7.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime7.plus(readablePeriod10);
        java.util.Locale locale12 = java.util.Locale.CHINA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) localTime7, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfWeek' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) 1, (-101), 99, 52, (int) (short) 10, (-101), 20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTime3.getZone();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.DateTime dateTime12 = property11.withMinimumValue();
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime16 = dateTime12.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime12.getZone();
        long long19 = dateTimeZone17.nextTransition(100L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone8, dateTimeZone17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(5, (int) (short) 1, (int) ' ', 70, 99, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate10 = property7.addWrapFieldToCopy((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = property7.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: seconds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hourOfDay", (double) 36130021);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=3.6130021E7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withWeekOfWeekyear(10);
        int int4 = localDateTime3.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 66 + "'", int4 == 66);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withWeekOfWeekyear(10);
        int int11 = localDateTime7.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDate6.compareTo((org.joda.time.ReadablePartial) localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("1/1/70 12:00 AM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1/1/70 12:00 AM\" is malformed at \"/1/70 12:00 AM\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology9.getDateTimeMillis((long) ' ', 7, 23, 100, 8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
        boolean boolean4 = strSet1.remove((java.lang.Object) mutableDateTime3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = strSet1.add("\ufffd\ufffd\ufffd\ufffd 12:00 AM");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime7 = property6.roundHalfEvenCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.shortDateTime();
        java.lang.String str9 = localTime7.toString(dateTimeFormatter8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a', chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfEven();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime17 = property13.set("22", locale16);
        mutableDateTime17.addYears(10);
        boolean boolean21 = mutableDateTime17.isAfter((long) (short) 1);
        java.lang.String str22 = dateTimeFormatter8.print((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = dateTimeFormatter8.getPrinter();
        java.lang.StringBuffer stringBuffer24 = null;
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime28 = localTime26.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int30 = localTime26.get(dateTimeFieldType29);
        org.joda.time.Chronology chronology31 = localTime26.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.months();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        long long37 = dateTimeZone34.getMillisKeepLocal(dateTimeZone35, (long) '#');
        java.util.Locale locale38 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter23.printTo(stringBuffer24, 4460736516L, chronology31, (int) '4', dateTimeZone34, locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd 12:00 AM" + "'", str9, "\ufffd\ufffd\ufffd\ufffd 12:00 AM");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1/1/32 12:00 AM" + "'", str22, "1/1/32 12:00 AM");
        org.junit.Assert.assertNotNull(dateTimePrinter23);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 35L + "'", long37 == 35L);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko_KR");
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.weekOfWeekyear();
        java.lang.Class<?> wildcardClass7 = mutableDateTime5.getClass();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime11 = localTime8.withField(dateTimeFieldType9, (int) '#');
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTime dateTime16 = localTime8.toDateTimeToday(dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(2, (int) '4', (int) 'u', 0, 10, 23, (int) (short) 10, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = property3.addNoWrapToCopy(36130021);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(1);
        java.util.Locale locale9 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a', chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfEven();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime17 = property13.set("22", locale16);
        java.lang.String str18 = locale9.getDisplayScript(locale16);
        boolean boolean19 = locale9.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localDate7.toString("Thursday", locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate localDate8 = localDate6.minusYears((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localDate6.isSupported(durationFieldType9);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.withDayOfYear((int) '4');
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str16 = durationFieldType15.toString();
        boolean boolean17 = localDate12.isSupported(durationFieldType15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = localDate6.withFieldAdded(durationFieldType15, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'seconds' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "seconds" + "'", str10, "seconds");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "seconds" + "'", str16, "seconds");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime7 = localTime5.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int9 = localTime5.get(dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = localTime5.getChronology();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = chronology10.add(readablePeriod12, 4460736516L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((-101), (int) (short) 10, (int) 'a', (int) (short) 10, (int) '4', chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4460736516L + "'", long15 == 4460736516L);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '???????? ???????' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = localTime1.toString("English (Canada)", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDateTime(99, (-1), (-101), 3, 1970, 20, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(1);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime12 = localDate8.toDateTimeAtStartOfDay(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate8.plusDays((int) ' ');
        org.joda.time.LocalDate localDate16 = localDate14.minusYears((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str18 = durationFieldType17.toString();
        boolean boolean19 = localDate14.isSupported(durationFieldType17);
        boolean boolean20 = localDate2.isSupported(durationFieldType17);
        int int21 = localDate2.getYear();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "seconds" + "'", str18, "seconds");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 'a', chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfEven();
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime8 = property4.set("22", locale7);
        java.lang.String str9 = locale0.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale7.getDisplayLanguage(locale10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.DateTime dateTime15 = property14.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime17 = property14.addWrapFieldToCopy(20);
        org.joda.time.DateTime dateTime18 = property14.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateTime.Property property20 = dateTime18.property(dateTimeFieldType19);
        boolean boolean21 = locale10.equals((java.lang.Object) dateTimeFieldType19);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str11, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        int int3 = dateTime1.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime5 = dateTime1.plusSeconds((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime1.withDayOfMonth((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        java.lang.Appendable appendable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable2, 4460736516L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone2);
        java.lang.Object obj5 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate localDate8 = localDate0.minusDays(1970);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate8.withDayOfWeek(99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.year();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone10.getMillisKeepLocal(dateTimeZone11, (long) '#');
        java.lang.String str14 = dateTimeZone11.getID();
        int int16 = dateTimeZone11.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology17 = chronology6.withZone(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = chronology6.getDateTimeMillis(3, 86399001, 52, 23, 52, (-1), 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        int int6 = dateTime5.getDayOfMonth();
        org.joda.time.DateTime.Property property7 = dateTime5.year();
        org.joda.time.LocalDateTime localDateTime8 = dateTime5.toLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDateTime8.get(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        java.util.Locale locale11 = new java.util.Locale("", "seconds");
        java.lang.String str12 = localDateTime6.toString("22", locale11);
        int int13 = localDateTime6.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localDateTime6.toString("Property[dayOfMonth]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals(locale11.toString(), "_SECONDS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "22" + "'", str12, "22");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 86399001 + "'", int13 == 86399001);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime7 = localTime5.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int9 = localTime5.get(dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = localTime5.getChronology();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology10, locale11);
        org.joda.time.DateTimeZone dateTimeZone13 = chronology10.getZone();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(70, 99, (int) (short) -1, 36130021, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.LocalDate localDate4 = localDate2.minusDays((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDate2.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        java.lang.Appendable appendable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable2, (long) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        int int6 = dateTime5.getDayOfMonth();
        org.joda.time.DateTime.Property property7 = dateTime5.year();
        org.joda.time.LocalDateTime localDateTime8 = dateTime5.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minus(readableDuration9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusHours((int) (short) -1);
        int int13 = localDateTime10.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localDateTime10.toString("hourOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1998 + "'", int13 == 1998);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String[] strArray5 = new java.lang.String[] { "2023-01-01T00:00:00.000Z", "100", "Thursday" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = strSet1.addAll((java.util.Collection<java.lang.String>) strList6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("Dec 29, 1969");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Dec 29, 1969\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.year();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone10.getMillisKeepLocal(dateTimeZone11, (long) '#');
        java.lang.String str14 = dateTimeZone11.getID();
        int int16 = dateTimeZone11.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology17 = chronology6.withZone(dateTimeZone11);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        long long22 = dateTimeZone19.getMillisKeepLocal(dateTimeZone20, (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeZone11, dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale10 = dateTimeParserBucket8.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale10.getUnicodeLocaleType("12:00:00 AM +00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 12:00:00 AM +00:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.minus(readableDuration4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateTime5.toString("en_CA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime7 = property6.roundHalfEvenCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.shortDateTime();
        java.lang.String str9 = localTime7.toString(dateTimeFormatter8);
        int int10 = localTime7.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField12 = localTime7.getField((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd 12:00 AM" + "'", str9, "\ufffd\ufffd\ufffd\ufffd 12:00 AM");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withEra((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime7 = property6.roundHalfEvenCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.shortDateTime();
        java.lang.String str9 = localTime7.toString(dateTimeFormatter8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a', chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfEven();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime17 = property13.set("22", locale16);
        mutableDateTime17.addYears(10);
        boolean boolean21 = mutableDateTime17.isAfter((long) (short) 1);
        java.lang.String str22 = dateTimeFormatter8.print((org.joda.time.ReadableInstant) mutableDateTime17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = dateTimeFormatter8.parseLocalDateTime("millisOfSecond");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"millisOfSecond\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd 12:00 AM" + "'", str9, "\ufffd\ufffd\ufffd\ufffd 12:00 AM");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1/1/32 12:00 AM" + "'", str22, "1/1/32 12:00 AM");
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology4);
        boolean boolean6 = localTime2.isBefore((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime localTime8 = localTime5.plusSeconds((int) (short) 1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 'a', chronology10);
        mutableDateTime11.addWeekyears((int) (byte) -1);
        boolean boolean14 = localTime5.equals((java.lang.Object) mutableDateTime11);
        long long15 = mutableDateTime11.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime11.setHourOfDay(54341029);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54341029 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-31449599903L) + "'", long15 == (-31449599903L));
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        long long7 = dateTimeField4.set((long) 20, (int) (byte) 1);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(10, 2, (int) (short) 10, 21);
        int[] intArray19 = new int[] { (byte) 0, (byte) 0, 1, (byte) 0, (short) 1, 10 };
        int int20 = dateTimeField4.getMaximumValue((org.joda.time.ReadablePartial) localTime12, intArray19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = property24.withMaximumValue();
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) localDateTime25, (int) '#', locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-259199980L) + "'", long7 == (-259199980L));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "utc");
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfWeek();
        java.lang.String str4 = property3.getAsString();
        java.util.Locale locale6 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = property3.set("100", locale6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"100\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4" + "'", str4, "4");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate2.withDayOfMonth((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(1998, 66, 0, 54341029);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1998 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeZone0.getOffset(4, 10, (-1), (int) (short) 1, 1, 66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.set(dateTimeFieldType9, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        long long7 = dateTimeField4.set((long) 20, (int) (byte) 1);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(10, 2, (int) (short) 10, 21);
        int[] intArray19 = new int[] { (byte) 0, (byte) 0, 1, (byte) 0, (short) 1, 10 };
        int int20 = dateTimeField4.getMaximumValue((org.joda.time.ReadablePartial) localTime12, intArray19);
        org.joda.time.DurationField durationField21 = dateTimeField4.getDurationField();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        int int23 = localDate22.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.hourOfDay();
        int int29 = localDateTime27.getYearOfCentury();
        int[] intArray30 = localDateTime27.getValues();
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale locale33 = java.util.Locale.JAPAN;
        java.util.Locale.Builder builder34 = builder32.setLocale(locale33);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = dateTimeField4.set((org.joda.time.ReadablePartial) localDate22, 5, intArray30, "1/1/32 12:00 AM", locale33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1/1/32 12:00 AM\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-259199980L) + "'", long7 == (-259199980L));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 70 + "'", int29 == 70);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localTime2.getValue(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        org.joda.time.DateTime dateTime7 = dateTime3.withWeekyear(21);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) property8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addHours(0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDate((int) ' ', 10, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "\ufffd\ufffd\ufffd\ufffd 12:00 AM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"?/?/?? 12:00 AM\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        boolean boolean4 = localTime2.equals((java.lang.Object) 10L);
        org.joda.time.LocalTime localTime6 = localTime2.plusMinutes((int) ' ');
        org.joda.time.LocalTime localTime8 = localTime6.minusMinutes((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localTime6.getValue((-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -101");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.year();
        long long12 = dateTimeField9.set((long) (byte) 0, (int) (byte) 1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.DateTime dateTime16 = property15.withMinimumValue();
        org.joda.time.DateTime dateTime18 = dateTime16.minusYears(2);
        int int19 = dateTime18.getDayOfMonth();
        org.joda.time.DateTime.Property property20 = dateTime18.year();
        org.joda.time.LocalDateTime localDateTime21 = dateTime18.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks(70);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 'a', chronology26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        long long32 = dateTimeField29.set((long) 20, (int) (byte) 1);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(10, 2, (int) (short) 10, 21);
        int[] intArray44 = new int[] { (byte) 0, (byte) 0, 1, (byte) 0, (short) 1, 10 };
        int int45 = dateTimeField29.getMaximumValue((org.joda.time.ReadablePartial) localTime37, intArray44);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray47 = dateTimeField9.add((org.joda.time.ReadablePartial) localDateTime21, 52, intArray44, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-62135596800000L) + "'", long12 == (-62135596800000L));
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 21 + "'", int19 == 21);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-259199980L) + "'", long32 == (-259199980L));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0, 0, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 7 + "'", int45 == 7);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.lang.Object obj4 = locale2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.year();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone10.getMillisKeepLocal(dateTimeZone11, (long) '#');
        java.lang.String str14 = dateTimeZone11.getID();
        int int16 = dateTimeZone11.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology17 = chronology6.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = dateTimeField18.set((long) (short) 0, "UTC");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"UTC\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localDate0.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime9 = localTime6.withField(dateTimeFieldType7, (int) '#');
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTime dateTime14 = localTime6.toDateTimeToday(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeField4, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.GJDayOfWeekDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean6 = timeZone2.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.hourOfDay();
        int int11 = localDateTime9.getMillisOfDay();
        java.util.Date date12 = localDateTime9.toDate();
        boolean boolean13 = timeZone2.inDaylightTime(date12);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_EVEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        int int6 = localDateTime4.getMillisOfDay();
        java.util.Date date7 = localDateTime4.toDate();
        boolean boolean8 = timeZone1.inDaylightTime(date7);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("0001-01-03T23:59:59.001");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=0001-01-03t23:59:59.001");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) '#');
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfYear(8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField8 = localDate4.getField((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime4 = localTime1.withField(dateTimeFieldType2, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        java.lang.String str7 = localTime4.toString(dateTimeFormatter5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone14);
        long long18 = dateTimeZone14.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 'a', dateTimeZone14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter5.withZone(dateTimeZone14);
        java.lang.String str22 = dateTimeFormatter20.print(100L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = dateTimeFormatter20.parseLocalTime("Property[dayOfMonth]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Property[dayOfMonth]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12:00 AM" + "'", str7, "12:00 AM");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "12:00 AM" + "'", str22, "12:00 AM");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone2);
        java.lang.String str5 = timeZone2.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Greenwich Mean Time" + "'", str5, "Greenwich Mean Time");
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime7 = property6.roundHalfEvenCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.shortDateTime();
        java.lang.String str9 = localTime7.toString(dateTimeFormatter8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a', chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfEven();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime17 = property13.set("22", locale16);
        mutableDateTime17.addYears(10);
        boolean boolean21 = mutableDateTime17.isAfter((long) (short) 1);
        java.lang.String str22 = dateTimeFormatter8.print((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = dateTimeFormatter8.getPrinter();
        java.lang.StringBuffer stringBuffer24 = null;
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime29 = localTime27.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int31 = localTime27.get(dateTimeFieldType30);
        org.joda.time.Chronology chronology32 = localTime27.getChronology();
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology32, locale33);
        org.joda.time.Chronology chronology35 = dateTimeParserBucket34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfDay();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.yearOfCentury();
        org.joda.time.DateTime dateTime41 = property40.withMinimumValue();
        org.joda.time.DateTime dateTime43 = dateTime41.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime45 = dateTime41.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime41.getZone();
        boolean boolean47 = dateTimeZone46.isFixed();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(chronology48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime51 = dateTime49.plus(readablePeriod50);
        org.joda.time.DateTime.Property property52 = dateTime51.millisOfDay();
        org.joda.time.DurationField durationField53 = property52.getDurationField();
        org.joda.time.DateTime dateTime55 = property52.addWrapFieldToCopy((int) '#');
        java.util.Locale locale56 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) 'a', chronology58);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime59.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime61 = property60.roundHalfEven();
        java.util.Locale locale63 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime64 = property60.set("22", locale63);
        java.lang.String str65 = locale56.getDisplayScript(locale63);
        int int66 = property52.getMaximumShortTextLength(locale63);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter23.printTo(stringBuffer24, (long) (-8), chronology35, 0, dateTimeZone46, locale63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd 12:00 AM" + "'", str9, "\ufffd\ufffd\ufffd\ufffd 12:00 AM");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1/1/32 12:00 AM" + "'", str22, "1/1/32 12:00 AM");
        org.junit.Assert.assertNotNull(dateTimePrinter23);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_CA");
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 8 + "'", int66 == 8);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        long long9 = dateTimeField6.add((-259199980L), (int) (short) 1);
        java.lang.String str10 = dateTimeField6.toString();
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        int int12 = dateTimeField6.getMaximumShortTextLength(locale11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 'a', chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime15.add(readableDuration16, (int) (short) 100);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.millisOfDay();
        boolean boolean20 = locale11.equals((java.lang.Object) mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-259199979L) + "'", long9 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateTimeField[millisOfDay]" + "'", str10, "DateTimeField[millisOfDay]");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime6.getZone();
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTime dateTime13 = localDate0.toDateTime(localTime2, dateTimeZone11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localTime2.get(dateTimeFieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekOfWeekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withWeekOfWeekyear(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = localDateTime3.toString("2022-02-21T15:05:41.396Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        int int3 = localDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean5 = localDateTime2.isSupported(dateTimeFieldType4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.yearOfCentury();
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime2.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = localDate7.getFieldType(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2022");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        int int0 = org.joda.time.MutableDateTime.ROUND_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(10L);
        org.joda.time.DateTime dateTime2 = dateTime1.toDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.withDurationAdded(readableDuration3, (-8));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime1.withYearOfEra((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.minusYears(0);
        org.joda.time.DateTime dateTime5 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime8 = dateTime5.withDurationAdded(0L, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTime8.toString("English (Canada)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        boolean boolean4 = localTime2.equals((java.lang.Object) 10L);
        org.joda.time.LocalTime localTime6 = localTime2.plusMinutes((int) ' ');
        java.util.Locale locale8 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localTime2.toString("Property[dayOfMonth]", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.longTime();
        java.util.Locale locale2 = dateTimeFormatter1.getLocale();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime7 = dateTime4.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime4.toMutableDateTime(dateTimeZone8);
        int int12 = dateTimeFormatter1.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime9, "\ufffd\ufffd\ufffd\ufffd 12:00 AM", 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNull(locale2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-101) + "'", int12 == (-101));
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) property7, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusWeeks((int) '4');
        org.joda.time.TimeOfDay timeOfDay6 = dateTime3.toTimeOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime9 = dateTime3.withSecondOfMinute(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime9.withCenturyOfEra((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusDays((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfEra();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = property5.withMaximumValue();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.lang.String str9 = locale8.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property5.setCopy("en_CA", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"en_CA\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.withWeekyear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime1.withEra((-101));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -101 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.io.IOException iOException1 = new java.io.IOException("English (Canada)");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: English (Canada)" + "'", str2, "java.io.IOException: English (Canada)");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime7 = property6.roundHalfEvenCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.shortDateTime();
        java.lang.String str9 = localTime7.toString(dateTimeFormatter8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a', chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfEven();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime17 = property13.set("22", locale16);
        mutableDateTime17.addYears(10);
        boolean boolean21 = mutableDateTime17.isAfter((long) (short) 1);
        java.lang.String str22 = dateTimeFormatter8.print((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = dateTimeFormatter8.getPrinter();
        java.lang.StringBuffer stringBuffer24 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology26);
        boolean boolean29 = localTime27.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalTime localTime31 = localTime27.plus(readablePeriod30);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.LocalTime localTime34 = localTime31.plusSeconds(1998);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer24, (org.joda.time.ReadablePartial) localTime34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd 12:00 AM" + "'", str9, "\ufffd\ufffd\ufffd\ufffd 12:00 AM");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1/1/32 12:00 AM" + "'", str22, "1/1/32 12:00 AM");
        org.junit.Assert.assertNotNull(dateTimePrinter23);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localTime34);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("Property[dayOfMonth]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: Property[dayOfMonth]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "");
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.removeUnicodeLocaleAttribute("12:00:00 AM +00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 12:00:00 AM +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime7 = property3.set("22", locale6);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int12 = localTime8.get(dateTimeFieldType11);
        org.joda.time.Chronology chronology13 = localTime8.getChronology();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology13.add(readablePeriod15, 4460736516L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) property3, chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.MutableDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 4460736516L + "'", long18 == 4460736516L);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) 10, chronology1);
        int int3 = localTime2.getSecondOfMinute();
        org.joda.time.LocalTime localTime5 = localTime2.withHourOfDay((int) (short) 10);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property6.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property6.roundCeilingCopy();
        java.lang.String str9 = property6.getAsText();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime4 = localTime1.withField(dateTimeFieldType2, (int) '#');
        int int5 = localTime4.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate7 = localDate5.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = localDate7.getFieldType(0);
        org.joda.time.DateTime dateTime10 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate12 = localDate7.plusMonths(1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 'a', chronology14);
        mutableDateTime15.addWeekyears((int) (byte) -1);
        int int18 = mutableDateTime15.getDayOfMonth();
        int int19 = mutableDateTime15.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime15.toMutableDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localDate12.toDateTimeAtMidnight(dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(0, (-101), 22, 42, 100, dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDate();
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, (long) 40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        java.lang.Appendable appendable1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime7 = localTime4.withFieldAdded(durationFieldType5, 100);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadablePartial) localTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        java.lang.String str2 = dateTimeFormatter0.print((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dateTimeFormatter0.parseMillis("secondOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"secondOfDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1/1/70 12:00 AM" + "'", str2, "1/1/70 12:00 AM");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setRegion("0001-01-03T23:59:59.001");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 0001-01-03T23:59:59.001 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        int int3 = dateTime1.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime5 = dateTime1.plusSeconds((int) (short) 0);
        org.joda.time.DateTime dateTime7 = dateTime1.withMillisOfDay((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime1.withYearOfCentury((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("Dec 29, 1969");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Dec 29, 1969\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.mediumDate();
        java.lang.String str3 = dateTimeFormatter1.print((-259199980L));
        int int4 = dateTimeFormatter1.getDefaultYear();
        boolean boolean5 = dateTimeFormatter1.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.parse("0001-01-03T23:59:59.001", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"0001-01-03T23:59:59.001\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Dec 29, 1969" + "'", str3, "Dec 29, 1969");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2000 + "'", int4 == 2000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.withMinimumValue();
        int int10 = localDate9.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate9.withDayOfYear(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        long long9 = dateTimeField6.add((-259199980L), (int) (short) 1);
        java.lang.String str10 = dateTimeField6.toString();
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        int int12 = dateTimeField6.getMaximumShortTextLength(locale11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withWeekOfWeekyear(10);
        int int17 = localDateTime13.getWeekyear();
        org.joda.time.Chronology chronology18 = localDateTime13.getChronology();
        int[] intArray21 = new int[] { 2 };
        int[] intArray23 = dateTimeField6.add((org.joda.time.ReadablePartial) localDateTime13, 5, intArray21, 0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((-1L), chronology25);
        java.util.GregorianCalendar gregorianCalendar27 = dateTime26.toGregorianCalendar();
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology31);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime35 = localTime32.withFieldAdded(durationFieldType33, 100);
        int[] intArray36 = localTime32.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray38 = dateTimeField6.addWrapPartial((org.joda.time.ReadablePartial) localDate28, 41, intArray36, 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-259199979L) + "'", long9 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateTimeField[millisOfDay]" + "'", str10, "DateTimeField[millisOfDay]");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[2]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[2]");
        org.junit.Assert.assertNotNull(gregorianCalendar27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 0, 0, 10]");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime8 = localTime6.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int10 = localTime6.get(dateTimeFieldType9);
        org.joda.time.Chronology chronology11 = localTime6.getChronology();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology11, locale12);
        org.joda.time.DateTimeField dateTimeField14 = chronology11.year();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        long long18 = dateTimeZone15.getMillisKeepLocal(dateTimeZone16, (long) '#');
        java.lang.String str19 = dateTimeZone16.getID();
        int int21 = dateTimeZone16.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology22 = chronology11.withZone(dateTimeZone16);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone16);
        int int25 = dateTimeZone16.getOffsetFromLocal((-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(54341029, 21, (int) (short) 100, (int) '#', (-292275054), dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.withMinimumValue();
        int int10 = localDate9.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate9.withDayOfMonth(41);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 41 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.lang.Object obj0 = null;
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = chronology6.add(readablePeriod8, 4460736516L, (int) (short) -1);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(obj0, chronology6);
        java.util.Locale locale14 = java.util.Locale.US;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localTime12.toString("2022-02-21T15:05:41.396Z", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4460736516L + "'", long11 == 4460736516L);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime5 = property3.set("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
        boolean boolean4 = strSet1.remove((java.lang.Object) mutableDateTime3);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder5.setExtension('a', "");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder9.setExtension('a', "");
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder[] builderArray14 = new java.util.Locale.Builder[] { builder5, builder12, builder13 };
        java.util.Locale.Builder[] builderArray15 = strSet1.toArray(builderArray14);
        java.util.stream.Stream<java.lang.String> strStream16 = strSet1.parallelStream();
        java.lang.String[] strArray59 = new java.lang.String[] { "2000-02-21T15:05:38.021Z", "secondOfMinute", "2022-02-21T15:05:41.396Z", "2022-02-21T15:05:41.396Z", "English (Canada)", "1970", "Dec 29, 1969", "0", "2022-02-21T15:05:37.737Z", "1970-01-01T00:00:00.000Z", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", "1/1/32 12:00 AM", "UTC", "0", "100", "5", "2022-02-21T15:05:40.918", "2022-03-25", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", "Greenwich Mean Time", "English (Canada)", "2023-01-01T00:00:00.000Z", "12:00 AM", "en_CA", "0001-01-03T23:59:59.001", "Thursday", "2022-02-21T15:05:40.918", "2000-02-21T15:05:38.021Z", "5", "millisOfSecond", "2000-02-21T15:05:38.021Z", "ISOChronology[UTC]", "seconds", "year", "00:00:00.010", "5", "-1", "en_CA", "12:00 AM", "\ud55c\uad6d\uc5b4", "22", "Dec 29, 1969" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = strSet1.addAll((java.util.Collection<java.lang.String>) strList60);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builderArray14);
        org.junit.Assert.assertNotNull(builderArray15);
        org.junit.Assert.assertNotNull(strStream16);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2022-02-21");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-21");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay6 = dateTime5.toTimeOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology8);
        boolean boolean11 = localTime9.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime9.plus(readablePeriod12);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime5, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dateTime5.get(dateTimeField16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeField must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.lang.String str6 = locale1.getDisplayCountry(locale3);
        java.lang.String str7 = locale3.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.joda.time.format.DateTimeFormat.patternForStyle("hourOfDay", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: hourOfDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English (Canada)" + "'", str7, "English (Canada)");
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        mutableDateTime1.add(readablePeriod2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.dayOfWeek();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.util.Locale locale9 = java.util.Locale.ROOT;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale6.getDisplayCountry(locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = property4.set("2022-02-21T15:05:40.918", locale6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T15:05:40.918\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        org.joda.time.DurationField durationField7 = chronology5.days();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology5);
        org.joda.time.DateTimeField dateTimeField10 = chronology5.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = chronology5.get(readablePeriod11, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        org.joda.time.DurationField durationField7 = chronology5.days();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.dayOfWeek();
        int int9 = dateTimeField8.getMinimumValue();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology14);
        boolean boolean16 = localTime12.isBefore((org.joda.time.ReadablePartial) localTime15);
        org.joda.time.LocalTime localTime18 = localTime15.plusSeconds((int) (short) 1);
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.util.Locale locale20 = locale19.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = dateTimeField8.getAsText((org.joda.time.ReadablePartial) localTime18, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfWeek' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        int int9 = property7.get();
        java.util.Locale locale11 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 'a', chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfEven();
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime19 = property15.set("22", locale18);
        java.lang.String str20 = locale11.getDisplayScript(locale18);
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.lang.String str22 = locale18.getDisplayLanguage(locale21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = property7.setCopy("hi!", locale21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str22, "\ud55c\uad6d\uc5b4");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean6 = timeZone2.observesDaylightTime();
        boolean boolean7 = timeZone2.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        java.util.Locale locale11 = new java.util.Locale("", "seconds");
        java.lang.String str12 = localDateTime6.toString("22", locale11);
        int int13 = localDateTime6.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.withCenturyOfEra((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMinuteOfHour((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals(locale11.toString(), "_SECONDS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "22" + "'", str12, "22");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 86399001 + "'", int13 == 86399001);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        java.util.Locale locale11 = new java.util.Locale("", "seconds");
        java.lang.String str12 = localDateTime6.toString("22", locale11);
        int int13 = localDateTime6.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime6.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime6.withEra((-8));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -8 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals(locale11.toString(), "_SECONDS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "22" + "'", str12, "22");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 86399001 + "'", int13 == 86399001);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        int int10 = localDateTime8.getWeekOfWeekyear();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone13.nextTransition((long) (byte) 0);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((int) (byte) 0, 8, 22, 7, 52, (int) (short) 100, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(21);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        org.joda.time.DurationField durationField7 = chronology5.days();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology5);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setDateTime(4, 52, 1998, (int) '4', (int) (byte) 0, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = dateTimeFormatter0.parseDateTime("\ufffd\ufffd\ufffd\ufffd 12:00 AM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"?/?/?? 12:00 AM\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusDays((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfEra();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.weekOfWeekyear();
        int int6 = localDateTime3.getDayOfWeek();
        java.lang.String str7 = localDateTime3.toString();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-11T15:05:45.524" + "'", str7, "2022-02-11T15:05:45.524");
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.weekOfWeekyear();
        org.joda.time.LocalDate.Property property2 = localDate0.era();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone3.getMillisKeepLocal(dateTimeZone4, (long) '#');
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) localDate0, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.toMutableDateTime(chronology11);
        mutableDateTime1.setYear((-292275054));
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        int int7 = localDateTime5.getMillisOfDay();
        java.util.Date date8 = localDateTime5.toDate();
        boolean boolean9 = timeZone1.inDaylightTime(date8);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime7 = property6.roundHalfEvenCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.shortDateTime();
        java.lang.String str9 = localTime7.toString(dateTimeFormatter8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a', chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfEven();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime17 = property13.set("22", locale16);
        mutableDateTime17.addYears(10);
        boolean boolean21 = mutableDateTime17.isAfter((long) (short) 1);
        java.lang.String str22 = dateTimeFormatter8.print((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = dateTimeFormatter8.getPrinter();
        java.io.Writer writer24 = null;
        org.joda.time.ReadablePartial readablePartial25 = null;
        java.util.Locale locale28 = new java.util.Locale("", "seconds");
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter23.printTo(writer24, readablePartial25, locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd 12:00 AM" + "'", str9, "\ufffd\ufffd\ufffd\ufffd 12:00 AM");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1/1/32 12:00 AM" + "'", str22, "1/1/32 12:00 AM");
        org.junit.Assert.assertNotNull(dateTimePrinter23);
        org.junit.Assert.assertEquals(locale28.toString(), "_SECONDS");
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withMillisOfSecond((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Thursday");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 'a', chronology5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfEven();
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime11 = property7.set("22", locale10);
        mutableDateTime11.addYears(10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMillis(1);
        mutableDateTime11.setDate((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime11.add(readablePeriod23, (int) 'u');
        mutableDateTime11.setYear(99);
        java.util.Date date28 = mutableDateTime11.toDate();
        boolean boolean29 = timeZone3.inDaylightTime(date28);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Feb 23 00:00:00 UTC 99");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(17268551, 17268551, 3, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17268551 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        java.lang.Appendable appendable1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readableDuration6);
        int int8 = dateTime5.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadableInstant) dateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(457071, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 457071 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int11 = localTime7.get(dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = localTime7.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((int) (short) 10, 54345623, 2022, (int) (short) 1, 0, 40, (int) '4', chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54345623 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("Thursday");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        int int9 = localDateTime7.getWeekOfWeekyear();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone12.nextTransition((long) (byte) 0);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(86399001, 59, 0, (int) '4', 41, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekyear();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime2);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime2.add(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime2.add(readableDuration13, 46);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(21, (int) 'x', 0, 57, 23, 23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 57 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) (short) 0, 457071, 99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 457071 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int7 = localTime3.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = localTime3.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.DurationField durationField10 = chronology8.eras();
        mutableDateTime2.setChronology(chronology8);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology8);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = chronology8.getDateTimeMillis(1998, 66, 5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 66 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withWeekOfWeekyear(10);
        int int4 = localDateTime0.getWeekyear();
        org.joda.time.Chronology chronology5 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.millis();
        org.joda.time.DurationField durationField7 = chronology5.eras();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(54341);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh_CN" + "'", str1, "zh_CN");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        mutableDateTime2.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundFloor();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = property5.set(86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        org.joda.time.DateTime dateTime7 = dateTime3.withWeekyear(21);
        org.joda.time.DateTime dateTime9 = dateTime3.minusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekyear(2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(66);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 66 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate localDate8 = localDate6.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate8.minus(readablePeriod9);
        org.joda.time.DateTime dateTime11 = localDate10.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.withEra(47);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusDays(0);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withPeriodAdded(readablePeriod4, 10);
        int int7 = localDateTime0.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime.Property property9 = localDateTime0.property(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 54347365 + "'", int7 == 54347365);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        boolean boolean4 = localTime2.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.plus(readablePeriod5);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.era();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int14 = localTime10.get(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localTime10.getChronology();
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology15, locale16);
        org.joda.time.DateTimeZone dateTimeZone18 = chronology15.getZone();
        org.joda.time.DateTimeField dateTimeField19 = chronology15.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) dateTimeField8, chronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.GJEraDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plus(readableDuration4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, 100);
        int int9 = localDateTime5.getMonthOfYear();
        int int10 = localDateTime5.getHourOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours((int) ' ');
        org.joda.time.LocalDate localDate6 = dateTime5.toLocalDate();
        org.joda.time.DateTime.Property property7 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime8 = property7.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime9 = property7.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(54341, 86399001, 40, 45, 1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 45 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean6 = timeZone2.observesDaylightTime();
        int int8 = timeZone2.getOffset((long) (-101));
        boolean boolean9 = timeZone2.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = dateTime3.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone7);
        int int11 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime8, "\ufffd\ufffd\ufffd\ufffd 12:00 AM", 100);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime8.setDayOfWeek(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-101) + "'", int11 == (-101));
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = dateTimeFormatter0.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.mediumDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withPivotYear((java.lang.Integer) 23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.parse("secondOfDay", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"secondOfDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withWeekOfWeekyear(10);
        int int4 = localDateTime0.getWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withYear(2000);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusHours((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra((-101));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -101 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.weeks();
        boolean boolean3 = localDate0.isSupported(durationFieldType2);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight7 = localDate0.toDateMidnight(dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property10.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime13 = property10.addWrapFieldToCopy(20);
        org.joda.time.DateTime dateTime14 = property10.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateTime.Property property16 = dateTime14.property(dateTimeFieldType15);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localDate0.get(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ?:??:?? ? ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        java.util.Locale locale11 = new java.util.Locale("", "seconds");
        java.lang.String str12 = localDateTime6.toString("22", locale11);
        int int13 = localDateTime6.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime6.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime6.withDayOfMonth(42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals(locale11.toString(), "_SECONDS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "22" + "'", str12, "22");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 86399001 + "'", int13 == 86399001);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.removeUnicodeLocaleAttribute("2022-02-21T15:05:41.396Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-21T15:05:41.396Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime7 = property3.set("22", locale6);
        mutableDateTime7.addYears(10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.DateTime dateTime13 = property12.withMinimumValue();
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime17 = dateTime13.plusMillis(1);
        mutableDateTime7.setDate((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime7.add(readablePeriod19, (int) 'u');
        mutableDateTime7.setYear(99);
        java.util.Date date24 = mutableDateTime7.toDate();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime7.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration26 = null;
        mutableDateTime7.add(readableDuration26);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sat Feb 23 00:00:00 UTC 99");
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusDays((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property4.addToCopy((int) (byte) 1);
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale10 = java.util.Locale.ROOT;
        java.lang.String str11 = locale9.getDisplayVariant(locale10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property4.setCopy("Property[dayOfMonth]", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[dayOfMonth]\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter0.withChronology(chronology6);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuffer10, (long) 41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate7 = localDate2.plus(readablePeriod6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDate3.getFieldType(0);
        org.joda.time.DateTime dateTime6 = localDate3.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate8 = localDate3.plusMonths(1);
        org.joda.time.LocalDate.Property property9 = localDate3.yearOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.fullTime();
        java.lang.String str11 = localDate3.toString(dateTimeFormatter10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.parse("en_CA", dateTimeFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"en_CA\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd " + "'", str11, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd ");
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setRegion("0001-01-03T23:59:59.001");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 0001-01-03T23:59:59.001 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(1);
        org.joda.time.LocalDate localDate9 = localDate2.minusWeeks(100);
        java.lang.String str10 = localDate9.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDate9.get(dateTimeFieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdayOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-03-23" + "'", str10, "2020-03-23");
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int12 = localTime8.get(dateTimeFieldType11);
        org.joda.time.Chronology chronology13 = localTime8.getChronology();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology13, locale14);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.secondOfDay();
        org.joda.time.DurationField durationField18 = chronology16.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((int) 'x', 1, 54341, (int) (short) 10, 44, 46, 22, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54341 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) '#');
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone1);
        mutableDateTime4.setHourOfDay(6);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertNotNull(mutableDateTime4);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(23, 0, (int) 'a', 41, 40, 8, (-8));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 41 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.minus((long) ' ');
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(21);
        org.joda.time.DateTime dateTime8 = dateTime4.minusSeconds((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTime8.toString("2000-02-21T15:05:38.021Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 'a', chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfEven();
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime8 = property4.set("22", locale7);
        mutableDateTime8.addYears(10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime14 = property13.withMinimumValue();
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis(1);
        mutableDateTime8.setDate((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime8.add(readablePeriod20, (int) 'u');
        mutableDateTime8.setYear(99);
        java.util.Date date25 = mutableDateTime8.toDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 'a', chronology28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundHalfEven();
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime34 = property30.set("22", locale33);
        mutableDateTime34.addYears(10);
        int int39 = dateTimeFormatter26.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime34, "12:00 AM", 7);
        java.lang.String str40 = mutableDateTime8.toString(dateTimeFormatter26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.parse("4", dateTimeFormatter26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"4\" is too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Feb 23 00:00:00 UTC 99");
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-8) + "'", int39 == (-8));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "12:00:00 AM +00:00" + "'", str40, "12:00:00 AM +00:00");
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        long long9 = dateTimeField6.add((-259199980L), (int) (short) 1);
        java.lang.String str10 = dateTimeField6.toString();
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        int int12 = dateTimeField6.getMaximumShortTextLength(locale11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withWeekOfWeekyear(10);
        int int17 = localDateTime13.getWeekyear();
        org.joda.time.Chronology chronology18 = localDateTime13.getChronology();
        int[] intArray21 = new int[] { 2 };
        int[] intArray23 = dateTimeField6.add((org.joda.time.ReadablePartial) localDateTime13, 5, intArray21, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = localDateTime13.getValue(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-259199979L) + "'", long9 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateTimeField[millisOfDay]" + "'", str10, "DateTimeField[millisOfDay]");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[2]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[2]");
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate2.plusDays((int) ' ');
        org.joda.time.LocalDate localDate10 = localDate8.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localTime1.compareTo((org.joda.time.ReadablePartial) localDate10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendCenturyOfEra(22, 41);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendTimeZoneName(strMap13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder14.appendTimeZoneOffset("2022-03-25", "00:00:00.010", false, 54341029, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Thursday");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        timeZone1.setID("100");
        java.lang.String str5 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GMT+00:00" + "'", str5, "GMT+00:00");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.add(0L);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime8.setDayOfWeek(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology7, locale8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.monthOfYear();
        org.joda.time.Chronology chronology12 = chronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType0.getField(chronology12);
        boolean boolean15 = dateTimeField13.isLeap((-62166787199903L));
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.Chronology chronology10 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.centuryOfEra();
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeField11.set((-172800000L), "secondOfMinute", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"secondOfMinute\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        int int6 = timeZone2.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.year();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.plus(readablePeriod13);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.DurationField durationField16 = property15.getDurationField();
        org.joda.time.DateTimeField dateTimeField17 = property15.getField();
        long long20 = dateTimeField17.add((-259199980L), (int) (short) 1);
        java.lang.String str21 = dateTimeField17.toString();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        int int23 = dateTimeField17.getMaximumShortTextLength(locale22);
        java.lang.String str24 = dateTimeField9.getAsText((long) 'a', locale22);
        java.util.Set<java.lang.Character> charSet25 = locale22.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = locale22.getUnicodeLocaleType("English (Canada)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: English (Canada)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-259199979L) + "'", long20 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateTimeField[millisOfDay]" + "'", str21, "DateTimeField[millisOfDay]");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970" + "'", str24, "1970");
        org.junit.Assert.assertNotNull(charSet25);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (short) -1, 5, 40, 47, 45);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.LocalDate localDate4 = localDate2.minusDays((int) 'a');
        org.joda.time.LocalDate.Property property5 = localDate2.era();
        org.joda.time.LocalDate localDate6 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate7 = property5.withMaximumValue();
        org.joda.time.LocalDate localDate8 = property5.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate8.minusDays((-101));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 9223372036828800000 + 8726400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime4 = localTime1.withField(dateTimeFieldType2, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        java.lang.String str7 = localTime4.toString(dateTimeFormatter5);
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withCenturyOfEra((int) ' ');
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.DateTime dateTime16 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime18 = property15.addWrapFieldToCopy(20);
        org.joda.time.DateTime dateTime19 = property15.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateTime.Property property21 = dateTime19.property(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime12.withField(dateTimeFieldType20, 457071);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer8, (org.joda.time.ReadablePartial) localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12:00 AM" + "'", str7, "12:00 AM");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        long long9 = dateTimeField6.add((-259199980L), (int) (short) 1);
        java.lang.String str10 = dateTimeField6.toString();
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        int int12 = dateTimeField6.getMaximumShortTextLength(locale11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withWeekOfWeekyear(10);
        int int17 = localDateTime13.getWeekyear();
        org.joda.time.Chronology chronology18 = localDateTime13.getChronology();
        int[] intArray21 = new int[] { 2 };
        int[] intArray23 = dateTimeField6.add((org.joda.time.ReadablePartial) localDateTime13, 5, intArray21, 0);
        java.lang.String str24 = localDateTime13.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = localDateTime13.toString("Thursday");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-259199979L) + "'", long9 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateTimeField[millisOfDay]" + "'", str10, "DateTimeField[millisOfDay]");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[2]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[2]");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022-02-21T15:05:49.455" + "'", str24, "2022-02-21T15:05:49.455");
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDate3.getFieldType(0);
        org.joda.time.DateTime dateTime6 = localDate3.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate8 = localDate3.plusMonths(1);
        org.joda.time.LocalDate localDate10 = localDate3.minusWeeks(100);
        org.joda.time.Chronology chronology11 = localDate3.getChronology();
        org.joda.time.Chronology chronology12 = chronology11.withUTC();
        java.util.Locale locale15 = new java.util.Locale("February 21, 2022", "February 21, 2022");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(4460746081L, chronology11, locale15);
        java.lang.String str17 = locale15.toString();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertEquals(locale15.toString(), "february 21, 2022_FEBRUARY 21, 2022");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "february 21, 2022_FEBRUARY 21, 2022" + "'", str17, "february 21, 2022_FEBRUARY 21, 2022");
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(1);
        int int8 = localDate7.getEra();
        org.joda.time.LocalDate.Property property9 = localDate7.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = property9.setCopy("-1");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"-1\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int11 = localTime7.get(dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = localTime7.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology12);
        int int15 = mutableDateTime14.getSecondOfMinute();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean19 = localTime17.isSupported(dateTimeFieldType18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.property(dateTimeFieldType18);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime24 = localTime22.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int26 = localTime22.get(dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = localTime22.getChronology();
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology27, locale28);
        mutableDateTime14.setChronology(chronology27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(99, 8, (int) (short) 10, 54345623, (-292275054), 0, (int) ' ', chronology27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54345623 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime7 = property3.set("22", locale6);
        mutableDateTime7.addYears(10);
        boolean boolean11 = mutableDateTime7.isAfter((long) (short) 1);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.weekOfWeekyear();
        int int13 = property12.get();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendMinuteOfHour(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendMinuteOfHour((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay6 = dateTime5.toTimeOfDay();
        org.joda.time.DateTime dateTime8 = dateTime5.withHourOfDay(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime5.withEra((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(40, 44);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        boolean boolean4 = localTime2.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.plus(readablePeriod5);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekOfWeekyear();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(10, 2, (int) (short) 10, 21);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear((int) '4');
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str19 = durationFieldType18.toString();
        boolean boolean20 = localDate15.isSupported(durationFieldType18);
        int[] intArray21 = localDate15.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = dateTimeField8.addWrapField((org.joda.time.ReadablePartial) localTime13, 10, intArray21, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "seconds" + "'", str19, "seconds");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[2022, 2, 21]");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        java.lang.String str4 = property3.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = property3.setCopy("Saturday");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Saturday\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hourOfDay" + "'", str4, "hourOfDay");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime7 = property3.set("22", locale6);
        mutableDateTime7.addYears(10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.DateTime dateTime13 = property12.withMinimumValue();
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime17 = dateTime13.plusMillis(1);
        mutableDateTime7.setDate((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime7.add(readablePeriod19, (int) 'u');
        mutableDateTime7.setYear(99);
        java.util.Date date24 = mutableDateTime7.toDate();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime27 = property25.addWrapField(17268551);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime27.set(dateTimeFieldType28, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sat Feb 23 00:00:00 UTC 99");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone2);
        timeZone0.setRawOffset((int) (short) 100);
        int int7 = timeZone0.getRawOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = timeZone0.getDisplayName(false, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.minusYears(0);
        org.joda.time.DateTime dateTime5 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime8 = dateTime5.withDurationAdded(0L, (int) '#');
        org.joda.time.DateTime.Property property9 = dateTime5.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = property9.setCopy("+00:00");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"+00:00\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(45, 25, (int) (short) 100, 0, (int) ' ', 39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        long long10 = dateTimeParserBucket8.computeMillis(false);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.plus(readablePeriod13);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.DurationField durationField16 = property15.getDurationField();
        org.joda.time.DateTimeField dateTimeField17 = property15.getField();
        long long20 = dateTimeField17.add((-259199980L), (int) (short) 1);
        boolean boolean21 = dateTimeField17.isSupported();
        dateTimeParserBucket8.saveField(dateTimeField17, (int) (short) 100);
        java.lang.String str25 = dateTimeField17.getAsShortText((-62166787199903L));
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-259199979L) + "'", long20 == (-259199979L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "97" + "'", str25, "97");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        boolean boolean4 = localTime2.equals((java.lang.Object) 10L);
        org.joda.time.LocalTime localTime6 = localTime2.plusMinutes((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime2.withSecondOfMinute((-101));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -101 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime10.toMutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.property(dateTimeFieldType14);
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.plus(readablePeriod19);
        org.joda.time.DateTime.Property property21 = dateTime20.millisOfDay();
        org.joda.time.DurationField durationField22 = property21.getDurationField();
        org.joda.time.DateTimeField dateTimeField23 = property21.getField();
        long long26 = dateTimeField23.add((-259199980L), (int) (short) 1);
        java.lang.String str27 = dateTimeField23.toString();
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        int int29 = dateTimeField23.getMaximumShortTextLength(locale28);
        int int30 = property15.getMaximumTextLength(locale28);
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.lang.String str32 = locale31.getCountry();
        java.lang.String str33 = locale28.getDisplayCountry(locale31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime34 = property6.setCopy("+00:00", locale31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"+00:00\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-259199979L) + "'", long26 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DateTimeField[millisOfDay]" + "'", str27, "DateTimeField[millisOfDay]");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        int int6 = dateTime5.getDayOfMonth();
        org.joda.time.DateTime.Property property7 = dateTime5.year();
        org.joda.time.LocalDateTime localDateTime8 = dateTime5.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(70);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusSeconds((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withDayOfMonth(41);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 41 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        mutableDateTime2.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundFloor();
        org.joda.time.DurationField durationField7 = property5.getLeapDurationField();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNull(durationField7);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        long long10 = dateTimeZone6.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 'a', dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.withMonthOfYear(40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int7 = localTime3.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = localTime3.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.DurationField durationField10 = chronology8.eras();
        mutableDateTime2.setChronology(chronology8);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekyear();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.add((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime10.setHourOfDay(206);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 206 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusDays((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfEra();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = property5.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = property5.withMinimumValue();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property10.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime11.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime11.getZone();
        long long18 = dateTimeZone16.nextTransition(100L);
        long long20 = dateTimeZone16.convertUTCToLocal((long) 46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) property5, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 46L + "'", long20 == 46L);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.DateTime dateTime3 = property2.roundCeilingCopy();
        int int4 = property2.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) 10, chronology1);
        int int3 = localTime2.getSecondOfMinute();
        org.joda.time.LocalTime localTime5 = localTime2.withHourOfDay((int) (short) 10);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale8.getScript();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property6.setCopy("Jan", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Jan\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.weeks();
        boolean boolean3 = localDate0.isSupported(durationFieldType2);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight7 = localDate0.toDateMidnight(dateTimeZone5);
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDate0.compareTo(readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateMidnight7);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("eng");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"eng\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        int int3 = localDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean5 = localDateTime2.isSupported(dateTimeFieldType4);
        int int6 = localDateTime2.getWeekOfWeekyear();
        int int7 = localDateTime2.getYear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.withCenturyOfEra(22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime2.withTime((int) (byte) 10, (int) (byte) 1, 8, 457071);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 457071 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate9 = localDate0.withDayOfYear((int) '#');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime12 = dateTime11.toLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = localDate0.isBefore((org.joda.time.ReadablePartial) localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDate();
        java.lang.String str2 = dateTimeFormatter0.print((-259199980L));
        int int3 = dateTimeFormatter0.getDefaultYear();
        java.util.Locale locale4 = dateTimeFormatter0.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = dateTimeFormatter0.parseLocalDate("Saturday");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Saturday\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Dec 29, 1969" + "'", str2, "Dec 29, 1969");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime5 = property2.addWrapFieldToCopy(20);
        org.joda.time.DateTime dateTime6 = property2.roundHalfEvenCopy();
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime6.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.roundHalfFloor();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime10.setMinuteOfHour(99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime5 = localTime2.withFieldAdded(durationFieldType3, 100);
        int[] intArray6 = localTime2.getValues();
        java.lang.String str7 = localTime2.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.hourOfDay();
        int int12 = localDateTime10.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int14 = localDateTime10.indexOf(dateTimeFieldType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = localTime2.withField(dateTimeFieldType13, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekOfWeekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00:00:00.010" + "'", str7, "00:00:00.010");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone7.convertUTCToLocal((long) 7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(70, (int) ' ', (int) (byte) 10, 17268551, 4, 2016, 6, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17268551 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 7L + "'", long9 == 7L);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(1, 52, (-101));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(1);
        int int8 = localDate7.getEra();
        org.joda.time.LocalDate.Property property9 = localDate7.era();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        org.joda.time.LocalDate localDate11 = property9.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = property9.addToCopy(1970);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        int int3 = localDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean5 = localDateTime2.isSupported(dateTimeFieldType4);
        int int6 = localDateTime2.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withDayOfWeek((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter1.withChronology(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.parse("Feb 21, 2022", dateTimeFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Feb 21, 2022\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime2.add(readableDuration6, 8);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.weekOfWeekyear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime11.add(readablePeriod12);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int17 = localTime15.indexOf(dateTimeFieldType16);
        boolean boolean18 = mutableDateTime2.isSupported(dateTimeFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDate(44, 0, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(9, (int) (byte) 10, (int) (byte) 0, chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        int int4 = dateTime2.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime6 = dateTime2.plusSeconds((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.joda.time.format.DateTimeFormat.longDate();
        java.lang.String str8 = dateTime6.toString(dateTimeFormatter7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.parse("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd ", dateTimeFormatter7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"?:??:?? ? \"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "February 21, 2022" + "'", str8, "February 21, 2022");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusDays(0);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withPeriodAdded(readablePeriod4, 10);
        int int7 = localDateTime0.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime0.withDayOfMonth((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 54351842 + "'", int7 == 54351842);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology7, locale8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.secondOfDay();
        org.joda.time.DurationField durationField12 = chronology10.halfdays();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) '#', chronology10);
        org.joda.time.DateTimeField dateTimeField14 = chronology10.dayOfWeek();
        long long16 = dateTimeField14.roundCeiling((long) 54341029);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 86400000L + "'", long16 == 86400000L);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
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
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withWeekOfWeekyear(10);
        int int4 = localDateTime0.getWeekyear();
        org.joda.time.Chronology chronology5 = localDateTime0.getChronology();
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime0.withSecondOfMinute(1998);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1998 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) '4', (int) (short) 100, 7, 8, 6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.LocalDate localDate4 = localDate2.minusDays((int) 'a');
        org.joda.time.LocalDate.Property property5 = localDate2.era();
        org.joda.time.LocalDate localDate6 = property5.roundHalfCeilingCopy();
        org.joda.time.Interval interval7 = localDate6.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = localDate6.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(interval7);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime5 = property3.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.getLocalDateTime();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property3.setCopy("GMT", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"GMT\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime7 = property3.set("22", locale6);
        mutableDateTime7.addYears(10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.DateTime dateTime13 = property12.withMinimumValue();
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime17 = dateTime13.plusMillis(1);
        mutableDateTime7.setDate((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime7.add(readablePeriod19, (int) 'u');
        mutableDateTime7.setYear(99);
        java.util.Date date24 = mutableDateTime7.toDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 'a', chronology27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundHalfEven();
        java.util.Locale locale32 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime33 = property29.set("22", locale32);
        mutableDateTime33.addYears(10);
        int int38 = dateTimeFormatter25.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime33, "12:00 AM", 7);
        java.lang.String str39 = mutableDateTime7.toString(dateTimeFormatter25);
        org.joda.time.LocalTime localTime41 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime43 = localTime41.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int45 = localTime41.get(dateTimeFieldType44);
        org.joda.time.Chronology chronology46 = localTime41.getChronology();
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology46, locale47);
        org.joda.time.Chronology chronology49 = dateTimeParserBucket48.getChronology();
        org.joda.time.Chronology chronology50 = chronology49.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter25.withChronology(chronology49);
        java.lang.Appendable appendable52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(chronology53);
        org.joda.time.DateTime.Property property55 = dateTime54.yearOfCentury();
        org.joda.time.DateTime dateTime57 = dateTime54.minus((long) ' ');
        org.joda.time.DateTime dateTime59 = dateTime57.withMillisOfSecond(7);
        int int60 = dateTime59.getMillisOfSecond();
        org.joda.time.DateTime dateTime61 = dateTime59.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime63 = dateTime59.plusHours(10);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter51.printTo(appendable52, (org.joda.time.ReadableInstant) dateTime59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Sat Feb 23 00:00:00 GMT 99");
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-8) + "'", int38 == (-8));
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u6642\u5206\u79d2 +00:00" + "'", str39, "\u6642\u5206\u79d2 +00:00");
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 7 + "'", int60 == 7);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusWeeks((int) '4');
        org.joda.time.TimeOfDay timeOfDay6 = dateTime3.toTimeOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime9 = dateTime3.withSecondOfMinute(0);
        int int10 = dateTime3.getSecondOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 54352 + "'", int10 == 54352);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (short) 10, 0, (-292275054), 39, 10, 43, 457071);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekyear();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.add((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime10.setMonthOfYear((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime7 = property6.roundHalfEvenCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.shortDateTime();
        java.lang.String str9 = localTime7.toString(dateTimeFormatter8);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = dateTimeFormatter8.getPrinter();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.DateTimeFormat.longTime();
        java.util.Locale locale14 = dateTimeFormatter13.getLocale();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.DateTime dateTime19 = dateTime16.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime16.toMutableDateTime(dateTimeZone20);
        int int24 = dateTimeFormatter13.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime21, "\ufffd\ufffd\ufffd\ufffd 12:00 AM", 100);
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime28 = localTime26.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int30 = localTime26.get(dateTimeFieldType29);
        org.joda.time.Chronology chronology31 = localTime26.getChronology();
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology31, locale32);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime21.toMutableDateTime(chronology31);
        java.util.TimeZone timeZone37 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        long long42 = dateTimeZone39.adjustOffset((-62166787199903L), false);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone39);
        java.util.Locale.Builder builder44 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder47 = builder44.setExtension('a', "");
        java.util.Locale.Builder builder48 = builder44.clear();
        java.util.Locale locale49 = builder44.build();
        java.lang.String str50 = locale49.getScript();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter10.printTo(stringBuffer11, (long) 1970, chronology31, (int) (byte) -1, dateTimeZone39, locale49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0:00" + "'", str9, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0:00");
        org.junit.Assert.assertNotNull(dateTimePrinter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-101) + "'", int24 == (-101));
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(timeZone37);
// flaky:         org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-62166787199903L) + "'", long42 == (-62166787199903L));
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) 100, 9, 2022, 5, 42, 44, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(54341, 43, 0, 0, 20, (int) 'a', 57);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("2023-01-01T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2023-01-01T00:00:00.000Z\" is malformed at \"23-01-01T00:00:00.000Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("22", throwable2);
        java.io.IOException iOException4 = new java.io.IOException("English (Canada)", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("10");
        iOException3.addSuppressed((java.lang.Throwable) iOException7);
        java.lang.String str9 = iOException7.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: 10" + "'", str9, "java.io.IOException: 10");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDate();
        java.lang.String str2 = dateTimeFormatter0.print((-259199980L));
        int int3 = dateTimeFormatter0.getDefaultYear();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        java.lang.String str10 = dateTime8.toString();
        org.joda.time.DateTime dateTime12 = dateTime8.minus((-31449599903L));
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer4, (org.joda.time.ReadableInstant) dateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969/12/29" + "'", str2, "1969/12/29");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-21T15:05:52.719Z" + "'", str10, "2022-02-21T15:05:52.719Z");
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime9 = localTime6.withField(dateTimeFieldType7, (int) '#');
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTime dateTime14 = localTime6.toDateTimeToday(dateTimeZone13);
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = dateTimeZone13.getName((long) 7, locale16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(54341029, 8, (int) (byte) 1, 23, (int) 'u', dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        int int14 = mutableDateTime10.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime10.toMutableDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDate7.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime17.withDayOfWeek((-8));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -8 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getYearOfCentury();
        org.joda.time.LocalTime localTime5 = localDateTime2.toLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime5.withField(dateTimeFieldType6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        org.joda.time.DateTime dateTime7 = dateTime3.withWeekyear(21);
        org.joda.time.DateTime dateTime9 = dateTime3.minusMonths(2022);
        org.joda.time.DateTime.Property property10 = dateTime3.centuryOfEra();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setRawOffset((int) 'a');
        int int3 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendPattern("2022-02-21T00:00:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusDays((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfEra();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.weekOfWeekyear();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = localDateTime3.getFieldTypes();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology11);
        boolean boolean13 = localTime9.isBefore((org.joda.time.ReadablePartial) localTime12);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(1);
        org.joda.time.LocalDate localDate9 = localDate2.minusWeeks(100);
        org.joda.time.Chronology chronology10 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.millisOfDay();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        int int13 = localDate12.getCenturyOfEra();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.weeks();
        boolean boolean15 = localDate12.isSupported(durationFieldType14);
        org.joda.time.DateMidnight dateMidnight16 = localDate12.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight19 = localDate12.toDateMidnight(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        int int21 = localDate20.getCenturyOfEra();
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.weeks();
        boolean boolean23 = localDate20.isSupported(durationFieldType22);
        org.joda.time.DateMidnight dateMidnight24 = localDate20.toDateMidnight();
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder28 = builder25.setExtension('a', "");
        java.util.Locale.Builder builder29 = builder25.clear();
        java.util.Locale locale30 = builder25.build();
        java.util.Calendar calendar31 = dateMidnight24.toCalendar(locale30);
        java.util.Set<java.lang.Character> charSet32 = locale30.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = dateTimeField11.getAsShortText((org.joda.time.ReadablePartial) localDate12, locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(calendar31);
        org.junit.Assert.assertEquals(calendar31.toString(), "java.util.GregorianCalendar[time=1645401600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(charSet32);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.hourOfDay();
        int int11 = localDateTime9.getWeekOfWeekyear();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long16 = dateTimeZone14.nextTransition((long) (byte) 0);
        org.joda.time.DateTime dateTime17 = localDateTime9.toDateTime(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(59, 23, 86399999, 0, 54341029, 457071, 53, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54341029 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(66, 9, 1, 31, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1), 99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.year();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone10.getMillisKeepLocal(dateTimeZone11, (long) '#');
        java.lang.String str14 = dateTimeZone11.getID();
        int int16 = dateTimeZone11.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology17 = chronology6.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.dayOfMonth();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime22 = localTime20.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int24 = localTime20.get(dateTimeFieldType23);
        org.joda.time.Chronology chronology25 = localTime20.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.months();
        org.joda.time.DurationField durationField27 = chronology25.days();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology25);
        org.joda.time.DateTimeField dateTimeField30 = chronology25.dayOfMonth();
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.now(chronology25);
        int[] intArray32 = new int[] {};
        int int33 = dateTimeField19.getMaximumValue((org.joda.time.ReadablePartial) localTime31, intArray32);
        org.joda.time.LocalTime localTime35 = localTime31.minusSeconds(8);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.hourOfDay();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.plus(readableDuration40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withPeriodAdded(readablePeriod42, 100);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime41.plusYears((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            int int48 = localTime35.compareTo((org.joda.time.ReadablePartial) localDateTime46);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 31 + "'", int33 == 31);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime2.add(readableDuration6, 8);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.dayOfWeek();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate12 = localDate10.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDate12.getFieldType(0);
        mutableDateTime2.set(dateTimeFieldType14, (-8));
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime2.add(readablePeriod17);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDayOfYear(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("-1", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate0.minus(readablePeriod3);
        int int5 = localDate4.getYear();
        org.joda.time.LocalDate localDate7 = localDate4.plusWeeks(10);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.hourOfDay();
        int int12 = localDateTime10.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDate7.compareTo((org.joda.time.ReadablePartial) localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 70 + "'", int12 == 70);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime5 = property2.addWrapFieldToCopy(20);
        org.joda.time.DateTime dateTime6 = property2.roundHalfEvenCopy();
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime6.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime13 = property8.addWrapField(36130021);
        boolean boolean14 = property8.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.util.Locale locale3 = new java.util.Locale("", "seconds");
        java.lang.String str4 = locale3.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.joda.time.format.DateTimeFormat.patternForStyle("February 21, 2022", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: February 21, 2022");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "_SECONDS");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "German", "-1", "0001-01-03T23:59:59.001", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd ", "UTC", "22", "Property[dayOfMonth]", "GMT", "English (Canada)", "5", "2022-02-21T15:05:40.918", "Feb 21, 2022", "secondOfMinute", "en_CA", "+05:23", "10", "\ud55c\uad6d\uc5b4", "2020-03-23", "Chinese", "Dec 29, 1969", "Dec 29, 1969", "seconds", "de", "12:00 AM", "\ufffd\ufffd\ufffd\ufffd 12:00 AM", "eng", "February 21, 2022", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", "3:05 PM", "\uce90\ub098\ub2e4", "00:00:00.097", "UTC", "2022-02-21T15:05:37.737Z", "2022-02-21", "10", "february 21, 2022_FEBRUARY 21, 2022", "Thursday", "00:00:00.097", "English", "2020-03-23", "hourOfDay", "hourOfDay", "UTC", "2022-02-11T15:05:45.524", "Feb 21, 2022", "millisOfSecond", "5", "february 21, 2022_FEBRUARY 21, 2022", "hi!", "Saturday", "\ud55c\uad6d\uc5b4", "2022-02-21T15:05:41.396Z", "Thursday, January 1, 1970", "Saturday", "1/1/32 12:00 AM", "zh_CN", "Thursday, January 1, 1970", "en", "CAN", "4", "Jan", "1970-01-01T00:00:00.000Z", "Chinese", "2022-02-11T15:05:45.524", "February 21, 2022", "5", "12:00 AM", "GMT", "millisOfSecond", "UTC", "6" };
        java.util.LinkedHashSet<java.lang.String> strSet73 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet73, strArray72);
        java.util.Locale locale75 = java.util.Locale.TRADITIONAL_CHINESE;
        boolean boolean76 = locale75.hasExtensions();
        java.lang.String str77 = locale75.getDisplayVariant();
        boolean boolean78 = strSet73.equals((java.lang.Object) locale75);
        java.util.Locale.FilteringMode filteringMode79 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList80 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet73, filteringMode79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + filteringMode79 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode79.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(47);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        org.joda.time.Chronology chronology2 = dateTimeFormatter0.getChronolgy();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate5 = localDate3.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = localDate5.getFieldType(0);
        org.joda.time.DateTime dateTime8 = localDate5.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate10 = localDate5.plusMonths(1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 'a', chronology12);
        mutableDateTime13.addWeekyears((int) (byte) -1);
        int int16 = mutableDateTime13.getDayOfMonth();
        int int17 = mutableDateTime13.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime13.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate10.toDateTimeAtMidnight(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeFormatter0, dateTimeZone18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.format.DateTimeFormatter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertNull(chronology2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate9.withMonthOfYear(39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        mutableDateTime1.add(readablePeriod2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readableDuration6);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 99, (int) (short) 0);
        boolean boolean11 = mutableDateTime1.isBefore((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime1.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDate(17268551, (int) (byte) 0, (-8));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(2016, 9, (int) (byte) 0, 53, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime7 = property3.set("22", locale6);
        java.util.GregorianCalendar gregorianCalendar8 = mutableDateTime7.toGregorianCalendar();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate9.withDayOfYear((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        mutableDateTime2.addHours((int) 'u');
        mutableDateTime2.setMillis(35L);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDateTime((int) (byte) 1, 0, (int) (short) 10, 4, 52, 457071, 54353559);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 457071 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Collection<java.util.Locale> localeCollection1 = null;
        java.util.Locale.FilteringMode filteringMode2 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList3 = java.util.Locale.filter(languageRangeList0, localeCollection1, filteringMode2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + filteringMode2 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode2.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setUnicodeLocaleKeyword("en", "february 21, 2022_FEBRUARY 21, 2022");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: february 21, 2022_FEBRUARY 21, 2022 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.addHours(100);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDate(45, 43, 1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 43 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendPattern("Dec 29, 1969");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plus(readableDuration4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, 100);
        int int9 = localDateTime5.getMonthOfYear();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime5.withFieldAdded(durationFieldType10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (byte) 0, 0, (int) 'a', 206, 54353559, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 206 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.addUnicodeLocaleAttribute("\u82f1\u8a9e\u30ab\u30ca\u30c0)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localTime4.toString("3:05 PM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        long long9 = dateTimeField6.add((-259199980L), (int) (short) 1);
        boolean boolean10 = dateTimeField6.isSupported();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = builder12.build();
        java.lang.String str15 = dateTimeField6.getAsText(10, locale14);
        java.lang.Object obj16 = locale14.clone();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-259199979L) + "'", long9 == (-259199979L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        java.lang.String str4 = dateTimeZone2.getShortName((long) (byte) 0);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.joda.time.DateTime dateTime10 = dateTime8.minusYears(2);
        int int11 = dateTime10.getDayOfMonth();
        org.joda.time.DateTime.Property property12 = dateTime10.year();
        org.joda.time.LocalDateTime localDateTime13 = dateTime10.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minus(readableDuration14);
        int int16 = localDateTime15.size();
        boolean boolean17 = dateTimeZone2.equals((java.lang.Object) int16);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+05:23" + "'", str4, "+05:23");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate11 = localDate9.withDayOfWeek((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate11.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("0:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"0:00\" is malformed at \":00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plus(readableDuration4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withDate(2023, 54, (-101));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone2);
        timeZone0.setRawOffset((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeZone0.getDisplayName(true, 41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 41");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(24, 54345623, 48, 46, 21, 54353);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.io.IOException iOException1 = new java.io.IOException("UTC");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = dateTime3.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime3.getZone();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a', chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfEven();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime17 = property13.set("22", locale16);
        mutableDateTime17.addYears(10);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.DateTime dateTime23 = property22.withMinimumValue();
        org.joda.time.DateTime dateTime25 = dateTime23.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime27 = dateTime23.plusMillis(1);
        mutableDateTime17.setDate((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime17.add(readablePeriod29, (int) 'u');
        mutableDateTime17.setYear(99);
        java.util.Date date34 = mutableDateTime17.toDate();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime17.millisOfSecond();
        int int36 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) mutableDateTime17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((java.lang.Object) iOException1, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.io.IOException");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Sat Feb 23 00:00:00 GMT 99");
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime3.weekOfWeekyear();
        boolean boolean7 = property6.isLeap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = property6.setCopy("0");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) '#', (int) '4', 46, 48, 1998, 20, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime5 = localTime2.withFieldAdded(durationFieldType3, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime2.withHourOfDay((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendCenturyOfEra(22, 41);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendTimeZoneName(strMap13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendTwoDigitWeekyear(70, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder14.appendFractionOfDay(2022, 23);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder14.appendFractionOfSecond(5, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder14.appendSecondOfMinute((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        boolean boolean4 = localTime2.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.plus(readablePeriod5);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.dayOfYear();
        boolean boolean9 = dateTimeField8.isLenient();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plus(readableDuration13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfWeek();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.era();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.hourOfDay();
        int int22 = localDateTime20.getYearOfCentury();
        int[] intArray23 = localDateTime20.getValues();
        java.util.Locale locale25 = java.util.Locale.ROOT;
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.util.Locale locale27 = locale26.stripExtensions();
        java.util.Locale locale28 = java.util.Locale.ROOT;
        java.lang.String str29 = locale27.getDisplayVariant(locale28);
        java.lang.String str30 = locale25.getDisplayCountry(locale27);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = dateTimeField8.set((org.joda.time.ReadablePartial) localDateTime14, (-1), intArray23, "1", locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 70 + "'", int22 == 70);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        java.lang.String str4 = property3.getName();
        org.joda.time.LocalTime localTime5 = property3.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property3.addNoWrapToCopy(54341);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hourOfDay" + "'", str4, "hourOfDay");
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 'a', chronology3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfEven();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime9 = property5.set("22", locale8);
        mutableDateTime9.addYears(10);
        int int14 = dateTimeFormatter1.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime9, "seconds", (int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter1.withPivotYear((java.lang.Integer) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.parse("3:05 PM", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"3:05 PM\" is malformed at \":05 PM\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfMinute();
        java.lang.String str1 = dateTimeFieldType0.toString();
        java.lang.Class<?> wildcardClass2 = dateTimeFieldType0.getClass();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "secondOfMinute" + "'", str1, "secondOfMinute");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDate();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = dateTime3.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone7);
        long long11 = dateTimeZone7.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 'a', dateTimeZone7);
        org.joda.time.DateTime dateTime13 = dateTime12.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.minusYears(2);
        org.joda.time.DateTime dateTime21 = dateTime17.withWeekyear(21);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMillis(40);
        int int24 = dateTime12.compareTo((org.joda.time.ReadableInstant) dateTime21);
        java.lang.String str25 = dateTimeFormatter0.print((org.joda.time.ReadableInstant) dateTime21);
        java.io.Writer writer26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.yearOfCentury();
        org.joda.time.DateTime dateTime30 = property29.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime32 = property29.addWrapFieldToCopy(20);
        org.joda.time.DateTime dateTime33 = property29.roundHalfEvenCopy();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime36 = dateTime33.withDayOfMonth(4);
        int int37 = dateTime33.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer26, (org.joda.time.ReadableInstant) dateTime33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0021/02/22" + "'", str25, "0021/02/22");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("United States");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: United States");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withWeekOfWeekyear(10);
        int int4 = localDateTime0.getWeekyear();
        org.joda.time.Chronology chronology5 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.millis();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.minuteOfHour();
        java.lang.String str8 = dateTimeField7.getName();
        long long11 = dateTimeField7.add((long) 54348, 3);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "minuteOfHour" + "'", str8, "minuteOfHour");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 234348L + "'", long11 == 234348L);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Thursday");
        java.util.TimeZone timeZone2 = null;
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("Thursday");
        java.time.ZoneId zoneId6 = timeZone5.toZoneId();
        boolean boolean7 = timeZone1.hasSameRules(timeZone5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        int int14 = mutableDateTime10.getDayOfYear();
        java.util.Date date15 = mutableDateTime10.toDate();
        boolean boolean16 = timeZone5.inDaylightTime(date15);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 02 00:00:00 GMT 1969");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime7 = property6.roundHalfEvenCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.shortDateTime();
        java.lang.String str9 = localTime7.toString(dateTimeFormatter8);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = dateTimeFormatter8.getPrinter();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology13);
        boolean boolean16 = localTime14.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime18 = localTime14.plus(readablePeriod17);
        org.joda.time.LocalTime.Property property19 = localTime14.secondOfMinute();
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.util.Locale locale21 = locale20.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter10.printTo(stringBuffer11, (org.joda.time.ReadablePartial) localTime14, locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0:00" + "'", str9, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0:00");
        org.junit.Assert.assertNotNull(dateTimePrinter10);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate localDate8 = localDate0.minusWeeks(21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate0.withDayOfMonth(66);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 66 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray2 = strSet1.toArray();
        java.lang.String[] strArray39 = new java.lang.String[] { "\ufffd\ufffd\ufffd\ufffd 12:00 AM", "UTC", "0", "1/1/32 12:00 AM", "12:00 AM", "English (Canada)", "DateTimeField[millisOfDay]", "0001-01-03T23:59:59.001", "12:00:00 AM +00:00", "en", "22", "secondOfDay", "2022-02-21T15:05:40.918", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", "0001-01-03T23:59:59.001", "Thursday", "secondOfDay", "1/1/32 12:00 AM", "\ud55c\uad6d\uc5b4", "4", "en_CA", "DateTimeField[millisOfDay]", "en_CA", "Jan", "Dec 29, 1969", "", "12:00 AM", "2022-02-21T15:05:37.737Z", "0", "English (Canada)", "100", "secondOfDay", "100", "Property[dayOfMonth]", "4", "1/1/70 12:00 AM" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        java.lang.Object obj42 = null;
        boolean boolean43 = strSet40.remove(obj42);
        java.lang.Throwable throwable46 = null;
        java.io.IOException iOException47 = new java.io.IOException("22", throwable46);
        java.io.IOException iOException48 = new java.io.IOException("English (Canada)", (java.lang.Throwable) iOException47);
        java.lang.Throwable[] throwableArray49 = iOException47.getSuppressed();
        boolean boolean50 = strSet40.remove((java.lang.Object) iOException47);
        boolean boolean51 = strSet1.removeAll((java.util.Collection<java.lang.String>) strSet40);
        java.util.Collection<java.lang.String> strCollection52 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = strSet1.containsAll(strCollection52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime3.withTime(2000, 31, 44, 46);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime6 = dateTime5.toDateTimeISO();
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfDay();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology5);
        org.joda.time.DurationField durationField8 = chronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.dayOfMonth();
        long long12 = dateTimeField9.add((long) (short) 10, 21);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1814400010L + "'", long12 == 1814400010L);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        mutableDateTime2.addWeekyears((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDayOfMonth(39955351);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39955351 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(1);
        org.joda.time.LocalDate.Property property8 = localDate2.yearOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = org.joda.time.format.DateTimeFormat.fullTime();
        java.lang.String str10 = localDate2.toString(dateTimeFormatter9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = dateTimeFormatter9.parseLocalDate("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"??/??/?? 0:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ufffd\u6642\ufffd\ufffd\u5206\ufffd\ufffd\u79d2 " + "'", str10, "\ufffd\u6642\ufffd\ufffd\u5206\ufffd\ufffd\u79d2 ");
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendMillisOfSecond(20);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendText(dateTimeFieldType10);
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.append(dateTimeParser13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No parser supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 'a', chronology3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfEven();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime9 = property5.set("22", locale8);
        mutableDateTime9.addYears(10);
        int int14 = dateTimeFormatter1.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime9, "seconds", (int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter1.withPivotYear((java.lang.Integer) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.parse("0", dateTimeFormatter16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"0\" is too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English (Canada)" + "'", str4, "English (Canada)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.longDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("+05:23", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+05:23\" is malformed at \":23\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendCenturyOfEra(22, 41);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendTimeZoneName(strMap13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendTwoDigitWeekyear(70, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder14.appendFractionOfDay(2022, 23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendPattern("Saturday");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 457071);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int7 = localTime3.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = localTime3.getChronology();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology8, locale9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) 457071, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = builder0.build();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.plus(readablePeriod8);
        org.joda.time.DateTime.Property property10 = dateTime9.millisOfDay();
        org.joda.time.DurationField durationField11 = property10.getDurationField();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        long long15 = dateTimeField12.add((-259199980L), (int) (short) 1);
        boolean boolean16 = dateTimeField12.isSupported();
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale locale19 = builder18.build();
        java.util.Locale locale20 = builder18.build();
        java.lang.String str21 = dateTimeField12.getAsText(10, locale20);
        java.util.Locale.Builder builder22 = builder0.setLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder0.setLanguageTag("centuries");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: centuries [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-259199979L) + "'", long15 == (-259199979L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        java.lang.String str8 = dateTimeFieldType3.toString();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime11 = localTime9.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int13 = localTime9.get(dateTimeFieldType12);
        org.joda.time.Chronology chronology14 = localTime9.getChronology();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.now(chronology14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology14.add(readablePeriod16, 4460736516L, (int) (short) -1);
        org.joda.time.DurationField durationField20 = chronology14.minutes();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField22 = chronology14.millisOfDay();
        java.lang.String str23 = chronology14.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) str8, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"millisOfDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "millisOfDay" + "'", str8, "millisOfDay");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4460736516L + "'", long19 == 4460736516L);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ISOChronology[UTC]" + "'", str23, "ISOChronology[UTC]");
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.minusYears(0);
        org.joda.time.DateTime dateTime6 = dateTime1.withSecondOfMinute(0);
        org.joda.time.DateTime.Property property7 = dateTime1.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = property7.setCopy("Chinese");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Chinese\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        java.util.Locale locale11 = new java.util.Locale("", "seconds");
        java.lang.String str12 = localDateTime6.toString("22", locale11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime6.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime6.withHourOfDay((-101));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -101 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals(locale11.toString(), "_SECONDS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "22" + "'", str12, "22");
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plus(readableDuration3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.era();
        int int7 = localDateTime4.getYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property10.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime13 = property10.addWrapFieldToCopy(20);
        org.joda.time.DateTime dateTime14 = property10.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateTime.Property property16 = dateTime14.property(dateTimeFieldType15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime4.withField(dateTimeFieldType15, 23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withTime((int) (short) -1, 54352, 152, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        int int3 = dateTime1.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime5 = dateTime1.plusSeconds((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.longDate();
        java.lang.String str7 = dateTime5.toString(dateTimeFormatter6);
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable8, (long) 55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022/02/21" + "'", str7, "2022/02/21");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) 2023);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) strArray0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: [Ljava.lang.String;");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        boolean boolean4 = localTime2.equals((java.lang.Object) 10L);
        org.joda.time.LocalTime localTime6 = localTime2.plusMinutes((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localTime2.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (short) 100);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.add((long) 86399999);
        mutableDateTime8.addMonths((-101));
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime8.setHourOfDay(31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        long long17 = mutableDateTime10.getMillis();
        mutableDateTime10.addHours(99);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime10.setMillisOfSecond(54353);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54353 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-62166787199903L) + "'", long17 == (-62166787199903L));
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        int int14 = mutableDateTime10.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime10.toMutableDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDate7.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.secondOfMinute();
        java.lang.String str19 = dateTimeFieldType18.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = localDate7.withField(dateTimeFieldType18, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "secondOfMinute" + "'", str19, "secondOfMinute");
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.weeks();
        boolean boolean3 = localDate0.isSupported(durationFieldType2);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate0.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateMidnight4);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        org.joda.time.DateTime dateTime7 = dateTime3.withWeekyear(21);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.withPeriodAdded(readablePeriod9, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.withDayOfYear(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours((int) ' ');
        org.joda.time.LocalDate localDate6 = dateTime5.toLocalDate();
        org.joda.time.DateTime.Property property7 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime8 = property7.roundHalfFloorCopy();
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        boolean boolean11 = locale10.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property7.setCopy("February 21, 2022", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"February 21, 2022\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.joda.time.DateTime dateTime10 = dateTime8.minusYears(2);
        int int11 = dateTime10.getDayOfMonth();
        org.joda.time.DateTime.Property property12 = dateTime10.year();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime10.getZone();
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.lang.String str16 = dateTimeZone13.getName((long) 43, locale15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(2016, 22, 54353559, 55, 1998, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 55 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Thursday");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        java.lang.String str4 = timeZone3.getID();
        boolean boolean5 = timeZone3.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GMT" + "'", str4, "GMT");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime4 = localTime1.withField(dateTimeFieldType2, (int) '#');
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTime dateTime9 = localTime1.toDateTimeToday(dateTimeZone8);
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.lang.String str12 = dateTimeZone8.getName((long) 7, locale11);
        java.lang.Object obj13 = locale11.clone();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "zh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "zh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "zh");
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) '#');
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate6 = localDate4.plusYears((int) '#');
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 'a', chronology8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.yearOfCentury();
        mutableDateTime9.setMillisOfDay((int) 'a');
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime9.add(readableDuration13, 8);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.minuteOfHour();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.minus(readableDuration20);
        org.joda.time.DateTime dateTime24 = dateTime21.withDurationAdded((long) 99, (int) (short) 0);
        int int25 = dateTime24.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withCenturyOfEra((int) ' ');
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTime.Property property32 = dateTime31.yearOfCentury();
        org.joda.time.DateTime dateTime33 = property32.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime35 = property32.addWrapFieldToCopy(20);
        org.joda.time.DateTime dateTime36 = property32.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateTime.Property property38 = dateTime36.property(dateTimeFieldType37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime29.withField(dateTimeFieldType37, 457071);
        org.joda.time.DateTime dateTime42 = dateTime24.withField(dateTimeFieldType37, (int) (short) 1);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime9.property(dateTimeFieldType37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property44 = localDate4.property(dateTimeFieldType37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.property(dateTimeFieldType6);
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundFloor();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime11 = property7.set("hi!");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology5.getDateTimeMillis(4, (int) 'a', (-1), 100, (-54353560), 39955351, 31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ISOChronology[UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (short) 0);
        org.joda.time.LocalDate localDate3 = localDate1.plusYears((int) 'x');
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate1.plus(readablePeriod4);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, 21);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int11 = localTime7.get(dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = localTime7.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology12);
        int int15 = mutableDateTime14.getSecondOfMinute();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean19 = localTime17.isSupported(dateTimeFieldType18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.property(dateTimeFieldType18);
        int int21 = mutableDateTime14.getMonthOfYear();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime24 = localTime22.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int26 = localTime22.get(dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = localTime22.getChronology();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.now(chronology27);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology27);
        mutableDateTime14.setChronology(chronology27);
        mutableDateTime2.setChronology(chronology27);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 58 + "'", int15 == 58);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localTime28);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime7 = property3.set("22", locale6);
        mutableDateTime7.addYears(10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.DateTime dateTime13 = property12.withMinimumValue();
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime17 = dateTime13.plusMillis(1);
        mutableDateTime7.setDate((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime7.add(readablePeriod19, (int) (short) 0);
        org.joda.time.Chronology chronology22 = mutableDateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfYear();
        long long26 = dateTimeField23.add(1L, 52);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology28);
        boolean boolean31 = localTime29.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime33 = localTime29.plus(readablePeriod32);
        java.util.Locale locale37 = new java.util.Locale("February 21, 2022", "February 21, 2022");
        java.lang.String str38 = dateTimeField23.getAsText((org.joda.time.ReadablePartial) localTime33, 99, locale37);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = localTime33.getValue(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 4492800001L + "'", long26 == 4492800001L);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertEquals(locale37.toString(), "february 21, 2022_FEBRUARY 21, 2022");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "99" + "'", str38, "99");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime5 = property4.withMinimumValue();
        org.joda.time.DateTime dateTime7 = dateTime5.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime9 = dateTime5.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str13 = dateTimeZone10.getName((long) 457071, locale12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(4492800001L, dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) (short) 1, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Feb 21, 2022", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=feb21");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology5.add(readablePeriod7, 4460736516L, (int) (short) -1);
        org.joda.time.DurationField durationField11 = chronology5.minutes();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial14 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.plus(readablePeriod18);
        org.joda.time.DateTime.Property property20 = dateTime19.millisOfDay();
        org.joda.time.DurationField durationField21 = property20.getDurationField();
        org.joda.time.DateTimeField dateTimeField22 = property20.getField();
        long long25 = dateTimeField22.add((-259199980L), (int) (short) 1);
        java.lang.String str26 = dateTimeField22.toString();
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        int int28 = dateTimeField22.getMaximumShortTextLength(locale27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withWeekOfWeekyear(10);
        int int33 = localDateTime29.getWeekyear();
        org.joda.time.Chronology chronology34 = localDateTime29.getChronology();
        int[] intArray37 = new int[] { 2 };
        int[] intArray39 = dateTimeField22.add((org.joda.time.ReadablePartial) localDateTime29, 5, intArray37, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray41 = dateTimeField13.set(readablePartial14, 54352, intArray39, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54352");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4460736516L + "'", long10 == 4460736516L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-259199979L) + "'", long25 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateTimeField[millisOfDay]" + "'", str26, "DateTimeField[millisOfDay]");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2022 + "'", int33 == 2022);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[2]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[2]");
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("5", (double) 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=25.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        org.joda.time.DateTime dateTime7 = dateTime3.withWeekyear(21);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.withPeriodAdded(readablePeriod9, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime7.withMonthOfYear(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        long long9 = dateTimeField6.add((-259199980L), (int) (short) 1);
        java.lang.String str10 = dateTimeField6.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeField6.set((long) 1, "2022-02-21T15:05:41.396Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T15:05:41.396Z\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-259199979L) + "'", long9 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateTimeField[millisOfDay]" + "'", str10, "DateTimeField[millisOfDay]");
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime7 = property3.set("22", locale6);
        mutableDateTime7.addYears(10);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime7.setDayOfYear(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime7);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        int int3 = dateTime1.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime5 = dateTime1.plusSeconds((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime1.withMillisOfSecond((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter0.withChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField10 = chronology6.weekyearOfCentury();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtStartOfDay(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getNameKey(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) dateTimeField10, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.field.RemainderDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 23);
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.DateTime dateTime7 = property6.withMinimumValue();
        org.joda.time.DateTime dateTime9 = dateTime7.minusYears(2);
        org.joda.time.DateTime dateTime11 = dateTime7.withWeekyear(21);
        org.joda.time.DateTime dateTime13 = dateTime7.minusMinutes((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.minus(readablePeriod14);
        java.util.Locale locale16 = java.util.Locale.US;
        java.util.Calendar calendar17 = dateTime13.toCalendar(locale16);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer3, (org.joda.time.ReadableInstant) dateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=951139558419,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2000,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=1,HOUR_OF_DAY=13,MINUTE=25,SECOND=58,MILLISECOND=419,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(10L);
        org.joda.time.DateTime dateTime2 = dateTime1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int11 = localTime7.get(dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = localTime7.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology12);
        org.joda.time.DurationField durationField14 = chronology12.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter6.withChronology(chronology12);
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology12, locale16, (java.lang.Integer) 70, 41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = property3.setCopy("\ud55c\uad6d\uc5b4", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"????????\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withDefaultYear(21);
        java.lang.Appendable appendable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable3, 4492800001L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekyear();
        int int9 = mutableDateTime2.getMinuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDayOfYear(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.secondOfDay();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime17 = localTime14.withField(dateTimeFieldType15, (int) '#');
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTime dateTime22 = localTime14.toDateTimeToday(dateTimeZone21);
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.lang.String str25 = dateTimeZone21.getName((long) 7, locale24);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = dateTimeField10.set((-1L), "", locale24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        int int3 = localDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean5 = localDateTime2.isSupported(dateTimeFieldType4);
        int int6 = localDateTime2.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDateTime2.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "en");
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("millisOfSecond");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"millisOfSecond\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) '4', 54341, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.property(dateTimeFieldType6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.plus(readablePeriod11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DurationField durationField14 = property13.getDurationField();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        long long18 = dateTimeField15.add((-259199980L), (int) (short) 1);
        boolean boolean19 = dateTimeField15.isSupported();
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.ROOT;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.lang.String str24 = locale21.getDisplayName();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.plus(readablePeriod27);
        org.joda.time.DateTime.Property property29 = dateTime28.millisOfDay();
        org.joda.time.DurationField durationField30 = property29.getDurationField();
        org.joda.time.DateTimeField dateTimeField31 = property29.getField();
        long long34 = dateTimeField31.add((-259199980L), (int) (short) 1);
        boolean boolean35 = dateTimeField31.isSupported();
        java.util.Locale.Builder builder37 = new java.util.Locale.Builder();
        java.util.Locale locale38 = builder37.build();
        java.util.Locale locale39 = builder37.build();
        java.lang.String str40 = dateTimeField31.getAsText(10, locale39);
        java.lang.String str41 = locale21.getDisplayCountry(locale39);
        int int42 = dateTimeField15.getMaximumShortTextLength(locale39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime43 = property7.set("German", locale39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"German\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-259199979L) + "'", long18 == (-259199979L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "English (Canada)" + "'", str24, "English (Canada)");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-259199979L) + "'", long34 == (-259199979L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "10" + "'", str40, "10");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Canada" + "'", str41, "Canada");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime5 = property3.set("hourOfDay");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hourOfDay\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 'a', chronology8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.yearOfCentury();
        mutableDateTime9.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology13 = null;
        mutableDateTime9.setChronology(chronology13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 'a', chronology16);
        mutableDateTime17.addWeekyears((int) (byte) -1);
        int int20 = mutableDateTime17.getDayOfMonth();
        mutableDateTime17.setWeekyear((int) (short) 0);
        boolean boolean23 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime27 = localTime25.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int29 = localTime25.get(dateTimeFieldType28);
        org.joda.time.Chronology chronology30 = localTime25.getChronology();
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology30, locale31);
        org.joda.time.Chronology chronology33 = dateTimeParserBucket32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.secondOfDay();
        org.joda.time.DurationField durationField35 = chronology33.halfdays();
        mutableDateTime9.setChronology(chronology33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(70, 5, 54348, (int) (byte) 100, 2, 0, (int) (short) 0, chronology33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
        boolean boolean4 = strSet1.remove((java.lang.Object) mutableDateTime3);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder5.setExtension('a', "");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder9.setExtension('a', "");
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder[] builderArray14 = new java.util.Locale.Builder[] { builder5, builder12, builder13 };
        java.util.Locale.Builder[] builderArray15 = strSet1.toArray(builderArray14);
        java.util.stream.Stream<java.lang.String> strStream16 = strSet1.parallelStream();
        java.lang.String[] strArray60 = new java.lang.String[] { "Dec 29, 1969", "00:00:00.097", "2022/02/21", "Chinese", "utc", "DateTimeField[millisOfDay]", "2023-01-01T00:00:00.000Z", "97", "5", "Thursday", "1998", "Greenwich Mean Time", "2022-02-21", "\ub144\uc6d4\uc77c\ubaa9\uc694\uc77c\uc624\uc804\uc2dc\ubd84\ucd08 +00:00", "1970-01-01T00:00:00.097Z", "Dec 29, 1969", "1969/12/29", "GMT+00:00", "12:00 AM", "java.io.IOException: English (Canada)", "1970-01-01T00:00:00.097Z", "United States", "UTC", "5", "United States", "Thursday", "GMT", "Property[hourOfDay]", "\ufffd\ufffd\ufffd\ufffd 12:00 AM", "GMT", "zh_CN", "GMT", "seconds", "millisOfDay", "GMT+00:00", "zh-TW", "2022-02-21", "+00:00", "1/1/70 12:00 AM", "CAN", "99", "2023-01-01T00:00:00.000Z", "millisOfDay" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = strSet1.addAll((java.util.Collection<java.lang.String>) strList61);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builderArray14);
        org.junit.Assert.assertNotNull(builderArray15);
        org.junit.Assert.assertNotNull(strStream16);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withWeekOfWeekyear(10);
        int int9 = localDateTime5.getWeekyear();
        org.joda.time.Chronology chronology10 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.millis();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.minuteOfHour();
        org.joda.time.DurationField durationField13 = chronology10.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(20, 2023, 58, (int) (byte) 10, 48, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2023 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime2.add(readableDuration6, 8);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.weekOfWeekyear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime11.add(readablePeriod12);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int17 = localTime15.indexOf(dateTimeFieldType16);
        boolean boolean18 = mutableDateTime2.isSupported(dateTimeFieldType16);
        mutableDateTime2.addSeconds(40);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime2.add(readableDuration21, 54341029);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setTime(2067, 23, 2000, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2067 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale6 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.removeUnicodeLocaleAttribute("\u6642\u5206\u79d2 +00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 0?00?00? +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate10 = property7.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.Interval interval11 = property7.toInterval();
        org.joda.time.LocalDate localDate12 = property7.getLocalDate();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 'a', chronology14);
        mutableDateTime15.addWeekyears((int) (byte) -1);
        int int18 = mutableDateTime15.getDayOfMonth();
        int int19 = mutableDateTime15.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime15.toMutableDateTime(dateTimeZone20);
        long long25 = dateTimeZone20.convertLocalToUTC((long) (byte) 0, true, 5050L);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.plus(readablePeriod29);
        org.joda.time.DateTime.Property property31 = dateTime30.millisOfDay();
        org.joda.time.DurationField durationField32 = property31.getDurationField();
        org.joda.time.DateTimeField dateTimeField33 = property31.getField();
        long long36 = dateTimeField33.add((-259199980L), (int) (short) 1);
        boolean boolean37 = dateTimeField33.isSupported();
        java.util.Locale locale38 = java.util.Locale.CANADA;
        java.util.Locale locale39 = locale38.stripExtensions();
        java.util.Locale locale40 = java.util.Locale.ROOT;
        java.lang.String str41 = locale39.getDisplayVariant(locale40);
        java.lang.String str42 = locale39.getDisplayName();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(chronology43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.plus(readablePeriod45);
        org.joda.time.DateTime.Property property47 = dateTime46.millisOfDay();
        org.joda.time.DurationField durationField48 = property47.getDurationField();
        org.joda.time.DateTimeField dateTimeField49 = property47.getField();
        long long52 = dateTimeField49.add((-259199980L), (int) (short) 1);
        boolean boolean53 = dateTimeField49.isSupported();
        java.util.Locale.Builder builder55 = new java.util.Locale.Builder();
        java.util.Locale locale56 = builder55.build();
        java.util.Locale locale57 = builder55.build();
        java.lang.String str58 = dateTimeField49.getAsText(10, locale57);
        java.lang.String str59 = locale39.getDisplayCountry(locale57);
        int int60 = dateTimeField33.getMaximumShortTextLength(locale57);
        java.lang.String str61 = dateTimeZone20.getShortName(47041L, locale57);
        int int62 = property7.getMaximumTextLength(locale57);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.UTC;
        long long66 = dateTimeZone63.getMillisKeepLocal(dateTimeZone64, (long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone63);
        org.joda.time.LocalTime localTime69 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime71 = localTime69.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int73 = localTime69.get(dateTimeFieldType72);
        org.joda.time.Chronology chronology74 = localTime69.getChronology();
        java.util.Locale locale75 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology74, locale75);
        org.joda.time.DateTimeZone dateTimeZone77 = chronology74.getZone();
        org.joda.time.DateTimeField dateTimeField78 = chronology74.dayOfWeek();
        boolean boolean79 = dateTimeZone63.equals((java.lang.Object) dateTimeField78);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime80 = new org.joda.time.LocalTime((java.lang.Object) int62, dateTimeZone63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-259199979L) + "'", long36 == (-259199979L));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "English (Canada)" + "'", str42, "English (Canada)");
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-259199979L) + "'", long52 == (-259199979L));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "10" + "'", str58, "10");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Canada" + "'", str59, "Canada");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 8 + "'", int60 == 8);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+00:00" + "'", str61, "+00:00");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 9 + "'", int62 == 9);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 35L + "'", long66 == 35L);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(dateTimeFieldType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.plusHours((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.DateTime dateTime9 = property8.withMaximumValue();
        int int10 = dateTime9.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime9.withField(dateTimeFieldType11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2000 + "'", int10 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(4460757261L);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.withMaximumValue();
        org.joda.time.LocalTime localTime5 = property3.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property3.getAsShortText(locale6);
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = property3.setCopy("45", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 45 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.Chronology chronology6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) 'x', 41, 0, 66, (int) (byte) 1, 52, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 66 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        java.util.Locale locale11 = new java.util.Locale("", "seconds");
        java.lang.String str12 = localDateTime6.toString("22", locale11);
        int int13 = localDateTime6.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime6.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime6.withTime(1998, 44, 58, 31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1998 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals(locale11.toString(), "_SECONDS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "22" + "'", str12, "22");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 86399001 + "'", int13 == 86399001);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale10 = dateTimeParserBucket8.getLocale();
        dateTimeParserBucket8.setOffset((java.lang.Integer) 8);
        long long14 = dateTimeParserBucket8.computeMillis(true);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 44L + "'", long14 == 44L);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("100", "en");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 100 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime5 = property2.addWrapFieldToCopy(20);
        long long6 = property2.remainder();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) property2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4460759857L + "'", long6 == 4460759857L);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = builder0.build();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.plus(readablePeriod8);
        org.joda.time.DateTime.Property property10 = dateTime9.millisOfDay();
        org.joda.time.DurationField durationField11 = property10.getDurationField();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        long long15 = dateTimeField12.add((-259199980L), (int) (short) 1);
        boolean boolean16 = dateTimeField12.isSupported();
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale locale19 = builder18.build();
        java.util.Locale locale20 = builder18.build();
        java.lang.String str21 = dateTimeField12.getAsText(10, locale20);
        java.util.Locale.Builder builder22 = builder0.setLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder22.setUnicodeLocaleKeyword("2000-02-21T15:05:58.434Z", "GMT+00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 2000-02-21T15:05:58.434Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-259199979L) + "'", long15 == (-259199979L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Thursday");
        boolean boolean2 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime8 = localTime6.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int10 = localTime6.get(dateTimeFieldType9);
        org.joda.time.Chronology chronology11 = localTime6.getChronology();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology11, locale12);
        org.joda.time.DateTimeField dateTimeField14 = chronology11.year();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        long long18 = dateTimeZone15.getMillisKeepLocal(dateTimeZone16, (long) '#');
        java.lang.String str19 = dateTimeZone16.getID();
        int int21 = dateTimeZone16.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology22 = chronology11.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.hourOfDay();
        org.joda.time.DurationField durationField24 = chronology22.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(6, 0, 6, (-101), (int) 'a', chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -101 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology4);
        boolean boolean6 = localTime2.isBefore((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localTime2.toString("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        int int3 = localDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean5 = localDateTime2.isSupported(dateTimeFieldType4);
        int int6 = localDateTime2.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusDays((int) 'a');
        org.joda.time.LocalDateTime.Property property9 = localDateTime2.era();
        java.util.Locale locale11 = java.util.Locale.TAIWAN;
        java.util.Locale locale15 = new java.util.Locale("", "4", "4");
        java.lang.String str16 = locale11.getDisplayScript(locale15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = property9.setCopy("", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale15.toString(), "_4_4");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime7 = property6.roundHalfEvenCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.shortDateTime();
        java.lang.String str9 = localTime7.toString(dateTimeFormatter8);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = dateTimeFormatter8.getPrinter();
        java.io.Writer writer11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withWeekOfWeekyear(10);
        int int16 = localDateTime12.getWeekyear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withYear(2000);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        java.util.Locale locale21 = java.util.Locale.ROOT;
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.util.Locale locale23 = locale22.stripExtensions();
        java.util.Locale locale24 = java.util.Locale.ROOT;
        java.lang.String str25 = locale23.getDisplayVariant(locale24);
        java.lang.String str26 = locale21.getDisplayCountry(locale23);
        java.lang.String str27 = locale21.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter10.printTo(writer11, (org.joda.time.ReadablePartial) localDateTime20, locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0:00" + "'", str9, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0:00");
        org.junit.Assert.assertNotNull(dateTimePrinter10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.LocalDate localDate4 = localDate2.minusDays((int) 'a');
        org.joda.time.LocalDate.Property property5 = localDate2.era();
        org.joda.time.LocalDate localDate6 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate7 = property5.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField8 = property5.getField();
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.util.Locale locale13 = new java.util.Locale("", "4", "4");
        java.lang.String str14 = locale9.getDisplayScript(locale13);
        int int15 = dateTimeField8.getMaximumShortTextLength(locale9);
        int int17 = dateTimeField8.get((long) 54345623);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale13.toString(), "_4_4");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Japanese (Japan)", (double) 4460757261L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=4.460757261E9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate0.minus(readablePeriod3);
        int int5 = localDate4.getYear();
        org.joda.time.LocalDate localDate7 = localDate4.plusWeeks(10);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        boolean boolean12 = timeZone8.hasSameRules(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone.setDefault(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTime dateTime16 = localDate4.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusWeeks((int) (byte) -1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        int int3 = localDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean5 = localDateTime2.isSupported(dateTimeFieldType4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.yearOfCentury();
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder10.setExtension('a', "");
        java.util.Locale.Builder builder14 = builder10.clear();
        java.util.Locale locale15 = builder10.build();
        java.lang.String str16 = locale15.getScript();
        int int17 = dateTimeField9.getMaximumTextLength(locale15);
        java.lang.String str18 = locale15.getCountry();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate21 = localDate19.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime23 = localDate19.toDateTimeAtStartOfDay(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((java.lang.Object) locale15, dateTimeZone22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology7);
        boolean boolean10 = localTime8.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime8.plus(readablePeriod11);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekOfWeekyear();
        org.joda.time.DurationField durationField15 = chronology13.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(45, 44, 2016, 42, (-54353560), 978, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendMillisOfSecond(20);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendText(dateTimeFieldType10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendTimeZoneShortName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder9.appendMinuteOfDay((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setExtension('x', "2022/02/21");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: 2022/02/21 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendYearOfEra(39, (int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder0.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendTwoDigitYear(1969);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withMillisOfSecond(1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.plus(readablePeriod8);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder11.setExtension('a', "");
        java.util.Locale.Builder builder15 = builder11.clear();
        java.util.Locale locale16 = builder11.build();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.plus(readablePeriod19);
        org.joda.time.DateTime.Property property21 = dateTime20.millisOfDay();
        org.joda.time.DurationField durationField22 = property21.getDurationField();
        org.joda.time.DateTimeField dateTimeField23 = property21.getField();
        long long26 = dateTimeField23.add((-259199980L), (int) (short) 1);
        boolean boolean27 = dateTimeField23.isSupported();
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale locale30 = builder29.build();
        java.util.Locale locale31 = builder29.build();
        java.lang.String str32 = dateTimeField23.getAsText(10, locale31);
        java.util.Locale.Builder builder33 = builder11.setLocale(locale31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = localDateTime9.toString("Feb 21, 2022", locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: F");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-259199979L) + "'", long26 == (-259199979L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10" + "'", str32, "10");
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekyear();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean14 = localTime12.isSupported(dateTimeFieldType13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder10.appendSignedDecimal(dateTimeFieldType13, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder10.appendMillisOfSecond(20);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendText(dateTimeFieldType20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = localTime9.withField(dateTimeFieldType20, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        int int6 = dateTime5.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime5.withHourOfDay(53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((-101), 58, 99, 0, 2016, 57);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2016 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate10 = property7.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(0);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 'a', chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfWeek();
        org.joda.time.DateTime dateTime17 = mutableDateTime15.toDateTime();
        boolean boolean18 = localDate12.equals((java.lang.Object) mutableDateTime15);
        org.joda.time.LocalDate localDate20 = localDate12.plusYears(54348);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = localDate12.withYearOfCentury(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        int int3 = localDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean5 = localDateTime2.isSupported(dateTimeFieldType4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.yearOfCentury();
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a', chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfEven();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime17 = property13.set("22", locale16);
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime17.toGregorianCalendar();
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar18);
        org.joda.time.LocalDate localDate21 = localDate19.withYear(1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray22 = localDate19.getFieldTypes();
        int int23 = localDate19.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime24 = localDate19.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.plus(readablePeriod28);
        org.joda.time.DateTime.Property property30 = dateTime29.millisOfDay();
        org.joda.time.DurationField durationField31 = property30.getDurationField();
        org.joda.time.DateTimeField dateTimeField32 = property30.getField();
        long long35 = dateTimeField32.add((-259199980L), (int) (short) 1);
        java.lang.String str36 = dateTimeField32.toString();
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        int int38 = dateTimeField32.getMaximumShortTextLength(locale37);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withWeekOfWeekyear(10);
        int int43 = localDateTime39.getWeekyear();
        org.joda.time.Chronology chronology44 = localDateTime39.getChronology();
        int[] intArray47 = new int[] { 2 };
        int[] intArray49 = dateTimeField32.add((org.joda.time.ReadablePartial) localDateTime39, 5, intArray47, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray51 = dateTimeField9.add((org.joda.time.ReadablePartial) localDate19, 2067, intArray47, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2067");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(gregorianCalendar18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-259199979L) + "'", long35 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DateTimeField[millisOfDay]" + "'", str36, "DateTimeField[millisOfDay]");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 8 + "'", int38 == 8);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2022 + "'", int43 == 2022);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[2]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[2]");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime4 = localTime1.withField(dateTimeFieldType2, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        java.lang.String str7 = localTime4.toString(dateTimeFormatter5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone14);
        long long18 = dateTimeZone14.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 'a', dateTimeZone14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter5.withZone(dateTimeZone14);
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = dateTimeFormatter5.getPrinter();
        java.io.Writer writer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(writer22, (long) 86399001);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00" + "'", str7, "0:00");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimePrinter21);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        org.joda.time.DateTime.Property property5 = dateTime3.millisOfSecond();
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        long long7 = property6.remainder();
        org.joda.time.DateTime dateTime8 = property6.roundFloorCopy();
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 860L + "'", long7 == 860L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        int int3 = dateTime1.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime5 = dateTime1.plusSeconds((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.longDate();
        java.lang.String str7 = dateTime5.toString(dateTimeFormatter6);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter6.getParser();
        java.io.Writer writer9 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a', chronology11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime12.add(readableDuration13, 21);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(writer9, (org.joda.time.ReadableInstant) mutableDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022/02/21" + "'", str7, "2022/02/21");
        org.junit.Assert.assertNotNull(dateTimeParser8);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        long long9 = dateTimeField6.add((-259199980L), (int) (short) 1);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) (-259199980L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withHourOfDay(54353);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54353 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-259199979L) + "'", long9 == (-259199979L));
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2022-02-21T00:00:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-21t00:00:00.000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setExtension('4', "6");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.fullDateTime();
        boolean boolean2 = dateTimeFormatter1.isPrinter();
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = java.util.Locale.ROOT;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfEven();
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime15 = property11.set("22", locale14);
        java.lang.String str16 = locale7.getDisplayScript(locale14);
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.lang.String str18 = locale14.getDisplayLanguage(locale17);
        java.lang.String str19 = locale4.getDisplayCountry(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter1.withLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.parse("25", dateTimeFormatter20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"25\" is too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str18, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\uce90\ub098\ub2e4" + "'", str19, "\uce90\ub098\ub2e4");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withDayOfMonth(43);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 43 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate9 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime14 = localTime12.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int16 = localTime12.get(dateTimeFieldType15);
        org.joda.time.Chronology chronology17 = localTime12.getChronology();
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology17, locale18);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.year();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.plus(readablePeriod24);
        org.joda.time.DateTime.Property property26 = dateTime25.millisOfDay();
        org.joda.time.DurationField durationField27 = property26.getDurationField();
        org.joda.time.DateTimeField dateTimeField28 = property26.getField();
        long long31 = dateTimeField28.add((-259199980L), (int) (short) 1);
        java.lang.String str32 = dateTimeField28.toString();
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        int int34 = dateTimeField28.getMaximumShortTextLength(locale33);
        java.lang.String str35 = dateTimeField20.getAsText((long) 'a', locale33);
        java.util.Set<java.lang.Character> charSet36 = locale33.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = localDate9.toString("12:00:00 AM +00:00", locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: A");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-259199979L) + "'", long31 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "DateTimeField[millisOfDay]" + "'", str32, "DateTimeField[millisOfDay]");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970" + "'", str35, "1970");
        org.junit.Assert.assertNotNull(charSet36);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekyear();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime2);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime10.add(readableDuration11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.property(dateTimeFieldType13);
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        org.joda.time.DurationField durationField16 = property14.getDurationField();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime2.add(readableDuration6, 8);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.weekOfWeekyear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime11.add(readablePeriod12);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime11.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime11.setDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 'a', chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfEven();
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime8 = property4.set("22", locale7);
        mutableDateTime8.addYears(10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime14 = property13.withMinimumValue();
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis(1);
        mutableDateTime8.setDate((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime8.add(readablePeriod20, (int) 'u');
        mutableDateTime8.setYear(99);
        java.util.Date date25 = mutableDateTime8.toDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 'a', chronology28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundHalfEven();
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime34 = property30.set("22", locale33);
        mutableDateTime34.addYears(10);
        int int39 = dateTimeFormatter26.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime34, "12:00 AM", 7);
        java.lang.String str40 = mutableDateTime8.toString(dateTimeFormatter26);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) 'a', chronology42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime45 = property44.roundHalfEven();
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime48 = property44.set("22", locale47);
        mutableDateTime48.addYears(10);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(chronology51);
        org.joda.time.DateTime.Property property53 = dateTime52.yearOfCentury();
        org.joda.time.DateTime dateTime54 = property53.withMinimumValue();
        org.joda.time.DateTime dateTime56 = dateTime54.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime58 = dateTime54.plusMillis(1);
        mutableDateTime48.setDate((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime48.add(readablePeriod60, (int) (short) 0);
        org.joda.time.Chronology chronology63 = mutableDateTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.dayOfYear();
        java.util.Locale.Builder builder65 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder68 = builder65.setExtension('a', "");
        java.util.Locale.Builder builder69 = builder65.clear();
        java.util.Locale locale70 = builder65.build();
        java.lang.String str71 = locale70.getScript();
        int int72 = dateTimeField64.getMaximumShortTextLength(locale70);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = dateTimeFormatter26.withLocale(locale70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime74 = org.joda.time.DateTime.parse("2022-02-21T15:05:37.737Z", dateTimeFormatter73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T15:05:37.737Z\" is malformed at \"22-02-21T15:05:37.737Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Feb 23 00:00:00 GMT 99");
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-8) + "'", int39 == (-8));
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u6642\u5206\u79d2 +00:00" + "'", str40, "\u6642\u5206\u79d2 +00:00");
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 3 + "'", int72 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatter73);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology4);
        boolean boolean6 = localTime2.isBefore((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime localTime8 = localTime5.plusSeconds((int) (short) 1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 'a', chronology10);
        mutableDateTime11.addWeekyears((int) (byte) -1);
        boolean boolean14 = localTime5.equals((java.lang.Object) mutableDateTime11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField16 = localTime5.getField((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.withWeekyear(0);
        int int5 = dateTime4.getDayOfWeek();
        org.joda.time.DateTime.Property property6 = dateTime4.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime4.withField(dateTimeFieldType7, 2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendDayOfWeek(44);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean13 = dateTimeFormatterBuilder0.canBuildPrinter();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(obj0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now();
        int int3 = localDate1.compareTo((org.joda.time.ReadablePartial) localDate2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate2.withPeriodAdded(readablePeriod4, 1970);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property8 = localDate2.property(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        org.joda.time.DateTime dateTime7 = dateTime3.withWeekyear(21);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.DateTime.Property property9 = dateTime7.millisOfSecond();
        org.joda.time.DateTime dateTime11 = dateTime7.withMillisOfDay(66);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime7.withMillisOfSecond(17268551);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17268551 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.plusDays((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate7.withEra(25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int12 = localTime8.get(dateTimeFieldType11);
        org.joda.time.Chronology chronology13 = localTime8.getChronology();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology13, locale14);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime20 = localTime18.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int22 = localTime18.get(dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = localTime18.getChronology();
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology23, locale24);
        org.joda.time.DateTimeField dateTimeField26 = chronology23.year();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long30 = dateTimeZone27.getMillisKeepLocal(dateTimeZone28, (long) '#');
        java.lang.String str31 = dateTimeZone28.getID();
        int int33 = dateTimeZone28.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology34 = chronology23.withZone(dateTimeZone28);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(dateTimeZone28);
        java.lang.String str36 = dateTimeZone28.getID();
        org.joda.time.Chronology chronology37 = chronology16.withZone(dateTimeZone28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(2, 2022, 54353, (int) (short) 100, 43, 39, 25, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35L + "'", long30 == 35L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertNotNull(chronology37);
    }
}
