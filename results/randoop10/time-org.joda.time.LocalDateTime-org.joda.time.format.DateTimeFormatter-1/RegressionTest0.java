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
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
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
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
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
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTimeField dateTimeField2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = dateTime1.get(dateTimeField2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeField must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.Chronology chronology6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(0, 14, 100, (int) (byte) 0, (int) (short) 100, 0, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((int) '4', (int) (short) 1, (int) '#', (int) (short) 100, 0, (int) (byte) 1, (int) (short) -1, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate6.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate12.withDayOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.plus(readableDuration6);
        org.joda.time.DateTime.Property property8 = dateTime3.centuryOfEra();
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withPeriodAdded(readablePeriod13, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime10.getZone();
        long long19 = dateTimeZone16.convertLocalToUTC((long) 11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) property8, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 11L + "'", long19 == 11L);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        java.util.Date date16 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.fromDateFields(date16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean19 = localDate17.isSupported(dateTimeFieldType18);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = localDate6.get(dateTimeFieldType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
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
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = property1.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        java.lang.Object obj2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.withPeriodAdded(readablePeriod6, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime3.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) property1, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField14 = localDate12.getField((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.plus(readableDuration6);
        java.util.Date date13 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        boolean boolean17 = dateTime7.isSupported(dateTimeFieldType15);
        org.joda.time.DateTime dateTime19 = dateTime7.plusHours(11);
        org.joda.time.DateTime.Property property20 = dateTime7.yearOfEra();
        java.util.Locale locale21 = java.util.Locale.JAPAN;
        java.lang.String str22 = property20.getAsShortText(locale21);
        java.lang.Object obj23 = locale21.clone();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10" + "'", str22, "10");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "ja_JP");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "ja_JP");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "ja_JP");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfFloorCopy();
        boolean boolean5 = locale0.equals((java.lang.Object) localDateTime4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime3 = property1.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = property1.setCopy("09:50:02.357");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:50:02.357\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = localTime1.withSecondOfMinute((int) ' ');
        java.util.Locale locale5 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localTime3.toString("", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja_JP");
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale4 = new java.util.Locale("09:50:02.357", "", "09:50:02.357");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone0, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "09:50:02.357__09:50:02.357");
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate.Property property11 = localDate10.year();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate10.withFieldAdded(durationFieldType12, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: hi!" + "'", str2, "java.io.IOException: hi!");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((java.lang.Object) localTime0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        date5.setHours(0);
        java.lang.Object obj8 = date5.clone();
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 00:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "Thu Nov 13 00:01:00 UTC 1997");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "Thu Nov 13 00:01:00 UTC 1997");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "Thu Nov 13 00:01:00 UTC 1997");
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        int int0 = org.joda.time.MutableDateTime.ROUND_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateTime5.toString("java.io.IOException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(chronology13);
        org.joda.time.LocalTime localTime16 = localTime14.withSecondOfMinute((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = localDate12.isEqual((org.joda.time.ReadablePartial) localTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMinuteOfHour(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        java.lang.String str13 = chronology12.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = chronology12.getDateTimeMillis((long) 1, (-1), 9, 19, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str13, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property4.setCopy("hi!", locale6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = chronology12.getDateTimeMillis(1, (int) (short) -1, 100, (int) (byte) 100, 4, 19, (-27409550));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.eras();
        boolean boolean2 = localDateTime0.isSupported(durationFieldType1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withYearOfEra(1997);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfWeek((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.plus(readableDuration6);
        org.joda.time.DateTime.Property property8 = dateTime3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dateTime3.get(dateTimeField9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeField must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = property4.addCopy((long) 1);
        java.util.Locale locale9 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property4.setCopy("09:50:02.357", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:50:02.357\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja_JP");
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) (byte) 0, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        java.lang.Object obj13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.plus(readablePeriod17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime16.plus(readableDuration19);
        java.util.Date date26 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.fromDateFields(date26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean29 = localDate27.isSupported(dateTimeFieldType28);
        boolean boolean30 = dateTime20.isSupported(dateTimeFieldType28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate32 = localDate6.withField(dateTimeFieldType28, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        int int8 = localDateTime2.getYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localDateTime2.toString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setSecondOfMinute((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = localTime0.withMillisOfDay((-27409550));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -27409550 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("09:50:02.357");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"09:50:02.357\" is malformed at \":50:02.357\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfMonth();
        int int3 = property2.get();
        org.joda.time.DateTime dateTime4 = property2.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = property2.setCopy("2022-02-28T09:50:05.336Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-28T09:50:05.336Z\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        java.lang.Class<?> wildcardClass9 = localDate6.getClass();
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale2 = new java.util.Locale("2022-02-28T09:50:05.336Z");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "2022-02-28t09:50:05.336z");
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(10L, chronology1);
        org.joda.time.LocalDate.Property property3 = localDate2.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = property3.setCopy("-1997-11-13T09:50:03.940Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"-1997-11-13T09:50:03.940Z\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("Dec 3, 1909 4:01:00 AM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Dec 3, 1909 4:01:00 AM\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (byte) 100, (int) (byte) 100, 19, 0, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate6.plus(readablePeriod13);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withPeriodAdded(readablePeriod19, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime16.getZone();
        org.joda.time.DateMidnight dateMidnight23 = localDate6.toDateMidnight(dateTimeZone22);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.plus(readablePeriod28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.plus(readableDuration30);
        java.util.Date date37 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.fromDateFields(date37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean40 = localDate38.isSupported(dateTimeFieldType39);
        boolean boolean41 = dateTime31.isSupported(dateTimeFieldType39);
        org.joda.time.DateTime dateTime43 = dateTime31.plusHours(11);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.withChronology(chronology44);
        org.joda.time.DateMidnight dateMidnight46 = dateTime45.toDateMidnight();
        org.joda.time.Instant instant47 = dateMidnight46.toInstant();
        boolean boolean48 = dateTimeZone22.equals((java.lang.Object) instant47);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateMidnight46);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMinuteOfHour((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((java.lang.Object) strSet0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.TreeSet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime1.toMutableDateTime(dateTimeZone9);
        java.util.Date date16 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.fromDateFields(date16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean19 = localDate17.isSupported(dateTimeFieldType18);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.set(dateTimeFieldType18, 14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
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
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (short) -1, (int) (byte) 1, (int) (short) 100, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(11);
        java.lang.Object obj13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj13);
        org.joda.time.LocalDateTime localDateTime15 = dateTime14.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withDurationAdded(readableDuration16, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.minusMonths(0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime15.withDate((int) ' ', 9, 23);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = localDate10.compareTo((org.joda.time.ReadablePartial) localDateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate6.plus(readablePeriod13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDate14.toString("2022-02-28T09:50:06.761Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime3 = property2.withMaximumValue();
        java.lang.String str4 = property2.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Property[dayOfMonth]" + "'", str4, "Property[dayOfMonth]");
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        java.lang.String str14 = property13.getName();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        long long18 = dateTimeField15.addWrapField((long) 10, (int) (short) -1);
        java.lang.String str19 = dateTimeField15.toString();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.lang.String str23 = locale22.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = dateTimeField15.set((long) (short) 1, "hi!", locale22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "era" + "'", str14, "era");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-124334351999990L) + "'", long18 == (-124334351999990L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateTimeField[era]" + "'", str19, "DateTimeField[era]");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate6.plus(readablePeriod13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDate14.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        int int13 = localDate12.getWeekyear();
        org.joda.time.LocalDate.Property property14 = localDate12.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = property14.setCopy("2022-02-28T09:50:06.761Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-28T09:50:06.761Z\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1997 + "'", int13 == 1997);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfMonth();
        int int3 = property2.get();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.MIDNIGHT;
        int int7 = localTime5.compareTo((org.joda.time.ReadablePartial) localTime6);
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.withPeriodAdded(readablePeriod12, (int) (byte) 10);
        org.joda.time.DateTime dateTime15 = localTime6.toDateTime((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime.Property property16 = dateTime15.weekOfWeekyear();
        org.joda.time.DateTime dateTime18 = property16.addWrapFieldToCopy(10);
        int int19 = property2.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime.Property property20 = dateTime18.millisOfSecond();
        int int21 = dateTime18.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime localTime3 = localTime1.withSecondOfMinute((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.eras();
        boolean boolean8 = localDateTime6.isSupported(durationFieldType7);
        boolean boolean9 = localDateTime4.isSupported(durationFieldType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime3.withFieldAdded(durationFieldType7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.LocalDate.Property property13 = localDate6.yearOfCentury();
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime19 = dateTime15.withField(dateTimeFieldType17, 15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property20 = localDate6.property(dateTimeFieldType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(11);
        org.joda.time.LocalDate localDate14 = localDate12.plusDays((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) localDate12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("zh", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(11);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.MIDNIGHT;
        int int14 = localTime13.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property16 = localTime13.property(dateTimeFieldType15);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localDate10.compareTo((org.joda.time.ReadablePartial) localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        boolean boolean8 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(10L, chronology10);
        org.joda.time.DateTime dateTime12 = dateTime3.withFields((org.joda.time.ReadablePartial) localDate11);
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.lang.String str15 = locale14.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTime3.toString("java.io.IOException: hi!", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int2 = localTime0.getValue(0);
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0, chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.util.Date date3 = new java.util.Date(6, 10, 10);
        int int4 = date3.getYear();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.MIDNIGHT;
        int int7 = localTime5.getValue(0);
        org.joda.time.LocalTime.Property property8 = localTime5.millisOfDay();
        boolean boolean9 = date3.equals((java.lang.Object) property8);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 10 00:00:00 UTC 1906");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime localTime3 = localTime1.withSecondOfMinute((int) (short) 1);
        java.lang.String str4 = localTime1.toString();
        org.joda.time.LocalTime localTime6 = localTime1.withMinuteOfHour(15);
        org.joda.time.LocalTime localTime8 = localTime6.plusMillis(590);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.MIDNIGHT;
        int int13 = localTime11.compareTo((org.joda.time.ReadablePartial) localTime12);
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime20 = dateTime15.withPeriodAdded(readablePeriod18, (int) (byte) 10);
        org.joda.time.DateTime dateTime21 = localTime12.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Chronology chronology22 = dateTime15.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.months();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(11L, chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) localTime8, chronology22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "09:50:08.711" + "'", str4, "09:50:08.711");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "ISOChronology[Etc/UTC]", "zh", "java.io.IOException: hi!", "1997-11-13", "09:50:07.635", "era", "2022-02-11T09:50:06.992Z", "ISOChronology[Etc/UTC]", "Dec 3, 1909 4:01:00 AM", "era", "era", "2022-02-28T09:50:04.963Z", "Dec 3, 1909 4:01:00 AM", "1997-11-13", "German" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.Locale.FilteringMode filteringMode19 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strList17, filteringMode19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + filteringMode19 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode19.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        java.lang.String str16 = mutableDateTime1.toString();
        java.util.Date date22 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        int int23 = date22.getYear();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.fromDateFields(date22);
        int int25 = localDateTime24.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int29 = localDateTime27.get(dateTimeFieldType28);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.set(dateTimeFieldType28, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022-02-28T09:50:08.845Z" + "'", str16, "2022-02-28T09:50:08.845Z");
        org.junit.Assert.assertEquals(date22.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 19 + "'", int25 == 19);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 12 + "'", int29 == 12);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(6, (int) 'a', (int) (byte) 100, 4, 3, (-27409550), (-27409550));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -27409550 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property3 = localTime0.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property5 = localTime4.millisOfSecond();
        org.joda.time.LocalTime localTime7 = property5.addCopy((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property5.addNoWrapToCopy((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = calendar15.getActualMaximum(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573008996,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=8,MILLISECOND=996,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime9.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime9.add(readableDuration12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.property(dateTimeFieldType14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime2.property(dateTimeFieldType14);
        java.util.Locale locale18 = java.util.Locale.ROOT;
        java.lang.String str19 = locale18.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localDateTime2.toString("hi!", locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        java.lang.String str14 = property13.getName();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        java.util.Date date21 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.fromDateFields(date21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean24 = localDate22.isSupported(dateTimeFieldType23);
        org.joda.time.LocalDate localDate26 = localDate22.withEra(0);
        org.joda.time.LocalDate localDate28 = localDate22.plusMonths((int) (byte) -1);
        int int29 = dateTimeField15.getMaximumValue((org.joda.time.ReadablePartial) localDate28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate31 = localDate28.withYearOfCentury((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "era" + "'", str14, "era");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((java.lang.Object) property9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.MutableDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.withPeriodAdded(readablePeriod4, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime1.getZone();
        long long10 = dateTimeZone7.convertLocalToUTC((long) 11, true);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.LocalTime localTime12 = localDateTime11.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withWeekOfWeekyear((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(0, 2, 11, (int) (byte) -1, 35408, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate6.plus(readablePeriod13);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        int int16 = localTime15.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property18 = localTime15.property(dateTimeFieldType17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = localDate6.withField(dateTimeFieldType17, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundFloor();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime10.setDateTime(0, (int) (byte) 100, 3, (int) '4', (int) (short) -1, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.MIDNIGHT;
        int int10 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime9);
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withPeriodAdded(readablePeriod15, (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology19 = dateTime12.getChronology();
        java.lang.String str20 = chronology19.toString();
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withPeriodAdded(readablePeriod25, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime22.getZone();
        long long31 = dateTimeZone28.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.Chronology chronology33 = chronology19.withZone(dateTimeZone28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(2022, (int) (short) -1, 5, 590, 10, 23, 1997, dateTimeZone28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 590 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str20, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 11L + "'", long31 == 11L);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        java.lang.String str14 = property13.getName();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        long long18 = dateTimeField15.addWrapField((long) 10, (int) (short) -1);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.MIDNIGHT;
        int int22 = localTime20.compareTo((org.joda.time.ReadablePartial) localTime21);
        org.joda.time.LocalTime.Property property23 = localTime20.minuteOfHour();
        org.joda.time.LocalTime localTime24 = property23.getLocalTime();
        org.joda.time.LocalTime localTime25 = property23.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime26 = property23.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime28 = property23.addCopy(15);
        int[] intArray35 = new int[] { (byte) 1, 11, (short) 100, (-1), (short) 100, 4 };
        int int36 = dateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) localTime28, intArray35);
        // The following exception was thrown during execution in test generation
        try {
            long long39 = dateTimeField15.add(1646041808985L, (long) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "era" + "'", str14, "era");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-124334351999990L) + "'", long18 == (-124334351999990L));
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 11, 100, -1, 100, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("2022-02-28T09:50:07.526Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.util.Date date3 = new java.util.Date(6, 10, 10);
        int int4 = date3.getYear();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime6.setWeekyear(3);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfMonth();
        org.joda.time.DateTime dateTime12 = property11.withMaximumValue();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime15 = dateTime12.minusYears((int) (short) 1);
        long long16 = dateTime12.getMillis();
        java.util.Date date17 = dateTime12.toDate();
        int int18 = date3.compareTo(date17);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 10 00:00:00 UTC 1906");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1646041809840L + "'", long16 == 1646041809840L);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Mon Feb 28 09:50:09 UTC 2022");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime3 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property1.roundHalfCeilingCopy();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale6.getDisplayCountry(locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property1.setCopy("1997-11-13", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1997-11-13\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.months();
        org.joda.time.DurationField durationField14 = chronology12.hours();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.weekyearOfCentury();
        java.lang.Object obj16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj16);
        org.joda.time.LocalDateTime localDateTime18 = dateTime17.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusMonths((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.weekOfWeekyear();
        int[] intArray26 = new int[] { 5, 7, 1 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = dateTimeField15.set((org.joda.time.ReadablePartial) localDateTime18, 3, intArray26, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[5, 7, 1]");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("zho");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"zho\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        boolean boolean14 = dateTimeFieldType0.isSupported(chronology13);
        org.joda.time.DurationField durationField15 = chronology13.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = chronology13.getDateTimeMillis(17, 50400000, 4, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50400000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property3 = localTime0.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        org.joda.time.LocalTime localTime5 = property3.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property3.addNoWrapToCopy(232);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        int int8 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime7);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withPeriodAdded(readablePeriod13, (int) (byte) 10);
        org.joda.time.DateTime dateTime16 = localTime7.toDateTime((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Chronology chronology17 = dateTime10.getChronology();
        java.lang.String str18 = chronology17.toString();
        org.joda.time.DurationField durationField19 = chronology17.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(5, 10, 23, 2022, 2022, chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str18, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate6.plus(readablePeriod13);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withPeriodAdded(readablePeriod19, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime16.getZone();
        org.joda.time.DateMidnight dateMidnight23 = localDate6.toDateMidnight(dateTimeZone22);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = localDate6.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateMidnight23);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        calendar15.set(5, (-292275054), 0, 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            calendar15.set(100, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=5,MONTH=-292275054,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=0,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=1,MINUTE=100,SECOND=10,MILLISECOND=600,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime4.setWeekyear(3);
        java.lang.Object obj7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj7);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfMonth();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        mutableDateTime4.setMillis((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeField dateTimeField12 = null;
        mutableDateTime4.setRounding(dateTimeField12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime4.add(readableDuration14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime4.era();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime4.millisOfDay();
        org.joda.time.Chronology chronology18 = mutableDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(97, (int) (short) -1, 999, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        // The following exception was thrown during execution in test generation
        try {
            calendar15.add((int) (short) 100, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573010773,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=10,MILLISECOND=773,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Set<java.lang.String> strSet1 = java.util.Calendar.getAvailableCalendarTypes();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("2022-02-28T09:50:08.877Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '2022-02-28T09:50:08.877Z' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime6.setWeekyear(3);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfMonth();
        org.joda.time.DateTime dateTime12 = property11.withMaximumValue();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTimeField dateTimeField14 = null;
        mutableDateTime6.setRounding(dateTimeField14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime6.add(readableDuration16);
        mutableDateTime6.setSecondOfMinute((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        mutableDateTime6.setZoneRetainFields(dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((int) (short) 100, 4, 50, (int) (short) 10, (int) (short) 10, dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property3 = localTime0.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property3.addNoWrapToCopy((int) (byte) 1);
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.lang.String str9 = localTime6.toString("+00:00", locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale8.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime3 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property1.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYearOfEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.withPeriodAdded(readablePeriod4, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime1.getZone();
        org.joda.time.Instant instant8 = dateTime1.toInstant();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(instant8);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate.Property property11 = localDate6.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = property11.setCopy("2022-02-28T09:50:05.336Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-28T09:50:05.336Z\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("0003-01-01T23:59:59.999Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("2022-02-11T09:50:05.443Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '2022-02-11T09:50:05.443Z' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate6.plus(readablePeriod13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate6.withField(dateTimeFieldType15, 46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromCalendarFields(calendar15);
        java.lang.Object obj17 = calendar15.clone();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573011435,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=11,MILLISECOND=435,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(obj17);
// flaky:         org.junit.Assert.assertEquals(obj17.toString(), "java.util.GregorianCalendar[time=1644573011435,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=11,MILLISECOND=435,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "java.util.GregorianCalendar[time=1644573011435,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=11,MILLISECOND=435,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "java.util.GregorianCalendar[time=1644573011435,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=11,MILLISECOND=435,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2022-02-11T09:50:10.822Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:50:10.822Z\" is malformed at \"T09:50:10.822Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.millisOfDay();
        org.joda.time.Chronology chronology15 = mutableDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField18 = chronology15.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = chronology15.getDateTimeMillis((long) (byte) 0, 35408, 10, 50, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35408 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDateTime(20, 2, (int) ' ', 12, 16, 7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must be in the range [1,29]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.withPeriodAdded(readablePeriod4, (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime1.minusMillis(2022);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime8.withDayOfWeek(20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int2 = localTime0.getValue(0);
        org.joda.time.LocalTime.Property property3 = localTime0.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = localTime0.isBefore((org.joda.time.ReadablePartial) localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        java.lang.String str14 = property13.getName();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        long long18 = dateTimeField15.addWrapField((long) 10, (int) (short) -1);
        java.lang.String str19 = dateTimeField15.toString();
        java.util.Locale locale21 = java.util.Locale.ROOT;
        java.util.Locale locale22 = java.util.Locale.FRENCH;
        java.lang.String str23 = locale21.getDisplayCountry(locale22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = dateTimeField15.getAsText(23, locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 23");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "era" + "'", str14, "era");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-124334351999990L) + "'", long18 == (-124334351999990L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateTimeField[era]" + "'", str19, "DateTimeField[era]");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.MIDNIGHT;
        int int10 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime9);
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withPeriodAdded(readablePeriod15, (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology19 = dateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((int) (byte) 0, (int) (byte) 0, (int) (short) -1, (int) (short) -1, 2, 35408, 10, chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMonths((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.dayOfWeek();
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withDate(97, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("0003-01-01T23:59:59.999Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"0003-01-01T23:59:59.999Z\" is malformed at \"T23:59:59.999Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2022-02-28T09:50:07.589Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-28T09:50:07.589Z\" is malformed at \"T09:50:07.589Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.lang.Object obj7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes(2022);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime12.setWeekyear(3);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfMonth();
        org.joda.time.DateTime dateTime18 = property17.withMaximumValue();
        mutableDateTime12.setMillis((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeField dateTimeField20 = null;
        mutableDateTime12.setRounding(dateTimeField20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime12.add(readableDuration22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime12.era();
        org.joda.time.ReadableDuration readableDuration25 = null;
        mutableDateTime12.add(readableDuration25);
        java.lang.String str27 = mutableDateTime12.toString();
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.MIDNIGHT;
        int int31 = localTime29.compareTo((org.joda.time.ReadablePartial) localTime30);
        java.lang.Object obj32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(obj32);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime33.withPeriodAdded(readablePeriod36, (int) (byte) 10);
        org.joda.time.DateTime dateTime39 = localTime30.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology40 = dateTime33.getChronology();
        java.lang.String str41 = chronology40.toString();
        java.lang.Object obj42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(obj42);
        org.joda.time.DateTime dateTime45 = dateTime43.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime48 = dateTime43.withPeriodAdded(readablePeriod46, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTime43.getZone();
        long long52 = dateTimeZone49.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone49);
        org.joda.time.Chronology chronology54 = chronology40.withZone(dateTimeZone49);
        mutableDateTime12.setChronology(chronology40);
        org.joda.time.DurationField durationField56 = chronology40.years();
        org.joda.time.DateTimeField dateTimeField57 = chronology40.secondOfMinute();
        org.joda.time.DateTime dateTime58 = dateTime10.toDateTime(chronology40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((int) '4', 97, (int) (short) 100, 50400000, (int) (byte) -1, (int) (byte) 100, (int) (short) -1, chronology40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50400000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2022-02-28T09:50:12.017Z" + "'", str27, "2022-02-28T09:50:12.017Z");
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str41, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 11L + "'", long52 == 11L);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTime58);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        int int6 = date5.getYear();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromDateFields(date5);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusYears((int) (short) 10);
        int int10 = localDateTime7.getWeekyear();
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1997 + "'", int10 == 1997);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundFloor();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime10.setTime((int) (byte) 10, 232, (int) (byte) 10, 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 232 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime1.year();
        boolean boolean17 = mutableDateTime1.isBeforeNow();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMonthOfYear(999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = localTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property5.setCopy("09:50:07.635");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:50:07.635\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("2022-02-11T09:50:05.833Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException((java.lang.Throwable) iOException0);
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str2, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate.Property property11 = localDate10.year();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalDate localDate14 = property11.setCopy(1);
        org.joda.time.LocalDate localDate15 = property11.roundHalfEvenCopy();
        org.joda.time.LocalDate.Property property16 = localDate15.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = localDate15.toString("2022-02-28T09:50:05.336Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime3 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property1.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localDateTime4.toString("2022-02-28T09:50:07.589Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime6 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime9 = property4.addCopy(15);
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = locale11.getDisplayScript();
        org.joda.time.LocalTime localTime13 = property4.setCopy("10", locale11);
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.lang.String str16 = locale15.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = localTime13.toString("Dec 3, 1909 4:01:00 AM", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        java.util.Date date23 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromDateFields(date23);
        date23.setYear((int) (short) 0);
        int int27 = date23.getHours();
        int int28 = date23.getHours();
        calendar15.setTime(date23);
        calendar15.set(9, 23, 100, 0, 2);
        int int36 = calendar15.getWeekYear();
        int int38 = calendar15.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=-61814361480000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=11,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=69,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=2,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23 + "'", int27 == 23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 23 + "'", int28 == 23);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11 + "'", int36 == 11);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 11 + "'", int38 == 11);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        boolean boolean14 = dateTimeFieldType0.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.era();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = dateTimeField16.set((long) 14, "2022-02-28T09:50:11.300Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-28T09:50:11.300Z\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localTime1.getFieldTypes();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.MIDNIGHT;
        int int7 = localTime6.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property9 = localTime6.property(dateTimeFieldType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime1.withField(dateTimeFieldType8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("en-US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"en-US\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate.Property property11 = localDate10.year();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField13 = property11.getField();
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.plus(readablePeriod19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        java.util.Date date28 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.fromDateFields(date28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean31 = localDate29.isSupported(dateTimeFieldType30);
        boolean boolean32 = dateTime22.isSupported(dateTimeFieldType30);
        org.joda.time.DateTime dateTime34 = dateTime22.plusHours(11);
        org.joda.time.DateTime.Property property35 = dateTime22.yearOfEra();
        java.util.Locale locale36 = java.util.Locale.FRENCH;
        java.lang.String str37 = property35.getAsText(locale36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate38 = property11.setCopy("09:50:10.643", locale36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:50:10.643\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "10" + "'", str37, "10");
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setSecondOfDay(50400000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50400000 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("2022-02-28T09:50:07.589Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '2022-02-28T09:50:07.589Z' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        java.util.Date date6 = new java.util.Date(23, 9, 1, (int) (short) -1, (int) (short) -1, (int) '#');
        java.lang.Object obj7 = date6.clone();
        org.junit.Assert.assertEquals(date6.toString(), "Sun Sep 30 22:59:35 UTC 1923");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "Sun Sep 30 22:59:35 UTC 1923");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "Sun Sep 30 22:59:35 UTC 1923");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "Sun Sep 30 22:59:35 UTC 1923");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = property4.addCopy((long) 1);
        java.lang.String str8 = property4.getAsText();
        int int9 = property4.getLeapAmount();
        org.joda.time.LocalTime localTime10 = property4.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property4.setCopy("eras");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"eras\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("zh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.LocalDate.Property property13 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property13.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate16 = localDate14.withEra(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField18 = localDate16.getField(617);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 617");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.eras();
        boolean boolean6 = localDateTime4.isSupported(durationFieldType5);
        boolean boolean7 = localDateTime2.isSupported(durationFieldType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime0.withFieldAdded(durationFieldType5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfDay();
        org.joda.time.DateTime dateTime15 = dateTime0.toDateTime(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime15.withYearOfCentury(232);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 232 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localTime1.getFieldTypes();
        org.joda.time.LocalTime localTime7 = localTime1.plusMillis((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localTime7.toString("DateTimeField[era]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.MIDNIGHT;
        int int11 = localTime9.compareTo((org.joda.time.ReadablePartial) localTime10);
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime dateTime15 = dateTime13.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withPeriodAdded(readablePeriod16, (int) (byte) 10);
        org.joda.time.DateTime dateTime19 = localTime10.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Chronology chronology20 = dateTime13.getChronology();
        boolean boolean21 = dateTimeFieldType7.isSupported(chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((int) (byte) 0, 13, 19, 2022, (int) 'a', 5, (int) (short) 100, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfFloorCopy();
        int int3 = localDateTime2.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDayOfYear(590);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 590 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        int int13 = localDate6.getWeekyear();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        int int17 = localTime15.compareTo((org.joda.time.ReadablePartial) localTime16);
        java.lang.Object obj18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj18);
        org.joda.time.DateTime dateTime21 = dateTime19.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime24 = dateTime19.withPeriodAdded(readablePeriod22, (int) (byte) 10);
        org.joda.time.DateTime dateTime25 = localTime16.toDateTime((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Chronology chronology26 = dateTime19.getChronology();
        java.lang.String str27 = chronology26.toString();
        java.lang.Object obj28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj28);
        org.joda.time.DateTime dateTime31 = dateTime29.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.DateTime dateTime34 = dateTime29.withPeriodAdded(readablePeriod32, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime29.getZone();
        long long38 = dateTimeZone35.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.Chronology chronology40 = chronology26.withZone(dateTimeZone35);
        org.joda.time.DurationField durationField41 = chronology26.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((java.lang.Object) int13, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1997 + "'", int13 == 1997);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str27, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 11L + "'", long38 == 11L);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(durationField41);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate.Property property11 = localDate10.year();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale14.getDisplayScript();
        java.util.Locale locale16 = java.util.Locale.ROOT;
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.lang.String str18 = locale16.getDisplayCountry(locale17);
        java.lang.String str19 = locale14.getDisplayCountry(locale16);
        java.lang.String str20 = locale14.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = property11.setCopy("2022-02-28T09:50:11.910Z", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-28T09:50:11.910Z\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        long long18 = calendar15.getTimeInMillis();
        java.util.Locale locale21 = java.util.Locale.ROOT;
        java.lang.String str22 = locale21.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap23 = calendar15.getDisplayNames(232, (int) (short) 10, locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573013557,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=13,MILLISECOND=557,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1644573013557L + "'", long18 == 1644573013557L);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property3 = localTime0.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property3.addNoWrapToCopy((int) (byte) 1);
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.lang.String str9 = localTime6.toString("+00:00", locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime6.withSecondOfMinute(35412);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35412 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime3 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property1.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        java.lang.String str13 = chronology12.toString();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = chronology12.get(readablePeriod14, (long) 50, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str13, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime1.add(readableDuration13, (int) (byte) -1);
        mutableDateTime1.setMillis((long) 6);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setHourOfDay((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime12.setWeekyear(3);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withPeriodAdded(readablePeriod19, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime16.getZone();
        mutableDateTime12.setZoneRetainFields(dateTimeZone22);
        mutableDateTime1.setZone(dateTimeZone22);
        mutableDateTime1.addWeeks((int) (byte) -1);
        mutableDateTime1.setSecondOfDay(2);
        int int29 = mutableDateTime1.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDateTime((int) (short) 1, 97, 617, (-27409550), 2, 590, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -27409550 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        int int16 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime15);
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withPeriodAdded(readablePeriod21, (int) (byte) 10);
        org.joda.time.DateTime dateTime24 = localTime15.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology25 = dateTime18.getChronology();
        boolean boolean26 = dateTimeFieldType12.isSupported(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime11.withField(dateTimeFieldType12, 10);
        org.joda.time.DateTime.Property property29 = dateTime28.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = property29.setCopy("Dec 3, 1909 4:01:00 AM");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Dec 3, 1909 4:01:00 AM\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (short) -1, 0, 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        long long8 = dateTimeZone5.previousTransition(1L);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime10.setWeekyear(3);
        java.lang.Object obj13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withPeriodAdded(readablePeriod17, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime14.getZone();
        mutableDateTime10.setZoneRetainFields(dateTimeZone20);
        long long23 = dateTimeZone5.getMillisKeepLocal(dateTimeZone20, (long) 35408);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(35408, 2022, (int) (short) 100, 0, 11, dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35408L + "'", long23 == 35408L);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getISO3Language();
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        java.lang.String str14 = property13.getName();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        long long18 = dateTimeField15.addWrapField((long) 10, (int) (short) -1);
        java.util.Locale locale20 = java.util.Locale.ROOT;
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = dateTimeField15.getAsText((int) '#', locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "era" + "'", str14, "era");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-124334351999990L) + "'", long18 == (-124334351999990L));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        calendar15.set(5, (-292275054), 0, 1, (int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime23.setWeekyear(3);
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withPeriodAdded(readablePeriod30, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime27.getZone();
        mutableDateTime23.setZoneRetainFields(dateTimeZone33);
        java.util.TimeZone timeZone35 = dateTimeZone33.toTimeZone();
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone35, locale36);
        calendar15.setTimeZone(timeZone35);
        // The following exception was thrown during execution in test generation
        try {
            calendar15.clear(35411);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35411");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=5,MONTH=-292275054,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=0,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=1,MINUTE=100,SECOND=14,MILLISECOND=802,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(timeZone35);
// flaky:         org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar37);
// flaky:         org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=1644573014802,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=14,MILLISECOND=802,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        java.lang.String str14 = property13.getName();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        java.util.Locale locale18 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj19);
        org.joda.time.LocalDateTime localDateTime21 = dateTime20.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withDurationAdded(readableDuration22, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.minusMonths(0);
        org.joda.time.DateTime dateTime27 = localDateTime26.toDateTime();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours(0);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.minusMinutes((int) (byte) 10);
        java.util.Locale locale33 = java.util.Locale.CHINESE;
        java.lang.String str34 = localDateTime26.toString("10", locale33);
        java.lang.String str35 = locale18.getDisplayName(locale33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = dateTimeField15.getAsText((int) 'a', locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "era" + "'", str14, "era");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals(locale18.toString(), "09:50:02.357");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10" + "'", str34, "10");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "09:50:02.357" + "'", str35, "09:50:02.357");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setSecondOfMinute(999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(22, (int) (short) 0, 2022, (-1), 999, 35411, 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        boolean boolean8 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(10L, chronology10);
        org.joda.time.DateTime dateTime12 = dateTime3.withFields((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = dateTime12.toString(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T09:50:15.012Z" + "'", str14, "1970-01-01T09:50:15.012Z");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int12 = localDate6.indexOf(dateTimeFieldType11);
        org.joda.time.LocalDate localDate14 = localDate6.withWeekyear(35411);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate6.withMonthOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        mutableDateTime1.setSecondOfDay(4);
        mutableDateTime1.setMillisOfDay(590);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setWeekOfWeekyear((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        java.lang.String str14 = property13.getName();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        long long18 = dateTimeField15.addWrapField((long) 10, (int) (short) -1);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.MIDNIGHT;
        int int20 = localTime19.getHourOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime23.setWeekyear(3);
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfMonth();
        org.joda.time.DateTime dateTime29 = property28.withMaximumValue();
        mutableDateTime23.setMillis((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTimeField dateTimeField31 = null;
        mutableDateTime23.setRounding(dateTimeField31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        mutableDateTime23.add(readableDuration33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime23.era();
        java.lang.String str36 = property35.getName();
        org.joda.time.DateTimeField dateTimeField37 = property35.getField();
        long long40 = dateTimeField37.addWrapField((long) 10, (int) (short) -1);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime43 = org.joda.time.LocalTime.MIDNIGHT;
        int int44 = localTime42.compareTo((org.joda.time.ReadablePartial) localTime43);
        org.joda.time.LocalTime.Property property45 = localTime42.minuteOfHour();
        org.joda.time.LocalTime localTime46 = property45.getLocalTime();
        org.joda.time.LocalTime localTime47 = property45.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime48 = property45.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime50 = property45.addCopy(15);
        int[] intArray57 = new int[] { (byte) 1, 11, (short) 100, (-1), (short) 100, 4 };
        int int58 = dateTimeField37.getMinimumValue((org.joda.time.ReadablePartial) localTime50, intArray57);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray60 = dateTimeField15.add((org.joda.time.ReadablePartial) localTime19, 14, intArray57, 86399);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "era" + "'", str14, "era");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-124334351999990L) + "'", long18 == (-124334351999990L));
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "era" + "'", str36, "era");
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-124334351999990L) + "'", long40 == (-124334351999990L));
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 11, 100, -1, 100, 4]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.plus(readableDuration6);
        java.util.Date date13 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        boolean boolean17 = dateTime7.isSupported(dateTimeFieldType15);
        org.joda.time.DateTime dateTime19 = dateTime7.plusHours(11);
        org.joda.time.DateTime.Property property20 = dateTime7.yearOfEra();
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = property20.getAsText(locale21);
        org.joda.time.DateTime dateTime23 = property20.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime25 = property20.addWrapFieldToCopy(0);
        java.util.Locale locale28 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj29);
        org.joda.time.LocalDateTime localDateTime31 = dateTime30.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withDurationAdded(readableDuration32, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime31.minusMonths(0);
        org.joda.time.DateTime dateTime37 = localDateTime36.toDateTime();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.minusHours(0);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.minusMinutes((int) (byte) 10);
        java.util.Locale locale43 = java.util.Locale.CHINESE;
        java.lang.String str44 = localDateTime36.toString("10", locale43);
        java.lang.String str45 = locale28.getDisplayName(locale43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime46 = property20.setCopy("09:50:09.975", locale28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:50:09.975\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10" + "'", str22, "10");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertEquals(locale28.toString(), "09:50:02.357");
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "10" + "'", str44, "10");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "09:50:02.357" + "'", str45, "09:50:02.357");
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = localTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        boolean boolean9 = dateTime8.isEqualNow();
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withPeriodAdded(readablePeriod14, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime11.getZone();
        long long20 = dateTimeZone17.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime21 = dateTime8.toDateTime(dateTimeZone17);
        org.joda.time.LocalTime localTime22 = dateTime8.toLocalTime();
        org.joda.time.DateTime dateTime24 = dateTime8.plus((long) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.MIDNIGHT;
        int int29 = localTime27.compareTo((org.joda.time.ReadablePartial) localTime28);
        java.lang.Object obj30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj30);
        org.joda.time.DateTime dateTime33 = dateTime31.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime36 = dateTime31.withPeriodAdded(readablePeriod34, (int) (byte) 10);
        org.joda.time.DateTime dateTime37 = localTime28.toDateTime((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Chronology chronology38 = dateTime31.getChronology();
        boolean boolean39 = dateTimeFieldType25.isSupported(chronology38);
        int int40 = dateTime24.get(dateTimeFieldType25);
        int int41 = localTime1.get(dateTimeFieldType25);
        java.lang.Object obj42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(obj42);
        org.joda.time.DateTime.Property property44 = dateTime43.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime47 = dateTime43.withField(dateTimeFieldType45, 15);
        int int48 = localTime1.indexOf(dateTimeFieldType45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime50 = localTime1.withMillisOfSecond((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 11L + "'", long20 == 11L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 590 + "'", int40 == 590);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        int int2 = localDateTime0.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(9);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Chronology chronology6 = null;
        boolean boolean7 = durationFieldType5.isSupported(chronology6);
        java.lang.String str8 = durationFieldType5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime0.withFieldAdded(durationFieldType5, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eras" + "'", str8, "eras");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime6 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime9 = property4.addCopy(15);
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = locale11.getDisplayScript();
        org.joda.time.LocalTime localTime13 = property4.setCopy("10", locale11);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime16.setWeekyear(3);
        java.lang.Object obj19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime20.withPeriodAdded(readablePeriod23, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime20.getZone();
        mutableDateTime16.setZoneRetainFields(dateTimeZone26);
        java.util.TimeZone timeZone28 = dateTimeZone26.toTimeZone();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(dateTimeZone26);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(10L, dateTimeZone26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) property4, dateTimeZone26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.plus(readableDuration6);
        java.util.Date date13 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        boolean boolean17 = dateTime7.isSupported(dateTimeFieldType15);
        org.joda.time.DateTime dateTime19 = dateTime7.plusHours(11);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withChronology(chronology20);
        org.joda.time.DateMidnight dateMidnight22 = dateTime21.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean24 = dateMidnight22.isSupported(dateTimeFieldType23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) dateTimeFieldType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        java.io.IOException iOException0 = new java.io.IOException();
        java.lang.String str1 = iOException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.io.IOException" + "'", str1, "java.io.IOException");
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((java.lang.Object) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime12.setWeekyear(3);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withPeriodAdded(readablePeriod19, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime16.getZone();
        mutableDateTime12.setZoneRetainFields(dateTimeZone22);
        mutableDateTime1.setZone(dateTimeZone22);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime1.secondOfDay();
        int int26 = property25.get();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime28 = property25.set((-27409550));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -27409550 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(property25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35415 + "'", int26 == 35415);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        java.util.Date date23 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromDateFields(date23);
        date23.setYear((int) (short) 0);
        int int27 = date23.getHours();
        int int28 = date23.getHours();
        calendar15.setTime(date23);
        boolean boolean31 = calendar15.isSet(5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=-2181603540000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1900,MONTH=10,WEEK_OF_YEAR=46,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=317,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=1,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23 + "'", int27 == 23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 23 + "'", int28 == 23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        date5.setYear((int) (short) 0);
        int int9 = date5.getHours();
        int int10 = date5.getHours();
        java.time.Instant instant11 = date5.toInstant();
        java.util.Date date17 = new java.util.Date(10, (int) (byte) -1, (-1), 100, (int) (byte) 1);
        int int18 = date17.getDate();
        java.util.Date date24 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        boolean boolean25 = date17.before(date24);
        int int26 = date5.compareTo(date17);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 23 + "'", int9 == 23);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 23 + "'", int10 == 23);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Dec 03 04:01:00 UTC 1909");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.LocalDate.Property property13 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property13.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate16 = localDate14.withEra(1);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Chronology chronology18 = null;
        boolean boolean19 = durationFieldType17.isSupported(chronology18);
        java.lang.String str20 = durationFieldType17.toString();
        boolean boolean21 = localDate16.isSupported(durationFieldType17);
        java.util.Date date27 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        int int28 = date27.getYear();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.fromDateFields(date27);
        int int30 = localDateTime29.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.eras();
        boolean boolean33 = localDateTime31.isSupported(durationFieldType32);
        org.joda.time.Chronology chronology34 = null;
        boolean boolean35 = durationFieldType32.isSupported(chronology34);
        boolean boolean36 = localDateTime29.isSupported(durationFieldType32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate38 = localDate16.withFieldAdded(durationFieldType32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "eras" + "'", str20, "eras");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19 + "'", int30 == 19);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = dateTime1.toLocalTime();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.eras();
        boolean boolean5 = localDateTime3.isSupported(durationFieldType4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = localTime2.isBefore((org.joda.time.ReadablePartial) localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.MIDNIGHT;
        int int9 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime8);
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withPeriodAdded(readablePeriod14, (int) (byte) 10);
        org.joda.time.DateTime dateTime17 = localTime8.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Chronology chronology18 = dateTime11.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.months();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(11L, chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(7, (int) 'a', 35414, (int) (short) 0, 232, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 232 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime4.setWeekyear(3);
        java.lang.Object obj7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj7);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfMonth();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        mutableDateTime4.setMillis((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeField dateTimeField12 = null;
        mutableDateTime4.setRounding(dateTimeField12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime4.add(readableDuration14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime4.era();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime4.millisOfDay();
        org.joda.time.Chronology chronology18 = mutableDateTime4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(35412, 17, 100, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        java.lang.String str14 = property13.getName();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.roundHalfCeiling();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime17 = property13.add(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "era" + "'", str14, "era");
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 50400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 50400000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.withPeriodAdded(readablePeriod4, (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime6.plusHours((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime6.withDayOfWeek(232);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 232 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        int int6 = date5.getYear();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromDateFields(date5);
        int int8 = localDateTime7.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusMonths(590);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfWeek(1997);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1997 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(11, (int) '#', 50400000, (int) 'u', (int) (byte) -1, 17, 5, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        int int5 = property4.getMinimumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property4.setCopy((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = calendar15.getGreatestMinimum(365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 365");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573016741,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=16,MILLISECOND=741,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.millisOfSecond();
        mutableDateTime1.addHours((int) (byte) 10);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(3, (int) '4', (int) (short) -1, 14, 35408);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35408 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate.Property property11 = localDate10.year();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField13 = property11.getField();
        java.util.Date date19 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.fromDateFields(date19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean22 = localDate20.isSupported(dateTimeFieldType21);
        org.joda.time.LocalDate localDate24 = localDate20.withEra(0);
        org.joda.time.LocalDate.Property property25 = localDate24.year();
        org.joda.time.LocalDate localDate26 = property25.withMaximumValue();
        org.joda.time.LocalDate localDate28 = property25.setCopy(1);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.MIDNIGHT;
        int int33 = localTime31.compareTo((org.joda.time.ReadablePartial) localTime32);
        java.lang.Object obj34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(obj34);
        org.joda.time.DateTime dateTime37 = dateTime35.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime40 = dateTime35.withPeriodAdded(readablePeriod38, (int) (byte) 10);
        org.joda.time.DateTime dateTime41 = localTime32.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Chronology chronology42 = dateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.secondOfDay();
        long long45 = dateTimeField43.roundFloor(0L);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime49.setWeekyear(3);
        java.lang.Object obj52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(obj52);
        org.joda.time.DateTime.Property property54 = dateTime53.dayOfMonth();
        org.joda.time.DateTime dateTime55 = property54.withMaximumValue();
        mutableDateTime49.setMillis((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTimeField dateTimeField57 = null;
        mutableDateTime49.setRounding(dateTimeField57);
        org.joda.time.ReadableDuration readableDuration59 = null;
        mutableDateTime49.add(readableDuration59);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime49.era();
        java.lang.String str62 = property61.getName();
        org.joda.time.DateTimeField dateTimeField63 = property61.getField();
        long long66 = dateTimeField63.addWrapField((long) 10, (int) (short) -1);
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime69 = org.joda.time.LocalTime.MIDNIGHT;
        int int70 = localTime68.compareTo((org.joda.time.ReadablePartial) localTime69);
        org.joda.time.LocalTime.Property property71 = localTime68.minuteOfHour();
        org.joda.time.LocalTime localTime72 = property71.getLocalTime();
        org.joda.time.LocalTime localTime73 = property71.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime74 = property71.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime76 = property71.addCopy(15);
        int[] intArray83 = new int[] { (byte) 1, 11, (short) 100, (-1), (short) 100, 4 };
        int int84 = dateTimeField63.getMinimumValue((org.joda.time.ReadablePartial) localTime76, intArray83);
        int int85 = dateTimeField43.getMaximumValue((org.joda.time.ReadablePartial) localTime47, intArray83);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray87 = dateTimeField13.add((org.joda.time.ReadablePartial) localDate28, 14, intArray83, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "era" + "'", str62, "era");
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-124334351999990L) + "'", long66 == (-124334351999990L));
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1, 11, 100, -1, 100, 4]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 86399 + "'", int85 == 86399);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.DateMidnight dateMidnight6 = dateTime1.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime1.withMinuteOfHour((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateMidnight6);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("09:50:10.643");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"09:50:10.643\" is malformed at \":50:10.643\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.util.Date date5 = new java.util.Date(10, (int) (byte) -1, (-1), 100, (int) (byte) 1);
        int int6 = date5.getDate();
        int int7 = date5.getTimezoneOffset();
        java.lang.String str8 = date5.toLocaleString();
        date5.setHours(32772);
        java.lang.String str11 = date5.toString();
        org.junit.Assert.assertEquals(date5.toString(), "Fri Aug 29 12:01:00 UTC 1913");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1909/12/03 4:01:00" + "'", str8, "1909/12/03 4:01:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Fri Aug 29 12:01:00 UTC 1913" + "'", str11, "Fri Aug 29 12:01:00 UTC 1913");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.MIDNIGHT;
        int int11 = localTime9.compareTo((org.joda.time.ReadablePartial) localTime10);
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime dateTime15 = dateTime13.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withPeriodAdded(readablePeriod16, (int) (byte) 10);
        org.joda.time.DateTime dateTime19 = localTime10.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Chronology chronology20 = dateTime13.getChronology();
        boolean boolean21 = dateTimeFieldType7.isSupported(chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology20.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(2, 17, 11, (int) (byte) 10, 23, (int) (byte) 1, 32772, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withDayOfMonth(1997);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1997 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        java.lang.String str14 = chronology13.toString();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType0.getField(chronology13);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime19 = localTime17.withMillisOfSecond(1);
        int[] intArray23 = new int[] { 8, 9 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = dateTimeField16.addWrapField((org.joda.time.ReadablePartial) localTime19, (int) 'u', intArray23, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 117");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str14, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[8, 9]");
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        java.util.Date date23 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromDateFields(date23);
        date23.setYear((int) (short) 0);
        int int27 = date23.getHours();
        int int28 = date23.getHours();
        calendar15.setTime(date23);
        calendar15.set(9, 23, 100, 0, 2);
        int int36 = calendar15.getWeekYear();
        int int37 = calendar15.getMinimalDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            calendar15.setWeekDate(7, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=-61814361480000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=11,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=69,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=2,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23 + "'", int27 == 23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 23 + "'", int28 == 23);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11 + "'", int36 == 11);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("AD");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"AD\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime1.toString(dateTimeFormatter13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.MIDNIGHT;
        int int19 = localTime17.compareTo((org.joda.time.ReadablePartial) localTime18);
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withPeriodAdded(readablePeriod24, (int) (byte) 10);
        org.joda.time.DateTime dateTime27 = localTime18.toDateTime((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology28 = dateTime21.getChronology();
        boolean boolean29 = dateTimeFieldType15.isSupported(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.era();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.yearOfCentury();
        java.lang.String str33 = dateTimeField31.getAsText((long) 20);
        int int34 = mutableDateTime1.get(dateTimeField31);
        long long37 = dateTimeField31.getDifferenceAsLong(1646041809648L, (long) (-27409550));
        // The following exception was thrown during execution in test generation
        try {
            long long40 = dateTimeField31.set((long) 4, "");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0003-01-01T23:59:59.999Z" + "'", str14, "0003-01-01T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "70" + "'", str33, "70");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 52L + "'", long37 == 52L);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        int int6 = date5.getYear();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromDateFields(date5);
        int int8 = localDateTime7.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfWeek(50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = chronology12.get(readablePeriod14, 0L, (long) 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        java.lang.String str16 = mutableDateTime1.toString();
        mutableDateTime1.setWeekOfWeekyear(12);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.MIDNIGHT;
        int int22 = localTime20.compareTo((org.joda.time.ReadablePartial) localTime21);
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        org.joda.time.DateTime dateTime26 = dateTime24.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime29 = dateTime24.withPeriodAdded(readablePeriod27, (int) (byte) 10);
        org.joda.time.DateTime dateTime30 = localTime21.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology31 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setRounding(dateTimeField32, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022-02-28T09:50:17.550Z" + "'", str16, "2022-02-28T09:50:17.550Z");
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        java.time.Instant instant18 = calendar15.toInstant();
        calendar15.setWeekDate((int) ' ', (int) (byte) 10, 3);
        boolean boolean23 = calendar15.isLenient();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=-61152070182392,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=32,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=64,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=17,MILLISECOND=608,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("2022-02-28T09:50:13.045Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(46, 232, 1, (int) (byte) 100, (int) (byte) -1, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        long long6 = java.util.Date.UTC(12, (int) 'a', 32769, (int) (byte) -1, 35417252, 20);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3380941940000L + "'", long6 == 3380941940000L);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        java.lang.String str14 = property13.getName();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        long long18 = dateTimeField15.addWrapField((long) 10, (int) (short) -1);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.eras();
        boolean boolean21 = localDateTime19.isSupported(durationFieldType20);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.MIDNIGHT;
        int int26 = localTime24.compareTo((org.joda.time.ReadablePartial) localTime25);
        java.lang.Object obj27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj27);
        org.joda.time.DateTime dateTime30 = dateTime28.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime33 = dateTime28.withPeriodAdded(readablePeriod31, (int) (byte) 10);
        org.joda.time.DateTime dateTime34 = localTime25.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology35 = dateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfDay();
        long long38 = dateTimeField36.roundFloor(0L);
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime42.setWeekyear(3);
        java.lang.Object obj45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(obj45);
        org.joda.time.DateTime.Property property47 = dateTime46.dayOfMonth();
        org.joda.time.DateTime dateTime48 = property47.withMaximumValue();
        mutableDateTime42.setMillis((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTimeField dateTimeField50 = null;
        mutableDateTime42.setRounding(dateTimeField50);
        org.joda.time.ReadableDuration readableDuration52 = null;
        mutableDateTime42.add(readableDuration52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime42.era();
        java.lang.String str55 = property54.getName();
        org.joda.time.DateTimeField dateTimeField56 = property54.getField();
        long long59 = dateTimeField56.addWrapField((long) 10, (int) (short) -1);
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime62 = org.joda.time.LocalTime.MIDNIGHT;
        int int63 = localTime61.compareTo((org.joda.time.ReadablePartial) localTime62);
        org.joda.time.LocalTime.Property property64 = localTime61.minuteOfHour();
        org.joda.time.LocalTime localTime65 = property64.getLocalTime();
        org.joda.time.LocalTime localTime66 = property64.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime67 = property64.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime69 = property64.addCopy(15);
        int[] intArray76 = new int[] { (byte) 1, 11, (short) 100, (-1), (short) 100, 4 };
        int int77 = dateTimeField56.getMinimumValue((org.joda.time.ReadablePartial) localTime69, intArray76);
        int int78 = dateTimeField36.getMaximumValue((org.joda.time.ReadablePartial) localTime40, intArray76);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray80 = dateTimeField15.addWrapField((org.joda.time.ReadablePartial) localDateTime19, 97, intArray76, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "era" + "'", str14, "era");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-124334351999990L) + "'", long18 == (-124334351999990L));
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "era" + "'", str55, "era");
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-124334351999990L) + "'", long59 == (-124334351999990L));
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[1, 11, 100, -1, 100, 4]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 86399 + "'", int78 == 86399);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfDay();
        org.joda.time.DateTime dateTime15 = dateTime0.toDateTime(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = chronology13.getDateTimeMillis((int) (short) 100, 15, 1, 4, (int) (short) 100, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.plusSeconds(2);
        int int11 = localDateTime10.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusHours((-27409550));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localDateTime13.getValue(35412);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35412");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        calendar15.roll(1, true);
        calendar15.set(365, 22, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = calendar15.getActualMaximum(617);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 617");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=365,MONTH=22,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=0,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=18,MILLISECOND=105,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localTime1.getFieldTypes();
        org.joda.time.LocalTime localTime7 = localTime1.plusMillis((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localTime1.toString("2022-02-28T09:50:17.835Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        java.lang.String str16 = mutableDateTime1.toString();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.MIDNIGHT;
        int int20 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime19);
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withPeriodAdded(readablePeriod25, (int) (byte) 10);
        org.joda.time.DateTime dateTime28 = localTime19.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology29 = dateTime22.getChronology();
        java.lang.String str30 = chronology29.toString();
        java.lang.Object obj31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj31);
        org.joda.time.DateTime dateTime34 = dateTime32.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime37 = dateTime32.withPeriodAdded(readablePeriod35, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime32.getZone();
        long long41 = dateTimeZone38.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.Chronology chronology43 = chronology29.withZone(dateTimeZone38);
        mutableDateTime1.setChronology(chronology29);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime46.setWeekyear(3);
        java.lang.Object obj49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(obj49);
        org.joda.time.DateTime.Property property51 = dateTime50.dayOfMonth();
        org.joda.time.DateTime dateTime52 = property51.withMaximumValue();
        mutableDateTime46.setMillis((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTimeField dateTimeField54 = null;
        mutableDateTime46.setRounding(dateTimeField54);
        org.joda.time.ReadableDuration readableDuration56 = null;
        mutableDateTime46.add(readableDuration56);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime46.era();
        java.lang.String str59 = property58.getName();
        org.joda.time.DateTimeField dateTimeField60 = property58.getField();
        long long63 = dateTimeField60.addWrapField((long) 10, (int) (short) -1);
        mutableDateTime1.setRounding(dateTimeField60);
        // The following exception was thrown during execution in test generation
        try {
            long long67 = dateTimeField60.set((long) 6, "70");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"70\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022-02-28T09:50:18.285Z" + "'", str16, "2022-02-28T09:50:18.285Z");
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str30, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 11L + "'", long41 == 11L);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "era" + "'", str59, "era");
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-124334351999990L) + "'", long63 == (-124334351999990L));
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = calendar15.isSet(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2022");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573018305,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=18,MILLISECOND=305,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        java.util.Date date23 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromDateFields(date23);
        date23.setYear((int) (short) 0);
        int int27 = date23.getHours();
        int int28 = date23.getHours();
        calendar15.setTime(date23);
        calendar15.add(0, (-27409550));
        java.lang.String str33 = calendar15.getCalendarType();
        java.util.Locale locale36 = java.util.Locale.ROOT;
        java.lang.String str37 = locale36.getDisplayScript();
        java.util.Locale locale38 = java.util.Locale.ROOT;
        java.util.Locale locale39 = java.util.Locale.FRENCH;
        java.lang.String str40 = locale38.getDisplayCountry(locale39);
        java.lang.String str41 = locale36.getDisplayCountry(locale38);
        java.lang.String str42 = locale36.getDisplayName();
        java.lang.String str43 = locale36.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap44 = calendar15.getDisplayNames(590, 12, locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1900,MONTH=10,WEEK_OF_YEAR=46,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=317,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=1,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23 + "'", int27 == 23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 23 + "'", int28 == 23);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "gregory" + "'", str33, "gregory");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        mutableDateTime1.setWeekyear(19);
        org.joda.time.ReadableInstant readableInstant15 = null;
        mutableDateTime1.setMillis(readableInstant15);
        java.lang.String str17 = mutableDateTime1.toString();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMonthOfYear(17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2022-02-11T09:50:18.378Z" + "'", str17, "2022-02-11T09:50:18.378Z");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(10L, chronology1);
        org.joda.time.LocalDate.Property property3 = localDate2.monthOfYear();
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate2.withFieldAdded(durationFieldType5, 35412);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime3 = property2.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = property2.setCopy(46);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("2022-02-28T09:50:11.300Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-28T09:50:11.300Z\" is malformed at \"22-02-28T09:50:11.300Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        calendar15.set(5, (-292275054), 0, 1, (int) (byte) 100);
        java.util.TimeZone timeZone22 = calendar15.getTimeZone();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone22);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = calendar23.getGreatestMinimum(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2022");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=5,MONTH=-292275054,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=0,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=1,MINUTE=100,SECOND=18,MILLISECOND=598,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(calendar23);
// flaky:         org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=1644573018599,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=18,MILLISECOND=599,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        int int18 = calendar15.getFirstDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            calendar15.setWeekDate(32769, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573018613,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=18,MILLISECOND=613,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("Vereinigte Staaten von Amerika");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Vereinigte Staaten von Amerika\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        calendar15.set(5, (-292275054), 0, 1, (int) (byte) 100);
        java.util.TimeZone timeZone22 = calendar15.getTimeZone();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone22);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = calendar23.getGreatestMinimum((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=5,MONTH=-292275054,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=0,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=1,MINUTE=100,SECOND=18,MILLISECOND=639,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(calendar23);
// flaky:         org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=1644573018639,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=18,MILLISECOND=639,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        int int5 = dateTime3.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(11);
        org.joda.time.LocalDate.Property property13 = localDate12.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localDate12.toString("ISOChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
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
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime.Property property12 = dateTime11.weekOfWeekyear();
        org.joda.time.DateTime dateTime14 = property12.addWrapFieldToCopy(10);
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight16 = dateTime15.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime15.withTime((int) (byte) 100, 8, (int) (byte) -1, 35414);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateMidnight16);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.millisOfDay();
        org.joda.time.Chronology chronology15 = mutableDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        java.lang.String str18 = dateTimeField16.getAsShortText(0L);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.MIDNIGHT;
        int int20 = localTime19.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property22 = localTime19.property(dateTimeFieldType21);
        org.joda.time.LocalTime localTime23 = property22.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.MIDNIGHT;
        int int28 = localTime26.compareTo((org.joda.time.ReadablePartial) localTime27);
        java.lang.Object obj29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj29);
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime35 = dateTime30.withPeriodAdded(readablePeriod33, (int) (byte) 10);
        org.joda.time.DateTime dateTime36 = localTime27.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Chronology chronology37 = dateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.secondOfDay();
        long long40 = dateTimeField38.roundFloor(0L);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime44.setWeekyear(3);
        java.lang.Object obj47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(obj47);
        org.joda.time.DateTime.Property property49 = dateTime48.dayOfMonth();
        org.joda.time.DateTime dateTime50 = property49.withMaximumValue();
        mutableDateTime44.setMillis((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTimeField dateTimeField52 = null;
        mutableDateTime44.setRounding(dateTimeField52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        mutableDateTime44.add(readableDuration54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime44.era();
        java.lang.String str57 = property56.getName();
        org.joda.time.DateTimeField dateTimeField58 = property56.getField();
        long long61 = dateTimeField58.addWrapField((long) 10, (int) (short) -1);
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime64 = org.joda.time.LocalTime.MIDNIGHT;
        int int65 = localTime63.compareTo((org.joda.time.ReadablePartial) localTime64);
        org.joda.time.LocalTime.Property property66 = localTime63.minuteOfHour();
        org.joda.time.LocalTime localTime67 = property66.getLocalTime();
        org.joda.time.LocalTime localTime68 = property66.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime69 = property66.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime71 = property66.addCopy(15);
        int[] intArray78 = new int[] { (byte) 1, 11, (short) 100, (-1), (short) 100, 4 };
        int int79 = dateTimeField58.getMinimumValue((org.joda.time.ReadablePartial) localTime71, intArray78);
        int int80 = dateTimeField38.getMaximumValue((org.joda.time.ReadablePartial) localTime42, intArray78);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray82 = dateTimeField16.addWrapField((org.joda.time.ReadablePartial) localTime23, 590, intArray78, 35414);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 590");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "70" + "'", str18, "70");
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "era" + "'", str57, "era");
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-124334351999990L) + "'", long61 == (-124334351999990L));
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[1, 11, 100, -1, 100, 4]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 86399 + "'", int80 == 86399);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime1.add(readableDuration13, (int) (byte) 10);
        org.joda.time.DateTime dateTime16 = mutableDateTime1.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMillisOfSecond(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.plus(readableDuration6);
        java.util.Date date13 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        boolean boolean17 = dateTime7.isSupported(dateTimeFieldType15);
        org.joda.time.DateTime dateTime19 = dateTime7.plusHours(11);
        org.joda.time.DateTime.Property property20 = dateTime7.yearOfEra();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = dateTime7.toString("0010-02-11T20:50:05.978Z", locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        date5.setYear((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        long long6 = java.util.Date.UTC(0, (-27409550), 1997, 35411, 3, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-72083542597019000L) + "'", long6 == (-72083542597019000L));
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("2022", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.MIDNIGHT;
        int int6 = localTime4.compareTo((org.joda.time.ReadablePartial) localTime5);
        java.lang.Object obj7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime8.withPeriodAdded(readablePeriod11, (int) (byte) 10);
        org.joda.time.DateTime dateTime14 = localTime5.toDateTime((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Chronology chronology15 = dateTime8.getChronology();
        java.lang.String str16 = chronology15.toString();
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withPeriodAdded(readablePeriod21, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime18.getZone();
        long long27 = dateTimeZone24.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.Chronology chronology29 = chronology15.withZone(dateTimeZone24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(11, 16, (int) (byte) 100, chronology29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str16, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 11L + "'", long27 == 11L);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime localTime3 = localTime1.withSecondOfMinute((int) (short) 1);
        java.lang.String str4 = localTime1.toString();
        org.joda.time.LocalTime localTime6 = localTime1.withMinuteOfHour(15);
        org.joda.time.LocalTime localTime8 = localTime6.plusMillis(590);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime8.withMillisOfSecond(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "09:50:19.427" + "'", str4, "09:50:19.427");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        java.lang.String str16 = mutableDateTime1.toString();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime1.add(readablePeriod17);
        mutableDateTime1.setMillisOfSecond(14);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDateTime((int) (short) 10, (int) 'a', (int) (short) 100, 32769, 1, 20, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022-02-28T09:50:19.488Z" + "'", str16, "2022-02-28T09:50:19.488Z");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(11);
        java.util.Date date13 = localDate12.toDate();
        org.joda.time.LocalDate localDate15 = localDate12.minusWeeks((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate15.withWeekOfWeekyear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sun Oct 13 00:00:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate.Property property11 = localDate10.year();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalDate localDate14 = property11.setCopy(1);
        org.joda.time.LocalDate localDate16 = localDate14.withMonthOfYear(6);
        org.joda.time.LocalDate.Property property17 = localDate16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = localDate16.withField(dateTimeFieldType18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime10 = dateTime7.minusYears((int) (short) 1);
        long long11 = dateTime7.getMillis();
        org.joda.time.DateTime dateTime12 = dateTime7.toDateTime();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        int int16 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime15);
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withPeriodAdded(readablePeriod21, (int) (byte) 10);
        org.joda.time.DateTime dateTime24 = localTime15.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology25 = dateTime18.getChronology();
        java.lang.String str26 = chronology25.toString();
        java.lang.Object obj27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj27);
        org.joda.time.DateTime dateTime30 = dateTime28.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime33 = dateTime28.withPeriodAdded(readablePeriod31, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime28.getZone();
        long long37 = dateTimeZone34.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.Chronology chronology39 = chronology25.withZone(dateTimeZone34);
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((java.lang.Object) dateTime7, dateTimeZone34);
        int int42 = dateTimeZone34.getOffsetFromLocal((long) 35412);
        long long45 = dateTimeZone34.adjustOffset((long) 625, true);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1646041819674L + "'", long11 == 1646041819674L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str26, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 11L + "'", long37 == 11L);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 625L + "'", long45 == 625L);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        date5.setYear((int) (short) 0);
        int int9 = date5.getHours();
        int int10 = date5.getHours();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime12.setWeekyear(3);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withPeriodAdded(readablePeriod19, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime16.getZone();
        mutableDateTime12.setZoneRetainFields(dateTimeZone22);
        java.util.TimeZone timeZone24 = dateTimeZone22.toTimeZone();
        java.util.Locale locale25 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone24, locale25);
        int int28 = calendar26.getLeastMaximum(15);
        java.util.Date date34 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.fromDateFields(date34);
        date34.setYear((int) (short) 0);
        int int38 = date34.getHours();
        int int39 = date34.getHours();
        calendar26.setTime(date34);
        boolean boolean41 = date5.after(date34);
        int int42 = date34.getDate();
        java.lang.Object obj43 = date34.clone();
        org.junit.Assert.assertEquals(date5.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 23 + "'", int9 == 23);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 23 + "'", int10 == 23);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone24);
// flaky:         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar26);
        org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=-2181603540000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1900,MONTH=10,WEEK_OF_YEAR=46,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=317,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=1,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50400000 + "'", int28 == 50400000);
        org.junit.Assert.assertEquals(date34.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 23 + "'", int38 == 23);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 23 + "'", int39 == 23);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 13 + "'", int42 == 13);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "Tue Nov 13 23:01:00 UTC 1900");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        date5.setHours(0);
        java.lang.Object obj8 = null;
        boolean boolean9 = date5.equals(obj8);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 00:01:00 UTC 1997");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.plus(readableDuration6);
        java.util.Date date13 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        boolean boolean17 = dateTime7.isSupported(dateTimeFieldType15);
        org.joda.time.DateTime dateTime19 = dateTime7.plusHours(11);
        org.joda.time.DateTime.Property property20 = dateTime7.yearOfEra();
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = property20.getAsText(locale21);
        java.util.Locale locale23 = locale21.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = locale23.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10" + "'", str22, "10");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime1.toMutableDateTime(dateTimeZone9);
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.plus(readablePeriod15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.plus(readableDuration17);
        java.util.Date date24 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.fromDateFields(date24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean27 = localDate25.isSupported(dateTimeFieldType26);
        boolean boolean28 = dateTime18.isSupported(dateTimeFieldType26);
        org.joda.time.DateTime dateTime30 = dateTime18.plusHours(11);
        org.joda.time.DateTime.Property property31 = dateTime18.yearOfEra();
        org.joda.time.DateTime dateTime33 = dateTime18.withMillis(0L);
        boolean boolean34 = mutableDateTime10.isBefore((org.joda.time.ReadableInstant) dateTime33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime36 = dateTime33.withDayOfMonth((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime12.setWeekyear(3);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withPeriodAdded(readablePeriod19, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime16.getZone();
        mutableDateTime12.setZoneRetainFields(dateTimeZone22);
        mutableDateTime1.setZone(dateTimeZone22);
        mutableDateTime1.addWeeks((int) (byte) -1);
        mutableDateTime1.setSecondOfDay(2);
        int int29 = mutableDateTime1.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime1.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime32 = property30.set(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        java.lang.String str16 = mutableDateTime1.toString();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime1.add(readablePeriod17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.set(dateTimeFieldType19, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022-02-28T09:50:20.061Z" + "'", str16, "2022-02-28T09:50:20.061Z");
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(0, (int) (short) 0, 0, 590);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localTime4.getValue(1997);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1997");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime1.toString(dateTimeFormatter13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.MIDNIGHT;
        int int19 = localTime17.compareTo((org.joda.time.ReadablePartial) localTime18);
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withPeriodAdded(readablePeriod24, (int) (byte) 10);
        org.joda.time.DateTime dateTime27 = localTime18.toDateTime((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology28 = dateTime21.getChronology();
        boolean boolean29 = dateTimeFieldType15.isSupported(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.era();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.yearOfCentury();
        java.lang.String str33 = dateTimeField31.getAsText((long) 20);
        int int34 = mutableDateTime1.get(dateTimeField31);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDate((int) (byte) 1, 50400000, 23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50400000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0003-01-01T23:59:59.999Z" + "'", str14, "0003-01-01T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "70" + "'", str33, "70");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        java.util.Date date23 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromDateFields(date23);
        date23.setYear((int) (short) 0);
        int int27 = date23.getHours();
        int int28 = date23.getHours();
        calendar15.setTime(date23);
        calendar15.set(9, 23, 100, 0, 2);
        int int36 = calendar15.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            calendar15.roll((-292275054), 1997);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=-61814361480000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=11,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=69,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=2,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23 + "'", int27 == 23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 23 + "'", int28 == 23);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11 + "'", int36 == 11);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2022-02-11T09:50:08.385Z", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.LocalDate.Property property13 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property13.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate16 = localDate14.withEra(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property18 = localDate16.property(dateTimeFieldType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMonths((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withDayOfMonth(999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.lang.String str14 = dateTimeZone11.getNameKey(1646041808949L);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime15.setMonthOfYear(35418);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35418 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        long long15 = dateTimeZone12.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone12);
        org.joda.time.LocalTime localTime17 = dateTime3.toLocalTime();
        org.joda.time.DateTime dateTime19 = dateTime3.plus((long) (byte) 1);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        int int23 = localTime21.compareTo((org.joda.time.ReadablePartial) localTime22);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime25.withPeriodAdded(readablePeriod28, (int) (byte) 10);
        org.joda.time.DateTime dateTime31 = localTime22.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime33 = dateTime31.minusDays((int) 'a');
        org.joda.time.DateTime dateTime35 = dateTime33.minusMinutes(97);
        boolean boolean36 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime41 = dateTime35.withTime((int) ' ', (int) (byte) 10, 50400000, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11L + "'", long15 == 11L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime9.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime9.add(readableDuration12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.property(dateTimeFieldType14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime2.property(dateTimeFieldType14);
        java.lang.String str17 = dateTimeFieldType14.toString();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hourOfDay" + "'", str17, "hourOfDay");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(11, 14, (int) 'x', 0, 9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate6.plus(readablePeriod13);
        int int15 = localDate6.size();
        int int16 = localDate6.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = localDate6.withEra(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.minuteOfHour();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.setMonthOfYear(8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = mutableDateTime1.toString("-1997-11-13T09:50:11.760Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        java.lang.String str16 = mutableDateTime1.toString();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.MIDNIGHT;
        int int20 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime19);
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withPeriodAdded(readablePeriod25, (int) (byte) 10);
        org.joda.time.DateTime dateTime28 = localTime19.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology29 = dateTime22.getChronology();
        java.lang.String str30 = chronology29.toString();
        java.lang.Object obj31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj31);
        org.joda.time.DateTime dateTime34 = dateTime32.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime37 = dateTime32.withPeriodAdded(readablePeriod35, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime32.getZone();
        long long41 = dateTimeZone38.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.Chronology chronology43 = chronology29.withZone(dateTimeZone38);
        mutableDateTime1.setChronology(chronology29);
        // The following exception was thrown during execution in test generation
        try {
            long long50 = chronology29.getDateTimeMillis((-768686946787187569L), 35412, 7, 35414, 35408);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35412 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022-02-28T09:50:21.288Z" + "'", str16, "2022-02-28T09:50:21.288Z");
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str30, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 11L + "'", long41 == 11L);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(chronology43);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        int int6 = date5.getYear();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromDateFields(date5);
        int int8 = localDateTime7.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = property9.addToCopy(97);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = property9.setCopy("09:50:15.720");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:50:15.720\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        int int6 = date5.getYear();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromDateFields(date5);
        int int8 = localDateTime7.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withHourOfDay(365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("Dec 3, 1909 4:01:00 AM", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.minusMinutes((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withYearOfEra(19);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime18 = localTime16.withSecondOfMinute((int) ' ');
        org.joda.time.LocalTime.Property property19 = localTime16.minuteOfHour();
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfEra((int) (byte) 10);
        boolean boolean24 = dateTime23.isEqualNow();
        java.lang.Object obj25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.withPeriodAdded(readablePeriod29, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime26.getZone();
        long long35 = dateTimeZone32.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime36 = dateTime23.toDateTime(dateTimeZone32);
        org.joda.time.LocalTime localTime37 = dateTime23.toLocalTime();
        org.joda.time.DateTime dateTime39 = dateTime23.plus((long) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime43 = org.joda.time.LocalTime.MIDNIGHT;
        int int44 = localTime42.compareTo((org.joda.time.ReadablePartial) localTime43);
        java.lang.Object obj45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(obj45);
        org.joda.time.DateTime dateTime48 = dateTime46.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.DateTime dateTime51 = dateTime46.withPeriodAdded(readablePeriod49, (int) (byte) 10);
        org.joda.time.DateTime dateTime52 = localTime43.toDateTime((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Chronology chronology53 = dateTime46.getChronology();
        boolean boolean54 = dateTimeFieldType40.isSupported(chronology53);
        int int55 = dateTime39.get(dateTimeFieldType40);
        int int56 = localTime16.get(dateTimeFieldType40);
        java.lang.Object obj57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(obj57);
        org.joda.time.DateTime.Property property59 = dateTime58.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime62 = dateTime58.withField(dateTimeFieldType60, 15);
        int int63 = localTime16.indexOf(dateTimeFieldType60);
        org.joda.time.LocalTime localTime64 = org.joda.time.LocalTime.MIDNIGHT;
        int int65 = localTime64.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property67 = localTime64.property(dateTimeFieldType66);
        org.joda.time.LocalTime localTime68 = property67.withMinimumValue();
        org.joda.time.LocalTime localTime69 = property67.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime71 = property67.addWrapFieldToCopy(97);
        org.joda.time.LocalTime localTime72 = localTime16.withFields((org.joda.time.ReadablePartial) localTime71);
        org.joda.time.LocalTime localTime74 = localTime72.plusMinutes(50400000);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localTime74);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 11L + "'", long35 == 11L);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 590 + "'", int55 == 590);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertNotNull(localTime74);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusHours(0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localTime5.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2022-02-28T09:50:11.910Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-28T09:50:11.910Z\" is malformed at \"Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        java.lang.String str6 = dateTime5.toString();
        int int7 = dateTime5.getSecondOfMinute();
        int int8 = dateTime5.getYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0010-02-11T09:50:21.601Z" + "'", str6, "0010-02-11T09:50:21.601Z");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.plus(readableDuration6);
        java.util.Date date13 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        boolean boolean17 = dateTime7.isSupported(dateTimeFieldType15);
        org.joda.time.DateTime dateTime19 = dateTime7.plusHours(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime7.withDayOfYear(35417252);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35417252 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Fri Aug 29 12:01:00 UTC 1913", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=friaug2912:01:00utc1913");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("1909/12/03 4:01:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1909/12/034:01:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.MIDNIGHT;
        int int10 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime9);
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withPeriodAdded(readablePeriod15, (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology19 = dateTime12.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.months();
        boolean boolean21 = dateTimeFieldType6.isSupported(chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(0, 46, 35414, 86399, (int) (short) 1, 0, chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime1.add(readableDuration13, (int) (byte) -1);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime1.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime18 = property16.set("0010-02-11T09:50:12.561Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0010-02-11T09:50:12.561Z\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.months();
        org.joda.time.DurationField durationField14 = chronology12.hours();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.yearOfCentury();
        java.util.Date date22 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.fromDateFields(date22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean25 = localDate23.isSupported(dateTimeFieldType24);
        org.joda.time.LocalDate localDate27 = localDate23.withEra(0);
        org.joda.time.LocalDate localDate29 = localDate23.withYearOfEra((int) '#');
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.MIDNIGHT;
        int int34 = localTime32.compareTo((org.joda.time.ReadablePartial) localTime33);
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime36.withPeriodAdded(readablePeriod39, (int) (byte) 10);
        org.joda.time.DateTime dateTime42 = localTime33.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology43 = dateTime36.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.secondOfDay();
        long long46 = dateTimeField44.roundFloor(0L);
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime50.setWeekyear(3);
        java.lang.Object obj53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(obj53);
        org.joda.time.DateTime.Property property55 = dateTime54.dayOfMonth();
        org.joda.time.DateTime dateTime56 = property55.withMaximumValue();
        mutableDateTime50.setMillis((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTimeField dateTimeField58 = null;
        mutableDateTime50.setRounding(dateTimeField58);
        org.joda.time.ReadableDuration readableDuration60 = null;
        mutableDateTime50.add(readableDuration60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime50.era();
        java.lang.String str63 = property62.getName();
        org.joda.time.DateTimeField dateTimeField64 = property62.getField();
        long long67 = dateTimeField64.addWrapField((long) 10, (int) (short) -1);
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime70 = org.joda.time.LocalTime.MIDNIGHT;
        int int71 = localTime69.compareTo((org.joda.time.ReadablePartial) localTime70);
        org.joda.time.LocalTime.Property property72 = localTime69.minuteOfHour();
        org.joda.time.LocalTime localTime73 = property72.getLocalTime();
        org.joda.time.LocalTime localTime74 = property72.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime75 = property72.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime77 = property72.addCopy(15);
        int[] intArray84 = new int[] { (byte) 1, 11, (short) 100, (-1), (short) 100, 4 };
        int int85 = dateTimeField64.getMinimumValue((org.joda.time.ReadablePartial) localTime77, intArray84);
        int int86 = dateTimeField44.getMaximumValue((org.joda.time.ReadablePartial) localTime48, intArray84);
        java.util.Locale locale88 = java.util.Locale.JAPANESE;
        boolean boolean89 = locale88.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray90 = dateTimeField16.set((org.joda.time.ReadablePartial) localDate29, 35419, intArray84, "0001-01-01T00:00:00.000Z", locale88);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0001-01-01T00:00:00.000Z\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "era" + "'", str63, "era");
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-124334351999990L) + "'", long67 == (-124334351999990L));
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[1, 11, 100, -1, 100, 4]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 86399 + "'", int86 == 86399);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "ja");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.minusMinutes((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withEra(21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        long long18 = calendar15.getTimeInMillis();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(chronology19);
        org.joda.time.LocalTime localTime22 = localTime20.withSecondOfMinute((int) (short) 1);
        java.lang.String str23 = localTime20.toString();
        org.joda.time.LocalTime localTime25 = localTime20.withMinuteOfHour(15);
        org.joda.time.LocalTime localTime27 = localTime25.plusMillis(590);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        boolean boolean29 = calendar15.after((java.lang.Object) property28);
        java.lang.String str30 = calendar15.getCalendarType();
        // The following exception was thrown during execution in test generation
        try {
            int int32 = calendar15.getLeastMaximum((-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -292275054");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573021985,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=21,MILLISECOND=985,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1644573021985L + "'", long18 == 1644573021985L);
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "09:50:21.985" + "'", str23, "09:50:21.985");
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "gregory" + "'", str30, "gregory");
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        int int2 = localDateTime0.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMonths(14);
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.secondOfMinute();
        java.util.Locale locale9 = java.util.Locale.ROOT;
        java.lang.String str10 = locale9.getDisplayScript();
        java.util.Locale locale11 = java.util.Locale.ROOT;
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str14 = locale9.getDisplayCountry(locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = property7.setCopy("2022-02-11T09:50:08.385Z", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:50:08.385Z\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("10", (java.lang.Throwable) iOException2);
        java.lang.String str4 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException: hi!" + "'", str4, "java.io.IOException: hi!");
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=+00:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        java.lang.String str13 = chronology12.toString();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime14.withMinuteOfHour(625);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 625 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str13, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = localTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        java.util.Date date10 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.fromDateFields(date10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean13 = localDate11.isSupported(dateTimeFieldType12);
        org.joda.time.LocalDate localDate15 = localDate11.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int17 = localDate11.indexOf(dateTimeFieldType16);
        org.joda.time.LocalDate.Property property18 = localDate11.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) '4', dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight23 = localDate11.toDateMidnight(dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) localTime1, dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateMidnight23);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        java.lang.String str14 = property13.getName();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        java.util.Locale locale16 = java.util.Locale.CHINA;
        int int17 = property13.getMaximumTextLength(locale16);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.parse("2022-02-28T09:50:17.835Z");
        // The following exception was thrown during execution in test generation
        try {
            long long20 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "era" + "'", str14, "era");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime19);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        int int2 = localDateTime0.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMonths(14);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.plusMillis((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime0.withDayOfMonth(35417252);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35417252 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate.Property property11 = localDate10.year();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalDate localDate14 = property11.setCopy(1);
        org.joda.time.LocalDate localDate15 = property11.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField16 = property11.getField();
        java.lang.Object obj19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.plus(readablePeriod23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.plus(readableDuration25);
        java.util.Date date32 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate33 = org.joda.time.LocalDate.fromDateFields(date32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean35 = localDate33.isSupported(dateTimeFieldType34);
        boolean boolean36 = dateTime26.isSupported(dateTimeFieldType34);
        org.joda.time.DateTime dateTime38 = dateTime26.plusHours(11);
        org.joda.time.DateTime.Property property39 = dateTime26.yearOfEra();
        java.util.Locale locale40 = java.util.Locale.FRENCH;
        java.lang.String str41 = property39.getAsText(locale40);
        // The following exception was thrown during execution in test generation
        try {
            long long42 = dateTimeField16.set((long) 9, "2022-02-28T09:50:05.336Z", locale40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-28T09:50:05.336Z\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "10" + "'", str41, "10");
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        int int16 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime15);
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withPeriodAdded(readablePeriod21, (int) (byte) 10);
        org.joda.time.DateTime dateTime24 = localTime15.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology25 = dateTime18.getChronology();
        boolean boolean26 = dateTimeFieldType12.isSupported(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime11.withField(dateTimeFieldType12, 10);
        org.joda.time.DateTime.Property property29 = dateTime28.year();
        org.joda.time.DateTime dateTime30 = property29.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.util.Date date5 = new java.util.Date(10, (int) (byte) -1, (-1), 100, (int) (byte) 1);
        int int6 = date5.getDate();
        java.time.Instant instant7 = date5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime9.setWeekyear(3);
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime dateTime15 = dateTime13.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withPeriodAdded(readablePeriod16, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime13.getZone();
        mutableDateTime9.setZoneRetainFields(dateTimeZone19);
        java.util.TimeZone timeZone21 = dateTimeZone19.toTimeZone();
        java.util.Locale locale22 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone21, locale22);
        int int25 = calendar23.getLeastMaximum(15);
        java.util.Date date31 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.fromDateFields(date31);
        date31.setYear((int) (short) 0);
        int int35 = date31.getHours();
        int int36 = date31.getHours();
        calendar23.setTime(date31);
        calendar23.add(0, (-27409550));
        java.lang.String str41 = calendar23.getCalendarType();
        java.util.Date date47 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate48 = org.joda.time.LocalDate.fromDateFields(date47);
        date47.setYear((int) (short) 0);
        int int51 = date47.getHours();
        int int52 = date47.getHours();
        java.time.Instant instant53 = date47.toInstant();
        int int54 = date47.getTimezoneOffset();
        calendar23.setTime(date47);
        int int56 = date5.compareTo(date47);
        org.junit.Assert.assertEquals(date5.toString(), "Fri Dec 03 04:01:00 UTC 1909");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(timeZone21);
// flaky:         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar23);
        org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=-2181603540000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1900,MONTH=10,WEEK_OF_YEAR=46,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=317,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=1,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 50400000 + "'", int25 == 50400000);
        org.junit.Assert.assertEquals(date31.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 23 + "'", int35 == 23);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 23 + "'", int36 == 23);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "gregory" + "'", str41, "gregory");
        org.junit.Assert.assertEquals(date47.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 23 + "'", int51 == 23);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 23 + "'", int52 == 23);
        org.junit.Assert.assertNotNull(instant53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(11);
        org.joda.time.LocalDate.Property property13 = localDate12.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField15 = localDate12.getField(999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 999");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime localTime3 = localTime1.withSecondOfMinute((int) (short) 1);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime6 = property4.addNoWrapToCopy(0);
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localTime8.toString("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: U");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        // The following exception was thrown during execution in test generation
        try {
            calendar15.clear(35414);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35414");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573022789,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=22,MILLISECOND=789,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("09:50:21.143");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '09:50:21.143' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime dateTime5 = dateTime2.withField(dateTimeFieldType3, (int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime2.withDurationAdded(readableDuration6, (int) (byte) 10);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.MIDNIGHT;
        int int12 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime11);
        java.lang.Object obj13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withPeriodAdded(readablePeriod17, (int) (byte) 10);
        org.joda.time.DateTime dateTime20 = localTime11.toDateTime((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime.Property property21 = dateTime20.weekOfWeekyear();
        org.joda.time.DateTime dateTime23 = property21.addWrapFieldToCopy(10);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        boolean boolean25 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime.Property property26 = dateTime8.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        int int28 = dateTime8.get(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1970 + "'", int28 == 1970);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        int int2 = localDateTime0.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMonths(14);
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime9 = property7.roundHalfEvenCopy();
        java.lang.String str10 = property7.toString();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[monthOfYear]" + "'", str10, "Property[monthOfYear]");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate.Property property11 = localDate10.year();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalDate localDate14 = property11.setCopy(1);
        org.joda.time.LocalDate localDate16 = localDate14.withMonthOfYear(6);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDate16.getValue((int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 120");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("monthOfYear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"monthOfYear\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property3 = localTime0.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        org.joda.time.LocalTime localTime5 = property3.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.LocalTime localTime7 = property3.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localTime7.getValue(42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 42");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfDay();
        long long15 = dateTimeField13.roundFloor(0L);
        long long17 = dateTimeField13.roundCeiling((long) 617);
        java.util.Locale locale18 = java.util.Locale.ROOT;
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.lang.String str20 = locale18.getDisplayCountry(locale19);
        int int21 = dateTimeField13.getMaximumShortTextLength(locale18);
        java.lang.Object obj22 = locale18.clone();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1000L + "'", long17 == 1000L);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("10", (java.lang.Throwable) iOException2);
        java.lang.String str4 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException: 10" + "'", str4, "java.io.IOException: 10");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromCalendarFields(calendar15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        int int21 = localTime19.compareTo((org.joda.time.ReadablePartial) localTime20);
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.DateTime dateTime25 = dateTime23.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime23.withPeriodAdded(readablePeriod26, (int) (byte) 10);
        org.joda.time.DateTime dateTime29 = localTime20.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology30 = dateTime23.getChronology();
        java.lang.String str31 = chronology30.toString();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType17.getField(chronology30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime35 = localTime16.withField(dateTimeFieldType17, 32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573023138,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=23,MILLISECOND=138,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str31, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes(2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime1.withTime(0, 2022, 53, 42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh_tw");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("-1996-10-13", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("0003-01-01T23:59:59.999Z", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=0003-01-01t23:59:59.999z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.plus(readableDuration6);
        java.util.Date date13 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        boolean boolean17 = dateTime7.isSupported(dateTimeFieldType15);
        org.joda.time.DateTime dateTime19 = dateTime7.plusHours(11);
        org.joda.time.DateTime.Property property20 = dateTime7.yearOfEra();
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = property20.getAsText(locale21);
        java.lang.String str23 = locale21.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10" + "'", str22, "10");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fr" + "'", str23, "fr");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(11);
        org.joda.time.LocalDate localDate14 = localDate10.withWeekyear(10);
        org.joda.time.LocalDate.Property property15 = localDate10.yearOfCentury();
        java.util.Locale locale17 = java.util.Locale.JAPANESE;
        boolean boolean18 = locale17.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = property15.setCopy("09:50:15.720", locale17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:50:15.720\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ja");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.LocalDate.Property property13 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property13.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate16 = localDate14.withEra(1);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime20 = localTime18.withSecondOfMinute((int) ' ');
        org.joda.time.LocalTime.Property property21 = localTime18.minuteOfHour();
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.DateTime dateTime25 = dateTime23.withYearOfEra((int) (byte) 10);
        boolean boolean26 = dateTime25.isEqualNow();
        java.lang.Object obj27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj27);
        org.joda.time.DateTime dateTime30 = dateTime28.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime33 = dateTime28.withPeriodAdded(readablePeriod31, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime28.getZone();
        long long37 = dateTimeZone34.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime38 = dateTime25.toDateTime(dateTimeZone34);
        org.joda.time.LocalTime localTime39 = dateTime25.toLocalTime();
        org.joda.time.DateTime dateTime41 = dateTime25.plus((long) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.MIDNIGHT;
        int int46 = localTime44.compareTo((org.joda.time.ReadablePartial) localTime45);
        java.lang.Object obj47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(obj47);
        org.joda.time.DateTime dateTime50 = dateTime48.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.DateTime dateTime53 = dateTime48.withPeriodAdded(readablePeriod51, (int) (byte) 10);
        org.joda.time.DateTime dateTime54 = localTime45.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Chronology chronology55 = dateTime48.getChronology();
        boolean boolean56 = dateTimeFieldType42.isSupported(chronology55);
        int int57 = dateTime41.get(dateTimeFieldType42);
        int int58 = localTime18.get(dateTimeFieldType42);
        java.lang.Object obj59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(obj59);
        org.joda.time.DateTime.Property property61 = dateTime60.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime64 = dateTime60.withField(dateTimeFieldType62, 15);
        int int65 = localTime18.indexOf(dateTimeFieldType62);
        org.joda.time.LocalTime localTime66 = org.joda.time.LocalTime.MIDNIGHT;
        int int67 = localTime66.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property69 = localTime66.property(dateTimeFieldType68);
        org.joda.time.LocalTime localTime70 = property69.withMinimumValue();
        org.joda.time.LocalTime localTime71 = property69.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime73 = property69.addWrapFieldToCopy(97);
        org.joda.time.LocalTime localTime74 = localTime18.withFields((org.joda.time.ReadablePartial) localTime73);
        // The following exception was thrown during execution in test generation
        try {
            int int75 = localDate16.compareTo((org.joda.time.ReadablePartial) localTime74);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 11L + "'", long37 == 11L);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 590 + "'", int57 == 590);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(localTime74);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withEra(4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573023630,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=23,MILLISECOND=630,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.months();
        org.joda.time.DurationField durationField14 = chronology12.hours();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.weekyearOfCentury();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.now(chronology12);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = chronology12.get(readablePeriod17, (long) 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(4, (int) (byte) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder7 = builder4.setWeekDefinition(365, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate6.withPeriodAdded(readablePeriod13, 100);
        org.joda.time.LocalDate.Property property16 = localDate6.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = property16.setCopy("09:50:04.464");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:50:04.464\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getDisplayName();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.MIDNIGHT;
        int int10 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime9);
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withPeriodAdded(readablePeriod15, (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology19 = dateTime12.getChronology();
        boolean boolean20 = dateTimeFieldType6.isSupported(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.era();
        org.joda.time.DurationField durationField22 = chronology19.seconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) str5, chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        java.lang.String str14 = property13.getName();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        java.util.Date date21 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.fromDateFields(date21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean24 = localDate22.isSupported(dateTimeFieldType23);
        org.joda.time.LocalDate localDate26 = localDate22.withEra(0);
        org.joda.time.LocalDate localDate28 = localDate22.plusMonths((int) (byte) -1);
        int int29 = dateTimeField15.getMaximumValue((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.LocalDate localDate31 = localDate28.plusWeeks(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate33 = localDate31.withWeekOfWeekyear(617);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 617 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "era" + "'", str14, "era");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(localDate31);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.withPeriodAdded(readablePeriod4, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime1.getZone();
        long long10 = dateTimeZone7.convertLocalToUTC((long) 11, true);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withField(dateTimeFieldType12, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(4, (int) (byte) 100, (int) (short) 0);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.lang.String str6 = locale5.getDisplayCountry();
        java.util.Calendar.Builder builder7 = builder4.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder10 = builder4.set(590, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.util.Date date5 = new java.util.Date(10, (int) (byte) -1, (-1), 100, (int) (byte) 1);
        java.lang.String str6 = date5.toString();
        org.junit.Assert.assertEquals(date5.toString(), "Fri Dec 03 04:01:00 UTC 1909");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Fri Dec 03 04:01:00 UTC 1909" + "'", str6, "Fri Dec 03 04:01:00 UTC 1909");
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate.Property property11 = localDate10.year();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalDate localDate14 = property11.setCopy(1);
        org.joda.time.LocalDate localDate16 = localDate14.withMonthOfYear(6);
        org.joda.time.LocalDate.Property property17 = localDate16.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = property17.setCopy("0010-02-11T09:50:13.513Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0010-02-11T09:50:13.513Z\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) (short) -1, 46, 0, 4, 6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        java.lang.String str13 = chronology12.toString();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        java.lang.String str16 = property15.toString();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str13, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Property[era]" + "'", str16, "Property[era]");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("2022-02-28T09:50:17.076Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-28T09:50:17.076Z\" is malformed at \"22-02-28T09:50:17.076Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.util.Date date5 = new java.util.Date(10, (int) (byte) -1, (-1), 100, (int) (byte) 1);
        int int6 = date5.getDate();
        int int7 = date5.getMonth();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromDateFields(date5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Dec 03 04:01:00 UTC 1909");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        java.util.GregorianCalendar gregorianCalendar5 = dateTime3.toGregorianCalendar();
        boolean boolean6 = gregorianCalendar5.isLenient();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = calendar15.isSet(41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573024659,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=24,MILLISECOND=659,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        boolean boolean14 = dateTimeFieldType0.isSupported(chronology13);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(chronology13);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology13);
        int int17 = dateTime16.getDayOfWeek();
        int int18 = dateTime16.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime16.withField(dateTimeFieldType19, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfYear((int) (short) 1);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = dateTime5.withChronology(chronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime9.withDate((-27409550), 50, 590);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        mutableDateTime1.setSecondOfDay(4);
        mutableDateTime1.addMinutes(1);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime13 = localTime11.withSecondOfMinute((int) ' ');
        org.joda.time.LocalTime.Property property14 = localTime11.minuteOfHour();
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) (byte) 10);
        boolean boolean19 = dateTime18.isEqualNow();
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withPeriodAdded(readablePeriod24, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime21.getZone();
        long long30 = dateTimeZone27.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime31 = dateTime18.toDateTime(dateTimeZone27);
        org.joda.time.LocalTime localTime32 = dateTime18.toLocalTime();
        org.joda.time.DateTime dateTime34 = dateTime18.plus((long) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime38 = org.joda.time.LocalTime.MIDNIGHT;
        int int39 = localTime37.compareTo((org.joda.time.ReadablePartial) localTime38);
        java.lang.Object obj40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(obj40);
        org.joda.time.DateTime dateTime43 = dateTime41.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime46 = dateTime41.withPeriodAdded(readablePeriod44, (int) (byte) 10);
        org.joda.time.DateTime dateTime47 = localTime38.toDateTime((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Chronology chronology48 = dateTime41.getChronology();
        boolean boolean49 = dateTimeFieldType35.isSupported(chronology48);
        int int50 = dateTime34.get(dateTimeFieldType35);
        int int51 = localTime11.get(dateTimeFieldType35);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime1.property(dateTimeFieldType35);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime56 = org.joda.time.LocalTime.MIDNIGHT;
        int int57 = localTime55.compareTo((org.joda.time.ReadablePartial) localTime56);
        java.lang.Object obj58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(obj58);
        org.joda.time.DateTime dateTime61 = dateTime59.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        org.joda.time.DateTime dateTime64 = dateTime59.withPeriodAdded(readablePeriod62, (int) (byte) 10);
        org.joda.time.DateTime dateTime65 = localTime56.toDateTime((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Chronology chronology66 = dateTime59.getChronology();
        boolean boolean67 = dateTimeFieldType53.isSupported(chronology66);
        org.joda.time.DateTimeField dateTimeField68 = chronology66.era();
        mutableDateTime1.setChronology(chronology66);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfMonth((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 11L + "'", long30 == 11L);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 590 + "'", int50 == 590);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(dateTimeField68);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime10 = dateTime7.minusYears((int) (short) 1);
        long long11 = dateTime7.getMillis();
        java.util.Date date12 = dateTime7.toDate();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromDateFields(date12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean15 = date12.equals((java.lang.Object) dateTimeFieldType14);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1646041824957L + "'", long11 == 1646041824957L);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Feb 28 09:50:24 UTC 2022");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        long long15 = dateTimeZone12.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone12);
        org.joda.time.LocalTime localTime17 = dateTime3.toLocalTime();
        org.joda.time.DateTime dateTime19 = dateTime3.plus((long) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime21.setWeekyear(3);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfMonth();
        org.joda.time.DateTime dateTime27 = property26.withMaximumValue();
        mutableDateTime21.setMillis((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeField dateTimeField29 = null;
        mutableDateTime21.setRounding(dateTimeField29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime32.setWeekyear(3);
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime36.withPeriodAdded(readablePeriod39, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime36.getZone();
        mutableDateTime32.setZoneRetainFields(dateTimeZone42);
        mutableDateTime21.setZone(dateTimeZone42);
        mutableDateTime21.addWeeks((int) (byte) -1);
        boolean boolean47 = dateTime19.isEqual((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.DateTime dateTime49 = dateTime19.plusDays((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime54 = dateTime49.withTime(35418, (int) (short) 1, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35418 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11L + "'", long15 == 11L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTime49);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime dateTime5 = dateTime2.withField(dateTimeFieldType3, (int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar6 = dateTime5.toGregorianCalendar();
        java.time.Instant instant7 = gregorianCalendar6.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = gregorianCalendar6.getMinimum((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(instant7);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        long long15 = dateTimeZone12.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone12);
        org.joda.time.LocalTime localTime17 = dateTime3.toLocalTime();
        org.joda.time.DateTime dateTime19 = dateTime3.plus((long) (byte) 1);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        int int23 = localTime21.compareTo((org.joda.time.ReadablePartial) localTime22);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime25.withPeriodAdded(readablePeriod28, (int) (byte) 10);
        org.joda.time.DateTime dateTime31 = localTime22.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime33 = dateTime31.minusDays((int) 'a');
        org.joda.time.DateTime dateTime35 = dateTime33.minusMinutes(97);
        boolean boolean36 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime.Property property38 = dateTime3.property(dateTimeFieldType37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime40 = dateTime3.withDayOfMonth(86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11L + "'", long15 == 11L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(property38);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfDay();
        org.joda.time.DurationField durationField14 = chronology12.millis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) chronology12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = localTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        int int13 = property4.getDifference((org.joda.time.ReadableInstant) dateTime6);
        int int14 = dateTime6.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) int14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-27409550) + "'", int13 == (-27409550));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime localTime3 = localTime1.withSecondOfMinute((int) (short) 1);
        java.lang.String str4 = localTime1.toString();
        org.joda.time.LocalTime localTime6 = localTime1.withMinuteOfHour(15);
        org.joda.time.LocalTime localTime8 = localTime1.plusSeconds(232);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localTime1.toString("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "09:50:25.263" + "'", str4, "09:50:25.263");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        mutableDateTime1.setSecondOfDay(4);
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime1.add(readableDuration8, (int) '4');
        java.util.Date date17 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.fromDateFields(date17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean20 = localDate18.isSupported(dateTimeFieldType19);
        org.joda.time.LocalDate localDate22 = localDate18.withEra(0);
        org.joda.time.LocalDate.Property property23 = localDate22.year();
        org.joda.time.LocalDate localDate24 = property23.withMaximumValue();
        org.joda.time.LocalDate localDate26 = property23.setCopy(1);
        java.util.Locale locale28 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str29 = locale28.getLanguage();
        java.lang.String str30 = locale28.getISO3Language();
        java.lang.String str31 = localDate26.toString("09:50:04.464", locale28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = mutableDateTime1.toString("2022-02-28T09:50:24.915Z", locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date17.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh" + "'", str29, "zh");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zho" + "'", str30, "zho");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "09:50:04.464" + "'", str31, "09:50:04.464");
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = calendar15.getActualMaximum(232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 232");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573025392,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=25,MILLISECOND=392,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDateTime2.getValue(35417252);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35417252");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguageTag("2022-02-28T09:50:19.831Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 2022 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.millisOfDay();
        org.joda.time.Chronology chronology15 = mutableDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        java.lang.String str18 = dateTimeField16.getAsShortText(0L);
        int int21 = dateTimeField16.getDifference(35408L, 1646041814162L);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = dateTimeField16.set(1644573012231L, "09:50:04.464");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:50:04.464\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "70" + "'", str18, "70");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-52) + "'", int21 == (-52));
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int12 = localDate6.indexOf(dateTimeFieldType11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property14 = localDate6.property(dateTimeFieldType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        int int2 = mutableDateTime1.getSecondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMonthOfYear((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35425 + "'", int2 == 35425);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(10L, chronology1);
        org.joda.time.LocalDate.Property property3 = localDate2.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str5 = dateTimeFieldType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate2.withField(dateTimeFieldType4, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "minuteOfDay" + "'", str5, "minuteOfDay");
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.eras();
        boolean boolean4 = localDateTime2.isSupported(durationFieldType3);
        boolean boolean5 = localDateTime0.isSupported(durationFieldType3);
        int int6 = localDateTime0.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("en-US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: en-US");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.minusHours(0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = property13.setCopy((-52));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -52 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property3 = localTime0.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        org.joda.time.LocalTime localTime5 = property3.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = property3.addWrapFieldToCopy(97);
        org.joda.time.LocalTime localTime9 = property3.addCopy(1644573014993L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = property3.setCopy("0");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguage("1");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 1 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        int int8 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime7);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withPeriodAdded(readablePeriod13, (int) (byte) 10);
        org.joda.time.DateTime dateTime16 = localTime7.toDateTime((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Chronology chronology17 = dateTime10.getChronology();
        java.lang.String str18 = chronology17.toString();
        java.lang.Object obj19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime20.withPeriodAdded(readablePeriod23, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime20.getZone();
        long long29 = dateTimeZone26.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.Chronology chronology31 = chronology17.withZone(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime33.setWeekyear(3);
        java.lang.Object obj36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj36);
        org.joda.time.DateTime dateTime39 = dateTime37.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime42 = dateTime37.withPeriodAdded(readablePeriod40, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime37.getZone();
        mutableDateTime33.setZoneRetainFields(dateTimeZone43);
        java.lang.String str46 = dateTimeZone43.getNameKey(1646041808949L);
        boolean boolean47 = dateTimeZone43.isFixed();
        org.joda.time.Chronology chronology48 = chronology31.withZone(dateTimeZone43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(20, 61200000, (int) (short) 0, 5, 1997, chronology31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1997 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str18, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 11L + "'", long29 == 11L);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTC" + "'", str46, "UTC");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(chronology48);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        int int8 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime7);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withPeriodAdded(readablePeriod13, (int) (byte) 10);
        org.joda.time.DateTime dateTime16 = localTime7.toDateTime((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Chronology chronology17 = dateTime10.getChronology();
        boolean boolean18 = dateTimeFieldType4.isSupported(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = localTime2.withField(dateTimeFieldType4, 2020);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2020 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.withYearOfEra((int) '#');
        org.joda.time.LocalDate localDate14 = localDate6.withYearOfCentury((int) 'a');
        org.joda.time.LocalDate.Property property15 = localDate14.year();
        org.joda.time.LocalDate localDate17 = property15.addWrapFieldToCopy((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = localDate17.toString("Japan");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime1.add(readableDuration13, (int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.property(dateTimeFieldType16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime19.setWeekyear(3);
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfMonth();
        org.joda.time.DateTime dateTime25 = property24.withMaximumValue();
        mutableDateTime19.setMillis((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeField dateTimeField27 = null;
        mutableDateTime19.setRounding(dateTimeField27);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime30.setWeekyear(3);
        java.lang.Object obj33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(obj33);
        org.joda.time.DateTime dateTime36 = dateTime34.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.DateTime dateTime39 = dateTime34.withPeriodAdded(readablePeriod37, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime34.getZone();
        mutableDateTime30.setZoneRetainFields(dateTimeZone40);
        mutableDateTime19.setZone(dateTimeZone40);
        mutableDateTime19.addWeeks((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime19.millisOfDay();
        long long46 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime49.setWeekyear(3);
        java.lang.Object obj52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(obj52);
        org.joda.time.DateTime dateTime55 = dateTime53.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.DateTime dateTime58 = dateTime53.withPeriodAdded(readablePeriod56, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone59 = dateTime53.getZone();
        mutableDateTime49.setZoneRetainFields(dateTimeZone59);
        java.util.TimeZone timeZone61 = dateTimeZone59.toTimeZone();
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate(dateTimeZone59);
        long long66 = dateTimeZone59.convertLocalToUTC(0L, true, (long) (short) 1);
        boolean boolean67 = dateTimeZone59.isFixed();
        java.lang.Object obj68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(obj68);
        org.joda.time.DateTime dateTime71 = dateTime69.withYearOfEra((int) (byte) 10);
        java.lang.Object obj72 = null;
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime(obj72);
        org.joda.time.DateTime dateTime75 = dateTime73.withYearOfEra((int) (byte) 10);
        boolean boolean76 = dateTime71.isEqual((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime.Property property77 = dateTime71.monthOfYear();
        int int78 = dateTimeZone59.getOffset((org.joda.time.ReadableInstant) dateTime71);
        mutableDateTime19.setZone(dateTimeZone59);
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime81.setWeekyear(3);
        java.lang.Object obj84 = null;
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime(obj84);
        org.joda.time.DateTime.Property property86 = dateTime85.dayOfMonth();
        org.joda.time.DateTime dateTime87 = property86.withMaximumValue();
        mutableDateTime81.setMillis((org.joda.time.ReadableInstant) dateTime87);
        org.joda.time.DateTimeField dateTimeField89 = null;
        mutableDateTime81.setRounding(dateTimeField89);
        org.joda.time.ReadableDuration readableDuration91 = null;
        mutableDateTime81.add(readableDuration91);
        org.joda.time.MutableDateTime.Property property93 = mutableDateTime81.era();
        org.joda.time.MutableDateTime.Property property94 = mutableDateTime81.millisOfDay();
        org.joda.time.Chronology chronology95 = mutableDateTime81.getChronology();
        org.joda.time.DateTimeField dateTimeField96 = chronology95.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField97 = chronology95.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField98 = chronology95.millisOfSecond();
        mutableDateTime19.setChronology(chronology95);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-105353L) + "'", long46 == (-105353L));
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(timeZone61);
// flaky:         org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(property93);
        org.junit.Assert.assertNotNull(property94);
        org.junit.Assert.assertNotNull(chronology95);
        org.junit.Assert.assertNotNull(dateTimeField96);
        org.junit.Assert.assertNotNull(dateTimeField97);
        org.junit.Assert.assertNotNull(dateTimeField98);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(10L, chronology1);
        org.joda.time.LocalDate.Property property3 = localDate2.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField5 = localDate2.getField(86399);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 86399");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime dateTime5 = dateTime2.withField(dateTimeFieldType3, (int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime2.withDurationAdded(readableDuration6, (int) (byte) 10);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.MIDNIGHT;
        int int12 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime11);
        java.lang.Object obj13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withPeriodAdded(readablePeriod17, (int) (byte) 10);
        org.joda.time.DateTime dateTime20 = localTime11.toDateTime((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime.Property property21 = dateTime20.weekOfWeekyear();
        org.joda.time.DateTime dateTime23 = property21.addWrapFieldToCopy(10);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        boolean boolean25 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime27 = dateTime8.minusMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = dateTime27.withEra(590);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 590 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        int int2 = localDateTime0.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(9);
        int[] intArray5 = localDateTime4.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withSecondOfMinute(35425);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35425 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2021, 5, 11, 35426368]");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(4, (int) (byte) 100, (int) (short) 0);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.lang.String str6 = locale5.getDisplayCountry();
        java.util.Calendar.Builder builder7 = builder4.setLocale(locale5);
        java.util.Date date13 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        int int14 = date13.getYear();
        int int15 = date13.getMinutes();
        java.util.Date date22 = new java.util.Date((int) '4', (int) (short) 0, (int) 'a', (int) (short) 1, (int) 'a', 100);
        boolean boolean23 = date13.after(date22);
        int int24 = date22.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder25 = builder7.setInstant(date22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Apr 06 02:38:40 UTC 1952");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(4, (int) (byte) 100, (int) (short) 0);
        java.util.Calendar.Builder builder6 = builder4.setLenient(false);
        java.util.Calendar.Builder builder8 = builder6.setLenient(false);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.MIDNIGHT;
        int int12 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime11);
        java.lang.Object obj13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withPeriodAdded(readablePeriod17, (int) (byte) 10);
        org.joda.time.DateTime dateTime20 = localTime11.toDateTime((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Chronology chronology21 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.secondOfDay();
        long long24 = dateTimeField22.roundFloor(0L);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime28.setWeekyear(3);
        java.lang.Object obj31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj31);
        org.joda.time.DateTime.Property property33 = dateTime32.dayOfMonth();
        org.joda.time.DateTime dateTime34 = property33.withMaximumValue();
        mutableDateTime28.setMillis((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeField dateTimeField36 = null;
        mutableDateTime28.setRounding(dateTimeField36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutableDateTime28.add(readableDuration38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime28.era();
        java.lang.String str41 = property40.getName();
        org.joda.time.DateTimeField dateTimeField42 = property40.getField();
        long long45 = dateTimeField42.addWrapField((long) 10, (int) (short) -1);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime48 = org.joda.time.LocalTime.MIDNIGHT;
        int int49 = localTime47.compareTo((org.joda.time.ReadablePartial) localTime48);
        org.joda.time.LocalTime.Property property50 = localTime47.minuteOfHour();
        org.joda.time.LocalTime localTime51 = property50.getLocalTime();
        org.joda.time.LocalTime localTime52 = property50.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime53 = property50.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime55 = property50.addCopy(15);
        int[] intArray62 = new int[] { (byte) 1, 11, (short) 100, (-1), (short) 100, 4 };
        int int63 = dateTimeField42.getMinimumValue((org.joda.time.ReadablePartial) localTime55, intArray62);
        int int64 = dateTimeField22.getMaximumValue((org.joda.time.ReadablePartial) localTime26, intArray62);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder65 = builder8.setFields(intArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "era" + "'", str41, "era");
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-124334351999990L) + "'", long45 == (-124334351999990L));
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, 11, 100, -1, 100, 4]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 86399 + "'", int64 == 86399);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone11.toTimeZone();
        java.util.Locale locale16 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.LocalDateTime localDateTime19 = dateTime18.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withDurationAdded(readableDuration20, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.minusMonths(0);
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusHours(0);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.minusMinutes((int) (byte) 10);
        java.util.Locale locale31 = java.util.Locale.CHINESE;
        java.lang.String str32 = localDateTime24.toString("10", locale31);
        java.lang.String str33 = locale16.getDisplayName(locale31);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone14, locale16);
        calendar34.clear();
        java.util.TimeZone timeZone36 = calendar34.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int38 = calendar34.getActualMaximum(46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 46");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertEquals(locale16.toString(), "09:50:02.357");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10" + "'", str32, "10");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "09:50:02.357" + "'", str33, "09:50:02.357");
        org.junit.Assert.assertNotNull(calendar34);
        org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(timeZone36);
// flaky:         org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("2022-02-28T09:50:17.835Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getActualMaximum(6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = calendar15.isSet((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573026545,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=26,MILLISECOND=545,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 365 + "'", int17 == 365);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime6 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime9 = property4.addCopy(15);
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = locale11.getDisplayScript();
        org.joda.time.LocalTime localTime13 = property4.setCopy("10", locale11);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime16 = localTime13.withPeriodAdded(readablePeriod14, 46);
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.lang.String str19 = locale18.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localTime13.toString("2022-02-11T09:50:23.849Z", locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zho" + "'", str19, "zho");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2022-02-28T09:50:25.291Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-28t09:50:25.291z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(35414, (int) 'x', 50400000, 35419, 8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35419 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        long long4 = dateTimeZone1.previousTransition(1L);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime6.setWeekyear(3);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withPeriodAdded(readablePeriod13, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime10.getZone();
        mutableDateTime6.setZoneRetainFields(dateTimeZone16);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, (long) 35408);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 4, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone1);
        mutableDateTime21.addWeeks(19);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime21.era();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) mutableDateTime21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35408L + "'", long19 == 35408L);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(21, (int) (short) 10, (int) (short) 10, 2, 2019);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2019 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime2.setWeekyear(3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        mutableDateTime2.setZoneRetainFields(dateTimeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(1646041809840L, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime18.setWeekyear(3);
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property23.withMaximumValue();
        mutableDateTime18.setMillis((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTimeField dateTimeField26 = null;
        mutableDateTime18.setRounding(dateTimeField26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutableDateTime18.add(readableDuration28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutableDateTime18.add(readableDuration30, (int) (byte) -1);
        java.util.Date date38 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate39 = org.joda.time.LocalDate.fromDateFields(date38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean41 = localDate39.isSupported(dateTimeFieldType40);
        int int42 = mutableDateTime18.get(dateTimeFieldType40);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.set(dateTimeFieldType40, 32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 9 + "'", int42 == 9);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.util.Date date5 = new java.util.Date(10, (int) (byte) -1, (-1), 100, (int) (byte) 1);
        int int6 = date5.getDate();
        java.util.Date date12 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        boolean boolean13 = date5.before(date12);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localTime14.get(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Dec 03 04:01:00 UTC 1909");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
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
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.DateTime dateTime4 = dateTime1.plusDays(11);
        org.joda.time.DateTime.Property property5 = dateTime4.era();
        org.joda.time.DateTime dateTime6 = property5.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime6.withTime(6018575, 1, (int) (short) -1, 317);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6018575 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minus(readablePeriod8);
        int int10 = localDateTime9.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("German", "2022-02-11T09:50:06.992Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: German [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        mutableDateTime1.setSecondOfDay(4);
        mutableDateTime1.addMinutes(1);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime13 = localTime11.withSecondOfMinute((int) ' ');
        org.joda.time.LocalTime.Property property14 = localTime11.minuteOfHour();
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) (byte) 10);
        boolean boolean19 = dateTime18.isEqualNow();
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withPeriodAdded(readablePeriod24, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime21.getZone();
        long long30 = dateTimeZone27.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime31 = dateTime18.toDateTime(dateTimeZone27);
        org.joda.time.LocalTime localTime32 = dateTime18.toLocalTime();
        org.joda.time.DateTime dateTime34 = dateTime18.plus((long) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime38 = org.joda.time.LocalTime.MIDNIGHT;
        int int39 = localTime37.compareTo((org.joda.time.ReadablePartial) localTime38);
        java.lang.Object obj40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(obj40);
        org.joda.time.DateTime dateTime43 = dateTime41.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime46 = dateTime41.withPeriodAdded(readablePeriod44, (int) (byte) 10);
        org.joda.time.DateTime dateTime47 = localTime38.toDateTime((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Chronology chronology48 = dateTime41.getChronology();
        boolean boolean49 = dateTimeFieldType35.isSupported(chronology48);
        int int50 = dateTime34.get(dateTimeFieldType35);
        int int51 = localTime11.get(dateTimeFieldType35);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime1.property(dateTimeFieldType35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime54 = property52.set("09:50:19.155");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:50:19.155\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 11L + "'", long30 == 11L);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 590 + "'", int50 == 590);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(property52);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) '4', dateTimeZone1);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.MIDNIGHT;
        int int7 = localTime5.compareTo((org.joda.time.ReadablePartial) localTime6);
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.withPeriodAdded(readablePeriod12, (int) (byte) 10);
        org.joda.time.DateTime dateTime15 = localTime6.toDateTime((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Chronology chronology16 = dateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime3.setRounding(dateTimeField17, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        java.lang.String str13 = chronology12.toString();
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime20 = dateTime15.withPeriodAdded(readablePeriod18, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime15.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Chronology chronology26 = chronology12.withZone(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime28.setWeekyear(3);
        java.lang.Object obj31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj31);
        org.joda.time.DateTime dateTime34 = dateTime32.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime37 = dateTime32.withPeriodAdded(readablePeriod35, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime32.getZone();
        mutableDateTime28.setZoneRetainFields(dateTimeZone38);
        java.lang.String str41 = dateTimeZone38.getNameKey(1646041808949L);
        boolean boolean42 = dateTimeZone38.isFixed();
        org.joda.time.Chronology chronology43 = chronology26.withZone(dateTimeZone38);
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.now(chronology43);
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(chronology43);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray48 = chronology43.get(readablePeriod46, 1644573016265L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str13, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 11L + "'", long24 == 11L);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(localTime44);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfDay();
        java.lang.String str14 = chronology12.toString();
        org.joda.time.DurationField durationField15 = chronology12.weeks();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str14, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.LocalDate.Property property13 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property13.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate16 = localDate14.withEra(1);
        org.joda.time.LocalDate localDate18 = localDate14.minusYears(12);
        org.joda.time.DateMidnight dateMidnight19 = localDate18.toDateMidnight();
        org.joda.time.LocalDate localDate21 = localDate18.minusWeeks(7);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property23 = localDate18.property(dateTimeFieldType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        long long6 = java.util.Date.UTC(86399, 0, 86399, 50400000, 50, 35417252);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2913220335452000L + "'", long6 == 2913220335452000L);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        long long17 = dateTimeZone14.previousTransition(1L);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime19.setWeekyear(3);
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.DateTime dateTime25 = dateTime23.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime23.withPeriodAdded(readablePeriod26, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime23.getZone();
        mutableDateTime19.setZoneRetainFields(dateTimeZone29);
        long long32 = dateTimeZone14.getMillisKeepLocal(dateTimeZone29, (long) 35408);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeZone11, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 35408L + "'", long32 == 35408L);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getDay();
        java.lang.Object obj2 = date0.clone();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Fri Feb 11 09:50:27 UTC 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertNotNull(obj2);
// flaky:         org.junit.Assert.assertEquals(obj2.toString(), "Fri Feb 11 09:50:27 UTC 2022");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "Fri Feb 11 09:50:27 UTC 2022");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "Fri Feb 11 09:50:27 UTC 2022");
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        boolean boolean14 = dateTimeFieldType0.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.era();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = dateTimeField16.set((long) 3, "deu");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"deu\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMonths((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.dayOfWeek();
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withWeekOfWeekyear((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        int int16 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime15);
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withPeriodAdded(readablePeriod21, (int) (byte) 10);
        org.joda.time.DateTime dateTime24 = localTime15.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology25 = dateTime18.getChronology();
        boolean boolean26 = dateTimeFieldType12.isSupported(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime11.withField(dateTimeFieldType12, 10);
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfYear();
        java.lang.Class<?> wildcardClass30 = property29.getClass();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.yearOfCentury();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.era();
        int int17 = localDateTime15.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plusMonths(14);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean23 = localDateTime15.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.eras();
        boolean boolean26 = localDateTime24.isSupported(durationFieldType25);
        boolean boolean27 = localDateTime15.isSupported(durationFieldType25);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.add(durationFieldType25, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.DateTime dateTime4 = dateTime1.plusDays(11);
        org.joda.time.DateTime.Property property5 = dateTime4.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = property5.addToCopy((long) 35414);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        int int2 = localDateTime0.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusWeeks(6);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime6.setWeekyear(3);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfMonth();
        org.joda.time.DateTime dateTime12 = property11.withMaximumValue();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTimeField dateTimeField14 = null;
        mutableDateTime6.setRounding(dateTimeField14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime6.add(readableDuration16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime6.era();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime6.millisOfDay();
        org.joda.time.Chronology chronology20 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.clockhourOfHalfday();
        boolean boolean23 = localDateTime0.equals((java.lang.Object) dateTimeField22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime0.toDateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMillis(32772);
        org.joda.time.DateTime dateTime29 = dateTime27.minusDays(35411);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.lang.String str14 = dateTimeZone11.getNameKey(1646041808949L);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone11);
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime15.toGregorianCalendar();
        mutableDateTime15.setMillis((long) 35423);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime15.setMonthOfYear((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(gregorianCalendar16);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.LocalDate localDate14 = localDate6.withWeekOfWeekyear(9);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.LocalDateTime localDateTime17 = dateTime16.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withDurationAdded(readableDuration18, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.minusMonths(0);
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusHours(0);
        int int26 = localDateTime25.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = localDate6.isBefore((org.joda.time.ReadablePartial) localDateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.util.Date date5 = new java.util.Date(10, (int) (byte) -1, (-1), 100, (int) (byte) 1);
        int int6 = date5.getDate();
        int int7 = date5.getTimezoneOffset();
        date5.setSeconds(2);
        date5.setSeconds(2);
        org.junit.Assert.assertEquals(date5.toString(), "Fri Dec 03 04:01:02 UTC 1909");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = locale11.getDisplayScript();
        boolean boolean13 = locale11.hasExtensions();
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale8, locale9, locale10, locale11, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.Locale locale18 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.lang.String str26 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList24);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "10", "java.io.IOException: hi!", "10", "-1997-11-13T09:50:03.940Z", "-1997-11-13T09:50:03.940Z" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.Locale.FilteringMode filteringMode36 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList34, filteringMode36);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.lang.String str45 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strList43);
        java.util.Locale locale46 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet47 = locale46.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strSet47);
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strSet47, filteringMode49);
        java.lang.String str51 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet47);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + filteringMode36 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode36.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode49.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(97, 46, 6018575, 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        mutableDateTime1.setSecondOfDay(4);
        mutableDateTime1.setMillisOfDay(590);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfWeek(20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2022-02-28T09:50:16.644Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-28t09:50:16.644z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime12.setWeekyear(3);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withPeriodAdded(readablePeriod19, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime16.getZone();
        mutableDateTime12.setZoneRetainFields(dateTimeZone22);
        mutableDateTime1.setZone(dateTimeZone22);
        mutableDateTime1.addWeeks((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime1.millisOfDay();
        mutableDateTime1.setDate((long) 8);
        int int30 = mutableDateTime1.getDayOfMonth();
        java.lang.Object obj31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj31);
        org.joda.time.LocalDateTime localDateTime33 = dateTime32.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withDurationAdded(readableDuration34, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.minusMonths(0);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime33.minusHours((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.era();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.eras();
        boolean boolean45 = localDateTime43.isSupported(durationFieldType44);
        boolean boolean46 = localDateTime41.isSupported(durationFieldType44);
        boolean boolean47 = localDateTime40.isSupported(durationFieldType44);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.add(durationFieldType44, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate.Property property11 = localDate6.dayOfMonth();
        org.joda.time.LocalDate localDate13 = localDate6.plusDays((int) '#');
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes(2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int19 = dateTime17.get(dateTimeFieldType18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) '4', dateTimeZone21);
        int int25 = dateTimeZone21.getOffsetFromLocal((long) 32769);
        org.joda.time.DateTime dateTime26 = dateTime17.withZone(dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) localDate13, dateTimeZone21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1644573009070L);
        org.joda.time.LocalTime localTime2 = dateTime1.toLocalTime();
        int int3 = dateTime1.getEra();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getDisplayName();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone2);
        long long5 = dateTimeZone2.previousTransition(1L);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime7.setWeekyear(3);
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withPeriodAdded(readablePeriod14, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime11.getZone();
        mutableDateTime7.setZoneRetainFields(dateTimeZone17);
        long long20 = dateTimeZone2.getMillisKeepLocal(dateTimeZone17, (long) 35408);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime22.setWeekyear(3);
        java.lang.Object obj25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.withPeriodAdded(readablePeriod29, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime26.getZone();
        mutableDateTime22.setZoneRetainFields(dateTimeZone32);
        java.util.TimeZone timeZone34 = dateTimeZone32.toTimeZone();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone32);
        long long39 = dateTimeZone32.convertLocalToUTC(0L, true, (long) (short) 1);
        boolean boolean40 = dateTimeZone32.isFixed();
        java.lang.Object obj41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(obj41);
        org.joda.time.DateTime dateTime44 = dateTime42.withYearOfEra((int) (byte) 10);
        java.lang.Object obj45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(obj45);
        org.joda.time.DateTime dateTime48 = dateTime46.withYearOfEra((int) (byte) 10);
        boolean boolean49 = dateTime44.isEqual((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime.Property property50 = dateTime44.monthOfYear();
        int int51 = dateTimeZone32.getOffset((org.joda.time.ReadableInstant) dateTime44);
        long long53 = dateTimeZone2.getMillisKeepLocal(dateTimeZone32, (long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((java.lang.Object) locale0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35408L + "'", long20 == 35408L);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(timeZone34);
// flaky:         org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        int int2 = localDateTime0.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(9);
        int int5 = localDateTime0.getSecondOfMinute();
        int int6 = localDateTime0.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime0.withSecondOfMinute((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 28 + "'", int5 == 28);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 28 + "'", int6 == 28);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(4, (int) (byte) 100, (int) (short) 0);
        java.util.Calendar.Builder builder6 = builder4.setLenient(false);
        java.util.Calendar.Builder builder8 = builder6.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder10 = builder6.setCalendarType("zho");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: zho");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime.Property property12 = dateTime11.weekOfWeekyear();
        org.joda.time.DateTime dateTime14 = property12.addWrapFieldToCopy(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = property12.setCopy(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(11);
        org.joda.time.LocalDate localDate14 = localDate10.withWeekyear(10);
        org.joda.time.LocalDate.Property property15 = localDate10.yearOfCentury();
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.plus(readablePeriod21);
        org.joda.time.DateTime dateTime24 = dateTime22.withDayOfYear((int) (short) 1);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfMonth();
        org.joda.time.DateTime dateTime27 = property25.addWrapFieldToCopy(2022);
        org.joda.time.DateTime dateTime28 = property25.getDateTime();
        java.util.Locale locale29 = java.util.Locale.ITALY;
        java.lang.String str30 = property25.getAsText(locale29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate31 = property15.setCopy("0003-01-01T23:59:59.999Z", locale29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0003-01-01T23:59:59.999Z\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1" + "'", str30, "1");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.property(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime1.yearOfEra();
        mutableDateTime1.addMonths(17);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11, 8);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        mutableDateTime1.setSecondOfMinute((int) ' ');
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.MIDNIGHT;
        int int19 = localTime17.compareTo((org.joda.time.ReadablePartial) localTime18);
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withPeriodAdded(readablePeriod24, (int) (byte) 10);
        org.joda.time.DateTime dateTime27 = localTime18.toDateTime((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology28 = dateTime21.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.months();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(11L, chronology28);
        org.joda.time.DateTimeField dateTimeField31 = chronology28.weekyear();
        int int32 = mutableDateTime1.get(dateTimeField31);
        long long34 = dateTimeField31.roundHalfEven((long) 46);
        int int36 = dateTimeField31.getLeapAmount(11L);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2022 + "'", int32 == 2022);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-259200000L) + "'", long34 == (-259200000L));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        long long18 = calendar15.getTimeInMillis();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(chronology19);
        org.joda.time.LocalTime localTime22 = localTime20.withSecondOfMinute((int) (short) 1);
        java.lang.String str23 = localTime20.toString();
        org.joda.time.LocalTime localTime25 = localTime20.withMinuteOfHour(15);
        org.joda.time.LocalTime localTime27 = localTime25.plusMillis(590);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        boolean boolean29 = calendar15.after((java.lang.Object) property28);
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.lang.String str33 = locale32.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap34 = calendar15.getDisplayNames(35412, 32772, locale32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573028872,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=28,MILLISECOND=872,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1644573028872L + "'", long18 == 1644573028872L);
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "09:50:28.873" + "'", str23, "09:50:28.873");
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "de");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.months();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(11L, chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.weekyear();
        long long18 = dateTimeField16.roundHalfFloor(365L);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-259200000L) + "'", long18 == (-259200000L));
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMonths((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime6 = property5.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = property5.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(31828525);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31828525 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime8.setWeekyear(3);
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfMonth();
        org.joda.time.DateTime dateTime14 = property13.withMaximumValue();
        mutableDateTime8.setMillis((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTimeField dateTimeField16 = null;
        mutableDateTime8.setRounding(dateTimeField16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime8.add(readableDuration18);
        mutableDateTime8.setSecondOfMinute((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        mutableDateTime8.setZoneRetainFields(dateTimeZone22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0, 9, 19, (int) ' ', 16, 17, 249, dateTimeZone22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("zh_TW", "ISOChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: zh_TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime.Property property12 = dateTime11.weekOfWeekyear();
        org.joda.time.DateTime dateTime14 = property12.addWrapFieldToCopy(10);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        org.joda.time.DateTime.Property property16 = dateTime14.weekyear();
        org.joda.time.DateTime dateTime17 = dateTime14.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property18 = dateTime14.millisOfSecond();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property9 = dateTime7.dayOfWeek();
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime7.minusYears(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime12.withMinuteOfHour(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 590 + "'", int10 == 590);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        java.util.Date date23 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromDateFields(date23);
        date23.setYear((int) (short) 0);
        int int27 = date23.getHours();
        int int28 = date23.getHours();
        calendar15.setTime(date23);
        calendar15.add(0, (-27409550));
        java.lang.String str33 = calendar15.getCalendarType();
        java.util.Date date39 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate40 = org.joda.time.LocalDate.fromDateFields(date39);
        date39.setYear((int) (short) 0);
        int int43 = date39.getHours();
        int int44 = date39.getHours();
        java.time.Instant instant45 = date39.toInstant();
        int int46 = date39.getTimezoneOffset();
        calendar15.setTime(date39);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) 1, chronology49);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime dateTime53 = dateTime50.withField(dateTimeFieldType51, (int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar54 = dateTime53.toGregorianCalendar();
        boolean boolean55 = calendar15.after((java.lang.Object) gregorianCalendar54);
        java.util.Locale locale58 = java.util.Locale.PRC;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap59 = gregorianCalendar54.getDisplayNames(35412, 317, locale58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=-2181603540000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1900,MONTH=10,WEEK_OF_YEAR=46,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=317,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=1,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23 + "'", int27 == 23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 23 + "'", int28 == 23);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "gregory" + "'", str33, "gregory");
        org.junit.Assert.assertEquals(date39.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 23 + "'", int43 == 23);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 23 + "'", int44 == 23);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(gregorianCalendar54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(4, (int) (byte) 100, (int) (short) 0);
        java.util.Calendar.Builder builder6 = builder4.setLenient(false);
        java.util.Calendar.Builder builder8 = builder6.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder10 = builder6.setInstant((long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        boolean boolean8 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime10 = dateTime3.minusMonths((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime10.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.era();
        int int2 = localDateTime0.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusWeeks(6);
        java.util.Date date10 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.fromDateFields(date10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean13 = localDate11.isSupported(dateTimeFieldType12);
        org.joda.time.LocalDate localDate15 = localDate11.withEra(0);
        org.joda.time.LocalDate localDate17 = localDate11.plusMonths((int) (byte) -1);
        org.joda.time.LocalDate.Property property18 = localDate11.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDate11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = property4.addCopy((long) 1);
        java.util.Locale locale9 = java.util.Locale.ROOT;
        java.lang.String str10 = locale9.getDisplayScript();
        java.util.Locale locale11 = java.util.Locale.ROOT;
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str14 = locale9.getDisplayCountry(locale11);
        java.lang.String str15 = locale11.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = property4.setCopy("Property[dayOfMonth]", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[dayOfMonth]\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "und" + "'", str15, "und");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        int int6 = date5.getYear();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromDateFields(date5);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime10 = property8.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str16 = locale14.getScript();
        java.lang.String str17 = dateTimeZone12.getName(1646041809840L, locale14);
        int int19 = dateTimeZone12.getStandardOffset((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) property8, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.232" + "'", str17, "+00:00:00.232");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 232 + "'", int19 == 232);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.minusMinutes((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.era();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime16.setWeekyear(3);
        java.lang.Object obj19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj19);
        org.joda.time.DateTime.Property property21 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime22 = property21.withMaximumValue();
        mutableDateTime16.setMillis((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeField dateTimeField24 = null;
        mutableDateTime16.setRounding(dateTimeField24);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime27.setWeekyear(3);
        java.lang.Object obj30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj30);
        org.joda.time.DateTime dateTime33 = dateTime31.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime36 = dateTime31.withPeriodAdded(readablePeriod34, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTime31.getZone();
        mutableDateTime27.setZoneRetainFields(dateTimeZone37);
        mutableDateTime16.setZone(dateTimeZone37);
        java.util.Locale locale41 = java.util.Locale.JAPAN;
        java.lang.String str42 = dateTimeZone37.getShortName((long) 3, locale41);
        java.lang.String str43 = locale41.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = localDateTime12.toString("1970-01-03T09:50:10.755Z", locale41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u65e5\u672c\u8a9e\u65e5\u672c)" + "'", str43, "\u65e5\u672c\u8a9e\u65e5\u672c)");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMonths((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone11);
        java.lang.String str16 = dateTimeZone11.getNameKey((long) 35423);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.MIDNIGHT;
        int int7 = localTime5.compareTo((org.joda.time.ReadablePartial) localTime6);
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.withPeriodAdded(readablePeriod12, (int) (byte) 10);
        org.joda.time.DateTime dateTime15 = localTime6.toDateTime((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Chronology chronology16 = dateTime9.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(17, 32769, (int) (byte) -1, 249, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMonths((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYear(50);
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.minuteOfHour();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.MIDNIGHT;
        int int10 = localTime9.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property12 = localTime9.property(dateTimeFieldType11);
        org.joda.time.LocalTime localTime13 = property12.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        org.joda.time.LocalTime localTime15 = property14.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean19 = localTime17.isSupported(dateTimeFieldType18);
        boolean boolean20 = localTime15.isSupported(dateTimeFieldType18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(61200000, 0, 42, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 61200000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        mutableDateTime1.setMillisOfSecond(19);
        java.lang.Object obj16 = mutableDateTime1.clone();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(obj16);
// flaky:         org.junit.Assert.assertEquals(obj16.toString(), "2022-02-28T09:50:30.019Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "2022-02-28T09:50:30.019Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "2022-02-28T09:50:30.019Z");
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property3 = localTime0.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        org.joda.time.LocalTime localTime5 = property3.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property3.addNoWrapToCopy((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1646041814507L);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.withPeriodAdded(readablePeriod4, (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime1.minusMillis(2022);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime11.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime11.add(readableDuration14);
        org.joda.time.Instant instant16 = mutableDateTime11.toInstant();
        int int17 = dateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.DateTime dateTime18 = mutableDateTime11.toDateTimeISO();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(0, 2022, 3, 46);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property9 = dateTime7.dayOfWeek();
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime7.minusYears(0);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 1, chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime dateTime18 = dateTime15.withField(dateTimeFieldType16, (int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        boolean boolean20 = dateTime12.isBefore((org.joda.time.ReadableInstant) dateTime18);
        int int21 = dateTime12.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 590 + "'", int10 == 590);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 50 + "'", int21 == 50);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.util.Date date5 = new java.util.Date(10, (int) (byte) -1, (-1), 100, (int) (byte) 1);
        int int6 = date5.getDate();
        int int7 = date5.getTimezoneOffset();
        java.lang.String str8 = date5.toLocaleString();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.MIDNIGHT;
        int int13 = localTime11.compareTo((org.joda.time.ReadablePartial) localTime12);
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime20 = dateTime15.withPeriodAdded(readablePeriod18, (int) (byte) 10);
        org.joda.time.DateTime dateTime21 = localTime12.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Chronology chronology22 = dateTime15.getChronology();
        boolean boolean23 = dateTimeFieldType9.isSupported(chronology22);
        org.joda.time.DurationField durationField24 = chronology22.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) str8, chronology22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1909/12/03 4:01:00\" is malformed at \"/12/03 4:01:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Dec 03 04:01:00 UTC 1909");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1909/12/03 4:01:00" + "'", str8, "1909/12/03 4:01:00");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate6.plus(readablePeriod13);
        org.joda.time.LocalDate localDate16 = localDate6.withYear(23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = localDate16.withEra(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        java.lang.String str14 = property13.getName();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dateTimeField15.getDifference((-72064071665819000L), (long) 365);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "era" + "'", str14, "era");
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime1.copy();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        java.lang.String str18 = calendar15.toString();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573030878,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=30,MILLISECOND=878,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.util.GregorianCalendar[time=1644573030878,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=30,MILLISECOND=878,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str18, "java.util.GregorianCalendar[time=1644573030878,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=30,MILLISECOND=878,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.plus(readableDuration6);
        java.util.Date date13 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        boolean boolean17 = dateTime7.isSupported(dateTimeFieldType15);
        org.joda.time.DateTime dateTime19 = dateTime7.plusHours(11);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = dateTime19.withDayOfWeek((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.plus(readableDuration6);
        java.util.Date date13 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        boolean boolean17 = dateTime7.isSupported(dateTimeFieldType15);
        org.joda.time.DateTime dateTime19 = dateTime7.plusHours(11);
        org.joda.time.DateTime.Property property20 = dateTime7.yearOfEra();
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = property20.getAsText(locale21);
        org.joda.time.DateTime dateTime23 = property20.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime25 = property20.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekyear(1);
        org.joda.time.DateTime.Property property28 = dateTime25.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = dateTime25.withWeekOfWeekyear(317);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 317 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10" + "'", str22, "10");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2022-02-28T09:50:18.980Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-28T09:50:18.980Z\" is malformed at \"Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        java.util.Date date23 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromDateFields(date23);
        date23.setYear((int) (short) 0);
        int int27 = date23.getHours();
        int int28 = date23.getHours();
        calendar15.setTime(date23);
        calendar15.set(9, 23, 100, 0, 2);
        java.lang.String str36 = calendar15.toString();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=9,MONTH=23,WEEK_OF_YEAR=46,WEEK_OF_MONTH=3,DAY_OF_MONTH=100,DAY_OF_YEAR=317,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=0,MINUTE=2,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23 + "'", int27 == 23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 23 + "'", int28 == 23);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=9,MONTH=23,WEEK_OF_YEAR=46,WEEK_OF_MONTH=3,DAY_OF_MONTH=100,DAY_OF_YEAR=317,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=0,MINUTE=2,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str36, "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=9,MONTH=23,WEEK_OF_YEAR=46,WEEK_OF_MONTH=3,DAY_OF_MONTH=100,DAY_OF_YEAR=317,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=0,MINUTE=2,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("09:50:07.635");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '09:50:07.635' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate6.withPeriodAdded(readablePeriod13, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate6.withWeekOfWeekyear((-27409550));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -27409550 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.setWeekDefinition((int) (short) -1, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(1644573600000L, dateTimeZone3);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((java.lang.Object) "2022-02-28T09:50:13.045Z", dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime5.withMonthOfYear((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDateTime((int) 'a', 35425, 42, (int) (byte) 1, 31828525, 8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31828525 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 1, chronology5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime dateTime9 = dateTime6.withField(dateTimeFieldType7, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime1.withField(dateTimeFieldType7, 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguage("2022");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 2022 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }
}
