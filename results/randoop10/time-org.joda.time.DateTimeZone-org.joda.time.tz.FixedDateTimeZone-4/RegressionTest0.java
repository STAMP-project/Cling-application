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
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.util.Locale locale0 = java.util.Locale.UK;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (byte) 10, 1970, (int) (short) 10, 100, (int) (byte) -1, 2, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) '4', dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(4, (-1), 11, (int) (byte) 10, 7, 2022, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale8 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localDateTime1.toString("", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = localTime0.withMillisOfDay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(12, 761, 7, (-1), (int) (byte) 0, 54, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("\u4e8c\u6708", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("1970-01-01T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '1970-01-01T00:00:00.000Z' is not recognised");
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
            long long1 = java.util.Date.parse("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.property(dateTimeFieldType2);
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(0L, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(0L, dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate14.plus(readablePeriod17);
        org.joda.time.LocalDate localDate19 = localDate11.withFields((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate.Property property20 = localDate19.year();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(0L, dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate23.plus(readablePeriod26);
        int int28 = localDate19.compareTo((org.joda.time.ReadablePartial) localDate27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDate27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfYear();
        java.util.Locale locale3 = java.util.Locale.UK;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = property1.setCopy("2022-02-22T07:10:26.657Z", locale3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:10:26.657Z\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial4 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        org.joda.time.DurationField durationField9 = dateTimeField8.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(0L, dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = localDate12.toDateMidnight(dateTimeZone13);
        int[] intArray21 = new int[] { (-1), (short) 1, 2, 54, (byte) 0 };
        int[] intArray23 = dateTimeField8.add((org.joda.time.ReadablePartial) localDate12, 0, intArray21, 0);
        java.util.Locale locale25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = dateTimeField3.set(readablePartial4, 32770, intArray23, "", locale25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for halfdayOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 1, 2, 54, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 1, 2, 54, 0]");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate1.withEra(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withHourOfDay(228);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 228 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int3 = localDate1.indexOf(dateTimeFieldType2);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = localDate1.isAfter((org.joda.time.ReadablePartial) localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime5 = localDateTime4.toDateTime();
        org.joda.time.Chronology chronology6 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(2022, (int) (byte) 0, (int) ' ', 32769, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("KOR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: KOR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet1);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long4 = dateTimeField2.remainder((long) (byte) 100);
        java.lang.String str5 = dateTimeField2.getName();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        int int7 = dateTimeField2.getMaximumShortTextLength(locale6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(0L, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate10.plus(readablePeriod13);
        org.joda.time.LocalDate.Property property15 = localDate10.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType18.getField(chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime17.property(dateTimeFieldType18);
        org.joda.time.LocalDateTime localDateTime22 = property21.roundHalfFloorCopy();
        java.util.Locale locale23 = java.util.Locale.UK;
        java.lang.String str24 = locale23.getDisplayCountry();
        boolean boolean25 = locale23.hasExtensions();
        java.lang.String str26 = locale23.getScript();
        java.lang.String str27 = property21.getAsShortText(locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDate10, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "millisOfDay" + "'", str5, "millisOfDay");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "United Kingdom" + "'", str24, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "25708841" + "'", str27, "25708841");
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType3 = localDate1.getFieldType(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
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
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar3.getActualMinimum((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513709330,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=29,MILLISECOND=330,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localDateTime2.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) '4', (int) (byte) 100, 7, 8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate14 = localDate4.withDayOfYear((int) '#');
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime19 = dateTime16.withFieldAdded(durationFieldType17, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.seconds();
        boolean boolean21 = dateTime16.equals((java.lang.Object) durationFieldType20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = localDate14.withFieldAdded(durationFieldType20, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'seconds' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(0L, dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(0L, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate9.plus(readablePeriod12);
        org.joda.time.LocalDate localDate14 = localDate6.withFields((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.LocalDate.Property property15 = localDate14.year();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.joda.time.LocalDate localDate17 = property15.roundHalfCeilingCopy();
        boolean boolean18 = date1.equals((java.lang.Object) property15);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property13 = localDate12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(0L, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate16.plus(readablePeriod19);
        int int21 = localDate12.compareTo((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localDate12.get(dateTimeFieldType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        int int7 = property6.getMaximumValue();
        org.joda.time.DateTime dateTime8 = property6.roundHalfCeilingCopy();
        int int9 = dateTime8.getDayOfYear();
        int int10 = dateTime8.getSecondOfMinute();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'United Kingdom' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        long long6 = calendar3.getTimeInMillis();
        java.lang.String str7 = calendar3.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513710548,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=30,MILLISECOND=548,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645513710548L + "'", long6 == 1645513710548L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.util.GregorianCalendar[time=1645513710548,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=30,MILLISECOND=548,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str7, "java.util.GregorianCalendar[time=1645513710548,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=30,MILLISECOND=548,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.Chronology chronology7 = localDateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(11, (int) (short) 1, 59, (int) (byte) 100, 59, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeZone0.getOffset(7, 86399999, 59, 10, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType0.getField(chronology3);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology3.getDateTimeMillis((int) (short) 10, 3, (int) (byte) 0, 292269054, 30, 29, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292269054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Korean (South Korea)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("Property[dayOfYear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Property[dayOfYear]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = timeZone0.getDisplayName(locale1);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KOR" + "'", str2, "KOR");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc138\uacc4\ud45c\uc900\uc2dc" + "'", str3, "\uc138\uacc4\ud45c\uc900\uc2dc");
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.plusHours(4);
        int int10 = dateTime7.getEra();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime7.plus(readablePeriod11);
        boolean boolean13 = calendar3.equals((java.lang.Object) readablePeriod11);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513710941,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=30,MILLISECOND=941,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.Appendable appendable5 = null;
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.plus(readablePeriod13);
        org.joda.time.DateTime dateTime15 = dateTime9.toDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable5, (org.joda.time.ReadableInstant) dateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.toDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTime9.toString("TWN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        calendar3.setLenient(true);
        int int9 = calendar3.getLeastMaximum(1);
        java.lang.String str10 = calendar3.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513711272,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=31,MILLISECOND=272,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 292269054 + "'", int9 == 292269054);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.util.GregorianCalendar[time=1645513711272,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=31,MILLISECOND=272,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str10, "java.util.GregorianCalendar[time=1645513711272,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=31,MILLISECOND=272,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond(12);
        int int3 = localTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime5 = localDateTime4.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime9 = dateTime7.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.withZone(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int13 = dateTime7.get(dateTimeFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property14 = localTime0.property(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 287 + "'", int3 == 287);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 22 + "'", int13 == 22);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        int int4 = dateTime1.getEra();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getName((long) (byte) -1);
        org.joda.time.DateTime dateTime10 = dateTime1.toDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((java.lang.Object) dateTimeZone6, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+35:00" + "'", str9, "+35:00");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = chronology3.get(readablePeriod6, (long) 374);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(0L, dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(0L, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate14 = localDate10.plusMonths((-1));
        int int15 = localDate5.compareTo((org.joda.time.ReadablePartial) localDate10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDate5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long4 = dateTimeField2.remainder((long) (byte) 100);
        java.lang.String str5 = dateTimeField2.getName();
        int int7 = dateTimeField2.getMinimumValue((long) 100);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "millisOfDay" + "'", str5, "millisOfDay");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime3.withDate(7, 59, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(228, 32770, (int) (short) -1, 866, (int) (short) 100, 761);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 866 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes(10);
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.plus(readablePeriod14);
        org.joda.time.DateTime dateTime16 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property17 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime19 = property17.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.minus(readableDuration20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime24 = localDateTime23.toDateTime();
        org.joda.time.Chronology chronology25 = localDateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType22.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.weekyear();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) readableDuration20, chronology25);
        org.joda.time.DateTimeZone dateTimeZone30 = chronology25.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((int) (short) 1, 31, (int) (byte) -1, 12, (int) (byte) 0, 5, 10, chronology25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Fri Jan 01 00:00:00 UTC 1909");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Fri Jan 01 00:00:00 UTC 1909' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.Appendable appendable5 = null;
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfMonth();
        int int8 = localDateTime6.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable5, (org.joda.time.ReadablePartial) localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 949 + "'", int8 == 949);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusMinutes(32770);
        int int9 = localDateTime8.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = localDateTime8.toString("java.util.GregorianCalendar[time=1645513711272,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=31,MILLISECOND=272,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable6, (long) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.util.Iterator<java.lang.Character> charItor3 = charSet2.iterator();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.property(dateTimeFieldType6);
        int int10 = property9.getMaximumValue();
        org.joda.time.DurationField durationField11 = property9.getDurationField();
        boolean boolean12 = charSet2.remove((java.lang.Object) property9);
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = property9.setCopy("", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(charItor3);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 86399999 + "'", int10 == 86399999);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long4 = dateTimeField2.remainder((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = dateTimeField2.set((long) 32770, "\u4e8c\u6708");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now(dateTimeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(0L, dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(0L, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate10.plus(readablePeriod13);
        org.joda.time.LocalDate localDate15 = localDate7.withFields((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate.Property property16 = localDate15.year();
        org.joda.time.LocalDate localDate18 = property16.addToCopy((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate2.withFields((org.joda.time.ReadablePartial) localDate18);
        int int20 = localDate2.size();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localDateTime1.getValue(228);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 228");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter4.getZone();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int10 = localDate8.indexOf(dateTimeFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer6, (org.joda.time.ReadablePartial) localDate8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond(12);
        int int3 = localTime0.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.Chronology chronology7 = localDateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime0.withField(dateTimeFieldType4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekOfWeekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 769 + "'", int3 == 769);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) ' ', 54, (int) 'a', 8, 20, 12, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.io.Writer writer5 = null;
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minus(readableDuration8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMinutes(548);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer5, (org.joda.time.ReadablePartial) localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withDefaultYear(3);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter5.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.parse("TWN", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int6 = localDateTime0.get(dateTimeFieldType5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDateTime0.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateTimeFormatter2.print((long) 184);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField9 = localDateTime7.getField(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 11");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 513 + "'", int2 == 513);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("millisOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=millisofday");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.property(dateTimeFieldType2);
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfFloorCopy();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.lang.String str8 = locale7.getDisplayCountry();
        boolean boolean9 = locale7.hasExtensions();
        java.lang.String str10 = locale7.getScript();
        java.lang.String str11 = property5.getAsShortText(locale7);
        java.lang.Object obj12 = locale7.clone();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "United Kingdom" + "'", str8, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25713647" + "'", str11, "25713647");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "en_GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "en_GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "en_GB");
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readableDuration13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.Chronology chronology18 = localDateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType15.getField(chronology18);
        org.joda.time.DateTimeField dateTimeField21 = chronology18.weekyear();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) readableDuration13, chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withDayOfMonth((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate11 = localDate7.plusMonths((-1));
        int int12 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone17 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone18 = fixedDateTimeZone17.toTimeZone();
        org.joda.time.DateMidnight dateMidnight19 = localDate7.toDateMidnight((org.joda.time.DateTimeZone) fixedDateTimeZone17);
        int int20 = dateMidnight19.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime3.withMinuteOfHour((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property13 = localDate12.year();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        java.util.Calendar.Builder builder16 = new java.util.Calendar.Builder();
        java.util.Locale locale17 = java.util.Locale.UK;
        java.lang.String str18 = locale17.getDisplayCountry();
        java.util.Calendar.Builder builder19 = builder16.setLocale(locale17);
        java.util.Locale locale20 = java.util.Locale.ROOT;
        java.util.Calendar.Builder builder21 = builder19.setLocale(locale20);
        java.lang.String str22 = dateTimeField14.getAsText(2, locale20);
        long long25 = dateTimeField14.add((long) 25713348, (int) ' ');
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "United Kingdom" + "'", str18, "United Kingdom");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2" + "'", str22, "2");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1009868913348L + "'", long25 == 1009868913348L);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.property(dateTimeFieldType2);
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfFloorCopy();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.lang.String str8 = locale7.getDisplayCountry();
        boolean boolean9 = locale7.hasExtensions();
        java.lang.String str10 = locale7.getScript();
        java.lang.String str11 = property5.getAsShortText(locale7);
        java.lang.Object obj12 = null;
        boolean boolean13 = locale7.equals(obj12);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "United Kingdom" + "'", str8, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25714074" + "'", str11, "25714074");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        long long7 = dateTimeField5.remainder((long) (byte) 100);
        java.lang.String str8 = dateTimeField5.getName();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(0L, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate15 = localDate11.plusMonths((-1));
        java.util.Locale locale19 = new java.util.Locale("1970-01-01T00:00:00.000Z", "\u4e8c\u6708");
        java.lang.String str20 = dateTimeField5.getAsText((org.joda.time.ReadablePartial) localDate11, 22, locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = timeZone0.getDisplayName(true, 500, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 500");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "millisOfDay" + "'", str8, "millisOfDay");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "\u4e8c\u6708");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "22" + "'", str20, "22");
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale0.getDisplayLanguage(locale1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(0L, dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(0L, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate11.plus(readablePeriod14);
        org.joda.time.LocalDate localDate16 = localDate8.withFields((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int20 = localDate18.indexOf(dateTimeFieldType19);
        boolean boolean21 = localDate16.isSupported(dateTimeFieldType19);
        boolean boolean22 = locale1.equals((java.lang.Object) dateTimeFieldType19);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u6587" + "'", str3, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        calendar3.setLenient(true);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.Chronology chronology11 = localDateTime9.getChronology();
        boolean boolean12 = dateTimeFieldType8.isSupported(chronology11);
        long long16 = chronology11.add((long) 184, 0L, 0);
        org.joda.time.DateTimeField dateTimeField17 = chronology11.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = chronology11.dayOfYear();
        boolean boolean19 = calendar3.equals((java.lang.Object) dateTimeField18);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513714347,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=34,MILLISECOND=347,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 184L + "'", long16 == 184L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getHours();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromDateFields(date1);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.roundFloorCopy();
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property4.setCopy("Korean (South Korea)", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Korean (South Korea)\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((-1), 32770, 184);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate2.plus(readablePeriod5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone7);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(0L, dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(0L, dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate19.plus(readablePeriod22);
        org.joda.time.LocalDate localDate24 = localDate16.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.LocalDate localDate26 = localDate16.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime27 = localDate26.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 0, chronology28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) localDate6, chronology28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getHours();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromDateFields(date1);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField7 = localTime5.getField((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property13 = localDate12.year();
        org.joda.time.LocalDate localDate14 = property13.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate14.withDayOfWeek(10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate2.plus(readablePeriod5);
        org.joda.time.LocalDate.Property property7 = localDate6.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDate6.get(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
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
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone6 = fixedDateTimeZone5.toTimeZone();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.withZone(dateTimeZone13);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfSecond();
        int int16 = fixedDateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateTime14);
        long long18 = fixedDateTimeZone5.previousTransition((long) '#');
        long long20 = fixedDateTimeZone5.nextTransition(1645513711304L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((java.lang.Object) 259, (org.joda.time.DateTimeZone) fixedDateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 59 + "'", int16 == 59);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1645513711304L + "'", long20 == 1645513711304L);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int3 = localDate1.indexOf(dateTimeFieldType2);
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localDate1.toString("Property[dayOfYear]", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Englisch" + "'", str7, "Englisch");
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(0L, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(0L, dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate14.plus(readablePeriod17);
        org.joda.time.LocalDate localDate19 = localDate11.withFields((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate localDate21 = localDate11.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime22 = localDate21.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 0, chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(6, 30, (int) (byte) 100, 259, 0, 785, chronology23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 259 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        long long6 = calendar3.getTimeInMillis();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar3);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone13 = fixedDateTimeZone12.toTimeZone();
        int int14 = timeZone13.getRawOffset();
        calendar3.setTimeZone(timeZone13);
        calendar3.set(100, 1970, 34, 348, (int) (short) 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromCalendarFields(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=100,MONTH=1970,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=34,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=348,MINUTE=10,SECOND=100,MILLISECOND=96,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645513716096L + "'", long6 == 1645513716096L);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int6 = localDateTime0.get(dateTimeFieldType5);
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType5.getDurationType();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType5.getDurationType();
        java.lang.String str9 = durationFieldType8.getName();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 173 + "'", int2 == 173);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hours" + "'", str9, "hours");
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withDefaultYear(3);
        java.lang.Integer int6 = dateTimeFormatter5.getPivotYear();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.lang.String str8 = locale7.getDisplayCountry();
        boolean boolean9 = locale7.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant11 = org.joda.time.Instant.parse("25713647", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "United Kingdom" + "'", str8, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime.Property property9 = dateTime3.hourOfDay();
        java.lang.String str10 = property9.toString();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[hourOfDay]" + "'", str10, "Property[hourOfDay]");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.property(dateTimeFieldType2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withSecondOfMinute(6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDateTime7.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes(10);
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.plus(readablePeriod14);
        org.joda.time.DateTime dateTime16 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property17 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime19 = property17.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.minus(readableDuration20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime24 = localDateTime23.toDateTime();
        org.joda.time.Chronology chronology25 = localDateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType22.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.weekyear();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) readableDuration20, chronology25);
        org.joda.time.DateTimeZone dateTimeZone30 = chronology25.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(761, 0, 0, 140, (int) (short) 0, 910, 1970, chronology25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 140 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        java.util.Locale locale6 = java.util.Locale.UK;
        java.lang.String str7 = locale6.getDisplayCountry();
        boolean boolean8 = locale6.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter4.withLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter4.print(13305600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "United Kingdom" + "'", str7, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(11, 0, (int) (short) 10, (int) (byte) 0);
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes(52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType(25711821);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 25711821");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.Chronology chronology10 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.secondOfMinute();
        org.joda.time.DurationField durationField12 = chronology10.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.year();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 9, chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(32770, (int) (short) 100, 489, 374, 6, 292278993, 348, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 374 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean3 = localTime1.isSupported(dateTimeFieldType2);
        org.joda.time.LocalTime.Property property4 = localTime1.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((java.lang.Object) localTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minus(readableDuration3);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        long long6 = calendar3.getTimeInMillis();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar3);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone13 = fixedDateTimeZone12.toTimeZone();
        int int14 = timeZone13.getRawOffset();
        calendar3.setTimeZone(timeZone13);
        calendar3.set(100, 1970, 34, 348, (int) (short) 10, (int) (byte) 100);
        java.util.Locale locale25 = java.util.Locale.US;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = calendar3.getDisplayName(32770, (int) (byte) 1, locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=100,MONTH=1970,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=34,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=348,MINUTE=10,SECOND=100,MILLISECOND=723,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645513716723L + "'", long6 == 1645513716723L);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minus(readablePeriod2);
        int int4 = localDateTime3.getYearOfEra();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        java.util.Locale locale6 = java.util.Locale.UK;
        java.lang.String str7 = locale6.getDisplayCountry();
        boolean boolean8 = locale6.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter4.withLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTimeFormatter9.parseDateTime("KOR");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "United Kingdom" + "'", str7, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        timeZone0.setID("");
        java.util.Locale locale6 = java.util.Locale.UK;
        java.lang.String str7 = locale6.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        java.util.Locale locale9 = java.util.Locale.UK;
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale6.getDisplayLanguage(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = timeZone0.getDisplayName(false, 548, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 548");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "United Kingdom" + "'", str7, "United Kingdom");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "United Kingdom" + "'", str10, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English" + "'", str11, "English");
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0L, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(0L, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate8.plus(readablePeriod11);
        org.joda.time.LocalDate localDate13 = localDate5.withFields((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate15 = localDate5.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime16 = localDate15.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 0, chronology17);
        org.joda.time.DurationField durationField19 = chronology17.weekyears();
        org.joda.time.DurationField durationField20 = chronology17.weeks();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(0L, dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = localDate23.toDateMidnight(dateTimeZone24);
        int[] intArray27 = chronology17.get((org.joda.time.ReadablePartial) localDate23, (long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = chronology17.getDateTimeMillis((int) '4', 761, 25711821, (int) (short) 0, 348, 25711821, 140);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 348 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1969, 12, 31]");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeZone0.getDisplayName(false, 292278993, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 292278993");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond(12);
        org.joda.time.LocalTime localTime4 = localTime0.plusMillis((int) ' ');
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(3);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter9.getZone();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        boolean boolean12 = localTime4.equals((java.lang.Object) dateTimeFormatter9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = dateTimeFormatter9.parseLocalTime("2022-02-22T07:08:27.149");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimeZone10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond(12);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        boolean boolean4 = localTime0.isSupported(durationFieldType3);
        java.util.Date date6 = new java.util.Date((long) (byte) 0);
        int int7 = date6.getHours();
        date6.setYear(9);
        boolean boolean10 = localTime0.equals((java.lang.Object) date6);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology14 = null;
        boolean boolean15 = durationFieldType13.isSupported(chronology14);
        boolean boolean16 = localTime12.isSupported(durationFieldType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = localTime0.withFieldAdded(durationFieldType13, 60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'years' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Jan 01 00:00:00 UTC 1909");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minus(readablePeriod2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = localDateTime1.toString("fr_CA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate6 = localDate2.plusMonths((-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDate6.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 1);
        org.joda.time.LocalTime localTime3 = localTime1.minusMinutes(489);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        int int5 = localDateTime4.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology7 = null;
        boolean boolean8 = durationFieldType6.isSupported(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFieldAdded(durationFieldType6, 59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime1.withFieldAdded(durationFieldType6, 913);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'years' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate14 = localDate4.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        long long21 = dateTimeField18.set((long) 100, 22);
        int int23 = dateTimeField18.getMaximumValue((long) '4');
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(0L, dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate28.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(0L, dateTimeZone32);
        org.joda.time.LocalDate localDate35 = localDate33.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDate localDate37 = localDate33.plus(readablePeriod36);
        org.joda.time.LocalDate localDate38 = localDate30.withFields((org.joda.time.ReadablePartial) localDate33);
        org.joda.time.LocalDate.Property property39 = localDate38.year();
        org.joda.time.DateTimeField dateTimeField40 = property39.getField();
        java.util.Calendar.Builder builder42 = new java.util.Calendar.Builder();
        java.util.Locale locale43 = java.util.Locale.UK;
        java.lang.String str44 = locale43.getDisplayCountry();
        java.util.Calendar.Builder builder45 = builder42.setLocale(locale43);
        java.util.Locale locale46 = java.util.Locale.ROOT;
        java.util.Calendar.Builder builder47 = builder45.setLocale(locale46);
        java.lang.String str48 = dateTimeField40.getAsText(2, locale46);
        java.lang.String str49 = locale46.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            long long50 = dateTimeField18.set((long) 785, "\u82f1\u6587", locale46);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-61472908799900L) + "'", long21 == (-61472908799900L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 292278993 + "'", int23 == 292278993);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "United Kingdom" + "'", str44, "United Kingdom");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "2" + "'", str48, "2");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(0);
        org.joda.time.DateTime.Property property13 = dateTime10.monthOfYear();
        int int14 = property13.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime22 = dateTime20.plusHours(0);
        org.joda.time.DateTime.Property property23 = dateTime20.monthOfYear();
        int int24 = property23.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField25 = property23.getField();
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str27 = property23.getAsShortText(locale26);
        java.lang.String str28 = dateTimeField15.getAsText((int) (byte) 10, locale26);
        java.lang.String str29 = locale26.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = property5.setCopy("English (United Kingdom)", locale26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"English (United Kingdom)\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 657 + "'", int2 == 657);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u4e8c\u6708" + "'", str27, "\u4e8c\u6708");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u5341\u6708" + "'", str28, "\u5341\u6708");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "TWN" + "'", str29, "TWN");
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int16 = localDate14.indexOf(dateTimeFieldType15);
        boolean boolean17 = localDate12.isSupported(dateTimeFieldType15);
        org.joda.time.LocalDate localDate19 = localDate12.withDayOfWeek(4);
        org.joda.time.Interval interval20 = localDate19.toInterval();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(interval20);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (short) 10, 292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.set(2, 0, (int) (short) 0, 2022, 2);
        // The following exception was thrown during execution in test generation
        try {
            calendar3.setWeekDate(2, 500, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2,MONTH=0,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=0,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=2022,MINUTE=2,SECOND=37,MILLISECOND=832,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.Chronology chronology8 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType5.getField(chronology8);
        boolean boolean11 = localDateTime0.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType5.getField(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.Chronology chronology20 = localDateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType17.getField(chronology20);
        org.joda.time.DateTimeField dateTimeField23 = chronology20.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeField16, chronology20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 894 + "'", int2 == 894);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = calendar1.isSet((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645513718104,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=38,MILLISECOND=104,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        int int4 = dateTime1.getEra();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.util.Calendar calendar7 = dateTime1.toCalendar(locale5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = calendar7.isSet(548);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 548");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645513718336,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=38,MILLISECOND=336,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(31, 1, 143, (int) (short) -1, 59, 548, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("\uc138\uacc4\ud45c\uc900\uc2dc");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"???? ???????\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        int int4 = dateTime1.getEra();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getName((long) (byte) -1);
        org.joda.time.DateTime dateTime10 = dateTime1.toDateTime(dateTimeZone6);
        org.joda.time.DateTime.Property property11 = dateTime1.minuteOfHour();
        java.util.Locale locale13 = java.util.Locale.UK;
        java.lang.String str14 = locale13.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet15 = locale13.getExtensionKeys();
        java.util.Locale locale16 = java.util.Locale.UK;
        java.lang.String str17 = locale16.getDisplayCountry();
        java.lang.String str18 = locale13.getDisplayLanguage(locale16);
        java.lang.String str19 = locale16.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = property11.setCopy("Korean (South Korea)", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Korean (South Korea)\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+35:00" + "'", str9, "+35:00");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "United Kingdom" + "'", str14, "United Kingdom");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "United Kingdom" + "'", str17, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English" + "'", str18, "English");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "English (United Kingdom)" + "'", str19, "English (United Kingdom)");
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long4 = dateTimeField2.remainder((long) (byte) 100);
        java.lang.String str5 = dateTimeField2.getName();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(0L, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate12 = localDate8.plusMonths((-1));
        java.util.Locale locale16 = new java.util.Locale("1970-01-01T00:00:00.000Z", "\u4e8c\u6708");
        java.lang.String str17 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDate8, 22, locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale16.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ??");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "millisOfDay" + "'", str5, "millisOfDay");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "\u4e8c\u6708");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "22" + "'", str17, "22");
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = chronology2.years();
        java.lang.String str5 = chronology2.toString();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.withMillisOfSecond(12);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        boolean boolean10 = localTime6.isSupported(durationFieldType9);
        org.joda.time.LocalTime.Property property11 = localTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfMinute();
        org.joda.time.DurationField durationField16 = chronology14.years();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone23 = fixedDateTimeZone22.toTimeZone();
        int int25 = fixedDateTimeZone22.getOffset((long) 228);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 'a', (org.joda.time.DateTimeZone) fixedDateTimeZone22);
        int int27 = localDateTime26.getDayOfYear();
        int[] intArray29 = chronology14.get((org.joda.time.ReadablePartial) localDateTime26, (long) 30);
        // The following exception was thrown during execution in test generation
        try {
            chronology2.validate((org.joda.time.ReadablePartial) localTime6, intArray29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[UTC]" + "'", str5, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 59 + "'", int25 == 59);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1970, 1, 1, 30]");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(11, 0, (int) (short) 10, (int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.plus(readablePeriod7);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property9.setCopy("English (United Kingdom)", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"English (United Kingdom)\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(14, 761, 173, 29, 70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 29 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setScript("Englisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Englisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone11 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone12 = fixedDateTimeZone11.toTimeZone();
        int int14 = fixedDateTimeZone11.getOffset((long) 228);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 'a', (org.joda.time.DateTimeZone) fixedDateTimeZone11);
        int int17 = fixedDateTimeZone11.getOffset((long) 228);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(100, 25717313, 18, 1, (int) (byte) 100, 54, (org.joda.time.DateTimeZone) fixedDateTimeZone11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 59 + "'", int17 == 59);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime7.withPeriodAdded(readablePeriod10, 785);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer5, (org.joda.time.ReadableInstant) dateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property13 = localDate12.year();
        org.joda.time.LocalDate localDate14 = property13.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate16 = localDate14.withYear((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight17 = localDate14.toDateMidnight();
        int int18 = dateMidnight17.getYear();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withHourOfDay(0);
        java.lang.String str4 = localTime0.toString("25707776");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType5);
        org.joda.time.LocalTime localTime8 = localTime0.plusMillis(0);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfMonth();
        int int13 = localDateTime11.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localTime10.compareTo((org.joda.time.ReadablePartial) localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25707776" + "'", str4, "25707776");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 18 + "'", int13 == 18);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond(12);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        boolean boolean4 = localTime0.isSupported(durationFieldType3);
        java.util.Date date6 = new java.util.Date((long) (byte) 0);
        int int7 = date6.getHours();
        date6.setYear(9);
        boolean boolean10 = localTime0.equals((java.lang.Object) date6);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) 910);
        java.lang.String str13 = localTime12.toString();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone19 = fixedDateTimeZone18.toTimeZone();
        int int21 = fixedDateTimeZone18.getOffset((long) 228);
        boolean boolean22 = fixedDateTimeZone18.isFixed();
        org.joda.time.DateTime dateTime23 = localTime12.toDateTimeToday((org.joda.time.DateTimeZone) fixedDateTimeZone18);
        boolean boolean24 = localTime0.isAfter((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime26 = localDateTime25.toDateTime();
        org.joda.time.Chronology chronology27 = localDateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.secondOfMinute();
        org.joda.time.DurationField durationField29 = chronology27.years();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone36 = fixedDateTimeZone35.toTimeZone();
        int int38 = fixedDateTimeZone35.getOffset((long) 228);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) 'a', (org.joda.time.DateTimeZone) fixedDateTimeZone35);
        int int40 = localDateTime39.getDayOfYear();
        int[] intArray42 = chronology27.get((org.joda.time.ReadablePartial) localDateTime39, (long) 30);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.withDayOfWeek(5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = localTime0.isBefore((org.joda.time.ReadablePartial) localDateTime44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Jan 01 00:00:00 UTC 1909");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11:00:00.910" + "'", str13, "11:00:00.910");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 59 + "'", int38 == 59);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1970, 1, 1, 30]");
        org.junit.Assert.assertNotNull(localDateTime44);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime.Property property11 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime13 = dateTime3.minusMonths((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.Chronology chronology17 = localDateTime15.getChronology();
        boolean boolean18 = dateTimeFieldType14.isSupported(chronology17);
        long long22 = chronology17.add((long) 184, 0L, 0);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = chronology17.add(readablePeriod23, (long) 2022, 1870);
        org.joda.time.DateTimeField dateTimeField27 = chronology17.era();
        int int28 = dateTime3.get(dateTimeField27);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 184L + "'", long22 == 184L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2022L + "'", long26 == 2022L);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readableDuration13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.Chronology chronology18 = localDateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType15.getField(chronology18);
        org.joda.time.DateTimeField dateTimeField21 = chronology18.weekyear();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) readableDuration13, chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withDate(374, 6, 292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withPeriodAdded(readablePeriod7, (int) '4');
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime3);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks(54);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withDate(32770, 59, 32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone6 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone7 = fixedDateTimeZone6.toTimeZone();
        int int9 = fixedDateTimeZone6.getOffset((long) 228);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 'a', (org.joda.time.DateTimeZone) fixedDateTimeZone6);
        int int12 = fixedDateTimeZone6.getOffset((long) 228);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) 140, (org.joda.time.DateTimeZone) fixedDateTimeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.year();
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale8.getDisplayName();
        long long10 = dateTimeField5.set(1645513710548L, "22", locale8);
        boolean boolean12 = locale8.equals((java.lang.Object) 8L);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Korean (South Korea)" + "'", str9, "Korean (South Korea)");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-61468390289452L) + "'", long10 == (-61468390289452L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.property(dateTimeFieldType2);
        int int6 = property5.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property5.setCopy("\u4e8c\u6708");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 86399999 + "'", int6 == 86399999);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withHourOfDay(0);
        java.lang.String str4 = localTime0.toString("25707776");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType5);
        org.joda.time.LocalTime localTime8 = localTime0.plusMillis(0);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property9.setCopy("2022-02-22T07:10:26.657Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:10:26.657Z\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25707776" + "'", str4, "25707776");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str6 = timeZone5.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GMT+00:00" + "'", str6, "GMT+00:00");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = localDateTime0.toString("Property[hourOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.Chronology chronology7 = localDateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.halfdayOfDay();
        org.joda.time.DurationField durationField9 = chronology7.seconds();
        org.joda.time.DurationField durationField10 = chronology7.millis();
        org.joda.time.DurationField durationField11 = chronology7.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(7, (int) ' ', 813, 541, (int) (short) 0, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 541 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 10);
        org.joda.time.DateTime dateTime11 = dateTime3.plusMonths(34);
        int int12 = dateTime3.getEra();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property13 = localDate12.year();
        org.joda.time.LocalDate localDate14 = property13.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate16 = localDate14.withYear((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int23 = localDateTime17.get(dateTimeFieldType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property24 = localDate16.property(dateTimeFieldType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 148 + "'", int19 == 148);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setUnicodeLocaleKeyword("DateTimeField[secondOfMinute]", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: DateTimeField[secondOfMinute] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone6 = fixedDateTimeZone5.toTimeZone();
        int int8 = fixedDateTimeZone5.getOffset((long) 228);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 'a', (org.joda.time.DateTimeZone) fixedDateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(2081);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2081 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        int int4 = dateTime1.getEra();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.util.Calendar calendar7 = dateTime1.toCalendar(locale5);
        // The following exception was thrown during execution in test generation
        try {
            calendar7.setWeekDate((int) (short) 0, 6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645513721416,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=41,MILLISECOND=416,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(8, 0, 10);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.plusHours(4);
        int int9 = dateTime6.getEra();
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet11 = locale10.getExtensionKeys();
        java.util.Calendar calendar12 = dateTime6.toCalendar(locale10);
        java.lang.Object obj13 = null;
        boolean boolean14 = dateTime6.equals(obj13);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime6.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((java.lang.Object) 8, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1645513721634,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=41,MILLISECOND=634,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.secondOfMinute();
        org.joda.time.DurationField durationField5 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.year();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 9, chronology3);
        int int8 = localDateTime7.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withCenturyOfEra(374);
        int int13 = localDateTime10.getMonthOfYear();
        int int14 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withYearOfEra((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 70 + "'", int8 == 70);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        boolean boolean4 = dateTimeFieldType0.isSupported(chronology3);
        long long8 = chronology3.add((long) 184, 0L, 0);
        org.joda.time.DateTimeField dateTimeField9 = chronology3.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(0L, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(0L, dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate21 = localDate17.plusMonths((-1));
        int int22 = localDate12.compareTo((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int26 = localDate24.indexOf(dateTimeFieldType25);
        org.joda.time.LocalDate localDate27 = localDate17.withFields((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.Chronology chronology31 = localDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.secondOfMinute();
        org.joda.time.DurationField durationField33 = chronology31.years();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone39 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone40 = fixedDateTimeZone39.toTimeZone();
        int int42 = fixedDateTimeZone39.getOffset((long) 228);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 'a', (org.joda.time.DateTimeZone) fixedDateTimeZone39);
        int int44 = localDateTime43.getDayOfYear();
        int[] intArray46 = chronology31.get((org.joda.time.ReadablePartial) localDateTime43, (long) 30);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray48 = dateTimeField9.addWrapField((org.joda.time.ReadablePartial) localDate17, 10, intArray46, 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 184L + "'", long8 == 184L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 59 + "'", int42 == 59);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1970, 1, 1, 30]");
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            calendar1.add(866, 323);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645513722221,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=42,MILLISECOND=280,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minus(readableDuration2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfCentury();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((-61472908799900L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -61472908799900 * 86400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate14 = localDate12.plusDays(20);
        org.joda.time.LocalDate localDate16 = localDate12.plusWeeks(40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = localDate16.withDayOfMonth((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.Chronology chronology8 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType5.getField(chronology8);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyear();
        org.joda.time.DateTime dateTime12 = dateTime3.toDateTime(chronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime3.withHourOfDay(813);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 813 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(816, 37, (int) (short) 1, (int) '#', 2, 42, 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        calendar3.setLenient(true);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromCalendarFields(calendar3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calendar3.getGreatestMinimum(268);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 268");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513723158,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=43,MILLISECOND=217,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withHourOfDay(0);
        java.lang.String str4 = localTime0.toString("25707776");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType5);
        org.joda.time.LocalTime localTime8 = localTime0.plusMillis(0);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.withMaximumValue();
        org.joda.time.LocalTime localTime11 = property9.roundHalfEvenCopy();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime11.withFieldAdded(durationFieldType12, 25842980);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25707776" + "'", str4, "25707776");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getHours();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone5);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDate localDate8 = localDate3.withFields((org.joda.time.ReadablePartial) localDateTime6);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 18 + "'", int7 == 18);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("GMT+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"GMT+00:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        int int6 = dateTime3.getWeekOfWeekyear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        boolean boolean15 = dateTimeFieldType11.isSupported(chronology14);
        long long19 = chronology14.add((long) 184, 0L, 0);
        org.joda.time.DateTimeField dateTimeField20 = chronology14.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((java.lang.Object) chronology7, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 184L + "'", long19 == 184L);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setRegion("Fri Jan 01 00:00:00 UTC 1909");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Fri Jan 01 00:00:00 UTC 1909 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.util.Locale locale3 = new java.util.Locale("java.util.GregorianCalendar[time=1645513710548,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=30,MILLISECOND=548,ZONE_OFFSET=0,DST_OFFSET=0]", "2", "2022-02-22T07:08:27.149");
        java.lang.String str4 = locale3.toLanguageTag();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone10 = fixedDateTimeZone9.toTimeZone();
        int int12 = fixedDateTimeZone9.getStandardOffset((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((java.lang.Object) str4, (org.joda.time.DateTimeZone) fixedDateTimeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"und\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "java.util.gregoriancalendar[time=1645513710548,arefieldsset=true,areallfieldsset=true,lenient=false,zone=sun.util.calendar.zoneinfo[id=\"etc/utc\",offset=0,dstsavings=0,usedaylight=false,transitions=0,lastrule=null],firstdayofweek=2,minimaldaysinfirstweek=4,era=1,year=2022,month=1,week_of_year=8,week_of_month=4,day_of_month=22,day_of_year=53,day_of_week=3,day_of_week_in_month=4,am_pm=0,hour=7,hour_of_day=7,minute=8,second=30,millisecond=548,zone_offset=0,dst_offset=0]_2_2022-02-22T07:08:27.149");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusMinutes(32770);
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withMinuteOfHour(659);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 659 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate2.plus(readablePeriod5);
        org.joda.time.LocalDate.Property property7 = localDate2.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        java.lang.String str9 = dateTimeFieldType8.toString();
        boolean boolean10 = localDate2.isSupported(dateTimeFieldType8);
        int int11 = localDate2.getMonthOfYear();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "clockhourOfHalfday" + "'", str9, "clockhourOfHalfday");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTime dateTime8 = dateTime3.plusYears((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime8.withYearOfCentury(866);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 866 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property13 = localDate12.year();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        org.joda.time.LocalDate localDate15 = property13.getLocalDate();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) 1);
        org.joda.time.LocalTime localTime19 = localTime17.minusHours((int) (short) 0);
        java.lang.String str21 = localTime17.toString("+35:00");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = localDate15.isEqual((org.joda.time.ReadablePartial) localTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+35:00" + "'", str21, "+35:00");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withMinuteOfHour(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra(374);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDateTime3.get(dateTimeFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("English (United Kingdom)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english(unitedkingdom)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.Chronology chronology8 = localDateTime6.getChronology();
        boolean boolean9 = dateTimeFieldType5.isSupported(chronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(18, 500, 0, 60, 42, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 60 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField6 = chronology3.weekyear();
        long long9 = dateTimeField6.set((long) 1970, 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1641427201970L + "'", long9 == 1641427201970L);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        long long6 = calendar3.getTimeInMillis();
        int int7 = calendar3.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar3.getMaximum(268);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 268");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513723939,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=43,MILLISECOND=998,ZONE_OFFSET=59,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645513723939L + "'", long6 == 1645513723939L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) '4');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        java.lang.String str12 = dateTimeZone9.getName((long) (byte) -1);
        java.lang.String str13 = dateTimeZone9.getID();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime7, dateTimeZone9);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readablePeriod15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekyear(228);
        int int19 = localDateTime16.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime16.withDate(184, 32769, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 985 + "'", int2 == 985);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+35:00" + "'", str12, "+35:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+35:00" + "'", str13, "+35:00");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2026 + "'", int19 == 2026);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        long long6 = java.util.Date.UTC(60, 13, 25713348, (-292275054), 785, 25842980);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1169187558080000L + "'", long6 == 1169187558080000L);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(0, 3, 292269054);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292269054 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.UK;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Calendar.Builder builder3 = builder0.setLocale(locale1);
        java.util.Calendar.Builder builder7 = builder0.setDate(3, (int) (short) 1, 25717313);
        int[] intArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder9 = builder0.setFields(intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United Kingdom" + "'", str2, "United Kingdom");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now(dateTimeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        int int4 = localDateTime3.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology6 = null;
        boolean boolean7 = durationFieldType5.isSupported(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withFieldAdded(durationFieldType5, 59);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime3.plusYears(13);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDate2.compareTo((org.joda.time.ReadablePartial) localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond(12);
        org.joda.time.LocalTime localTime4 = localTime0.plusMillis((int) ' ');
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(3);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter9.getZone();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        boolean boolean12 = localTime4.equals((java.lang.Object) dateTimeFormatter9);
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer13, (long) 25713348);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimeZone10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withPeriodAdded(readablePeriod7, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime9.withYearOfCentury((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType0.getField(chronology3);
        boolean boolean6 = dateTimeField5.isSupported();
        long long9 = dateTimeField5.add((long) (byte) 0, 22);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(dateTimeZone12);
        boolean boolean14 = localDateTime10.equals((java.lang.Object) localDate13);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType16.getField(chronology17);
        org.joda.time.DurationField durationField19 = dateTimeField18.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(0L, dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = localDate22.toDateMidnight(dateTimeZone23);
        int[] intArray31 = new int[] { (-1), (short) 1, 2, 54, (byte) 0 };
        int[] intArray33 = dateTimeField18.add((org.joda.time.ReadablePartial) localDate22, 0, intArray31, 0);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime36 = localDateTime35.toDateTime();
        org.joda.time.Chronology chronology37 = localDateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType40.getField(chronology41);
        long long44 = dateTimeField42.remainder((long) (byte) 100);
        java.lang.String str45 = dateTimeField42.getName();
        java.util.Locale locale47 = java.util.Locale.UK;
        java.lang.String str48 = locale47.getDisplayCountry();
        boolean boolean49 = locale47.hasExtensions();
        java.lang.String str50 = dateTimeField42.getAsShortText(2, locale47);
        java.lang.String str51 = locale47.getDisplayCountry();
        java.lang.String str52 = dateTimeField38.getAsShortText((long) (short) 0, locale47);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray53 = dateTimeField5.set((org.joda.time.ReadablePartial) localDate13, 25842980, intArray33, "\u82f1\u6587", locale47);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 13305600000L + "'", long9 == 13305600000L);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 1, 2, 54, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 1, 2, 54, 0]");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "millisOfDay" + "'", str45, "millisOfDay");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "United Kingdom" + "'", str48, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "2" + "'", str50, "2");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "United Kingdom" + "'", str51, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0" + "'", str52, "0");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology3 = null;
        boolean boolean4 = durationFieldType2.isSupported(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withFieldAdded(durationFieldType2, 59);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(0);
        org.joda.time.DateTime dateTime13 = localDateTime0.toDateTime((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime0.minus(readablePeriod14);
        org.joda.time.DateTime dateTime16 = localDateTime0.toDateTime();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(1645513712594L);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDate18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.set(2, 0, (int) (short) 0, 2022, 2);
        java.time.Instant instant10 = calendar3.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = calendar3.getLeastMaximum(446);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 446");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=-62097040635157,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2,MONTH=2,WEEK_OF_YEAR=12,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=84,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=2,SECOND=44,MILLISECOND=902,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant10);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        java.lang.Appendable appendable4 = null;
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime10 = dateTime8.plusHours(0);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable4, (org.joda.time.ReadableInstant) dateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(813, 0, 173, (int) 'x', 12, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = dateTimeField3.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = dateTimeField3.getType();
        java.lang.String str6 = dateTimeField3.toString();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateTimeField[clockhourOfDay]" + "'", str6, "DateTimeField[clockhourOfDay]");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = chronology2.getDateTimeMillis(1209600761L, (int) (byte) 10, 28, 228, 446);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 228 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable5, 2461104000100L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getHours();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromDateFields(date1);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(0L, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate12.plus(readablePeriod15);
        org.joda.time.LocalDate localDate17 = localDate9.withFields((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate.Property property18 = localDate17.year();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(0L, dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDate localDate25 = localDate21.plus(readablePeriod24);
        int int26 = localDate17.compareTo((org.joda.time.ReadablePartial) localDate25);
        int int27 = localDate17.getYear();
        org.joda.time.LocalDate.Property property28 = localDate17.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = property4.compareTo((org.joda.time.ReadablePartial) localDate17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        java.io.Writer writer6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer6, (org.joda.time.ReadablePartial) localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimePrinter5);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate2.plus(readablePeriod5);
        org.joda.time.LocalDate.Property property7 = localDate2.monthOfYear();
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate2.withDayOfWeek(54);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.Chronology chronology7 = localDateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfMinute();
        org.joda.time.DurationField durationField9 = chronology7.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(45, 184, 352, 259, 25842980, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 259 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime.Property property9 = dateTime3.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = property9.setCopy(495);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 495 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = dateTimeField3.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant5 = new org.joda.time.Instant((java.lang.Object) dateTimeField3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.field.ZeroIsMaxDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.util.Date date5 = new java.util.Date(60, 18, 1, 541, 785);
        java.lang.String str6 = date5.toString();
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Jul 24 02:05:00 GMT+00:00 1961");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mon Jul 24 02:05:00 GMT+00:00 1961" + "'", str6, "Mon Jul 24 02:05:00 GMT+00:00 1961");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(348, 386, 813, 17, 18, 995, 40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 995 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = chronology2.getDateTimeMillis(489, 2081, 59, 40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2081 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        int int7 = fixedDateTimeZone4.getOffset((long) 228);
        java.lang.String str9 = fixedDateTimeZone4.getShortName((long) 2);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minus(readableDuration12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusMinutes(548);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withFieldAdded(durationFieldType16, 6);
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = localDateTime18.getValue(60);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 60");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.059" + "'", str9, "+00:00:00.059");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter4.getZone();
        org.joda.time.Chronology chronology6 = dateTimeFormatter4.getChronolgy();
        boolean boolean7 = dateTimeFormatter4.isParser();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter4.withZone(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime11 = dateTimeFormatter4.parseMutableDateTime("java.util.GregorianCalendar[time=1645513710548,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=30,MILLISECOND=548,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale0.getDisplayName(locale3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(0L, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(0L, dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate13.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate13.plus(readablePeriod16);
        org.joda.time.LocalDate localDate18 = localDate10.withFields((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.LocalDate localDate20 = localDate10.withDayOfYear((int) '#');
        boolean boolean21 = locale3.equals((java.lang.Object) localDate20);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "United Kingdom" + "'", str4, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English (United Kingdom)" + "'", str5, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        long long7 = property6.remainder();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours(0);
        org.joda.time.DateTime.Property property14 = dateTime11.monthOfYear();
        int int15 = property14.getMaximumValue();
        org.joda.time.DateTime dateTime16 = property14.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime18 = dateTime16.plus((long) 3);
        int int19 = property6.getDifference((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone25 = fixedDateTimeZone24.toTimeZone();
        int int27 = fixedDateTimeZone24.getOffset((long) 228);
        boolean boolean28 = fixedDateTimeZone24.isFixed();
        org.joda.time.DateTime dateTime29 = dateTime18.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone24);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime32 = localDateTime31.toDateTime();
        org.joda.time.Chronology chronology33 = localDateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.secondOfMinute();
        org.joda.time.DurationField durationField35 = chronology33.years();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.year();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(0L, chronology33);
        org.joda.time.DateTime dateTime38 = dateTime29.toDateTime(chronology33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime40 = dateTime29.withMinuteOfHour(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4471846375L + "'", long7 == 4471846375L);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 59 + "'", int27 == 59);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant7 = new org.joda.time.Instant((java.lang.Object) dateTimeField6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.field.PreciseDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property13 = localDate12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(0L, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate16.plus(readablePeriod19);
        int int21 = localDate12.compareTo((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate23 = localDate20.minusWeeks((int) 'a');
        org.joda.time.LocalDate localDate25 = localDate23.withYearOfEra(100);
        int int26 = localDate23.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        long long31 = dateTimeField29.remainder((long) (byte) 100);
        java.lang.String str32 = dateTimeField29.getName();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(0L, dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate39 = localDate35.plusMonths((-1));
        java.util.Locale locale43 = new java.util.Locale("1970-01-01T00:00:00.000Z", "\u4e8c\u6708");
        java.lang.String str44 = dateTimeField29.getAsText((org.joda.time.ReadablePartial) localDate35, 22, locale43);
        int int46 = dateTimeField29.get((-1L));
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = dateTimeField29.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property48 = localDate23.property(dateTimeFieldType47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "millisOfDay" + "'", str32, "millisOfDay");
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
// flaky:         org.junit.Assert.assertEquals(locale43.toString(), "\u4e8c\u6708");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "22" + "'", str44, "22");
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 39599999 + "'", int46 == 39599999);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfYear();
        java.lang.String str2 = localDateTime0.toString();
        int int3 = localDateTime0.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withMinuteOfHour(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-23T18:08:46.531" + "'", str2, "2022-02-23T18:08:46.531");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.UK;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Calendar.Builder builder3 = builder0.setLocale(locale1);
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.util.Calendar.Builder builder5 = builder3.setLocale(locale4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone6);
        java.util.Calendar.Builder builder8 = builder3.setTimeZone(timeZone6);
        boolean boolean9 = timeZone6.useDaylightTime();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United Kingdom" + "'", str2, "United Kingdom");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long4 = dateTimeField2.remainder((long) (byte) 100);
        java.lang.String str5 = dateTimeField2.getName();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.lang.String str8 = locale7.getDisplayCountry();
        boolean boolean9 = locale7.hasExtensions();
        java.lang.String str10 = dateTimeField2.getAsShortText(2, locale7);
        java.lang.String str11 = locale7.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet12 = locale7.getExtensionKeys();
        org.joda.time.YearMonthDay[] yearMonthDayArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay[] yearMonthDayArray14 = charSet12.toArray(yearMonthDayArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "millisOfDay" + "'", str5, "millisOfDay");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "United Kingdom" + "'", str8, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2" + "'", str10, "2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "United Kingdom" + "'", str11, "United Kingdom");
        org.junit.Assert.assertNotNull(charSet12);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getDisplayCountry();
        boolean boolean6 = locale4.hasExtensions();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(locale4);
        calendar7.setLenient(false);
        long long10 = calendar7.getTimeInMillis();
        int int11 = calendar7.getWeeksInWeekYear();
        int int12 = calendar3.compareTo(calendar7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513726663,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=46,MILLISECOND=722,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "United Kingdom" + "'", str5, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645513726663,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=46,MILLISECOND=722,ZONE_OFFSET=59,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1645513726663L + "'", long10 == 1645513726663L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        int int7 = dateTime3.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime3.withWeekOfWeekyear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate2.withYearOfCentury((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property13 = localDate12.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate12.withWeekOfWeekyear(25711821);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25711821 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.seconds();
        boolean boolean6 = dateTime1.equals((java.lang.Object) durationFieldType5);
        int int7 = dateTime1.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = dateTime1.withYearOfEra(70);
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale11.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTime1.toString("Korean (South Korea)", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 47 + "'", int7 == 47);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "United Kingdom" + "'", str12, "United Kingdom");
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        int int7 = property6.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        int int11 = dateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTime.Property property18 = dateTime15.weekyear();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime15.withPeriodAdded(readablePeriod19, (int) '4');
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime15);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks(54);
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str27 = dateTimeField8.getAsText((org.joda.time.ReadablePartial) localDateTime22, 6, locale26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime22.withCenturyOfEra(785);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = localDateTime29.getValue(59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 59");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u516d\u6708" + "'", str27, "\u516d\u6708");
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.secondOfMinute();
        org.joda.time.DurationField durationField5 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.year();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 9, chronology3);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology3.getDateTimeMillis((long) 386, 17, 126000000, 500, 37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 126000000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter4.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = dateTimeFormatter6.parseMutableDateTime("25713366");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTime dateTime8 = dateTime3.plusYears((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime8.withMonthOfYear(619);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 619 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withPeriodAdded(readablePeriod7, (int) '4');
        java.lang.String str10 = dateTime3.toString();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime13 = localTime11.withMillisOfSecond(12);
        org.joda.time.LocalTime localTime15 = localTime11.plusMillis((int) ' ');
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withDefaultYear(3);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeFormatter20.getZone();
        org.joda.time.Chronology chronology22 = dateTimeFormatter20.getChronolgy();
        boolean boolean23 = localTime15.equals((java.lang.Object) dateTimeFormatter20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter20.withPivotYear((java.lang.Integer) 38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dateTime3.toString(dateTimeFormatter20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-23T18:10:47.679+35:00" + "'", str10, "2022-02-23T18:10:47.679+35:00");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNull(dateTimeZone21);
        org.junit.Assert.assertNull(chronology22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.year();
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale8.getDisplayName();
        long long10 = dateTimeField5.set(1645513710548L, "22", locale8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = dateTimeField14.getAsText((long) (byte) -1, locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTimeField5.getAsText(readablePartial11, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Korean (South Korea)" + "'", str9, "Korean (South Korea)");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-61468390289452L) + "'", long10 == (-61468390289452L));
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "39599999" + "'", str17, "39599999");
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        java.util.Date date5 = new java.util.Date(8, 54, (int) ' ', (int) (short) 1, 54);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate6.withYearOfCentury(967);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 967 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Thu Aug 01 01:54:00 GMT+00:00 1912");
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(0);
        org.joda.time.DateTime.Property property8 = dateTime5.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime5.withPeriodAdded(readablePeriod9, (int) '4');
        int int12 = property1.getDifference((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime5.plus(readableDuration13);
        int int15 = dateTime14.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime14.withDate((int) (short) 1, 41, 99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 41 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) '4');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        java.lang.String str12 = dateTimeZone9.getName((long) (byte) -1);
        java.lang.String str13 = dateTimeZone9.getID();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime7, dateTimeZone9);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readablePeriod15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekyear(228);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusMillis((-1));
        int int21 = localDateTime18.getCenturyOfEra();
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = localDateTime18.isSupported(durationFieldType22);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 339 + "'", int2 == 339);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+35:00" + "'", str12, "+35:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+35:00" + "'", str13, "+35:00");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate2.plus(readablePeriod5);
        org.joda.time.LocalDate.Property property7 = localDate2.monthOfYear();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(10);
        int int16 = dateTime13.getWeekOfWeekyear();
        org.joda.time.Chronology chronology17 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.secondOfMinute();
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str20 = locale19.getVariant();
        int int21 = dateTimeField18.getMaximumShortTextLength(locale19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = property7.setCopy("UTC", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"UTC\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        calendar3.setLenient(true);
        int int9 = calendar3.getLeastMaximum(1);
        calendar3.setMinimalDaysInFirstWeek(0);
        java.util.Date date12 = calendar3.getTime();
        int int13 = calendar3.getWeekYear();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        boolean boolean15 = timeZone14.observesDaylightTime();
        timeZone14.setID("");
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone14);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone14);
        calendar3.setTimeZone(timeZone14);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513728465,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=0,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=48,MILLISECOND=524,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 292269054 + "'", int9 == 292269054);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Feb 22 07:08:48 GMT+00:00 2022");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(calendar18);
// flaky:         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=1645513728468,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=48,MILLISECOND=527,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1645513728468,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=48,MILLISECOND=527,ZONE_OFFSET=59,DST_OFFSET=0]");
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.property(dateTimeFieldType2);
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear(48);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale locale5 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = calendar1.getDisplayName(0, 2026, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645513728515,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=48,MILLISECOND=574,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek(446);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 446 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond(12);
        org.joda.time.LocalTime localTime4 = localTime0.plusMillis((int) ' ');
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(3);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter9.getZone();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        boolean boolean12 = localTime4.equals((java.lang.Object) dateTimeFormatter9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = dateTimeFormatter9.parseLocalDateTime("19");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimeZone10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(0L, dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(0L, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate9.plus(readablePeriod12);
        org.joda.time.LocalDate localDate14 = localDate6.withFields((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.LocalDate localDate16 = localDate6.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime17 = localDate16.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property18 = dateTime17.monthOfYear();
        org.joda.time.Chronology chronology19 = dateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType0.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(0L, dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate24.minusYears((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        java.lang.String str28 = dateTimeFieldType27.toString();
        int int29 = localDate26.indexOf(dateTimeFieldType27);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeField21.getAsShortText((org.joda.time.ReadablePartial) localDate26, (-1), locale31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate34 = localDate26.withYearOfCentury(497);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 497 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "clockhourOfHalfday" + "'", str1, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "clockhourOfHalfday" + "'", str28, "clockhourOfHalfday");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-1" + "'", str32, "-1");
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology2.getDateTimeMillis(497, 685, 39020, 60, 619, 659, 348);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 60 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.Chronology chronology10 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.secondOfMinute();
        org.joda.time.DurationField durationField12 = chronology10.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.year();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(0L, chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(2081, 301, 30, 39610000, 7, 0, 348, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39610000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withHourOfDay((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 783 + "'", int2 == 783);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter4.getZone();
        org.joda.time.Chronology chronology6 = dateTimeFormatter4.getChronolgy();
        boolean boolean7 = dateTimeFormatter4.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter4.withPivotYear(913);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeFormatter4.parseMillis("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2");
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.Instant instant3 = instant1.toInstant();
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        org.joda.time.Chronology chronology6 = dateTimeFormatter4.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter4.getPrinter();
        java.lang.Integer int8 = dateTimeFormatter4.getPivotYear();
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(0L, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(0L, dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate21 = localDate17.plus(readablePeriod20);
        org.joda.time.LocalDate localDate22 = localDate14.withFields((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.LocalDate.Property property23 = localDate22.year();
        int int24 = localDate22.getYear();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate22.plus(readablePeriod25);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer9, (org.joda.time.ReadablePartial) localDate22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNull(dateTimePrinter7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.util.Date date1 = new java.util.Date((long) (byte) 1);
        date1.setYear(228);
        int int4 = date1.getDay();
        int int5 = date1.getMinutes();
        date1.setYear(348);
        date1.setTime(35L);
        int int10 = date1.getTimezoneOffset();
        java.lang.String str11 = date1.toGMTString();
        java.lang.String str12 = date1.toString();
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str11, "1 Jan 1970 00:00:00 GMT");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Thu Jan 01 00:00:00 GMT+00:00 1970" + "'", str12, "Thu Jan 01 00:00:00 GMT+00:00 1970");
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.Chronology chronology8 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType5.getField(chronology8);
        boolean boolean11 = localDateTime0.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType5.getField(chronology14);
        org.joda.time.DurationField durationField17 = chronology14.weekyears();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = chronology14.get(readablePeriod18, 1645513724554L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 204 + "'", int2 == 204);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.Chronology chronology7 = localDateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(13, (int) '4', 2026, 0, (-1), chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.UK;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Calendar.Builder builder3 = builder0.setLocale(locale1);
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.util.Calendar.Builder builder5 = builder3.setLocale(locale4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone6);
        java.util.Calendar.Builder builder8 = builder3.setTimeZone(timeZone6);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone6);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.fromCalendarFields(calendar9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDate10.get(dateTimeFieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United Kingdom" + "'", str2, "United Kingdom");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645513729345,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=49,MILLISECOND=404,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property13 = localDate12.year();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        org.joda.time.LocalDate localDate15 = property13.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate17 = localDate15.minusYears(866);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType18.getField(chronology19);
        long long22 = dateTimeField20.remainder((long) (byte) 100);
        java.lang.String str23 = dateTimeField20.getName();
        long long26 = dateTimeField20.set((long) 1870, 15);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = dateTimeField20.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property28 = localDate17.property(dateTimeFieldType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "millisOfDay" + "'", str23, "millisOfDay");
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-39599985L) + "'", long26 == (-39599985L));
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.property(dateTimeFieldType2);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        boolean boolean8 = localDateTime1.equals((java.lang.Object) property7);
        java.lang.String str9 = property7.toString();
        org.joda.time.LocalDateTime localDateTime10 = property7.roundHalfCeilingCopy();
        java.lang.String str11 = property7.getAsText();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[dayOfYear]" + "'", str9, "Property[dayOfYear]");
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "54" + "'", str11, "54");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getHours();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromDateFields(date1);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property4.roundFloorCopy();
        java.lang.String str7 = property4.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property4.setCopy("2022-02-23T18:08:44.927");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-23T18:08:44.927\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "secondOfMinute" + "'", str7, "secondOfMinute");
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes(10);
        int int11 = dateTime8.getWeekOfWeekyear();
        org.joda.time.Chronology chronology12 = dateTime8.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(59, (int) '4', 39020, 930, (int) (byte) 0, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 930 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 910);
        java.lang.String str2 = localTime1.toString();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone7 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone8 = fixedDateTimeZone7.toTimeZone();
        int int10 = fixedDateTimeZone7.getOffset((long) 228);
        boolean boolean11 = fixedDateTimeZone7.isFixed();
        org.joda.time.DateTime dateTime12 = localTime1.toDateTimeToday((org.joda.time.DateTimeZone) fixedDateTimeZone7);
        org.joda.time.DateTime dateTime14 = dateTime12.minusSeconds(22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime14.withDate(173, 25711821, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25711821 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11:00:00.910" + "'", str2, "11:00:00.910");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(659, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 659 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.UK;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Calendar.Builder builder3 = builder0.setLocale(locale1);
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.util.Calendar.Builder builder5 = builder3.setLocale(locale4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone6);
        java.util.Calendar.Builder builder8 = builder3.setTimeZone(timeZone6);
        int int9 = timeZone6.getDSTSavings();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str2, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfYear();
        java.lang.String str2 = localDateTime0.toString();
        int int3 = localDateTime0.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withYearOfCentury(184);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 184 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-23T18:08:50.103" + "'", str2, "2022-02-23T18:08:50.103");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        int int4 = dateTime1.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime1.withField(dateTimeFieldType5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.halfdayOfDay();
        org.joda.time.DurationField durationField4 = chronology2.seconds();
        org.joda.time.DurationField durationField5 = chronology2.millis();
        org.joda.time.DurationField durationField6 = chronology2.centuries();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = chronology2.get(readablePeriod7, 4345833483L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusMinutes(32770);
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withYearOfCentury(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minus(readableDuration2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra(37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setUnicodeLocaleKeyword("Japan", "430");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Japan [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate14 = localDate4.withDayOfYear((int) '#');
        int int15 = localDate14.getWeekyear();
        org.joda.time.LocalDate.Property property16 = localDate14.dayOfMonth();
        org.joda.time.LocalDate.Property property17 = localDate14.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = localDate14.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1870 + "'", int15 == 1870);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        calendar3.setLenient(true);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromCalendarFields(calendar3);
        calendar3.setMinimalDaysInFirstWeek(0);
        int int12 = calendar3.getActualMaximum(5);
        java.util.Date date14 = new java.util.Date((long) (byte) 0);
        int int15 = date14.getHours();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromDateFields(date14);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = localTime18.minusHours(20);
        org.joda.time.LocalTime localTime22 = localTime18.minusHours(42);
        boolean boolean23 = calendar3.equals((java.lang.Object) localTime18);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str1, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513730433,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=0,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=50,MILLISECOND=492,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(8, 0, 10);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        boolean boolean6 = timeZone5.observesDaylightTime();
        timeZone5.setID("");
        java.util.Calendar.Builder builder9 = builder0.setTimeZone(timeZone5);
        java.util.Calendar.Builder builder13 = builder9.setTimeOfDay(809, 910, (int) (byte) -1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfSecond();
        int int15 = fixedDateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime13);
        int int17 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        long long19 = fixedDateTimeZone4.previousTransition((long) 8);
        java.util.Date date21 = new java.util.Date((long) (byte) 1);
        int int22 = date21.getSeconds();
        java.time.Instant instant23 = date21.toInstant();
        boolean boolean24 = fixedDateTimeZone4.equals((java.lang.Object) instant23);
        java.util.Date date25 = java.util.Date.from(instant23);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 59 + "'", int17 == 59);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 8L + "'", long19 == 8L);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 910);
        org.joda.time.DateTime dateTime2 = localTime1.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateTime2.toString("Chinese");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate14 = localDate4.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology16 = localDate14.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = localDate14.withField(dateTimeFieldType17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        calendar3.setLenient(true);
        int int9 = calendar3.getLeastMaximum(1);
        calendar3.setMinimalDaysInFirstWeek(0);
        java.util.Date date12 = calendar3.getTime();
        int int13 = calendar3.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            calendar3.set(495, 495);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 495");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str1, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513730669,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=0,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=50,MILLISECOND=728,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 292269054 + "'", int9 == 292269054);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Feb 22 07:08:50 GMT+00:00 2022");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 910);
        java.lang.String str2 = localTime1.toString();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone7 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone8 = fixedDateTimeZone7.toTimeZone();
        int int10 = fixedDateTimeZone7.getOffset((long) 228);
        boolean boolean11 = fixedDateTimeZone7.isFixed();
        org.joda.time.DateTime dateTime12 = localTime1.toDateTimeToday((org.joda.time.DateTimeZone) fixedDateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((java.lang.Object) localTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11:00:00.910" + "'", str2, "11:00:00.910");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property13 = localDate12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(0L, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate16.plus(readablePeriod19);
        int int21 = localDate12.compareTo((org.joda.time.ReadablePartial) localDate20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = localDate20.withYearOfCentury(910);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 910 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("kor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"kor\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        int int7 = dateTime3.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime3.minusHours(60);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (-1));
        boolean boolean13 = dateTime3.isAfter((org.joda.time.ReadableInstant) instant12);
        org.joda.time.DateTime dateTime14 = instant12.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant17 = instant12.withDurationAdded(readableDuration15, (int) (byte) 100);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(instant17);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Chinese (Taiwan)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("\u82f1\u570b");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfMinute();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime8 = property5.addToCopy(59);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime16 = dateTime14.plusHours(0);
        org.joda.time.DateTime.Property property17 = dateTime14.weekyear();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime20 = dateTime14.withPeriodAdded(readablePeriod18, (int) '4');
        int int21 = property10.getDifference((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime14.plus(readableDuration22);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = property5.getDifference((org.joda.time.ReadableInstant) dateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3060979080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        java.lang.String str7 = localDateTime1.toString();
        org.joda.time.Instant instant9 = org.joda.time.Instant.parse("2");
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.DateTime dateTime11 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.withMonthOfYear(1870);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1870 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-23T18:08:51.261" + "'", str7, "2022-02-23T18:08:51.261");
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusMinutes(32770);
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        int[] intArray10 = localDateTime8.getValues();
        java.lang.String str11 = localDateTime8.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime8.getFieldType(65441750);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 65441750");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[2022, 3, 18, 44331319]");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022-03-18T12:18:51.319" + "'", str11, "2022-03-18T12:18:51.319");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readableDuration13);
        int int15 = dateTime12.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime12.withMillisOfSecond(126000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 126000000 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        int int6 = dateTime3.getWeekOfWeekyear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        java.util.GregorianCalendar gregorianCalendar8 = dateTime3.toGregorianCalendar();
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap12 = gregorianCalendar8.getDisplayNames(143, 17, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(11, 0, (int) (short) 10, (int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.plus(readablePeriod7);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        int int10 = property9.getMinimumValueOverall();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone12);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localTime11.compareTo((org.joda.time.ReadablePartial) localDate14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.property(dateTimeFieldType2);
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.DurationField durationField7 = property5.getLeapDurationField();
        java.lang.String str8 = property5.getAsText();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(durationField7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "65331610" + "'", str8, "65331610");
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        org.joda.time.Chronology chronology6 = dateTimeFormatter4.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter4.getPrinter();
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(writer8, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNull(dateTimePrinter7);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0);
        java.util.Locale locale3 = java.util.Locale.UK;
        java.lang.String str4 = locale3.getDisplayCountry();
        boolean boolean5 = locale3.hasExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale3);
        calendar6.setLenient(false);
        long long9 = calendar6.getTimeInMillis();
        int int10 = calendar6.getWeeksInWeekYear();
        int int11 = calendar2.compareTo(calendar6);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645513731776,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=51,MILLISECOND=835,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str4, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645513731776,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=51,MILLISECOND=835,ZONE_OFFSET=59,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645513731776L + "'", long9 == 1645513731776L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = chronology2.getDateTimeMillis(229, 7, 651, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 651 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now(dateTimeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(0L, dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(0L, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate10.plus(readablePeriod13);
        org.joda.time.LocalDate localDate15 = localDate7.withFields((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate.Property property16 = localDate15.year();
        org.joda.time.LocalDate localDate18 = property16.addToCopy((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate2.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property22.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate25 = localDate18.withField(dateTimeFieldType23, 226);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(11, 0, (int) (short) 10, (int) (byte) 0);
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes(52);
        org.joda.time.LocalTime localTime8 = localTime4.minusMinutes(0);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMinutes(548);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localTime4.compareTo((org.joda.time.ReadablePartial) localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfMinute();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime8 = property5.addToCopy(59);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) 'x');
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.Chronology chronology13 = localDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.era();
        org.joda.time.DateTime dateTime16 = dateTime10.toDateTime(chronology13);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime16.withDurationAdded(readableDuration17, 930);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime19.withDayOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(23, (-1), 1870);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.halfdayOfDay();
        org.joda.time.DurationField durationField4 = chronology2.seconds();
        org.joda.time.DurationField durationField5 = chronology2.millis();
        org.joda.time.DurationField durationField6 = chronology2.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = chronology2.getDateTimeMillis(25711821, 813, 489, 268, (int) '4', 4, 226);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 268 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1970-01-02T00:00:00.000+35:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-02T00:00:00.000+35:00\" is malformed at \"+35:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        calendar3.setLenient(true);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromCalendarFields(calendar3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = calendar3.isSet((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str1, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513732039,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=52,MILLISECOND=98,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withHourOfDay(0);
        java.lang.String str4 = localTime0.toString("25707776");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType5);
        org.joda.time.LocalTime localTime8 = localTime0.plusMillis(0);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime12 = property9.addCopy(184);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = localTime12.withField(dateTimeFieldType13, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25707776" + "'", str4, "25707776");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property13 = localDate12.year();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        java.util.Calendar.Builder builder16 = new java.util.Calendar.Builder();
        java.util.Locale locale17 = java.util.Locale.UK;
        java.lang.String str18 = locale17.getDisplayCountry();
        java.util.Calendar.Builder builder19 = builder16.setLocale(locale17);
        java.util.Locale locale20 = java.util.Locale.ROOT;
        java.util.Calendar.Builder builder21 = builder19.setLocale(locale20);
        java.lang.String str22 = dateTimeField14.getAsText(2, locale20);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(11, 0, (int) (short) 10, (int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean29 = localTime27.isSupported(durationFieldType28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalTime localTime31 = localTime27.plus(readablePeriod30);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime34 = localDateTime33.toDateTime();
        org.joda.time.Chronology chronology35 = localDateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfMinute();
        org.joda.time.DurationField durationField37 = chronology35.years();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone43 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone44 = fixedDateTimeZone43.toTimeZone();
        int int46 = fixedDateTimeZone43.getOffset((long) 228);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 'a', (org.joda.time.DateTimeZone) fixedDateTimeZone43);
        int int48 = localDateTime47.getDayOfYear();
        int[] intArray50 = chronology35.get((org.joda.time.ReadablePartial) localDateTime47, (long) 30);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray52 = dateTimeField14.addWrapField((org.joda.time.ReadablePartial) localTime27, 228, intArray50, 39599999);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 228");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str18, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2" + "'", str22, "2");
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 59 + "'", int46 == 59);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[1970, 1, 1, 30]");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset(0L);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = timeZone0.getDisplayName(false, (int) (byte) 10, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours(0);
        org.joda.time.DateTime.Property property12 = dateTime9.weekyear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime9.withPeriodAdded(readablePeriod13, (int) '4');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime9);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks(54);
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer5, (org.joda.time.ReadablePartial) localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) '4');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        java.lang.String str12 = dateTimeZone9.getName((long) (byte) -1);
        java.lang.String str13 = dateTimeZone9.getID();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime7, dateTimeZone9);
        int int15 = localDateTime7.getEra();
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localDateTime7.getFields();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDateTime7.getValue(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 292 + "'", int2 == 292);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+35:00" + "'", str12, "+35:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+35:00" + "'", str13, "+35:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        long long6 = java.util.Date.UTC((int) (short) 100, 651, (int) (short) 1, 0, 22, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2658615820000L + "'", long6 == 2658615820000L);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.Instant instant8 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.joda.time.Chronology chronology10 = instant8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(39020, 39599999, 2026, 52, 1870, 13, (int) (short) 0, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(0);
        int int13 = dateTime12.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate14 = localDate4.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtCurrentTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withDefaultYear(3);
        java.lang.Integer int21 = dateTimeFormatter20.getPivotYear();
        org.joda.time.Chronology chronology22 = dateTimeFormatter20.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter20.withPivotYear((java.lang.Integer) 187);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = dateTime15.toString(dateTimeFormatter20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(908, 497, 400, 4, 248);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 248 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology3 = null;
        boolean boolean4 = durationFieldType2.isSupported(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withFieldAdded(durationFieldType2, 59);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.minusWeeks(268);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime0.withHourOfDay(39020);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39020 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.util.Date date0 = new java.util.Date();
        java.lang.Object obj1 = date0.clone();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Tue Feb 22 07:08:52 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(obj1);
// flaky:         org.junit.Assert.assertEquals(obj1.toString(), "Tue Feb 22 07:08:52 GMT+00:00 2022");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Tue Feb 22 07:08:52 GMT+00:00 2022");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Tue Feb 22 07:08:52 GMT+00:00 2022");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withDefaultYear(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.parse("Taiwan", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(0, 541, 816, 104);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 541 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate2.plus(readablePeriod5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone7);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.DateTime dateTime12 = dateTime10.minus((long) 30);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime10.withField(dateTimeFieldType13, 37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37 for clockhourOfDay must be in the range [1,24]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(durationFieldType14);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate2.plus(readablePeriod5);
        org.joda.time.LocalDate.Property property7 = localDate2.monthOfYear();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.withMaximumValue();
        org.joda.time.LocalDate localDate11 = localDate9.minusDays(25842980);
        int int12 = localDate11.getEra();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        long long6 = calendar3.getTimeInMillis();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar3);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone13 = fixedDateTimeZone12.toTimeZone();
        int int14 = timeZone13.getRawOffset();
        calendar3.setTimeZone(timeZone13);
        int int16 = calendar3.getFirstDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            calendar3.add(15, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str1, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513732943,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=53,MILLISECOND=2,ZONE_OFFSET=59,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645513732943L + "'", long6 == 1645513732943L);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("java.util.GregorianCalendar[time=1645513710548,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=30,MILLISECOND=548,ZONE_OFFSET=0,DST_OFFSET=0]", (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.weekyear();
        org.joda.time.DateTime.Property property11 = dateTime3.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        long long16 = dateTimeField14.remainder((long) (byte) 100);
        java.lang.String str17 = dateTimeField14.getName();
        java.util.Locale locale19 = java.util.Locale.UK;
        java.lang.String str20 = locale19.getDisplayCountry();
        boolean boolean21 = locale19.hasExtensions();
        java.lang.String str22 = dateTimeField14.getAsShortText(2, locale19);
        java.lang.String str23 = locale19.getDisplayCountry();
        java.lang.String str24 = locale19.getDisplayLanguage();
        int int25 = property11.getMaximumTextLength(locale19);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "millisOfDay" + "'", str17, "millisOfDay");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str20, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2" + "'", str22, "2");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str23, "\u30a4\u30ae\u30ea\u30b9");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u82f1\u8a9e" + "'", str24, "\u82f1\u8a9e");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        long long6 = calendar3.getTimeInMillis();
        int int7 = calendar3.getWeeksInWeekYear();
        calendar3.set(34, 548, 659, (int) (short) 0, (int) 'x', 685);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = calendar3.getActualMinimum(292269054);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 292269054");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str1, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=34,MONTH=548,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=659,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=0,MINUTE=120,SECOND=685,MILLISECOND=176,ZONE_OFFSET=59,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645513733117L + "'", long6 == 1645513733117L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"United Kingdom\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withDefaultYear(3);
        java.lang.Integer int6 = dateTimeFormatter5.getPivotYear();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.lang.String str8 = locale7.getDisplayCountry();
        boolean boolean9 = locale7.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.parse("GMT+00:00", dateTimeFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str8, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        org.joda.time.Chronology chronology6 = dateTimeFormatter4.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter4.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withOffsetParsed();
        org.joda.time.Chronology chronology9 = dateTimeFormatter4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = dateTimeFormatter4.parseLocalDate("2022-03-18T12:18:43.346");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNull(dateTimePrinter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("1970-01-02T00:00:00.000+35:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1970-01-02t00:00:00.000+35:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime5 = localDateTime4.toDateTime();
        org.joda.time.Chronology chronology6 = localDateTime4.getChronology();
        boolean boolean7 = dateTimeFieldType3.isSupported(chronology6);
        long long11 = chronology6.add((long) 184, 0L, 0);
        org.joda.time.DateTimeField dateTimeField12 = chronology6.dayOfWeek();
        org.joda.time.DurationField durationField13 = chronology6.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((int) (byte) 1, (int) 'a', 500, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 184L + "'", long11 == 184L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(226, (int) (byte) 10, 652, (int) (short) 100, 292278993, 497);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withHourOfDay(0);
        java.lang.String str4 = localTime0.toString("25707776");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType5);
        org.joda.time.LocalTime localTime8 = localTime0.plusMillis(0);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime11 = property9.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = property9.setCopy((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25707776" + "'", str4, "25707776");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean3 = localTime1.isSupported(dateTimeFieldType2);
        org.joda.time.LocalTime.Property property4 = localTime1.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property6 = localTime1.property(dateTimeFieldType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond(12);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        boolean boolean4 = localTime0.isSupported(durationFieldType3);
        java.util.Date date6 = new java.util.Date((long) (byte) 0);
        int int7 = date6.getHours();
        date6.setYear(9);
        boolean boolean10 = localTime0.equals((java.lang.Object) date6);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) 910);
        java.lang.String str13 = localTime12.toString();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone19 = fixedDateTimeZone18.toTimeZone();
        int int21 = fixedDateTimeZone18.getOffset((long) 228);
        boolean boolean22 = fixedDateTimeZone18.isFixed();
        org.joda.time.DateTime dateTime23 = localTime12.toDateTimeToday((org.joda.time.DateTimeZone) fixedDateTimeZone18);
        boolean boolean24 = localTime0.isAfter((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.LocalTime.Property property25 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = localTime26.getValue(143);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 143");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Jan 01 00:00:00 GMT+00:00 1909");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11:00:00.910" + "'", str13, "11:00:00.910");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(0L, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate12.plus(readablePeriod15);
        org.joda.time.LocalDate localDate17 = localDate9.withFields((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate localDate19 = localDate9.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime20 = localDate19.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology21 = localDate19.getChronology();
        int int22 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.Chronology chronology23 = localDate2.getChronology();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = chronology23.get(readablePeriod24, (long) 619, (long) 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeField6.set((long) 25713348, "DateTimeField[clockhourOfDay]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[clockhourOfDay]\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        long long6 = calendar3.getTimeInMillis();
        int int7 = calendar3.getWeeksInWeekYear();
        calendar3.set(34, 548, 659, (int) (short) 0, (int) 'x', 685);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = calendar3.getActualMinimum(17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str1, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=34,MONTH=548,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=659,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=0,MINUTE=120,SECOND=685,MILLISECOND=908,ZONE_OFFSET=59,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645513733849L + "'", long6 == 1645513733849L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(495, 126000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 126000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        int int6 = dateTime3.getWeekOfWeekyear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeField10.set((long) 956, 969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 969 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        calendar3.setLenient(true);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromCalendarFields(calendar3);
        calendar3.setMinimalDaysInFirstWeek(0);
        calendar3.setLenient(false);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str1, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513734167,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=0,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=54,MILLISECOND=226,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        org.joda.time.DurationField durationField7 = property6.getDurationField();
        org.joda.time.DurationField durationField8 = property6.getLeapDurationField();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.lang.String str11 = locale10.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property6.setCopy("Property[hourOfDay]", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[hourOfDay]\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "KOR" + "'", str11, "KOR");
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 910);
        java.lang.String str2 = localTime1.toString();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone7 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone8 = fixedDateTimeZone7.toTimeZone();
        int int10 = fixedDateTimeZone7.getOffset((long) 228);
        boolean boolean11 = fixedDateTimeZone7.isFixed();
        org.joda.time.DateTime dateTime12 = localTime1.toDateTimeToday((org.joda.time.DateTimeZone) fixedDateTimeZone7);
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withDefaultYear(3);
        java.lang.Integer int18 = dateTimeFormatter17.getPivotYear();
        org.joda.time.Chronology chronology19 = dateTimeFormatter17.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter17.withPivotYear((java.lang.Integer) 187);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dateTime12.toString(dateTimeFormatter17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11:00:00.910" + "'", str2, "11:00:00.910");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(11, 0, (int) (short) 10, (int) (byte) 0);
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes(52);
        int int7 = localTime6.size();
        int int8 = localTime6.getHourOfDay();
        org.joda.time.LocalTime.Property property9 = localTime6.minuteOfHour();
        java.lang.String str11 = localTime6.toString("22");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "22" + "'", str11, "22");
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime3.plus(readablePeriod10);
        org.joda.time.DateTime.Property property12 = dateTime11.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        long long15 = dateTimeField13.roundHalfEven(0L);
        boolean boolean16 = dateTimeField13.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = dateTimeField13.set(2461104000100L, "Chinese");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Chinese\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DurationField durationField3 = dateTimeField2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(0L, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate6.toDateMidnight(dateTimeZone7);
        int[] intArray15 = new int[] { (-1), (short) 1, 2, 54, (byte) 0 };
        int[] intArray17 = dateTimeField2.add((org.joda.time.ReadablePartial) localDate6, 0, intArray15, 0);
        int int18 = localDate6.getYear();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 1, 2, 54, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1, 2, 54, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        java.util.Locale locale8 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = property6.setCopy("years", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"years\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond(12);
        org.joda.time.LocalTime localTime4 = localTime0.plusMillis((int) ' ');
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(3);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter9.getZone();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        boolean boolean12 = localTime4.equals((java.lang.Object) dateTimeFormatter9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = dateTimeFormatter9.parseMutableDateTime("49");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimeZone10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone6 = fixedDateTimeZone5.toTimeZone();
        int int8 = fixedDateTimeZone5.getOffset((long) 228);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 'a', (org.joda.time.DateTimeZone) fixedDateTimeZone5);
        int int11 = fixedDateTimeZone5.getOffset((long) 228);
        long long13 = fixedDateTimeZone5.previousTransition((long) 25713348);
        java.lang.String str14 = fixedDateTimeZone5.getID();
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 25713348L + "'", long13 == 25713348L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str14, "1970-01-01T00:00:00.000Z");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("\u30a4\u30ae\u30ea\u30b9");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"?????\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) '4');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        java.lang.String str12 = dateTimeZone9.getName((long) (byte) -1);
        java.lang.String str13 = dateTimeZone9.getID();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime7, dateTimeZone9);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readablePeriod15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusHours(11);
        java.lang.Class<?> wildcardClass19 = localDateTime16.getClass();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 991 + "'", int2 == 991);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+35:00" + "'", str12, "+35:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+35:00" + "'", str13, "+35:00");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2");
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime dateTime3 = instant1.toDateTime();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant1.minus(readableDuration4);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(instant5);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("Taiwan");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Taiwan\" is malformed at \"aiwan\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.DateTimeField dateTimeField6 = localDateTime4.getField((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withHourOfDay(25711821);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25711821 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 254 + "'", int2 == 254);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) '4');
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfCeilingCopy();
        int int9 = property5.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime10 = property5.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField11 = property5.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) property5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 265 + "'", int2 == 265);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        java.lang.String str2 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT+00:00" + "'", str2, "GMT+00:00");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getWeeksInWeekYear();
        java.util.Date date3 = calendar1.getTime();
        // The following exception was thrown during execution in test generation
        try {
            calendar1.roll(70, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645513735361,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=55,MILLISECOND=420,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Tue Feb 22 07:08:55 GMT+00:00 2022");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        int int11 = property10.getMaximumValue();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        java.util.Locale locale6 = java.util.Locale.UK;
        java.lang.String str7 = locale6.getDisplayCountry();
        boolean boolean8 = locale6.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter4.withLocale(locale6);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter9.getZone();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes(10);
        org.joda.time.DateTime.Property property17 = dateTime14.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.plus(readablePeriod18);
        org.joda.time.DateTime dateTime20 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property21 = dateTime14.minuteOfHour();
        org.joda.time.DateTime dateTime23 = property21.addToCopy((long) 6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = dateTimeFormatter9.print((org.joda.time.ReadableInstant) dateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str7, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1870, 1870);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 1870");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean3 = localTime1.isSupported(dateTimeFieldType2);
        org.joda.time.LocalTime.Property property4 = localTime1.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = property4.setCopy(248);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 248 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate14 = localDate4.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        long long21 = dateTimeField18.set((long) 100, 22);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now(dateTimeZone22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(0L, dateTimeZone26);
        org.joda.time.LocalDate localDate29 = localDate27.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(0L, dateTimeZone31);
        org.joda.time.LocalDate localDate34 = localDate32.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate36 = localDate32.plus(readablePeriod35);
        org.joda.time.LocalDate localDate37 = localDate29.withFields((org.joda.time.ReadablePartial) localDate32);
        org.joda.time.LocalDate.Property property38 = localDate37.year();
        org.joda.time.LocalDate localDate40 = property38.addToCopy((int) (byte) -1);
        org.joda.time.LocalDate localDate41 = localDate24.withFields((org.joda.time.ReadablePartial) localDate40);
        int[] intArray46 = new int[] { '#', 567, 30 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray48 = dateTimeField18.addWrapField((org.joda.time.ReadablePartial) localDate40, 53, intArray46, 813);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-61472908799900L) + "'", long21 == (-61472908799900L));
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[35, 567, 30]");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long4 = dateTimeField2.remainder((long) (byte) 100);
        java.lang.String str5 = dateTimeField2.getName();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.lang.String str8 = locale7.getDisplayCountry();
        boolean boolean9 = locale7.hasExtensions();
        java.lang.String str10 = dateTimeField2.getAsShortText(2, locale7);
        java.lang.String str11 = locale7.getDisplayCountry();
        java.lang.String str12 = locale7.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale7.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "millisOfDay" + "'", str5, "millisOfDay");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str8, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2" + "'", str10, "2");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str11, "\u30a4\u30ae\u30ea\u30b9");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u8a9e" + "'", str12, "\u82f1\u8a9e");
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.util.Locale locale2 = new java.util.Locale("2022-02-22T07:10:26.657Z", "0");
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale2.getDisplayVariant(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale2.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "2022-02-22t07:10:26.657z_0");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str4, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter4.getZone();
        org.joda.time.Chronology chronology6 = dateTimeFormatter4.getChronolgy();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(0);
        org.joda.time.DateTime.Property property13 = dateTime10.weekyear();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime10.withPeriodAdded(readablePeriod14, (int) '4');
        java.lang.String str17 = dateTime10.toString();
        org.joda.time.Chronology chronology18 = dateTime10.getChronology();
        org.joda.time.Chronology chronology19 = chronology18.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter4.withChronology(chronology19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = dateTimeFormatter4.parseLocalDate("25713647");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2022-02-23T18:10:55.764+35:00" + "'", str17, "2022-02-23T18:10:55.764+35:00");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.Calendar.Builder builder2 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder6 = builder2.setTimeOfDay(8, 0, 10);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        boolean boolean8 = timeZone7.observesDaylightTime();
        timeZone7.setID("");
        java.util.Calendar.Builder builder11 = builder2.setTimeZone(timeZone7);
        boolean boolean12 = timeZone0.hasSameRules(timeZone7);
        java.lang.String str13 = timeZone7.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GMT+00:00" + "'", str13, "GMT+00:00");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minus(readableDuration2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfCentury();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withYearOfCentury((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withDate(956, 1970, 761);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        int int6 = dateTime3.getWeekOfWeekyear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeField9.set(2022L, 386);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 386 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getHours();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date1);
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = date1.before(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(0);
        org.joda.time.DateTime.Property property8 = dateTime5.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime5.withPeriodAdded(readablePeriod9, (int) '4');
        int int12 = property1.getDifference((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime5.plus(readableDuration13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusHours(4);
        boolean boolean18 = dateTime16.isAfter(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime16.withDayOfYear(548);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 548 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType0.getField(chronology3);
        boolean boolean6 = dateTimeField5.isSupported();
        java.util.Locale locale9 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dateTimeField5.set(331L, "", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja_JP");
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.util.Iterator<java.lang.Character> charItor3 = charSet2.iterator();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minus(readableDuration6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfCentury();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.dayOfYear();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minus(readableDuration13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfCentury();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.dayOfYear();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.base.BaseInterval[] baseIntervalArray18 = new org.joda.time.base.BaseInterval[] { interval10, interval17 };
        org.joda.time.base.BaseInterval[] baseIntervalArray19 = charSet2.toArray(baseIntervalArray18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = charSet2.add((java.lang.Character) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str1, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(charItor3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(baseIntervalArray18);
        org.junit.Assert.assertNotNull(baseIntervalArray19);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withHourOfDay(0);
        org.joda.time.LocalTime.Property property3 = localTime2.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.Chronology chronology7 = localDateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime2.withField(dateTimeFieldType4, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekOfWeekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(0L, dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(0L, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate10.plus(readablePeriod13);
        org.joda.time.LocalDate localDate15 = localDate7.withFields((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = localDate15.getFieldTypes();
        java.lang.String str17 = localDate15.toString();
        org.joda.time.Chronology chronology18 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(126000000, 40, 42, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-02" + "'", str17, "1970-01-02");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withHourOfDay(0);
        java.lang.String str4 = localTime0.toString("25707776");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType5);
        org.joda.time.LocalTime localTime8 = localTime0.plusMillis(0);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime12 = property9.addCopy(184);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType14 = localTime12.getFieldType(188);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 188");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25707776" + "'", str4, "25707776");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("2022-02-23T18:08:46.986");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 910);
        java.lang.String str7 = localTime6.toString();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone13 = fixedDateTimeZone12.toTimeZone();
        int int15 = fixedDateTimeZone12.getOffset((long) 228);
        boolean boolean16 = fixedDateTimeZone12.isFixed();
        org.joda.time.DateTime dateTime17 = localTime6.toDateTimeToday((org.joda.time.DateTimeZone) fixedDateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(651, 211, 188, 813, 0, (org.joda.time.DateTimeZone) fixedDateTimeZone12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 813 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11:00:00.910" + "'", str7, "11:00:00.910");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withDefaultYear(3);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter11.getZone();
        org.joda.time.Chronology chronology13 = dateTimeFormatter11.getChronolgy();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime19 = dateTime17.plusHours(0);
        org.joda.time.DateTime.Property property20 = dateTime17.weekyear();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime17.withPeriodAdded(readablePeriod21, (int) '4');
        java.lang.String str24 = dateTime17.toString();
        org.joda.time.Chronology chronology25 = dateTime17.getChronology();
        org.joda.time.Chronology chronology26 = chronology25.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter11.withChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((int) '4', 892, 1, 23, 548, 173, 497, chronology26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 548 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeZone12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022-02-23T18:10:56.568+35:00" + "'", str24, "2022-02-23T18:10:56.568+35:00");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(11, 0, (int) (short) 10, (int) (byte) 0);
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes(52);
        int int7 = localTime6.size();
        int int8 = localTime6.getHourOfDay();
        org.joda.time.LocalTime.Property property9 = localTime6.minuteOfHour();
        org.joda.time.LocalTime localTime11 = property9.addWrapFieldToCopy(10);
        org.joda.time.DurationField durationField12 = property9.getRangeDurationField();
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(1970, 969, 143, 268);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate14 = localDate4.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology16 = localDate14.getChronology();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone21 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone22 = fixedDateTimeZone21.toTimeZone();
        int int24 = fixedDateTimeZone21.getOffset((long) 228);
        boolean boolean25 = fixedDateTimeZone21.isFixed();
        java.lang.String str27 = fixedDateTimeZone21.getNameKey((long) 348);
        org.joda.time.DateTime dateTime28 = localDate14.toDateTimeAtCurrentTime((org.joda.time.DateTimeZone) fixedDateTimeZone21);
        java.util.TimeZone timeZone29 = fixedDateTimeZone21.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId30 = timeZone29.toZoneId();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1970-01-01T00:00:00.000Z");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 59 + "'", int24 == 59);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str27, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(386, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 386 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        org.joda.time.Chronology chronology6 = dateTimeFormatter4.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter4.getPrinter();
        java.lang.Integer int8 = dateTimeFormatter4.getPivotYear();
        org.joda.time.Instant instant10 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant12 = instant10.minus((long) 32769);
        org.joda.time.MutableDateTime mutableDateTime13 = instant10.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dateTimeFormatter4.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime13, "java.util.GregorianCalendar[time=1645513711272,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=31,MILLISECOND=272,ZONE_OFFSET=0,DST_OFFSET=0]", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNull(dateTimePrinter7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime3.plus(readablePeriod10);
        org.joda.time.DateTime.Property property12 = dateTime11.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        org.joda.time.DateTime dateTime15 = property12.addToCopy(1009868913348L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTime15.toString("GMT+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfMinute();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime8 = property5.addToCopy(59);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) 'x');
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.Chronology chronology13 = localDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.era();
        org.joda.time.DateTime dateTime16 = dateTime10.toDateTime(chronology13);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = chronology13.get(readablePeriod17, (long) 785, (long) 548);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.plusYears(495);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfSecond(12);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime6.minus(readablePeriod7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = localDate3.isEqual((org.joda.time.ReadablePartial) localTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = localDate12.getFieldTypes();
        java.lang.String str14 = localDate12.toString();
        org.joda.time.Chronology chronology15 = localDate12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(0L, dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(0L, dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate27 = localDate23.plusMonths((-1));
        int int28 = localDate18.compareTo((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone33 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone34 = fixedDateTimeZone33.toTimeZone();
        org.joda.time.DateMidnight dateMidnight35 = localDate23.toDateMidnight((org.joda.time.DateTimeZone) fixedDateTimeZone33);
        int int37 = fixedDateTimeZone33.getOffset((long) '#');
        org.joda.time.DateMidnight dateMidnight38 = localDate12.toDateMidnight((org.joda.time.DateTimeZone) fixedDateTimeZone33);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime41 = localDateTime40.toDateTime();
        org.joda.time.Chronology chronology42 = localDateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.secondOfMinute();
        org.joda.time.DurationField durationField44 = chronology42.years();
        org.joda.time.DateTimeField dateTimeField45 = chronology42.year();
        java.util.Locale locale48 = java.util.Locale.KOREA;
        java.lang.String str49 = locale48.getDisplayName();
        long long50 = dateTimeField45.set(1645513710548L, "22", locale48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = dateMidnight38.toString("centuries", locale48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-02" + "'", str14, "1970-01-02");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 59 + "'", int37 == 59);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str49, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-61468390289452L) + "'", long50 == (-61468390289452L));
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        java.lang.Appendable appendable5 = null;
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.plusHours(4);
        int int10 = dateTime7.getEra();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime7.plus(readablePeriod11);
        org.joda.time.DateTime dateTime14 = dateTime7.plusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime16 = dateTime7.plusHours(143);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable5, (org.joda.time.ReadableInstant) dateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguage("51");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 51 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = timeZone5.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT+00:00" + "'", str7, "GMT+00:00");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.property(dateTimeFieldType2);
        int int6 = property5.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = property5.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withDate(664, 45, 25713348);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 45 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 86399999 + "'", int6 == 86399999);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter4.getZone();
        org.joda.time.Chronology chronology6 = dateTimeFormatter4.getChronolgy();
        org.joda.time.Instant instant8 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant10 = instant8.minus((long) 32769);
        org.joda.time.MutableDateTime mutableDateTime11 = instant8.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dateTimeFormatter4.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime11, "Thu Jan 01 00:00:00 UTC 1970", 541);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate14 = localDate4.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = chronology16.getDateTimeMillis(259, 30, 187, 575, 99, 382, 548);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 575 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(0L, dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(0L, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate9.plus(readablePeriod12);
        org.joda.time.LocalDate localDate14 = localDate6.withFields((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.LocalDate.Property property15 = localDate14.year();
        org.joda.time.LocalDate localDate16 = property15.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate18 = localDate16.withYear((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight19 = localDate16.toDateMidnight();
        boolean boolean20 = charSet1.equals((java.lang.Object) localDate16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = localDate16.withDayOfWeek(20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0L, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(0L, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate8.plus(readablePeriod11);
        org.joda.time.LocalDate localDate13 = localDate5.withFields((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate15 = localDate5.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime16 = localDate15.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 0, chronology17);
        org.joda.time.DurationField durationField19 = chronology17.weekyears();
        org.joda.time.DurationField durationField20 = chronology17.weeks();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(0L, dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = localDate23.toDateMidnight(dateTimeZone24);
        int[] intArray27 = chronology17.get((org.joda.time.ReadablePartial) localDate23, (long) (short) -1);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property30.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int int32 = localDate23.get(dateTimeFieldType31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(intArray27);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1970, 1, 2]");
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.era();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minus(readableDuration7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfCentury();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfYear();
        int[] intArray18 = new int[] { (short) 0, 292269054, 2, 460, 323, 930 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = dateTimeField4.add((org.joda.time.ReadablePartial) localDateTime8, 10, intArray18, 674);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 292269054, 2, 460, 323, 930]");
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.plusHours(4);
        int int11 = dateTime8.getEra();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getName((long) (byte) -1);
        org.joda.time.DateTime dateTime17 = dateTime8.toDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime18 = dateTime3.withZoneRetainFields(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+35:00" + "'", str16, "+35:00");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = localDate12.getFieldTypes();
        java.lang.String str14 = localDate12.toString();
        org.joda.time.Chronology chronology15 = localDate12.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localDate12.get(dateTimeFieldType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-02" + "'", str14, "1970-01-02");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        calendar3.setLenient(true);
        int int9 = calendar3.getLeastMaximum(1);
        calendar3.setMinimalDaysInFirstWeek(0);
        java.util.Date date12 = calendar3.getTime();
        calendar3.set(60, 14, 1912, 489, 52, 619);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str1, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=248,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=0,ERA=1,YEAR=60,MONTH=14,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1912,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=489,MINUTE=52,SECOND=619,MILLISECOND=917,ZONE_OFFSET=248,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 292269054 + "'", int9 == 292269054);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Feb 22 07:08:58 GMT+00:00 2022");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        java.lang.String str9 = dateTimeFieldType8.toString();
        org.joda.time.DateTime.Property property10 = dateTime7.property(dateTimeFieldType8);
        org.joda.time.Interval interval11 = property10.toInterval();
        boolean boolean12 = property10.isLeap();
        org.joda.time.DateTime dateTime13 = property10.withMaximumValue();
        java.util.Locale locale15 = java.util.Locale.PRC;
        boolean boolean16 = locale15.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = property10.setCopy("Mon Jul 24 02:05:00 GMT+00:00 1961", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Mon Jul 24 02:05:00 GMT+00:00 1961\" for clockhourOfHalfday is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "clockhourOfHalfday" + "'", str9, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        int int4 = dateTime1.getEra();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.util.Calendar calendar7 = dateTime1.toCalendar(locale5);
        java.util.TimeZone timeZone8 = calendar7.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = timeZone8.getOffset(35, 3, 0, 1969, 866, 286);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645513738756,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=58,MILLISECOND=756,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(0, 104, 12, 292278993, 352, 99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime3.minusMonths(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime9.withSecondOfMinute(228);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 228 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate14 = localDate4.withDayOfYear((int) '#');
        org.joda.time.LocalDate localDate16 = localDate14.minusYears((-1));
        org.joda.time.LocalDate.Property property17 = localDate14.dayOfYear();
        org.joda.time.LocalDate.Property property18 = localDate14.year();
        org.joda.time.LocalDate localDate19 = property18.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime22 = localTime20.withHourOfDay(0);
        java.lang.String str24 = localTime20.toString("25707776");
        // The following exception was thrown during execution in test generation
        try {
            int int25 = localDate19.compareTo((org.joda.time.ReadablePartial) localTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "25707776" + "'", str24, "25707776");
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable6, 1645513718816L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimePrinter5);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
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
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        int int4 = dateTime1.getEra();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getName((long) (byte) -1);
        org.joda.time.DateTime dateTime10 = dateTime1.toDateTime(dateTimeZone6);
        org.joda.time.DateTime.Property property11 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime12 = property11.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+35:00" + "'", str9, "+35:00");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate14 = localDate4.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        long long21 = dateTimeField18.set((long) 100, 22);
        int int23 = dateTimeField18.getMaximumValue((long) '4');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime27 = localDateTime26.toDateTime();
        org.joda.time.DateTime dateTime29 = dateTime27.plusHours(4);
        org.joda.time.DateTime dateTime30 = localDateTime25.toDateTime((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime25.plusMinutes(32770);
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.seconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeField18, chronology33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-61472908799900L) + "'", long21 == (-61472908799900L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 292278993 + "'", int23 == 292278993);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(durationField34);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        java.util.Locale locale6 = java.util.Locale.UK;
        java.lang.String str7 = locale6.getDisplayCountry();
        boolean boolean8 = locale6.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter4.withLocale(locale6);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter9.getZone();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withZoneUTC();
        java.io.Writer writer13 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer13, (org.joda.time.ReadableInstant) dateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str7, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimeZone10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(0L, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate8.plus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(0L, dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(0L, dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate22.plus(readablePeriod25);
        org.joda.time.LocalDate localDate27 = localDate19.withFields((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.LocalDate localDate29 = localDate19.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime30 = localDate29.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 0, chronology31);
        org.joda.time.DurationField durationField33 = chronology31.weekyears();
        org.joda.time.DurationField durationField34 = chronology31.weeks();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(0L, dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = localDate37.toDateMidnight(dateTimeZone38);
        int[] intArray41 = chronology31.get((org.joda.time.ReadablePartial) localDate37, (long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray43 = dateTimeField5.add((org.joda.time.ReadablePartial) localDate12, 339, intArray41, 339);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 339");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(intArray41);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1970, 1, 2]");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(11, 0, (int) (short) 10, (int) (byte) 0);
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes(52);
        int int7 = localTime6.size();
        int int8 = localTime6.getHourOfDay();
        org.joda.time.LocalTime.Property property9 = localTime6.minuteOfHour();
        org.joda.time.LocalTime localTime11 = property9.addWrapFieldToCopy(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = property9.setCopy(446);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 446 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("DateTimeField[halfdayOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"DateTimeField[halfdayOfDay]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(100L);
        int int2 = localTime1.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        boolean boolean4 = localTime1.isSupported(dateTimeFieldType3);
        java.util.Locale locale6 = java.util.Locale.UK;
        java.lang.String str7 = locale6.getDisplayCountry();
        boolean boolean8 = locale6.hasExtensions();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localTime1.toString("2022-02-23T18:08:47.830+35:00", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str7, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645513739563,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=248,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=59,MILLISECOND=811,ZONE_OFFSET=248,DST_OFFSET=0]");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (short) 100, (int) 'x', 619, 38, 16, 20, 761);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.util.Locale locale1 = new java.util.Locale("2");
        org.junit.Assert.assertEquals(locale1.toString(), "2");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Korean (South Korea)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property13 = localDate12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(0L, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate16.plus(readablePeriod19);
        int int21 = localDate12.compareTo((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate23 = localDate20.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime24 = localDate23.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = localDate23.isSupported(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter4.getZone();
        org.joda.time.Chronology chronology6 = dateTimeFormatter4.getChronolgy();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(0);
        org.joda.time.DateTime.Property property13 = dateTime10.weekyear();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime10.withPeriodAdded(readablePeriod14, (int) '4');
        java.lang.String str17 = dateTime10.toString();
        org.joda.time.Chronology chronology18 = dateTime10.getChronology();
        org.joda.time.Chronology chronology19 = chronology18.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter4.withChronology(chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeFormatter20.getZone();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2022-02-23T18:10:59.753+35:00" + "'", str17, "2022-02-23T18:10:59.753+35:00");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNull(dateTimeZone21);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(11, 0, (int) (short) 10, (int) (byte) 0);
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes(52);
        int int7 = localTime6.size();
        int int8 = localTime6.getHourOfDay();
        org.joda.time.LocalTime.Property property9 = localTime6.minuteOfHour();
        org.joda.time.LocalTime localTime11 = property9.addWrapFieldToCopy(53);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime14 = localTime11.withField(dateTimeFieldType12, 25717313);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType17.getField(chronology18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime16.property(dateTimeFieldType17);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        boolean boolean23 = localDateTime16.equals((java.lang.Object) property22);
        org.joda.time.LocalDateTime localDateTime25 = property22.addWrapFieldToCopy(292278993);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = localTime14.compareTo((org.joda.time.ReadablePartial) localDateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        long long6 = calendar3.getTimeInMillis();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar3.getLeastMaximum(25711821);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25711821");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str1, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513739818,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=,offset=248,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=0,MILLISECOND=66,ZONE_OFFSET=248,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645513739818L + "'", long6 == 1645513739818L);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.UK;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Calendar.Builder builder3 = builder0.setLocale(locale1);
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.util.Calendar.Builder builder5 = builder3.setLocale(locale4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone6);
        java.util.Calendar.Builder builder8 = builder3.setTimeZone(timeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str2, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.UK;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Calendar.Builder builder3 = builder0.setLocale(locale1);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay(761, 14, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder9 = builder7.setCalendarType("51");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: 51");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str2, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.toDateTimeISO();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime15 = dateTime13.plusHours(0);
        org.joda.time.DateTime.Property property16 = dateTime13.monthOfYear();
        org.joda.time.DateTime dateTime18 = dateTime13.plusYears((int) (byte) 1);
        boolean boolean19 = dateTime9.equals((java.lang.Object) dateTime13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime9.withMillisOfSecond(25717313);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25717313 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        int int3 = localDateTime2.getHourOfDay();
        int int4 = localDateTime2.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 65339964 + "'", int4 == 65339964);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withHourOfDay(0);
        java.lang.String str4 = localTime0.toString("25707776");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType5);
        org.joda.time.LocalTime localTime8 = localTime0.plusMillis(0);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime11 = property9.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = property9.setCopy("Chinese");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Chinese\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25707776" + "'", str4, "25707776");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        int int6 = dateTime3.getWeekOfWeekyear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond(12);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.years();
        boolean boolean14 = localTime10.isSupported(durationFieldType13);
        java.util.Date date16 = new java.util.Date((long) (byte) 0);
        int int17 = date16.getHours();
        date16.setYear(9);
        boolean boolean20 = localTime10.equals((java.lang.Object) date16);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) 910);
        java.lang.String str23 = localTime22.toString();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone29 = fixedDateTimeZone28.toTimeZone();
        int int31 = fixedDateTimeZone28.getOffset((long) 228);
        boolean boolean32 = fixedDateTimeZone28.isFixed();
        org.joda.time.DateTime dateTime33 = localTime22.toDateTimeToday((org.joda.time.DateTimeZone) fixedDateTimeZone28);
        boolean boolean34 = localTime10.isAfter((org.joda.time.ReadablePartial) localTime22);
        int int35 = localTime10.size();
        org.joda.time.LocalTime localTime37 = localTime10.withSecondOfMinute(38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(0L, dateTimeZone41);
        org.joda.time.LocalDate localDate44 = localDate42.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(0L, dateTimeZone46);
        org.joda.time.LocalDate localDate49 = localDate47.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDate localDate51 = localDate47.plus(readablePeriod50);
        org.joda.time.LocalDate localDate52 = localDate44.withFields((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.LocalDate localDate54 = localDate44.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime55 = localDate54.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology56 = dateTime55.getChronology();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) 0, chronology56);
        org.joda.time.DurationField durationField58 = chronology56.weekyears();
        org.joda.time.DurationField durationField59 = chronology56.weeks();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate(0L, dateTimeZone61);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateMidnight dateMidnight64 = localDate62.toDateMidnight(dateTimeZone63);
        int[] intArray66 = chronology56.get((org.joda.time.ReadablePartial) localDate62, (long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray68 = dateTimeField9.set((org.joda.time.ReadablePartial) localTime10, (int) (byte) 10, intArray66, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for clockhourOfDay must be in the range [1,24]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Fri Jan 01 00:00:00 GMT+00:00 1909");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "11:00:00.910" + "'", str23, "11:00:00.910");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 59 + "'", int31 == 59);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(dateMidnight64);
        org.junit.Assert.assertNotNull(intArray66);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1970, 1, 2]");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime.Property property11 = dateTime3.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.plusHours(4);
        int int16 = dateTime13.getEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        java.lang.String str21 = dateTimeZone18.getName((long) (byte) -1);
        org.joda.time.DateTime dateTime22 = dateTime13.toDateTime(dateTimeZone18);
        int int23 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime25 = dateTime3.minusYears((int) (byte) 100);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+35:00" + "'", str21, "+35:00");
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("Japan");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Japan\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.util.Date date1 = new java.util.Date((long) (byte) 1);
        date1.setYear(228);
        int int4 = date1.getSeconds();
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = date1.before(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 2128");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.Chronology chronology8 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType5.getField(chronology8);
        boolean boolean11 = localDateTime0.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType5.getField(chronology14);
        long long19 = dateTimeField16.addWrapField((long) 761, 2);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime22 = localDateTime21.toDateTime();
        org.joda.time.Chronology chronology23 = localDateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.secondOfMinute();
        org.joda.time.DurationField durationField25 = chronology23.years();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.year();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 9, chronology23);
        int int28 = localDateTime27.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withCenturyOfEra(374);
        int int33 = localDateTime30.getMonthOfYear();
        int int34 = localDateTime27.compareTo((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType36.getField(chronology37);
        org.joda.time.DurationField durationField39 = dateTimeField38.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(0L, dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateMidnight dateMidnight44 = localDate42.toDateMidnight(dateTimeZone43);
        int[] intArray51 = new int[] { (-1), (short) 1, 2, 54, (byte) 0 };
        int[] intArray53 = dateTimeField38.add((org.joda.time.ReadablePartial) localDate42, 0, intArray51, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray55 = dateTimeField16.add((org.joda.time.ReadablePartial) localDateTime27, 226, intArray51, 126000000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 226");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 183 + "'", int2 == 183);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1209600761L + "'", long19 == 1209600761L);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 70 + "'", int28 == 70);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 1, 2, 54, 0]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1, 1, 2, 54, 0]");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.Chronology chronology8 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType5.getField(chronology8);
        boolean boolean11 = localDateTime0.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType5.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.dayOfMonth();
        org.joda.time.ReadablePartial readablePartial18 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType19.getField(chronology20);
        org.joda.time.DurationField durationField22 = dateTimeField21.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(0L, dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = localDate25.toDateMidnight(dateTimeZone26);
        int[] intArray34 = new int[] { (-1), (short) 1, 2, 54, (byte) 0 };
        int[] intArray36 = dateTimeField21.add((org.joda.time.ReadablePartial) localDate25, 0, intArray34, 0);
        // The following exception was thrown during execution in test generation
        try {
            chronology14.validate(readablePartial18, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 218 + "'", int2 == 218);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 1, 2, 54, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 1, 2, 54, 0]");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.property(dateTimeFieldType2);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        boolean boolean8 = localDateTime1.equals((java.lang.Object) property7);
        org.joda.time.LocalDateTime localDateTime10 = property7.addWrapFieldToCopy(292278993);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(0L, dateTimeZone12);
        int int14 = localDate13.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDate13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate11 = localDate7.plusMonths((-1));
        int int12 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone17 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone18 = fixedDateTimeZone17.toTimeZone();
        org.joda.time.DateMidnight dateMidnight19 = localDate7.toDateMidnight((org.joda.time.DateTimeZone) fixedDateTimeZone17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = localDate7.withDayOfWeek(173);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 173 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateMidnight19);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.UK;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Calendar.Builder builder3 = builder0.setLocale(locale1);
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.util.Calendar.Builder builder5 = builder3.setLocale(locale4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone6);
        java.util.Calendar.Builder builder8 = builder3.setTimeZone(timeZone6);
        java.lang.String str9 = timeZone6.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30a4\u30ae\u30ea\u30b9" + "'", str2, "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT+00:00" + "'", str9, "GMT+00:00");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        int int3 = property2.get();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65341045 + "'", int3 == 65341045);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.util.Date date1 = new java.util.Date((long) (byte) 1);
        date1.setYear(228);
        int int4 = date1.getDay();
        int int5 = date1.getMinutes();
        date1.setYear(348);
        date1.setTime(35L);
        int int10 = date1.getTimezoneOffset();
        java.lang.String str11 = date1.toGMTString();
        int int12 = date1.getDate();
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str11, "1 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        int int7 = property6.getMaximumValue();
        org.joda.time.DateTime dateTime8 = property6.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime10 = dateTime8.plus((long) 3);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.plusHours(4);
        int int15 = dateTime12.getEra();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getName((long) (byte) -1);
        org.joda.time.DateTime dateTime21 = dateTime12.toDateTime(dateTimeZone17);
        org.joda.time.DateTime.Property property22 = dateTime12.minuteOfHour();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime12.minus(readableDuration23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean26 = dateTime24.isSupported(dateTimeFieldType25);
        int int27 = dateTime10.get(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+35:00" + "'", str20, "+35:00");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable5, 1645513714231L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property13 = localDate12.year();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        long long17 = dateTimeField14.add((long) '#', (long) 8);
        long long20 = dateTimeField14.getDifferenceAsLong((long) 500, (long) 1870);
        int int22 = dateTimeField14.get(1169187558080000L);
        int int23 = dateTimeField14.getMinimumValue();
        java.util.Locale locale26 = java.util.Locale.UK;
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str28 = locale27.getVariant();
        java.lang.String str29 = locale26.getDisplayLanguage(locale27);
        java.util.Locale locale33 = new java.util.Locale("java.util.GregorianCalendar[time=1645513710548,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=30,MILLISECOND=548,ZONE_OFFSET=0,DST_OFFSET=0]", "2", "2022-02-22T07:08:27.149");
        java.lang.String str34 = locale27.getDisplayLanguage(locale33);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = dateTimeField14.set((long) 1912, "\u82f1\u8a9e", locale33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 252460800035L + "'", long17 == 252460800035L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 39020 + "'", int22 == 39020);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-292275054) + "'", int23 == (-292275054));
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u82f1\u6587" + "'", str29, "\u82f1\u6587");
        org.junit.Assert.assertEquals(locale33.toString(), "java.util.gregoriancalendar[time=1645513710548,arefieldsset=true,areallfieldsset=true,lenient=false,zone=sun.util.calendar.zoneinfo[id=\"etc/utc\",offset=0,dstsavings=0,usedaylight=false,transitions=0,lastrule=null],firstdayofweek=2,minimaldaysinfirstweek=4,era=1,year=2022,month=1,week_of_year=8,week_of_month=4,day_of_month=22,day_of_year=53,day_of_week=3,day_of_week_in_month=4,am_pm=0,hour=7,hour_of_day=7,minute=8,second=30,millisecond=548,zone_offset=0,dst_offset=0]_2_2022-02-22T07:08:27.149");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Chinese" + "'", str34, "Chinese");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        boolean boolean4 = dateTimeFieldType0.isSupported(chronology3);
        long long8 = chronology3.add((long) 184, 0L, 0);
        org.joda.time.DateTimeField dateTimeField9 = chronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.dayOfYear();
        org.joda.time.DurationField durationField11 = chronology3.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology3.getDateTimeMillis(664, 65321929, 30, 913);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 65321929 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 184L + "'", long8 == 184L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 761);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType3 = localTime1.getFieldType(248);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 248");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(0);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.Chronology chronology15 = localDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.secondOfMinute();
        int int17 = dateTime12.get(dateTimeField16);
        int int19 = dateTimeField16.get((long) 910);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("Japan", "DateTimeField[millisOfDay]", 2026, 500);
        java.util.TimeZone timeZone25 = fixedDateTimeZone24.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) 910, (org.joda.time.DateTimeZone) fixedDateTimeZone24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u65e5\u672c\u6a19\u6e96\u6642");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(11, 0, (int) (short) 10, (int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.plus(readablePeriod7);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime12 = localTime10.minusSeconds(3);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfSecond(12);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.years();
        boolean boolean17 = localTime13.isSupported(durationFieldType16);
        boolean boolean18 = localTime12.isSupported(durationFieldType16);
        java.lang.Class<?> wildcardClass19 = durationFieldType16.getClass();
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2022-02-22T07:08:36.698");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-22t07:08:36.698");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) '4');
        java.util.Locale locale10 = new java.util.Locale("2022-02-22T07:08:36.698");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property5.setCopy("ISOChronology[UTC]", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ISOChronology[UTC]\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 807 + "'", int2 == 807);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals(locale10.toString(), "2022-02-22t07:08:36.698");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = fixedDateTimeZone4.getName(1009868913348L, locale6);
        java.util.TimeZone timeZone8 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone.setDefault(timeZone8);
        boolean boolean10 = timeZone8.useDaylightTime();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.059" + "'", str7, "+00:00:00.059");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate14 = localDate4.withDayOfYear((int) '#');
        int int15 = localDate14.getWeekyear();
        org.joda.time.LocalDate.Property property16 = localDate14.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = property16.setCopy(535);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 535 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1870 + "'", int15 == 1870);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getWeeksInWeekYear();
        calendar1.setFirstDayOfWeek(65441750);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.clear(99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 99");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645513741861,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=65441750,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=1,MILLISECOND=920,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.Chronology chronology7 = localDateTime5.getChronology();
        java.lang.String str8 = chronology7.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(39020, 1971, 248, 38, 65458977, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[UTC]" + "'", str8, "ISOChronology[UTC]");
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        int int6 = dateTime3.getWeekOfWeekyear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        java.util.GregorianCalendar gregorianCalendar8 = dateTime3.toGregorianCalendar();
        java.util.Locale locale9 = java.util.Locale.UK;
        java.lang.String str10 = locale9.getDisplayCountry();
        boolean boolean11 = locale9.hasExtensions();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(locale9);
        calendar12.setLenient(false);
        long long15 = calendar12.getTimeInMillis();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar12);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone21 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone22 = fixedDateTimeZone21.toTimeZone();
        int int23 = timeZone22.getRawOffset();
        calendar12.setTimeZone(timeZone22);
        calendar12.set(8, 15, (int) '4', 25711821, 34, 228);
        int int32 = gregorianCalendar8.compareTo(calendar12);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "United Kingdom" + "'", str10, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=8,MONTH=15,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=52,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=25711821,MINUTE=34,SECOND=228,MILLISECOND=233,ZONE_OFFSET=59,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1645513742174L + "'", long15 == 1645513742174L);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 59 + "'", int23 == 59);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond(12);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.minus(readablePeriod3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(0L, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate12.plus(readablePeriod15);
        org.joda.time.LocalDate localDate17 = localDate9.withFields((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate.Property property18 = localDate17.weekyear();
        java.util.Locale locale19 = java.util.Locale.GERMANY;
        int int20 = property18.getMaximumShortTextLength(locale19);
        org.joda.time.LocalDate localDate21 = property18.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = localTime4.isEqual((org.joda.time.ReadablePartial) localDate21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.set(2, 0, (int) (short) 0, 2022, 2);
        java.time.Instant instant10 = calendar3.toInstant();
        java.util.Locale locale13 = java.util.Locale.JAPAN;
        java.lang.String str14 = locale13.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = calendar3.getDisplayName((int) (byte) 100, (int) 'a', locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=-62097040677606,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2,MONTH=2,WEEK_OF_YEAR=12,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=84,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=2,SECOND=2,MILLISECOND=453,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(0);
        int int13 = dateTime12.getHourOfDay();
        org.joda.time.DateTime dateTime15 = dateTime12.minusMillis(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime15.withYearOfCentury(497);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 497 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int16 = localDate14.indexOf(dateTimeFieldType15);
        boolean boolean17 = localDate12.isSupported(dateTimeFieldType15);
        org.joda.time.LocalDate localDate19 = localDate12.withDayOfWeek(4);
        org.joda.time.LocalDate localDate21 = localDate12.plusWeeks(42);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property23 = localDate21.property(dateTimeFieldType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getHourOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.yearOfEra();
        java.util.Date date4 = localDateTime0.toDate();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Tue Feb 22 07:09:03 GMT+00:00 2022");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate11 = localDate7.plusMonths((-1));
        int int12 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int16 = localDate14.indexOf(dateTimeFieldType15);
        org.joda.time.LocalDate localDate17 = localDate7.withFields((org.joda.time.ReadablePartial) localDate14);
        java.util.Locale locale21 = new java.util.Locale("2022-02-22T07:10:26.657Z", "0");
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale22.getDisplayName();
        java.lang.String str24 = locale21.getDisplayVariant(locale22);
        java.util.Set<java.lang.String> strSet25 = locale21.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = localDate7.toString("2022-02-23T18:10:54.864+35:00", locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertEquals(locale21.toString(), "2022-02-22t07:10:26.657z_0");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Korean (South Korea)" + "'", str23, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate2.plus(readablePeriod5);
        org.joda.time.LocalDate.Property property7 = localDate2.monthOfYear();
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property9 = localDate2.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate2.withDayOfWeek(511);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 511 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(0);
        org.joda.time.DateTime.Property property8 = dateTime5.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime5.withPeriodAdded(readablePeriod9, (int) '4');
        int int12 = property1.getDifference((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime5.plus(readableDuration13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusHours(4);
        org.joda.time.DateTime dateTime18 = dateTime14.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property19 = dateTime18.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime18.withDayOfWeek(908);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 908 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean3 = localTime1.isSupported(dateTimeFieldType2);
        org.joda.time.LocalTime.Property property4 = localTime1.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = property4.setCopy(35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getHours();
        date1.setYear(9);
        date1.setMinutes((int) ' ');
        org.junit.Assert.assertEquals(date1.toString(), "Fri Jan 01 00:32:00 GMT+00:00 1909");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.Instant instant7 = dateTime3.toInstant();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(instant7);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(37, 0, 292278993, 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withDefaultYear(3);
        java.lang.Integer int6 = dateTimeFormatter5.getPivotYear();
        org.joda.time.Chronology chronology7 = dateTimeFormatter5.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.parse("2022-02-22T07:10:26.657Z", dateTimeFormatter9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        int int4 = property2.getMinimumValueOverall();
        int int5 = property2.getLeapAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = property2.setCopy(967);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 967 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(8, 0, 10);
        java.util.Calendar.Builder builder7 = builder4.set(16, 292269054);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder10 = builder4.setWeekDefinition(187, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh_CN" + "'", str1, "zh_CN");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        calendar3.setLenient(true);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromCalendarFields(calendar3);
        calendar3.setMinimalDaysInFirstWeek(0);
        int int12 = calendar3.getActualMaximum(5);
        calendar3.setTimeInMillis((long) 8);
        // The following exception was thrown during execution in test generation
        try {
            calendar3.clear(228);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 228");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=8,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=0,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=67,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("11:00:00.910");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"11:00:00.910\" is malformed at \":00:00.910\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(3, (int) (byte) 0, (int) '4', 22, 31, 567);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 567 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        calendar3.setLenient(true);
        calendar3.clear();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.Chronology chronology11 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.secondOfMinute();
        boolean boolean14 = dateTimeField12.isLeap((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withCenturyOfEra(374);
        int int19 = dateTimeField12.getMaximumValue((org.joda.time.ReadablePartial) localDateTime18);
        java.lang.String str20 = dateTimeField12.getName();
        boolean boolean22 = dateTimeField12.isLeap((long) 761);
        boolean boolean23 = calendar3.before((java.lang.Object) 761);
        java.util.TimeZone timeZone24 = calendar3.getTimeZone();
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        boolean boolean26 = timeZone25.observesDaylightTime();
        timeZone25.setID("");
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone25);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone25);
        boolean boolean31 = timeZone24.hasSameRules(timeZone25);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = timeZone25.getOffset(38, 1870, 4, 136, (-1), 866);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 38");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 59 + "'", int19 == 59);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "secondOfMinute" + "'", str20, "secondOfMinute");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(calendar29);
// flaky:         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1645513743025,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=3,MILLISECOND=84,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar30);
// flaky:         org.junit.Assert.assertEquals(calendar30.toString(), "java.util.GregorianCalendar[time=1645513743025,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=3,MILLISECOND=84,ZONE_OFFSET=59,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime8.plus(readablePeriod12);
        org.joda.time.DateTime dateTime14 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property15 = dateTime8.minuteOfDay();
        org.joda.time.DateTime dateTime17 = property15.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.minus(readableDuration18);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime17.getZone();
        long long23 = dateTimeZone20.adjustOffset((long) 70, false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(248, 956, 659, 41, 39599999, dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 41 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 70L + "'", long23 == 70L);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withHourOfDay(0);
        org.joda.time.LocalTime.Property property3 = localTime2.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localTime2.get(dateTimeFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology3 = null;
        boolean boolean4 = durationFieldType2.isSupported(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withFieldAdded(durationFieldType2, 59);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfDay((int) (byte) 100);
        org.joda.time.Instant instant10 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant11 = instant10.toInstant();
        org.joda.time.Instant instant12 = instant10.toInstant();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant12.plus(readableDuration13);
        org.joda.time.DateTime dateTime15 = instant12.toDateTime();
        org.joda.time.DateTime dateTime16 = localDateTime6.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 910);
        java.lang.String str2 = localTime1.toString();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone7 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone8 = fixedDateTimeZone7.toTimeZone();
        int int10 = fixedDateTimeZone7.getOffset((long) 228);
        boolean boolean11 = fixedDateTimeZone7.isFixed();
        org.joda.time.DateTime dateTime12 = localTime1.toDateTimeToday((org.joda.time.DateTimeZone) fixedDateTimeZone7);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone17 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone18 = fixedDateTimeZone17.toTimeZone();
        int int20 = fixedDateTimeZone17.getOffset((long) 228);
        int int22 = fixedDateTimeZone17.getStandardOffset((long) 548);
        java.lang.String str24 = fixedDateTimeZone17.getNameKey(0L);
        org.joda.time.DateTime dateTime25 = dateTime12.withZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone17);
        java.util.TimeZone timeZone26 = fixedDateTimeZone17.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int33 = timeZone26.getOffset(187, 352, 226, 184, 188, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 187");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00:00:00.969" + "'", str2, "00:00:00.969");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 59 + "'", int20 == 59);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str24, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 228);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.secondOfMinute();
        org.joda.time.DurationField durationField5 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.year();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 9, chronology3);
        int int8 = localDateTime7.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withCenturyOfEra(374);
        int int13 = localDateTime10.getMonthOfYear();
        int int14 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime7.withMinuteOfHour(187);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 187 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 70 + "'", int8 == 70);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str6, "1970-01-01T00:00:00.000Z");
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate2.plus(readablePeriod5);
        org.joda.time.LocalDate.Property property7 = localDate2.monthOfYear();
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property9 = localDate2.yearOfCentury();
        org.joda.time.DurationField durationField10 = property9.getLeapDurationField();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNull(durationField10);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        timeZone5.setRawOffset(301);
        java.lang.Object obj8 = timeZone5.clone();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=301,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=301,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=301,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(0);
        org.joda.time.DateTime.Property property8 = dateTime5.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime5.withPeriodAdded(readablePeriod9, (int) '4');
        int int12 = property1.getDifference((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime5.plus(readableDuration13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusWeeks(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime14.withHourOfDay(529);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 529 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond(12);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        boolean boolean4 = localTime0.isSupported(durationFieldType3);
        org.joda.time.LocalTime.Property property5 = localTime0.millisOfDay();
        org.joda.time.LocalTime localTime6 = property5.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime8 = property5.addNoWrapToCopy(956);
        org.joda.time.LocalTime localTime9 = property5.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localTime9.getValue(301);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 301");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        long long6 = calendar3.getTimeInMillis();
        boolean boolean7 = calendar3.isLenient();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513743819,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=3,MILLISECOND=878,ZONE_OFFSET=59,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645513743819L + "'", long6 == 1645513743819L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("\u661f\u671f\u4e09");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"???\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(11, 0, (int) (short) 10, (int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.plus(readablePeriod7);
        int int9 = localTime8.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property11 = localTime8.property(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        org.joda.time.Chronology chronology6 = dateTimeFormatter4.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter4.getPrinter();
        java.lang.Integer int8 = dateTimeFormatter4.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter4.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear(659);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuffer12, (long) 17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNull(dateTimePrinter7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.plus(readablePeriod13);
        org.joda.time.DateTime.Property property15 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime17 = dateTime9.plusDays(22);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTime(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(348, 70, 38, 13, 385, 65339964, dateTimeZone18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 385 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0L, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(0L, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate8.plus(readablePeriod11);
        org.joda.time.LocalDate localDate13 = localDate5.withFields((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate15 = localDate5.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime16 = localDate15.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology17 = localDate15.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((java.lang.Object) "1970-01-02", chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-02\" is malformed at \"70-01-02\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 910);
        java.lang.String str2 = localTime1.toString();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone7 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone8 = fixedDateTimeZone7.toTimeZone();
        int int10 = fixedDateTimeZone7.getOffset((long) 228);
        boolean boolean11 = fixedDateTimeZone7.isFixed();
        org.joda.time.DateTime dateTime12 = localTime1.toDateTimeToday((org.joda.time.DateTimeZone) fixedDateTimeZone7);
        org.joda.time.LocalTime localTime14 = localTime1.plusHours(18);
        org.joda.time.LocalTime localTime16 = localTime14.plusSeconds(65339964);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localTime16.getValue(188);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 188");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00:00:00.969" + "'", str2, "00:00:00.969");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(11, 0, (int) (short) 10, (int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.plus(readablePeriod7);
        int int9 = localTime8.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime8.withMinuteOfHour(674);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 674 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        org.joda.time.Chronology chronology6 = dateTimeFormatter4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTimeFormatter4.print((-125999941L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(chronology6);
    }
}
