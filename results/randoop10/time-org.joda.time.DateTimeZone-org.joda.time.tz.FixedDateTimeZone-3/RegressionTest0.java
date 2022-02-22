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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate4.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
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
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (byte) 100, 0, (int) '4', 2, 10, (int) (byte) 100, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) chronology2, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(1, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
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
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(0, (int) ' ', 404, 2022, 32770, (int) (short) -1, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        java.util.Locale locale2 = java.util.Locale.ROOT;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = localDateTime0.toString("", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
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
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("83", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'United Kingdom' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.Chronology chronology8 = localDateTime6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((int) (byte) 0, 4, (int) 'a', 32770, 32770, 2, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
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
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = property2.compareTo((org.joda.time.ReadablePartial) localTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate2.withFieldAdded(durationFieldType3, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate6 = localDate2.plusMonths((-1));
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate6.withPeriodAdded(readablePeriod7, (int) (short) 1);
        int int10 = localDate9.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(dateTimeZone11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int14 = localDate12.indexOf(dateTimeFieldType13);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localDate9.get(dateTimeFieldType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 69 + "'", int10 == 69);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property14 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate15 = property14.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        boolean boolean23 = dateTimeZone16.isLocalDateTimeGap(localDateTime21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) property14, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 717 + "'", int19 == 717);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calendar8.getActualMaximum((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 782 + "'", int2 == 782);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454821783,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=1,MILLISECOND=783,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime0.withFieldAdded(durationFieldType1, 293);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10, 437);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 437 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property14 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate15 = property14.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfMonth();
        int int18 = localDateTime16.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int22 = localDateTime16.get(dateTimeFieldType21);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localDate15.get(dateTimeFieldType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 943 + "'", int18 == 943);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        // The following exception was thrown during execution in test generation
        try {
            calendar8.add(69, 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454822054,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=2,MILLISECOND=54,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = property6.setCopy("UTC");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"UTC\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate2.plus(readablePeriod5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDate2.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
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
        int int15 = localDate4.compareTo((org.joda.time.ReadablePartial) localDate14);
        java.lang.Class<?> wildcardClass16 = localDate14.getClass();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
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
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        java.lang.String str9 = dateTimeField7.getAsShortText((long) 618);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.MIDNIGHT;
        java.lang.String str11 = localTime10.toString();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeField7.getAsShortText((org.joda.time.ReadablePartial) localTime10, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Jan" + "'", str9, "Jan");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00:00:00.000" + "'", str11, "00:00:00.000");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.lang.Character[] charArray3 = new java.lang.Character[] { 'a', '#', '#' };
        java.util.LinkedHashSet<java.lang.Character> charSet4 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet4, charArray3);
        java.util.Iterator<java.lang.Character> charItor6 = charSet4.iterator();
        java.lang.Character[] charArray10 = new java.lang.Character[] { 'a', '#', '#' };
        java.util.LinkedHashSet<java.lang.Character> charSet11 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet11, charArray10);
        java.util.Iterator<java.lang.Character> charItor13 = charSet11.iterator();
        java.lang.Character[] charArray17 = new java.lang.Character[] { 'a', '#', '#' };
        java.util.LinkedHashSet<java.lang.Character> charSet18 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet18, charArray17);
        java.util.Iterator<java.lang.Character> charItor20 = charSet18.iterator();
        java.util.AbstractSet[] abstractSetArray22 = new java.util.AbstractSet[2];
        @SuppressWarnings("unchecked")
        java.util.AbstractSet<java.lang.Character>[] charSetArray23 = (java.util.AbstractSet<java.lang.Character>[]) abstractSetArray22;
        charSetArray23[0] = charSet11;
        charSetArray23[1] = charSet18;
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractSet<java.lang.Character>[] charSetArray28 = charSet4.toArray(charSetArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.Character");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charItor6);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charItor13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charItor20);
        org.junit.Assert.assertNotNull(abstractSetArray22);
        org.junit.Assert.assertNotNull(charSetArray23);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        int int6 = localDateTime4.getDayOfYear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 985 + "'", int2 == 985);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 83 + "'", int6 == 83);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("0", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime1.withDate(165, 47, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        int int2 = dateTime1.getYearOfEra();
        boolean boolean4 = dateTime1.isAfter((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime1.withDate((int) (byte) 0, 293, 988);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 293 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2022 + "'", int2 == 2022);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(0L, dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(0L, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate11.plus(readablePeriod14);
        org.joda.time.LocalDate localDate16 = localDate8.withFields((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTime dateTime17 = localDate11.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDate11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property14 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate15 = property14.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) property14, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("Jan", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMillis((long) 386);
        org.joda.time.YearMonthDay yearMonthDay16 = dateTime13.toYearMonthDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime13.withMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(yearMonthDay16);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = localTime0.withHourOfDay(694);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 694 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.util.Date date1 = new java.util.Date((long) (byte) 1);
        date1.setTime((long) 404);
        int int4 = date1.getHours();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(0L, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate12.plus(readablePeriod15);
        org.joda.time.LocalDate localDate17 = localDate9.withFields((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate12.minus(readablePeriod18);
        org.joda.time.DateTime dateTime20 = localDate19.toDateTimeAtStartOfDay();
        boolean boolean21 = date1.equals((java.lang.Object) dateTime20);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(618, 1970, 988);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = chronology2.get(readablePeriod6, (long) 1970, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localDateTime4.toString("hi!", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 310 + "'", int2 == 310);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime13.plusYears(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292280963 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) (byte) -1);
        org.joda.time.DateTime dateTime3 = localTime2.toDateTimeToday();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology5 = null;
        boolean boolean6 = durationFieldType4.isSupported(chronology5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime2.withFieldAdded(durationFieldType4, 345);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'years' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        long long9 = calendar8.getTimeInMillis();
        calendar8.set(0, 386, (int) (short) 10);
        calendar8.set((int) (byte) 0, 0, 100, 345, 1970, 4);
        calendar8.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            calendar8.clear(22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 611 + "'", int2 == 611);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=0,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=100,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=345,MINUTE=1970,SECOND=4,MILLISECOND=611,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645454824611L + "'", long9 == 1645454824611L);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DurationField durationField3 = dateTimeField2.getDurationField();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        int[] intArray11 = new int[] { (byte) -1, (short) 100, (byte) -1, (byte) 100, (short) 0 };
        int[] intArray13 = dateTimeField2.add((org.joda.time.ReadablePartial) localDateTime4, 0, intArray11, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType14.getField(chronology15);
        org.joda.time.DurationField durationField17 = dateTimeField16.getDurationField();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        int[] intArray25 = new int[] { (byte) -1, (short) 100, (byte) -1, (byte) 100, (short) 0 };
        int[] intArray27 = dateTimeField16.add((org.joda.time.ReadablePartial) localDateTime18, 0, intArray25, 0);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        int[] intArray31 = localDateTime29.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = dateTimeField2.addWrapPartial((org.joda.time.ReadablePartial) localDateTime18, (int) (short) 100, intArray31, 858);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 100, -1, 100, 0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 100, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 100, -1, 100, 0]");
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(intArray31);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[2022, 2, 21, 53224655]");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(47, 11, 985, 490, 73);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 490 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2020-03-23T14:47:02.858");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2020-03-23T14:47:02.858\" is malformed at \"T14:47:02.858\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury(32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        org.joda.time.DurationField durationField9 = dateTimeField8.getDurationField();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        int[] intArray17 = new int[] { (byte) -1, (short) 100, (byte) -1, (byte) 100, (short) 0 };
        int[] intArray19 = dateTimeField8.add((org.joda.time.ReadablePartial) localDateTime10, 0, intArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = dateTimeField2.add((org.joda.time.ReadablePartial) localDateTime4, (int) (byte) 1, intArray19, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 121");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 122, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 122, -1, 100, 0]");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property9 = dateTime6.dayOfMonth();
        int int10 = dateTime6.getMonthOfYear();
        org.joda.time.Chronology chronology11 = dateTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((int) 'u', 47, 564, 100, 100, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = property6.setCopy("2020-03-23T14:47:02.858", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-03-23T14:47:02.858\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(293, 293);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 293");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfMonth();
        int int13 = localDateTime11.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        int int17 = localDateTime15.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withField(dateTimeFieldType18, 11);
        boolean boolean21 = calendar8.equals((java.lang.Object) 11);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 281 + "'", int2 == 281);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454825281,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=5,MILLISECOND=281,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 282 + "'", int13 == 282);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(679, 547);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 547");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = calendar8.isSet(644);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 644");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 373 + "'", int2 == 373);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454825373,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=5,MILLISECOND=373,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime5 = localDateTime4.toDateTime();
        org.joda.time.Chronology chronology6 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(32769, (int) (short) 100, 820, 0, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property2.setCopy(73);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = property2.setCopy("Jan 1, 1970 12:00:00 AM");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Jan 1, 1970 12:00:00 AM\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(128, 386, (int) 'x', 32770, 404);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.plus(readableDuration7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant6.withDurationAdded(readableDuration9, 22);
        org.joda.time.Chronology chronology12 = instant6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(118, 10, 2022, 490, 499, (int) ' ', chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 490 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
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
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        boolean boolean5 = timeZone3.useDaylightTime();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime localTime4 = localTime0.minusHours((int) '4');
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime4.withFieldAdded(durationFieldType5, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'days' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = localDate0.withDayOfMonth((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(22, 12, 69, 246, 773);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 246 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay((int) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMonths(0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) 0, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = locale8.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = property6.setCopy("years", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"years\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        java.lang.String str1 = localTime0.toString();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.days();
        java.lang.String str3 = durationFieldType2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime0.withFieldAdded(durationFieldType2, 843);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'days' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00:00:00.000" + "'", str1, "00:00:00.000");
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "days" + "'", str3, "days");
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("minuteOfHour");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'minuteOfHour' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = chronology6.getDateTimeMillis(858, 224, 246, 1969, (int) 'x', 381, 843);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.parse("\u82f1\u6587", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(0L, dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(0L, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate11.plus(readablePeriod14);
        org.joda.time.LocalDate localDate16 = localDate8.withFields((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate11.minus(readablePeriod17);
        org.joda.time.DateTime dateTime19 = localDate18.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer3, (org.joda.time.ReadableInstant) dateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.util.Date date1 = new java.util.Date((long) (byte) 1);
        int int2 = date1.getSeconds();
        java.lang.String str3 = date1.toGMTString();
        java.lang.String str4 = date1.toLocaleString();
        java.util.Date date6 = new java.util.Date((long) (byte) 1);
        int int7 = date1.compareTo(date6);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str3, "1 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Jan 1, 1970 12:00:00 AM" + "'", str4, "Jan 1, 1970 12:00:00 AM");
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        long long9 = calendar8.getTimeInMillis();
        calendar8.set(0, 386, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calendar8.getGreatestMinimum(468);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 468");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 551 + "'", int2 == 551);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=0,MONTH=386,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=10,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=6,MILLISECOND=551,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645454826551L + "'", long9 == 1645454826551L);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        int int4 = timeZone3.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime4 = localDateTime3.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property7 = dateTime4.dayOfMonth();
        int int8 = dateTime4.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int10 = dateTime4.get(dateTimeFieldType9);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.Chronology chronology13 = localDateTime11.getChronology();
        boolean boolean14 = dateTimeFieldType9.isSupported(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(69, 69, 100, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale6.getUnicodeLocaleType("days");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: days");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 644 + "'", int2 == 644);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
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
        org.joda.time.LocalDate localDate14 = property13.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate16 = property13.addWrapFieldToCopy(53225018);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = localDate16.withMonthOfYear(888);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 888 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(769, 483, 979, 1970, 629, 0, 31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = calendar8.getLeastMaximum(468);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 468");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 804 + "'", int2 == 804);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454826804,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=6,MILLISECOND=804,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        int int6 = localDateTime4.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withField(dateTimeFieldType7, 11);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        org.joda.time.Interval interval11 = property10.toInterval();
        java.util.Locale locale13 = java.util.Locale.ROOT;
        java.util.Locale locale14 = java.util.Locale.UK;
        java.lang.String str15 = locale14.getDisplayCountry();
        java.lang.String str16 = locale13.getDisplayScript(locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = property10.setCopy("Etc/UTC", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Etc/UTC\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 846 + "'", int2 == 846);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "United Kingdom" + "'", str15, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        java.lang.String str1 = localTime0.toString();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime0.plus(readablePeriod2);
        int int4 = localTime3.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime3.withSecondOfMinute(769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 769 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00:00:00.000" + "'", str1, "00:00:00.000");
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
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
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.Chronology chronology17 = localDateTime15.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekOfWeekyear();
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet22 = locale21.getExtensionKeys();
        java.lang.String str23 = dateTimeField19.getAsShortText((int) (byte) 100, locale21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate24 = property13.setCopy("UTC", locale21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"UTC\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "100" + "'", str23, "100");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        java.lang.String str7 = localTime6.toString();
        org.joda.time.Chronology chronology8 = localTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(73, 20, 165, 490, 73, 32772, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 490 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "14:47:07.382" + "'", str7, "14:47:07.382");
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        calendar8.set(988, (int) (short) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = calendar8.getLeastMaximum((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 422 + "'", int2 == 422);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=988,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=100,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=7,MILLISECOND=422,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        calendar8.set(224, 100, 73, 404, 403);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = calendar8.getTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 468 + "'", int2 == 468);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=224,MONTH=100,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=73,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=404,MINUTE=403,SECOND=7,MILLISECOND=468,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.lang.String str15 = locale14.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = calendar8.getDisplayName(293, (int) 'a', locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 497 + "'", int2 == 497);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454827497,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=7,MILLISECOND=497,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.lang.String str5 = dateMidnight4.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = dateMidnight4.toDateTime(dateTimeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate8.withCenturyOfEra(53225018);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53225018 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str5, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        calendar8.set(224, 100, 73, 404, 403);
        int int17 = calendar8.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            calendar8.set(69, 483);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 69");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 631 + "'", int2 == 631);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=224,MONTH=100,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=73,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=404,MINUTE=403,SECOND=7,MILLISECOND=631,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        int int12 = dateTime8.getMonthOfYear();
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((int) 'x', 52, 5, 773, 533, 894, 449, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 773 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        int int5 = timeZone3.getOffset(4L);
        boolean boolean6 = timeZone3.observesDaylightTime();
        java.lang.String str7 = timeZone3.getID();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = timeZone3.getDisplayName(false, 83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 83");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Etc/UTC" + "'", str7, "Etc/UTC");
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isParser();
        java.util.Locale locale5 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.parse("yearOfCentury", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = property6.withMaximumValue();
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime15 = dateTime13.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.withZone(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMinutes(165);
        int int20 = dateTime19.getDayOfMonth();
        boolean boolean21 = dateTime19.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar22 = dateTime19.toGregorianCalendar();
        boolean boolean23 = date9.equals((java.lang.Object) dateTime19);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Feb 22 23:59:59 UTC 2022");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 21 + "'", int20 == 21);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(gregorianCalendar22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property14 = localDate7.year();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localDate7.getValue(386);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 386");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime localTime4 = localTime0.minusHours((int) '4');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime4.minus(readablePeriod5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(0L, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate13 = localDate9.plusMonths((-1));
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (short) 1);
        int int17 = localDate16.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = localTime4.isEqual((org.joda.time.ReadablePartial) localDate16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1969 + "'", int17 == 1969);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter2.getPrinter();
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer5, (long) 888);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimePrinter4);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        java.lang.Appendable appendable6 = null;
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        int int9 = localDateTime7.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        int int13 = localDateTime11.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable6, (org.joda.time.ReadablePartial) localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        boolean boolean4 = dateTime3.isAfterNow();
        org.joda.time.DateTime.Property property5 = dateTime3.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime3.withYearOfCentury((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isParser();
        java.util.Locale locale5 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.parse("00:00:00.000", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Etc/UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = calendar8.getDisplayName(0, (int) 'x', locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 232 + "'", int2 == 232);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454828233,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=8,MILLISECOND=233,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setTimeInMillis((long) 69);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = calendar8.getActualMinimum(558);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 558");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 292 + "'", int2 == 292);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=69,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=69,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property5.addToCopy(483);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 411 + "'", int2 == 411);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime8.withMillisOfSecond((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'x', 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 70");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusYears(386);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMinuteOfHour(644);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 644 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate11 = localDate7.plusMonths((-1));
        int int12 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(0L, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(0L, dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate20.plus(readablePeriod23);
        org.joda.time.LocalDate localDate25 = localDate17.withFields((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate20.minus(readablePeriod26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology29 = null;
        boolean boolean30 = durationFieldType28.isSupported(chronology29);
        boolean boolean31 = localDate20.isSupported(durationFieldType28);
        org.joda.time.LocalDate localDate32 = localDate2.withFields((org.joda.time.ReadablePartial) localDate20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate34 = localDate32.withYearOfCentury(60902);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 60902 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(localDate32);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDate localDate3 = localDateTime0.toLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate3.withEra((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 738 + "'", int2 == 738);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int3 = localDate1.indexOf(dateTimeFieldType2);
        boolean boolean5 = localDate1.equals((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDate1.getValue(971);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 971");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        calendar8.set(988, (int) (short) 1, (int) (byte) 100);
        java.util.Locale locale18 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = calendar8.getDisplayName(202, 403, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 761 + "'", int2 == 761);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=988,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=100,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=8,MILLISECOND=761,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(769, 282, 0, 366, 629);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DurationField durationField3 = dateTimeField2.getDurationField();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        int[] intArray11 = new int[] { (byte) -1, (short) 100, (byte) -1, (byte) 100, (short) 0 };
        int[] intArray13 = dateTimeField2.add((org.joda.time.ReadablePartial) localDateTime4, 0, intArray11, 0);
        long long15 = dateTimeField2.roundCeiling((long) 118);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfMonth();
        int int18 = localDateTime16.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfYear();
        int int22 = localDateTime20.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        org.joda.time.DurationField durationField27 = dateTimeField26.getDurationField();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        int[] intArray35 = new int[] { (byte) -1, (short) 100, (byte) -1, (byte) 100, (short) 0 };
        int[] intArray37 = dateTimeField26.add((org.joda.time.ReadablePartial) localDateTime28, 0, intArray35, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = dateTimeField2.set((org.joda.time.ReadablePartial) localDateTime20, 769, intArray37, 769);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 769");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 100, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 118L + "'", long15 == 118L);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 100, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 100, -1, 100, 0]");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        calendar8.set(224, 100, 73, 404, 403);
        int int17 = calendar8.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = calendar8.get(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 135 + "'", int2 == 135);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=224,MONTH=100,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=73,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=404,MINUTE=403,SECOND=9,MILLISECOND=135,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusYears(386);
        int int9 = localDateTime2.getYearOfEra();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(618, 538, 449, 10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 538 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isParser();
        java.util.Locale locale5 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withLocale(locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        int int13 = dateTime9.getMonthOfYear();
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property20 = dateTime17.dayOfMonth();
        int int21 = dateTime17.getMonthOfYear();
        org.joda.time.Chronology chronology22 = dateTime17.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.weekyears();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology22.getZone();
        org.joda.time.Chronology chronology25 = chronology14.withZone(dateTimeZone24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter7.withChronology(chronology25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant27 = org.joda.time.Instant.parse("\u82f1\u6587", dateTimeFormatter7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate7.minus(readablePeriod13);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localDate14.getValue(281);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 281");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        int int12 = dateTime8.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int14 = dateTime8.get(dateTimeFieldType13);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.Chronology chronology17 = localDateTime15.getChronology();
        boolean boolean18 = dateTimeFieldType13.isSupported(chronology17);
        org.joda.time.DurationField durationField19 = chronology17.millis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(898, 0, 858, 293, (int) (byte) 10, 155, 69, chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 293 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        long long9 = calendar8.getTimeInMillis();
        calendar8.set(0, 386, (int) (short) 10);
        calendar8.set((int) (byte) 0, 0, 100, 345, 1970, 4);
        calendar8.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = calendar8.getActualMinimum(366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 366");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 528 + "'", int2 == 528);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=0,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=100,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=345,MINUTE=1970,SECOND=4,MILLISECOND=528,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645454829528L + "'", long9 == 1645454829528L);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfCeilingCopy();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Locale locale11 = locale9.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property6.setCopy("Jan", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Jan\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        boolean boolean4 = dateTime3.isAfterNow();
        int int5 = dateTime3.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime3.withDate(694, (-1), 773);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        java.lang.Appendable appendable7 = null;
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant8.plus(readableDuration9);
        org.joda.time.Instant instant12 = instant8.minus((long) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime13 = instant8.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable7, (org.joda.time.ReadableInstant) instant8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField7 = property5.getLeapDurationField();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        boolean boolean12 = dateTimeFormatter11.isParser();
        java.util.Locale locale13 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter11.withLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = property5.setCopy("1 janv. 1970 00:00:00", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1 janv. 1970 00:00:00\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 728 + "'", int2 == 728);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property9 = dateTime6.dayOfMonth();
        int int10 = dateTime6.getMonthOfYear();
        org.joda.time.Chronology chronology11 = dateTime6.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology11.getZone();
        java.lang.String str14 = dateTimeZone13.toString();
        java.lang.String str15 = dateTimeZone13.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(122, 52, 281, 83, 988, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 83 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Etc/UTC" + "'", str14, "Etc/UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Etc/UTC" + "'", str15, "Etc/UTC");
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime1.withEra(483);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 483 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
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
        int int15 = localDate4.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate.Property property16 = localDate4.dayOfYear();
        org.joda.time.LocalDate localDate17 = property16.roundFloorCopy();
        int int18 = property16.getMaximumValue();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 365 + "'", int18 == 365);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(53227055);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        int int5 = timeZone3.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.UK;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayScript(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United Kingdom" + "'", str2, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.days();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = chronology2.get(readablePeriod4, 1645454822073L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
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
        org.joda.time.LocalDate localDate11 = localDate7.plusMonths((-1));
        int int12 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate2.withYearOfCentury(345);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 345 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime5 = localDateTime4.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property8 = dateTime5.dayOfMonth();
        int int9 = dateTime5.getMonthOfYear();
        org.joda.time.Chronology chronology10 = dateTime5.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.weekyears();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology10.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(851, 345, 781, 137, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 851 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
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
        int int15 = localDate4.compareTo((org.joda.time.ReadablePartial) localDate14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate14.withMonthOfYear(53225);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53225 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Chronology chronology3 = instant0.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = chronology3.getDateTimeMillis((int) (byte) -1, 345, 706, 73, 1970, 100, 629);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 73 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = dateTime1.withEra(769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 769 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        int int3 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        boolean boolean7 = dateTimeZone0.isLocalDateTimeGap(localDateTime5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = localDateTime5.toString(dateTimeFormatter8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime5.withField(dateTimeFieldType10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 386 + "'", int3 == 386);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-03-23T14:47:10.386" + "'", str9, "2020-03-23T14:47:10.386");
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.Interval interval13 = localDate12.toInterval();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfMonth();
        int int16 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int20 = localDateTime14.get(dateTimeFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property21 = localDate12.property(dateTimeFieldType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 495 + "'", int16 == 495);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime10 = dateTime8.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZone(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes(165);
        int int15 = dateTime14.getDayOfMonth();
        boolean boolean16 = dateTime14.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar17 = dateTime14.toGregorianCalendar();
        int int18 = dateTime14.getSecondOfMinute();
        org.joda.time.Chronology chronology19 = dateTime14.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(21, (int) ' ', 60902, 612, (int) 'u', chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 612 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(gregorianCalendar17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int3 = localDate1.indexOf(dateTimeFieldType2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDate1.getFieldTypes();
        org.joda.time.LocalDate.Property property5 = localDate1.yearOfEra();
        org.joda.time.LocalDate localDate6 = property5.roundFloorCopy();
        int[] intArray7 = localDate6.getValues();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfYear(3);
        org.joda.time.LocalDate localDate11 = localDate9.withYear((int) '4');
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMinuteOfHour(10);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) localDate9, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 1, 1]");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withWeekOfWeekyear(747);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 747 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        long long6 = java.util.Date.UTC(9, 70, 3, 769, 618, 985);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1737980735000L) + "'", long6 == (-1737980735000L));
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = dateTimeFormatter2.parseLocalDateTime("100");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusYears(386);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withHourOfDay((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(0L, dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate13.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(0L, dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate18.plus(readablePeriod21);
        org.joda.time.LocalDate localDate23 = localDate15.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate.Property property24 = localDate23.year();
        org.joda.time.LocalDate localDate26 = localDate23.plusWeeks(14);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDate23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate11 = localDate7.plusMonths((-1));
        int int12 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(0L, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(0L, dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate20.plus(readablePeriod23);
        org.joda.time.LocalDate localDate25 = localDate17.withFields((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate20.minus(readablePeriod26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology29 = null;
        boolean boolean30 = durationFieldType28.isSupported(chronology29);
        boolean boolean31 = localDate20.isSupported(durationFieldType28);
        org.joda.time.LocalDate localDate32 = localDate2.withFields((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate35 = localDate32.withField(dateTimeFieldType33, 570);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 570 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean2 = calendar0.isSet((int) (short) 1);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645454830932,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=10,MILLISECOND=932,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        int int12 = dateTime8.getMonthOfYear();
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.weekyears();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology13.getZone();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(781, 0, 911, 404, 53227055, 404, 14, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 404 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 781);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 781");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DurationField durationField3 = dateTimeField2.getDurationField();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        int[] intArray11 = new int[] { (byte) -1, (short) 100, (byte) -1, (byte) 100, (short) 0 };
        int[] intArray13 = dateTimeField2.add((org.joda.time.ReadablePartial) localDateTime4, 0, intArray11, 0);
        int int14 = localDateTime4.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime4.withTime(790, 558, 490, 53221444);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 790 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 100, -1, 100, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 47 + "'", int14 == 47);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate12.withDayOfMonth(706);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 706 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isParser();
        java.util.Locale locale5 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withLocale(locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        int int13 = dateTime9.getMonthOfYear();
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property20 = dateTime17.dayOfMonth();
        int int21 = dateTime17.getMonthOfYear();
        org.joda.time.Chronology chronology22 = dateTime17.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.weekyears();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology22.getZone();
        org.joda.time.Chronology chronology25 = chronology14.withZone(dateTimeZone24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter7.withChronology(chronology25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant27 = org.joda.time.Instant.parse("years", dateTimeFormatter7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        int int6 = localDateTime4.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withField(dateTimeFieldType7, 11);
        java.util.Date date10 = localDateTime9.toDate();
        int int11 = localDateTime9.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDayOfWeek((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 492 + "'", int2 == 492);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Wed Mar 23 14:47:11 UTC 2011");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 47 + "'", int11 == 47);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int3 = localDate1.indexOf(dateTimeFieldType2);
        boolean boolean5 = localDate1.equals((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate1.withDayOfWeek(386);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 386 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate6 = localDate2.plusMonths((-1));
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate6.withPeriodAdded(readablePeriod7, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate6.withDayOfWeek(499);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 499 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTime dateTime7 = property6.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = property6.addToCopy(1645454826490L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Magnitude of add amount is too large: 1645454826490");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getDayOfMonth();
        boolean boolean11 = dateTime9.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        gregorianCalendar12.setMinimalDaysInFirstWeek(483);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar12.clear(404);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 404");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(gregorianCalendar12);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter2.getPrinter();
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable5, (long) 137);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimePrinter4);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime.Property property3 = localTime0.millisOfDay();
        org.joda.time.LocalTime localTime5 = property3.addNoWrapToCopy(468);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int10 = localDate8.indexOf(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = localDate8.getFieldTypes();
        org.joda.time.LocalDate.Property property12 = localDate8.yearOfEra();
        org.joda.time.LocalDate localDate13 = property12.roundFloorCopy();
        int[] intArray14 = localDate13.getValues();
        org.joda.time.LocalDate localDate16 = localDate13.withDayOfYear(3);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = property3.compareTo((org.joda.time.ReadablePartial) localDate16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[2022, 1, 1]");
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        org.joda.time.DateTime.Property property10 = dateTime7.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 769, dateTimeZone12);
        long long16 = dateTimeZone12.convertUTCToLocal((long) 73);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) property10, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 73L + "'", long16 == 73L);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property2.setCopy(73);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate4.withWeekOfWeekyear(747);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 747 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        calendar8.set(988, (int) (short) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = calendar8.getMaximum(64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 64");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 950 + "'", int2 == 950);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=988,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=100,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=11,MILLISECOND=950,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        long long9 = calendar8.getTimeInMillis();
        java.util.Date date11 = new java.util.Date((long) (byte) 1);
        int int12 = date11.getSeconds();
        calendar8.setTime(date11);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfMonth();
        int int16 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfYear();
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str21 = property19.getAsShortText(locale20);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(locale20);
        long long23 = calendar22.getTimeInMillis();
        boolean boolean24 = calendar8.before((java.lang.Object) long23);
        // The following exception was thrown during execution in test generation
        try {
            calendar8.roll(83, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 976 + "'", int2 == 976);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645454831976L + "'", long9 == 1645454831976L);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 977 + "'", int16 == 977);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "83" + "'", str21, "83");
        org.junit.Assert.assertNotNull(calendar22);
// flaky:         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=1645454831977,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=11,MILLISECOND=977,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1645454831977L + "'", long23 == 1645454831977L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.util.Date date1 = new java.util.Date((long) (byte) 1);
        int int2 = date1.getSeconds();
        java.lang.String str3 = date1.toGMTString();
        java.lang.String str4 = date1.toString();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str3, "1 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Thu Jan 01 00:00:00 UTC 1970" + "'", str4, "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer6, (long) 1969);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusMillis(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withDayOfMonth(898);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 898 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setTimeInMillis((long) 69);
        java.util.Date date12 = new java.util.Date((long) (byte) 1);
        date12.setMonth((int) (byte) -1);
        calendar8.setTime(date12);
        calendar8.set(5, 773);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = calendar8.getMinimum((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 217 + "'", int2 == 217);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=773,DAY_OF_YEAR=335,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date12.toString(), "Mon Dec 01 00:00:00 UTC 1969");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) (byte) -1);
        int int3 = localTime2.getMillisOfDay();
        org.joda.time.LocalTime localTime5 = localTime2.withMillisOfDay(679);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant7.plus(readableDuration8);
        org.joda.time.Chronology chronology10 = instant7.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.era();
        java.util.Locale locale13 = java.util.Locale.ROOT;
        java.lang.String str14 = dateTimeField11.getAsText((long) 1015, locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localTime2.toString("Taiwan", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53231334 + "'", int3 == 53231334);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AD" + "'", str14, "AD");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        boolean boolean10 = dateTimeFormatter9.isParser();
        java.util.Locale locale11 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfMonth();
        int int19 = dateTime15.getMonthOfYear();
        org.joda.time.Chronology chronology20 = dateTime15.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.weekyears();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property26 = dateTime23.dayOfMonth();
        int int27 = dateTime23.getMonthOfYear();
        org.joda.time.Chronology chronology28 = dateTime23.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.weekyears();
        org.joda.time.DateTimeZone dateTimeZone30 = chronology28.getZone();
        org.joda.time.Chronology chronology31 = chronology20.withZone(dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter13.withChronology(chronology31);
        boolean boolean33 = dateTimeFieldType3.isSupported(chronology31);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = chronology31.getDateTimeMillis(3, 708, 694, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 708 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = calendar8.isSet(381);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 381");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 399 + "'", int2 == 399);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454832399,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=12,MILLISECOND=399,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale0.getDisplayLanguage(locale1);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime5 = localDateTime4.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime9 = dateTime7.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.withZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfMonth();
        int int15 = localDateTime13.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        boolean boolean19 = dateTimeZone12.isLocalDateTimeGap(localDateTime17);
        org.joda.time.DateTime dateTime20 = dateTime7.toDateTime(dateTimeZone12);
        long long23 = dateTimeZone12.convertLocalToUTC((long) 677, true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) locale1, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u6587" + "'", str3, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 424 + "'", int15 == 424);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 677L + "'", long23 == 677L);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        long long9 = calendar8.getTimeInMillis();
        calendar8.set(0, 386, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            calendar8.setWeekDate((int) '4', 118, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 265");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 443 + "'", int2 == 443);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=0,MONTH=386,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=10,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=12,MILLISECOND=443,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645454832443L + "'", long9 == 1645454832443L);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType9.getField(chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.property(dateTimeFieldType9);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plusYears(386);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = property22.getAsShortText(locale23);
        java.lang.String str25 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDateTime8, locale23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = localDateTime8.withDayOfWeek(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 485 + "'", int19 == 485);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "83" + "'", str24, "83");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        org.joda.time.DurationField durationField9 = dateTimeField8.getDurationField();
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale11.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeField8.getAsText(265, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 265");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "United Kingdom" + "'", str12, "United Kingdom");
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        java.util.Date date1 = new java.util.Date((long) (byte) 1);
        int int2 = date1.getSeconds();
        java.lang.String str3 = date1.toGMTString();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfMonth();
        int int6 = localDateTime4.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str11 = property9.getAsShortText(locale10);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(locale10);
        long long13 = calendar12.getTimeInMillis();
        java.util.Date date15 = new java.util.Date((long) (byte) 1);
        int int16 = date15.getSeconds();
        calendar12.setTime(date15);
        int int18 = date1.compareTo(date15);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str3, "1 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 747 + "'", int6 == 747);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "83" + "'", str11, "83");
        org.junit.Assert.assertNotNull(calendar12);
        org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1645454832747L + "'", long13 == 1645454832747L);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.Object obj5 = timeZone3.clone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTime dateTime7 = property6.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = property6.setCopy("14:47:11.830");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"14:47:11.830\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate11 = localDate7.plusMonths((-1));
        int int12 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(0L, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(0L, dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate20.plus(readablePeriod23);
        org.joda.time.LocalDate localDate25 = localDate17.withFields((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate20.minus(readablePeriod26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology29 = null;
        boolean boolean30 = durationFieldType28.isSupported(chronology29);
        boolean boolean31 = localDate20.isSupported(durationFieldType28);
        org.joda.time.LocalDate localDate32 = localDate2.withFields((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        boolean boolean36 = dateTimeFormatter35.isParser();
        java.util.Locale locale37 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter35.withLocale(locale37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter38.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime41 = localDateTime40.toDateTime();
        org.joda.time.DateTime dateTime43 = dateTime41.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property44 = dateTime41.dayOfMonth();
        int int45 = dateTime41.getMonthOfYear();
        org.joda.time.Chronology chronology46 = dateTime41.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.weekyears();
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime49 = localDateTime48.toDateTime();
        org.joda.time.DateTime dateTime51 = dateTime49.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property52 = dateTime49.dayOfMonth();
        int int53 = dateTime49.getMonthOfYear();
        org.joda.time.Chronology chronology54 = dateTime49.getChronology();
        org.joda.time.DurationField durationField55 = chronology54.weekyears();
        org.joda.time.DateTimeZone dateTimeZone56 = chronology54.getZone();
        org.joda.time.Chronology chronology57 = chronology46.withZone(dateTimeZone56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter39.withChronology(chronology57);
        boolean boolean59 = dateTimeFormatter58.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = localDate32.toString(dateTimeFormatter58);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        long long9 = calendar8.getTimeInMillis();
        calendar8.set(0, 386, (int) (short) 10);
        calendar8.set((int) (byte) 0, 0, 100, 345, 1970, 4);
        calendar8.setLenient(false);
        java.util.TimeZone timeZone23 = calendar8.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = calendar8.getGreatestMinimum(137);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 137");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 990 + "'", int2 == 990);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=0,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=100,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=345,MINUTE=1970,SECOND=4,MILLISECOND=990,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645454832990L + "'", long9 == 1645454832990L);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("minuteOfHour");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        long long6 = java.util.Date.UTC(4, 52, 967, (int) 'a', 281, 53225);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1862278315000L) + "'", long6 == (-1862278315000L));
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear(265);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer8, (long) 174);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        int int6 = localDateTime4.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withField(dateTimeFieldType7, 11);
        java.util.Date date10 = localDateTime9.toDate();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plusWeeks((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withHourOfDay(206);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 206 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Wed Mar 23 14:47:13 UTC 2011");
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        calendar8.set(224, 100, 73, 404, 403);
        int int18 = calendar8.getActualMinimum((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = calendar8.getMinimum(24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 142 + "'", int2 == 142);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=224,MONTH=100,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=73,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=404,MINUTE=403,SECOND=13,MILLISECOND=143,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType10.getField(chronology11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime9.property(dateTimeFieldType10);
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        boolean boolean17 = dateTimeFormatter16.isParser();
        java.util.Locale locale18 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter16.withLocale(locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter19.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime22 = localDateTime21.toDateTime();
        org.joda.time.DateTime dateTime24 = dateTime22.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property25 = dateTime22.dayOfMonth();
        int int26 = dateTime22.getMonthOfYear();
        org.joda.time.Chronology chronology27 = dateTime22.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.weekyears();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.DateTime dateTime32 = dateTime30.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property33 = dateTime30.dayOfMonth();
        int int34 = dateTime30.getMonthOfYear();
        org.joda.time.Chronology chronology35 = dateTime30.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.weekyears();
        org.joda.time.DateTimeZone dateTimeZone37 = chronology35.getZone();
        org.joda.time.Chronology chronology38 = chronology27.withZone(dateTimeZone37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter20.withChronology(chronology38);
        boolean boolean40 = dateTimeFieldType10.isSupported(chronology38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((int) (byte) 1, 22, 199, 404, 304, 644, 123, chronology38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 404 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property9 = dateTime6.dayOfMonth();
        int int10 = dateTime6.getMonthOfYear();
        org.joda.time.Chronology chronology11 = dateTime6.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property17 = dateTime14.dayOfMonth();
        int int18 = dateTime14.getMonthOfYear();
        org.joda.time.Chronology chronology19 = dateTime14.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.weekyears();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology19.getZone();
        org.joda.time.Chronology chronology22 = chronology11.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfMonth();
        int int27 = localDateTime25.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.minusWeeks(100);
        int[] intArray31 = chronology22.get((org.joda.time.ReadablePartial) localDateTime25, (long) 404);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(584, 96, 14, 889, 0, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 889 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 294 + "'", int27 == 294);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1970, 1, 1, 404]");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate6 = localDate2.plusMonths((-1));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str9 = dateTimeZone7.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDate2.toDateTimeAtCurrentTime(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate2.withWeekOfWeekyear(593);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 593 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
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
        org.joda.time.LocalDate localDate15 = localDate12.plusWeeks(14);
        org.joda.time.LocalDate localDate17 = localDate15.plusWeeks(32772);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType19 = localDate17.getFieldType(397);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 397");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant0.withDurationAdded(readableDuration3, 22);
        org.joda.time.Chronology chronology6 = instant0.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(0L, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(0L, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate19 = localDate15.plusMonths((-1));
        int int20 = localDate10.compareTo((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(0L, dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(0L, dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate28.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate28.plus(readablePeriod31);
        org.joda.time.LocalDate localDate33 = localDate25.withFields((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate35 = localDate28.minus(readablePeriod34);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology37 = null;
        boolean boolean38 = durationFieldType36.isSupported(chronology37);
        boolean boolean39 = localDate28.isSupported(durationFieldType36);
        org.joda.time.LocalDate localDate40 = localDate10.withFields((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.LocalDate localDate42 = localDate40.plusYears((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType44.getField(chronology45);
        org.joda.time.DurationField durationField47 = dateTimeField46.getDurationField();
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.now();
        int[] intArray55 = new int[] { (byte) -1, (short) 100, (byte) -1, (byte) 100, (short) 0 };
        int[] intArray57 = dateTimeField46.add((org.joda.time.ReadablePartial) localDateTime48, 0, intArray55, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray59 = dateTimeField7.addWrapField((org.joda.time.ReadablePartial) localDate42, 20, intArray55, 246);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1, 100, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1, 100, -1, 100, 0]");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.lang.String str5 = dateMidnight4.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = dateMidnight4.toDateTime(dateTimeZone6);
        boolean boolean9 = dateTimeZone6.isStandardOffset((long) (byte) 100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        int int11 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) dateTime10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime10.withDayOfYear(694);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 694 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str5, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime5 = instant0.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(0L, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = localDate8.toDateMidnight(dateTimeZone9);
        java.lang.String str11 = dateMidnight10.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = dateMidnight10.toDateTime(dateTimeZone12);
        boolean boolean14 = mutableDateTime5.isBefore((org.joda.time.ReadableInstant) dateTime13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = mutableDateTime5.toString("2022-02-21T14:47:12.368Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str11, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        int int5 = timeZone3.getOffset(4L);
        boolean boolean6 = timeZone3.useDaylightTime();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        int int13 = dateTime9.getMonthOfYear();
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology14.getZone();
        org.joda.time.Chronology chronology17 = chronology6.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.centuryOfEra();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        boolean boolean23 = dateTimeFormatter22.isParser();
        java.util.Locale locale24 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withLocale(locale24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter25.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property31 = dateTime28.dayOfMonth();
        int int32 = dateTime28.getMonthOfYear();
        org.joda.time.Chronology chronology33 = dateTime28.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.weekyears();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime36 = localDateTime35.toDateTime();
        org.joda.time.DateTime dateTime38 = dateTime36.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property39 = dateTime36.dayOfMonth();
        int int40 = dateTime36.getMonthOfYear();
        org.joda.time.Chronology chronology41 = dateTime36.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.weekyears();
        org.joda.time.DateTimeZone dateTimeZone43 = chronology41.getZone();
        org.joda.time.Chronology chronology44 = chronology33.withZone(dateTimeZone43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter26.withChronology(chronology44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((java.lang.Object) dateTimeField19, chronology44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime.Property property3 = localTime0.millisOfDay();
        org.joda.time.LocalTime localTime5 = property3.addNoWrapToCopy(468);
        org.joda.time.LocalTime localTime7 = property3.addWrapFieldToCopy(22);
        org.joda.time.LocalTime.Property property8 = localTime7.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property8.addNoWrapToCopy(858);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        long long7 = chronology3.add((long) (short) 1, (long) (byte) 0, 2);
        org.joda.time.DateTimeField dateTimeField8 = chronology3.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) 16, chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str3 = dateTimeZone1.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.Chronology chronology8 = localDateTime6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType15.getField(chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.property(dateTimeFieldType15);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.plusYears(386);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime14.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfMonth();
        int int25 = localDateTime23.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfYear();
        java.util.Locale locale29 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str30 = property28.getAsShortText(locale29);
        java.lang.String str31 = dateTimeField11.getAsShortText((org.joda.time.ReadablePartial) localDateTime14, locale29);
        java.lang.String str32 = dateTimeZone1.getShortName((long) 381, locale29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((java.lang.Object) 6, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 661 + "'", int25 == 661);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "83" + "'", str30, "83");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Thu Jan 01 00:00:00 UTC 1970", (double) 528);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=528.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        int int12 = dateTime8.getMonthOfYear();
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.weekyears();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        int int20 = dateTime16.getMonthOfYear();
        org.joda.time.Chronology chronology21 = dateTime16.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.weekyears();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology21.getZone();
        org.joda.time.Chronology chronology24 = chronology13.withZone(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter6.withChronology(chronology24);
        java.io.Writer writer26 = null;
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.Chronology chronology29 = localDateTime27.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.eras();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField32 = chronology29.hourOfDay();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime35 = property34.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType36.getField(chronology37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime35.property(dateTimeFieldType36);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.plusYears(386);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime35.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.dayOfMonth();
        int int46 = localDateTime44.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime44.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.dayOfYear();
        java.util.Locale locale50 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str51 = property49.getAsShortText(locale50);
        java.lang.String str52 = dateTimeField32.getAsShortText((org.joda.time.ReadablePartial) localDateTime35, locale50);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter25.printTo(writer26, (org.joda.time.ReadablePartial) localDateTime35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 794 + "'", int46 == 794);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "83" + "'", str51, "83");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0" + "'", str52, "0");
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField7 = property5.getLeapDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property5.addToCopy(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 833 + "'", int2 == 833);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(durationField7);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property9 = dateTime6.dayOfMonth();
        int int10 = dateTime6.getMonthOfYear();
        org.joda.time.Chronology chronology11 = dateTime6.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property17 = dateTime14.dayOfMonth();
        int int18 = dateTime14.getMonthOfYear();
        org.joda.time.Chronology chronology19 = dateTime14.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.weekyears();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology19.getZone();
        org.joda.time.Chronology chronology22 = chronology11.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(474, 100, 263, 60902, 137, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 60902 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isParser();
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.util.Locale locale8 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.lang.String str10 = locale7.getDisplayLanguage(locale8);
        java.lang.String str11 = locale6.getDisplayVariant(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.parse("it", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u6587" + "'", str10, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        int int13 = dateTime9.getMonthOfYear();
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology14.getZone();
        org.joda.time.Chronology chronology17 = chronology6.withZone(dateTimeZone16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = chronology6.get(readablePeriod18, (long) 570, (long) 898);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.getDateTime();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.MIDNIGHT;
        java.lang.String str7 = localTime6.toString();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime6.plus(readablePeriod8);
        int int10 = localTime9.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = property4.compareTo((org.joda.time.ReadablePartial) localTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00:00:00.000" + "'", str7, "00:00:00.000");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfHalfday();
        org.joda.time.DurationField durationField5 = chronology2.halfdays();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = chronology2.get(readablePeriod6, (long) 869, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(985);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str6 = dateTimeFieldType5.toString();
        boolean boolean7 = localDate4.isSupported(dateTimeFieldType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate2.withField(dateTimeFieldType5, 618);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "minuteOfDay" + "'", str6, "minuteOfDay");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime7 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withTime(83, 246, 679, 316);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 83 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 164 + "'", int2 == 164);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll((int) 'u', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645454834260,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=14,MILLISECOND=260,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(12, 12, 92);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 92 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
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
        org.joda.time.LocalDate localDate14 = property13.roundHalfCeilingCopy();
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = property15.setCopy(13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfHalfday();
        long long7 = dateTimeField4.set((long) 32769, 0);
        int int9 = dateTimeField4.getLeapAmount((long) 83);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeField4.set((long) 265, "fr-FR");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"fr-FR\" for hourOfHalfday is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32769L + "'", long7 == 32769L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.UK;
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale6.getDisplayLanguage(locale7);
        java.lang.String str10 = locale5.getDisplayVariant(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withLocale(locale6);
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfMonth();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalDateTime localDateTime17 = property14.addToCopy(0);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer12, (org.joda.time.ReadablePartial) localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u6587" + "'", str9, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        long long9 = calendar8.getTimeInMillis();
        calendar8.set(0, 386, (int) (short) 10);
        calendar8.set((int) (byte) 0, 0, 100, 345, 1970, 4);
        calendar8.setLenient(false);
        java.util.TimeZone timeZone23 = calendar8.getTimeZone();
        java.lang.Object obj24 = timeZone23.clone();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 583 + "'", int2 == 583);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=0,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=100,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=345,MINUTE=1970,SECOND=4,MILLISECOND=583,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645454834583L + "'", long9 == 1645454834583L);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        calendar8.set(224, 100, 73, 404, 403);
        int int18 = calendar8.getActualMinimum((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            calendar8.add(874, 874);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 723 + "'", int2 == 723);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=224,MONTH=100,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=73,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=404,MINUTE=403,SECOND=14,MILLISECOND=723,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMinutes(53221444);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusMillis(202);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = localDateTime0.getFieldType(593);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 593");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 757 + "'", int2 == 757);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("19");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 834 + "'", int2 == 834);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        int int13 = dateTime9.getMonthOfYear();
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology14.getZone();
        org.joda.time.Chronology chronology17 = chronology6.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.centuryOfEra();
        java.lang.String str21 = dateTimeField19.getAsText((-1862278315000L));
        // The following exception was thrown during execution in test generation
        try {
            long long24 = dateTimeField19.set((-1737980735000L), "1 janv. 1970 00:00:00");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1 janv. 1970 00:00:00\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "19" + "'", str21, "19");
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        org.joda.time.DateTime dateTime9 = property6.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime9.withMonthOfYear(73);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 73 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        boolean boolean9 = dateTimeFormatter8.isParser();
        java.util.Locale locale10 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withLocale(locale10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property17 = dateTime14.dayOfMonth();
        int int18 = dateTime14.getMonthOfYear();
        org.joda.time.Chronology chronology19 = dateTime14.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.weekyears();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime22 = localDateTime21.toDateTime();
        org.joda.time.DateTime dateTime24 = dateTime22.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property25 = dateTime22.dayOfMonth();
        int int26 = dateTime22.getMonthOfYear();
        org.joda.time.Chronology chronology27 = dateTime22.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.weekyears();
        org.joda.time.DateTimeZone dateTimeZone29 = chronology27.getZone();
        org.joda.time.Chronology chronology30 = chronology19.withZone(dateTimeZone29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter12.withChronology(chronology30);
        boolean boolean32 = dateTimeFormatter31.isOffsetParsed();
        org.joda.time.Chronology chronology33 = dateTimeFormatter31.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((int) (byte) 100, 0, (int) 'u', 869, 70, 6, chronology33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 869 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(chronology33);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        // The following exception was thrown during execution in test generation
        try {
            calendar8.clear(53225018);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53225018");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454835060,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=15,MILLISECOND=60,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.Interval interval2 = property1.toInterval();
        int int3 = property1.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        int int11 = localDateTime9.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        boolean boolean15 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone8);
        long long19 = dateTimeZone8.convertLocalToUTC((long) 677, true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) 677);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 104 + "'", int11 == 104);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 677L + "'", long19 == 677L);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = dateTimeFormatter6.parseLocalDate("01-Jan-1970 00:00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("14:47:05.528");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=14:47:05.528");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        int int6 = dateTime1.getMonthOfYear();
        org.joda.time.DateTime dateTime8 = dateTime1.plusMonths(282);
        java.util.GregorianCalendar gregorianCalendar9 = dateTime8.toGregorianCalendar();
        boolean boolean10 = gregorianCalendar9.isLenient();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(53226219, 292278993, 92, 894, 403, 282, 971);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 894 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((java.lang.Object) "United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"United Kingdom\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime.Property property3 = localTime0.millisOfDay();
        org.joda.time.LocalTime localTime5 = property3.addNoWrapToCopy(468);
        org.joda.time.LocalTime localTime7 = property3.addWrapFieldToCopy(22);
        org.joda.time.LocalTime.Property property8 = localTime7.minuteOfHour();
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale10.getDisplayCountry();
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale12.getScript();
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale10.getDisplayCountry(locale12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = property8.setCopy("2020-03-23T14:47:02.858", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-03-23T14:47:02.858\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "United Kingdom" + "'", str11, "United Kingdom");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Royaume-Uni" + "'", str15, "Royaume-Uni");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        int int5 = timeZone3.getOffset(4L);
        boolean boolean6 = timeZone3.observesDaylightTime();
        java.lang.String str7 = timeZone3.getID();
        java.util.Date date9 = new java.util.Date((long) (byte) 1);
        int int10 = date9.getSeconds();
        java.lang.String str11 = date9.toGMTString();
        java.lang.String str12 = date9.toLocaleString();
        java.util.Date date14 = new java.util.Date((long) (byte) 1);
        int int15 = date14.getSeconds();
        java.lang.String str16 = date14.toGMTString();
        java.lang.String str17 = date14.toLocaleString();
        int int18 = date14.getDay();
        date14.setMonth(869);
        boolean boolean21 = date9.before(date14);
        boolean boolean22 = timeZone3.inDaylightTime(date9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Etc/UTC" + "'", str7, "Etc/UTC");
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str11, "1 Jan 1970 00:00:00 GMT");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01-Jan-1970 00:00:00" + "'", str12, "01-Jan-1970 00:00:00");
        org.junit.Assert.assertEquals(date14.toString(), "Sun Jun 01 00:00:00 UTC 2042");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str16, "1 Jan 1970 00:00:00 GMT");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "01-Jan-1970 00:00:00" + "'", str17, "01-Jan-1970 00:00:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.lang.String str1 = calendar0.toString();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645454835763,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=15,MILLISECOND=763,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.util.GregorianCalendar[time=1645454835763,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=15,MILLISECOND=763,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str1, "java.util.GregorianCalendar[time=1645454835763,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=15,MILLISECOND=763,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isParser();
        java.util.Locale locale5 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withLocale(locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        int int13 = dateTime9.getMonthOfYear();
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property20 = dateTime17.dayOfMonth();
        int int21 = dateTime17.getMonthOfYear();
        org.joda.time.Chronology chronology22 = dateTime17.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.weekyears();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology22.getZone();
        org.joda.time.Chronology chronology25 = chronology14.withZone(dateTimeZone24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter7.withChronology(chronology25);
        boolean boolean27 = dateTimeFormatter26.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.parse("2022-02-21T14:47:09.931Z", dateTimeFormatter26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        org.joda.time.DateTime dateTime10 = property6.addWrapFieldToCopy((int) 'a');
        int int11 = dateTime10.getYearOfEra();
        org.joda.time.DateTime dateTime13 = dateTime10.plusDays(564);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime13.withDayOfMonth(533);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 533 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds((int) 'a');
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusSeconds((int) (byte) -1);
        org.joda.time.DateTime dateTime8 = localTime7.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 858 + "'", int2 == 858);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.util.Date date1 = new java.util.Date((long) (byte) 1);
        int int2 = date1.getYear();
        java.util.Date date4 = new java.util.Date((long) (byte) 1);
        date4.setTime((long) 404);
        long long7 = date4.getTime();
        boolean boolean8 = date1.equals((java.lang.Object) date4);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 404L + "'", long7 == 404L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        int int5 = timeZone3.getOffset(4L);
        boolean boolean6 = timeZone3.observesDaylightTime();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeZone3.getOffset(0, 708, 32770, 92, 263, 874);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 5, dateTimeZone1);
        int int4 = localDate3.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localDate3.getField(630);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 630");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay((int) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMonths(0);
        java.util.Locale locale11 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDateTime9.toString("2020-03-23T14:47:02.858", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime localTime4 = localTime0.minusHours((int) '4');
        org.joda.time.LocalTime.Property property5 = localTime4.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfMonth();
        int int8 = localDateTime6.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMinutes(53221444);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        org.joda.time.LocalDateTime localDateTime13 = property11.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localTime4.compareTo((org.joda.time.ReadablePartial) localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
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
        int int15 = localDate4.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType19.getField(chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime18.property(dateTimeFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property23 = localDate4.property(dateTimeFieldType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2000, 389);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 389");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 2022);
        int int2 = dateTime1.getYearOfCentury();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime3.withSecondOfMinute(823);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 823 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getDayOfMonth();
        boolean boolean11 = dateTime9.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        int int13 = gregorianCalendar12.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar12.clear((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(gregorianCalendar12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((-1737980735000L), dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(14, 52, 397, 53226219, 528, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53226219 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = property6.withMaximumValue();
        java.util.Date date9 = localDateTime8.toDate();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime8.getValue(486);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 486");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Feb 22 23:59:59 UTC 2022");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getDayOfMonth();
        boolean boolean11 = dateTime9.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        gregorianCalendar12.setMinimalDaysInFirstWeek(483);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar12.clear(155);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 155");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(gregorianCalendar12);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = chronology2.getDateTimeMillis(1, 6, 694, 53233784, (-1), 1, 55);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53233784 for hourOfDay must be in the range [0,23]");
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
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusSeconds(454);
        org.joda.time.DateTime dateTime9 = dateTime5.plusSeconds((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTime5.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        boolean boolean6 = localDateTime4.equals((java.lang.Object) "0");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withField(dateTimeFieldType7, 12);
        int int10 = localDateTime4.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField12 = localDateTime4.getField(96);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 96");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 612 + "'", int2 == 612);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 612 + "'", int10 == 612);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        int int3 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        boolean boolean7 = dateTimeZone0.isLocalDateTimeGap(localDateTime5);
        boolean boolean8 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 624 + "'", int3 == 624);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getDayOfMonth();
        boolean boolean11 = dateTime9.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        gregorianCalendar12.setMinimalDaysInFirstWeek(483);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = gregorianCalendar12.isSet(873);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 873");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(gregorianCalendar12);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.getDateTime();
        org.joda.time.DurationField durationField6 = property4.getLeapDurationField();
        int int7 = property4.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNull(durationField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        int int5 = timeZone3.getOffset(4L);
        java.util.Locale locale6 = java.util.Locale.UK;
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale6.getDisplayLanguage(locale7);
        java.lang.String str10 = timeZone3.getDisplayName(locale6);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u6587" + "'", str9, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinated Universal Time" + "'", str10, "Coordinated Universal Time");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay((int) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMonths(0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property10.setCopy(677);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 677 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 838 + "'", int2 == 838);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter2.getPrinter();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTimeFormatter2.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        long long6 = java.util.Date.UTC(437, (-1), 4, 618, 526, 221);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11581238981000L + "'", long6 == 11581238981000L);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.Chronology chronology9 = localDateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(1, 53227055, 64, 0, 53225, 719, 483, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53225 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("yearOfCentury");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((java.lang.Object) "yearOfCentury");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"yearOfCentury\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes(468);
        org.joda.time.LocalDateTime localDateTime8 = dateTime5.toLocalDateTime();
        java.lang.String str9 = localDateTime8.toString();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfMonth();
        int int15 = dateTime11.getMonthOfYear();
        org.joda.time.Chronology chronology16 = dateTime11.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) str9, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T14:10:17.363\" is malformed at \"T14:10:17.363\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022-02-21T14:10:17.363" + "'", str9, "2022-02-21T14:10:17.363");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        int int5 = timeZone3.getOffset(4L);
        boolean boolean6 = timeZone3.observesDaylightTime();
        int int7 = timeZone3.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate6 = localDate2.plusMonths((-1));
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate6.withPeriodAdded(readablePeriod7, (int) (short) 1);
        int int10 = localDate6.getMonthOfYear();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        java.lang.String str1 = localTime0.toString();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime0.plus(readablePeriod2);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = property4.setCopy("14:47:02.388");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"14:47:02.388\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00:00:00.000" + "'", str1, "00:00:00.000");
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.UK;
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale6.getDisplayLanguage(locale7);
        java.lang.String str10 = locale5.getDisplayVariant(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withLocale(locale6);
        java.lang.Appendable appendable12 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(0L, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(0L, dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate20.plus(readablePeriod23);
        org.joda.time.LocalDate localDate25 = localDate17.withFields((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTime dateTime26 = localDate20.toDateTimeAtCurrentTime();
        int int27 = localDate20.getYear();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable12, (org.joda.time.ReadablePartial) localDate20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u6587" + "'", str9, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
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
        org.joda.time.LocalDate localDate14 = property13.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localDate14.getValue(202);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 202");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long4 = dateTimeField2.remainder((long) (short) 100);
        java.lang.String str6 = dateTimeField2.getAsShortText(0L);
        int int8 = dateTimeField2.get(248L);
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeField2.set((long) 538, "yearOfCentury", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"yearOfCentury\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 248 + "'", int8 == 248);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.days();
        org.joda.time.DateTimeZone dateTimeZone4 = chronology2.getZone();
        org.joda.time.DurationField durationField5 = chronology2.eras();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.add(32770, 53234486);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645454837653,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=17,MILLISECOND=653,ZONE_OFFSET=0,DST_OFFSET=0]");
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
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property14 = localDate7.year();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        org.joda.time.LocalDate localDate16 = property14.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField17 = property14.getField();
        org.joda.time.DurationField durationField18 = dateTimeField17.getDurationField();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
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
        int int15 = localDate4.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate.Property property16 = localDate4.dayOfYear();
        boolean boolean17 = property16.isLeap();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        org.joda.time.Chronology chronology21 = localDateTime19.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.hourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType28.getField(chronology29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime27.property(dateTimeFieldType28);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.plusYears(386);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime27.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.dayOfMonth();
        int int38 = localDateTime36.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.dayOfYear();
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str43 = property41.getAsShortText(locale42);
        java.lang.String str44 = dateTimeField24.getAsShortText((org.joda.time.ReadablePartial) localDateTime27, locale42);
        java.util.Locale locale45 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet46 = locale45.getUnicodeLocaleAttributes();
        java.lang.String str47 = locale42.getDisplayScript(locale45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate48 = property16.setCopy("01-Jan-1970 00:00:00", locale42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01-Jan-1970 00:00:00\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 723 + "'", int38 == 723);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "83" + "'", str43, "83");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0" + "'", str44, "0");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        java.lang.Integer int7 = dateTimeFormatter6.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = dateTimeFormatter6.parseLocalTime("14:47:07.406");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        boolean boolean11 = dateTimeFormatter10.isParser();
        java.util.Locale locale12 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withLocale(locale12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        int int20 = dateTime16.getMonthOfYear();
        org.joda.time.Chronology chronology21 = dateTime16.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.weekyears();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime24 = localDateTime23.toDateTime();
        org.joda.time.DateTime dateTime26 = dateTime24.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property27 = dateTime24.dayOfMonth();
        int int28 = dateTime24.getMonthOfYear();
        org.joda.time.Chronology chronology29 = dateTime24.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.weekyears();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology29.getZone();
        org.joda.time.Chronology chronology32 = chronology21.withZone(dateTimeZone31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter14.withChronology(chronology32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 533, chronology32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(316, 8, 11, 2, 695, 483, 16, chronology32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 695 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = calendar8.get(630);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 630");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 777 + "'", int2 == 777);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454837777,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=17,MILLISECOND=777,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        int int7 = dateTimeFormatter6.getDefaultYear();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime.Property property11 = localTime8.millisOfDay();
        org.joda.time.LocalTime localTime13 = property11.addNoWrapToCopy(468);
        org.joda.time.LocalTime localTime15 = property11.addWrapFieldToCopy(454);
        org.joda.time.LocalTime localTime17 = property11.addWrapFieldToCopy(971);
        org.joda.time.LocalTime localTime19 = localTime17.plusMillis(979);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dateTimeFormatter6.print((org.joda.time.ReadablePartial) localTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(0, (int) (byte) -1, 2000, 82, 259);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 82 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        long long9 = calendar8.getTimeInMillis();
        calendar8.set(0, 386, (int) (short) 10);
        calendar8.set((int) (byte) 0, 0, 100, 345, 1970, 4);
        calendar8.setLenient(false);
        java.util.TimeZone timeZone23 = calendar8.getTimeZone();
        java.lang.String str24 = timeZone23.getDisplayName();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 983 + "'", int2 == 983);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=0,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=100,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=345,MINUTE=1970,SECOND=4,MILLISECOND=983,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645454837983L + "'", long9 == 1645454837983L);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Temps universel coordonn\351");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Temps universel coordonn\351" + "'", str24, "Temps universel coordonn\351");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("2011-03-23T14:47:06.392");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '2011-03-23T14:47:06.392' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate11 = localDate7.plusMonths((-1));
        int int12 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(0L, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(0L, dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate20.plus(readablePeriod23);
        org.joda.time.LocalDate localDate25 = localDate17.withFields((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate20.minus(readablePeriod26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology29 = null;
        boolean boolean30 = durationFieldType28.isSupported(chronology29);
        boolean boolean31 = localDate20.isSupported(durationFieldType28);
        org.joda.time.LocalDate localDate32 = localDate2.withFields((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate.Property property33 = localDate2.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField35 = localDate2.getField(630);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 630");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(206, 449, (int) (short) 1, 821, 392, 719, 267);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 821 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate7.minus(readablePeriod13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology16 = null;
        boolean boolean17 = durationFieldType15.isSupported(chronology16);
        boolean boolean18 = localDate7.isSupported(durationFieldType15);
        org.joda.time.LocalDate localDate20 = localDate7.minusWeeks(0);
        org.joda.time.ReadablePartial readablePartial21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDate20.compareTo(readablePartial21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(0L, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = localDate8.toDateMidnight(dateTimeZone9);
        java.lang.String str11 = dateMidnight10.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = dateMidnight10.toDateTime(dateTimeZone12);
        boolean boolean15 = dateTimeZone12.isStandardOffset((long) (byte) 100);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(0, 924, (int) (short) 10, 860, 932, 323, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 860 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str11, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str5 = dateTimeZone4.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Etc/UTC" + "'", str5, "Etc/UTC");
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear(265);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTimeFormatter7.parseDateTime("AD");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
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
        org.joda.time.LocalDate localDate15 = localDate12.plusWeeks(14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int19 = localDate17.indexOf(dateTimeFieldType18);
        int int20 = localDate12.compareTo((org.joda.time.ReadablePartial) localDate17);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDate17.getValue(82);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 82");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusYears(386);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property11 = localDateTime2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.Chronology chronology16 = localDateTime14.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.hourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime22.property(dateTimeFieldType23);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.plusYears(386);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime22.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfMonth();
        int int33 = localDateTime31.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfYear();
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str38 = property36.getAsShortText(locale37);
        java.lang.String str39 = dateTimeField19.getAsShortText((org.joda.time.ReadablePartial) localDateTime22, locale37);
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleAttributes();
        java.lang.String str42 = locale37.getDisplayScript(locale40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime43 = property11.setCopy("1 Jan 1970 00:00:00 GMT", locale40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1 Jan 1970 00:00:00 GMT\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 474 + "'", int33 == 474);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "83" + "'", str38, "83");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0" + "'", str39, "0");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withMinuteOfHour(304);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 304 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMillis(202);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 202);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 5, dateTimeZone1);
        int int4 = localDate3.getYearOfEra();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        boolean boolean8 = dateTimeFormatter7.isParser();
        java.util.Locale locale9 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfMonth();
        int int17 = dateTime13.getMonthOfYear();
        org.joda.time.Chronology chronology18 = dateTime13.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.weekyears();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        int int25 = dateTime21.getMonthOfYear();
        org.joda.time.Chronology chronology26 = dateTime21.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.weekyears();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology26.getZone();
        org.joda.time.Chronology chronology29 = chronology18.withZone(dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter11.withChronology(chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter11.withPivotYear(1969);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = localDate3.toString(dateTimeFormatter11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getDayOfMonth();
        boolean boolean11 = dateTime9.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds(53221444);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime14.withEra(278);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 278 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(gregorianCalendar12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        long long9 = calendar8.getTimeInMillis();
        calendar8.set(0, 386, (int) (short) 10);
        calendar8.set((int) (byte) 0, 0, 100, 345, 1970, 4);
        calendar8.set(32772, 769, 747);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = calendar8.getMaximum(706);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 706");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 808 + "'", int2 == 808);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=32772,MONTH=769,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=747,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=345,MINUTE=1970,SECOND=4,MILLISECOND=809,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645454838809L + "'", long9 == 1645454838809L);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.plusYears(869);
        int[] intArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = dateTimeField6.addWrapPartial((org.joda.time.ReadablePartial) localDateTime7, 820, intArray12, 618);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long4 = dateTimeField2.remainder((long) (short) 100);
        java.lang.String str6 = dateTimeField2.getAsShortText(0L);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        int int9 = localDateTime7.getMillisOfSecond();
        int[] intArray10 = null;
        int int11 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localDateTime7, intArray10);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime localTime16 = localTime12.minusHours((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType18.getField(chronology19);
        long long22 = dateTimeField20.remainder((long) (short) 100);
        java.lang.String str24 = dateTimeField20.getAsShortText(0L);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfMonth();
        int int27 = localDateTime25.getMillisOfSecond();
        int[] intArray28 = null;
        int int29 = dateTimeField20.getMinimumValue((org.joda.time.ReadablePartial) localDateTime25, intArray28);
        long long32 = dateTimeField20.getDifferenceAsLong((long) 366, (long) 118);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfMonth();
        int int35 = localDateTime33.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.dayOfYear();
        org.joda.time.LocalDateTime localDateTime39 = property38.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withMillisOfDay(20);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime43 = localDateTime42.toDateTime();
        org.joda.time.DateTime dateTime45 = dateTime43.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property46 = dateTime43.dayOfMonth();
        int int47 = dateTime43.getMonthOfYear();
        org.joda.time.Chronology chronology48 = dateTime43.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.weekyears();
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime51 = localDateTime50.toDateTime();
        org.joda.time.DateTime dateTime53 = dateTime51.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property54 = dateTime51.dayOfMonth();
        int int55 = dateTime51.getMonthOfYear();
        org.joda.time.Chronology chronology56 = dateTime51.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.weekyears();
        org.joda.time.DateTimeZone dateTimeZone58 = chronology56.getZone();
        org.joda.time.Chronology chronology59 = chronology48.withZone(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = chronology59.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField61 = chronology59.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.dayOfMonth();
        int int64 = localDateTime62.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime62.minusWeeks(100);
        int[] intArray68 = chronology59.get((org.joda.time.ReadablePartial) localDateTime62, (long) 404);
        int int69 = dateTimeField20.getMaximumValue((org.joda.time.ReadablePartial) localDateTime39, intArray68);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray71 = dateTimeField2.addWrapField((org.joda.time.ReadablePartial) localTime16, 563, intArray68, 366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 563");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 71 + "'", int9 == 71);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 71 + "'", int27 == 71);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 248L + "'", long32 == 248L);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 71 + "'", int35 == 71);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(property63);
// flaky:         org.junit.Assert.assertTrue("'" + int64 + "' != '" + 72 + "'", int64 == 72);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1970, 1, 1, 404]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 86399999 + "'", int69 == 86399999);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int6 = localDate4.indexOf(dateTimeFieldType5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDate4.getFieldTypes();
        org.joda.time.LocalDate.Property property8 = localDate4.yearOfEra();
        org.joda.time.LocalDate localDate9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtStartOfDay();
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.plus(readableDuration12);
        org.joda.time.Chronology chronology14 = instant11.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.era();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str18 = dateTimeZone16.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone19 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.Chronology chronology21 = chronology14.withZone(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = dateTime10.toDateTime(chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(547, 263, 499, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 263 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        java.util.Date date13 = localDate7.toDate();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone17 = dateTimeZone14.toTimeZone();
        java.lang.String str19 = dateTimeZone14.getName((long) (short) -1);
        org.joda.time.DateTime dateTime20 = localDate7.toDateTimeAtStartOfDay(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = dateTime20.withTime(53233784, 889, 323, 47);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53233784 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfMonth();
        int int5 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        java.util.Locale locale9 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str10 = property8.getAsShortText(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap11 = calendar0.getDisplayNames(501, 694, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645454839402,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=19,MILLISECOND=402,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 402 + "'", int5 == 402);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "83" + "'", str10, "83");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.plus(readableDuration7);
        org.joda.time.Chronology chronology9 = instant6.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(924, 924, 323, 669, 0, 17, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 669 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        org.joda.time.LocalDateTime localDateTime9 = property5.addWrapFieldToCopy(404);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks(967);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withHourOfDay(941);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 941 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 621 + "'", int2 == 621);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setRegion("2022");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 2022 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(677, (int) (short) 100, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter2.getPrinter();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        java.io.Writer writer7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 5, dateTimeZone9);
        int int12 = localDate11.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, (org.joda.time.ReadablePartial) localDate11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant7.plus(readableDuration8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant12 = instant7.withDurationAdded(readableDuration10, 22);
        org.joda.time.Chronology chronology13 = instant7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(573, 584, 630, 224, (int) (byte) 1, 483, 936, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 224 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("years");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"years\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.centuryOfEra();
        org.joda.time.Instant instant5 = dateTime1.toInstant();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant8 = instant5.withDurationAdded(readableDuration6, 7);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(instant8);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calendar8.getGreatestMinimum(694);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 694");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 741 + "'", int2 == 741);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454839741,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=19,MILLISECOND=741,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfMonth();
        int int6 = dateTime2.getMonthOfYear();
        org.joda.time.Chronology chronology7 = dateTime2.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.weekyears();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 15, chronology7);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMillis(292278993);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMinuteOfHour(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfHalfday();
        long long7 = dateTimeField4.set((long) 32769, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32769L + "'", long7 == 32769L);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("14:47:02.388");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"14:47:02.388\" is malformed at \":47:02.388\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) (byte) -1);
        int int3 = localTime2.getMillisOfDay();
        org.joda.time.LocalTime localTime5 = localTime2.withMillisOfDay(679);
        int int6 = localTime2.getHourOfDay();
        org.joda.time.DateTime dateTime7 = localTime2.toDateTimeToday();
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime7.withYearOfCentury(422);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 422 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53238884 + "'", int3 == 53238884);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 14 + "'", int6 == 14);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = property6.withMaximumValue();
        java.util.Date date9 = localDateTime8.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withDayOfWeek(118);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 118 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Feb 22 23:59:59 UTC 2022");
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        int int13 = dateTime9.getMonthOfYear();
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology14.getZone();
        org.joda.time.Chronology chronology17 = chronology6.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = chronology6.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = chronology6.get(readablePeriod19, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        calendar8.set(224, 100, 73, 404, 403);
        int int18 = calendar8.getActualMinimum((int) (byte) 10);
        calendar8.setTimeInMillis(936L);
        // The following exception was thrown during execution in test generation
        try {
            calendar8.set(888, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 888");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 154 + "'", int2 == 154);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=936,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=936,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DurationField durationField3 = dateTimeField2.getDurationField();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        int[] intArray11 = new int[] { (byte) -1, (short) 100, (byte) -1, (byte) 100, (short) 0 };
        int[] intArray13 = dateTimeField2.add((org.joda.time.ReadablePartial) localDateTime4, 0, intArray11, 0);
        long long15 = dateTimeField2.roundCeiling((long) 118);
        org.joda.time.DurationField durationField16 = dateTimeField2.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusMinutes((int) (short) 0);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfMonth();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime25 = localTime23.plusSeconds((int) (byte) -1);
        int int26 = localTime25.getMillisOfDay();
        int[] intArray27 = localTime25.getValues();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.Chronology chronology31 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.eras();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.hourOfDay();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime37 = property36.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType38.getField(chronology39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime37.property(dateTimeFieldType38);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.plusYears(386);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime37.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.dayOfMonth();
        int int48 = localDateTime46.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.dayOfYear();
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str53 = property51.getAsShortText(locale52);
        java.lang.String str54 = dateTimeField34.getAsShortText((org.joda.time.ReadablePartial) localDateTime37, locale52);
        long long56 = dateTimeField34.roundCeiling((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime58 = localDateTime57.toDateTime();
        org.joda.time.Chronology chronology59 = localDateTime57.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.eras();
        org.joda.time.DateTimeField dateTimeField61 = chronology59.weekOfWeekyear();
        java.util.Locale locale63 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet64 = locale63.getExtensionKeys();
        java.lang.String str65 = dateTimeField61.getAsShortText((int) (byte) 100, locale63);
        int int66 = dateTimeField34.getMaximumShortTextLength(locale63);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray67 = dateTimeField2.set((org.joda.time.ReadablePartial) localDateTime20, 47, intArray27, "", locale63);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 100, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 118L + "'", long15 == 118L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53239215 + "'", int26 == 53239215);
        org.junit.Assert.assertNotNull(intArray27);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[14, 47, 19, 215]");
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 215 + "'", int48 == 215);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "83" + "'", str53, "83");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 3600000L + "'", long56 == 3600000L);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "100" + "'", str65, "100");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
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
        int int15 = localDate4.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType19.getField(chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime18.property(dateTimeFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localDate4.get(dateTimeFieldType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime4 = localDateTime3.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(4);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMillis(202);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime9, "fran\347ais", 53);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("14:47:16.492");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getDayOfMonth();
        boolean boolean11 = dateTime9.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        gregorianCalendar12.setMinimalDaysInFirstWeek(483);
        java.util.Locale locale17 = java.util.Locale.UK;
        java.util.Locale locale18 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.lang.String str20 = locale17.getDisplayLanguage(locale18);
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str22 = locale21.getDisplayCountry();
        java.lang.String str23 = locale18.getDisplayLanguage(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap24 = gregorianCalendar12.getDisplayNames(19, 0, locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(gregorianCalendar12);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u82f1\u6587" + "'", str20, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Taiwan" + "'", str22, "Taiwan");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587" + "'", str23, "\u4e2d\u6587");
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfMonth();
        int int6 = dateTime2.getMonthOfYear();
        org.joda.time.Chronology chronology7 = dateTime2.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.weekyears();
        org.joda.time.DateTimeZone dateTimeZone9 = chronology7.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) "year", dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"year\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusMillis(0);
        int int4 = localDateTime3.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withWeekOfWeekyear(558);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 558 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfHalfday();
        org.joda.time.DurationField durationField5 = chronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = chronology2.getDateTimeMillis(282, 53233784, 740, 403);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53233784 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfEvenCopy();
        java.lang.Class<?> wildcardClass7 = property5.getClass();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        long long9 = calendar8.getTimeInMillis();
        java.util.Date date11 = new java.util.Date((long) (byte) 1);
        int int12 = date11.getSeconds();
        calendar8.setTime(date11);
        java.lang.Object obj14 = calendar8.clone();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 117 + "'", int2 == 117);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645454841117L + "'", long9 == 1645454841117L);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
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
        org.joda.time.LocalDate localDate15 = localDate12.plusWeeks(14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int19 = localDate17.indexOf(dateTimeFieldType18);
        int int20 = localDate12.compareTo((org.joda.time.ReadablePartial) localDate17);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDate12.getValue(677);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 677");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withDefaultYear(47);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        int int12 = localDateTime10.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusWeeks(100);
        boolean boolean16 = localDateTime14.equals((java.lang.Object) "0");
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer9, (org.joda.time.ReadablePartial) localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 243 + "'", int12 == 243);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        calendar8.set(988, (int) (short) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = calendar8.getActualMinimum(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32769");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 260 + "'", int2 == 260);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=988,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=100,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=21,MILLISECOND=260,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        int int2 = dateTime1.getYearOfEra();
        boolean boolean4 = dateTime1.isAfter((long) (-1));
        int int5 = dateTime1.getSecondOfDay();
        int int6 = dateTime1.getMinuteOfDay();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2022 + "'", int2 == 2022);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53241 + "'", int5 == 53241);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 887 + "'", int6 == 887);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusYears(386);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute(773);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 773 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(53234486, 708, 389, 0, 564);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 564 for minuteOfHour must be in the range [0,59]");
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
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        int int12 = dateTime8.getMonthOfYear();
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.weekyears();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        int int20 = dateTime16.getMonthOfYear();
        org.joda.time.Chronology chronology21 = dateTime16.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.weekyears();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology21.getZone();
        org.joda.time.Chronology chronology24 = chronology13.withZone(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter6.withChronology(chronology24);
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = dateTimeFormatter6.getPrinter();
        org.joda.time.Chronology chronology27 = dateTimeFormatter6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter6.withZoneUTC();
        java.io.Writer writer29 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(0L, dateTimeZone31);
        org.joda.time.LocalDate localDate34 = localDate32.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(0L, dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate37.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDate localDate41 = localDate37.plus(readablePeriod40);
        org.joda.time.LocalDate localDate42 = localDate34.withFields((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.DateTime dateTime43 = localDate37.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter28.printTo(writer29, (org.joda.time.ReadableInstant) dateTime43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNull(dateTimePrinter26);
        org.junit.Assert.assertNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(dateTime43);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate2.plus(readablePeriod5);
        java.util.Date date7 = localDate6.toDate();
        date7.setSeconds(575);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:09:35 UTC 1970");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("14:47:18.691");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 14:47:18.691 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay((int) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMonths(0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withDayOfYear(629);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 629 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 750 + "'", int2 == 750);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay((int) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMonths(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMillis(155);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.year();
        org.joda.time.LocalDateTime localDateTime14 = property12.addToCopy(392);
        org.joda.time.LocalDateTime localDateTime16 = property12.addToCopy((long) 449);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withMinuteOfHour(148);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 148 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 878 + "'", int2 == 878);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 901 + "'", int2 == 901);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusSeconds(454);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant9);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant7.plus(readableDuration8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant12 = instant7.withDurationAdded(readableDuration10, 22);
        org.joda.time.Chronology chronology13 = instant7.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(437, 118, 53225018, 383, 669, 0, 92, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 383 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        calendar8.setLenient(true);
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        boolean boolean19 = dateTimeFormatter18.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = dateTimeFormatter18.getPrinter();
        boolean boolean21 = dateTimeFormatter18.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter18.withOffsetParsed();
        java.util.Locale locale23 = java.util.Locale.ITALY;
        java.lang.String str24 = locale23.getLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withLocale(locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = calendar8.getDisplayName(490, 82, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 156 + "'", int2 == 156);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454842156,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=22,MILLISECOND=156,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dateTimePrinter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "it" + "'", str24, "it");
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMillis((long) 386);
        org.joda.time.DateTime.Property property16 = dateTime15.hourOfDay();
        org.joda.time.DateTime dateTime18 = dateTime15.plusSeconds(13);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.dayOfMonth();
        int int21 = localDateTime19.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        int int25 = localDateTime23.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withField(dateTimeFieldType26, 11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = dateTime15.withField(dateTimeFieldType26, 53226219);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53226219 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 196 + "'", int21 == 196);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 22 + "'", int25 == 22);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes(468);
        org.joda.time.LocalDateTime localDateTime8 = dateTime5.toLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(0L, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(0L, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate16.plus(readablePeriod19);
        org.joda.time.LocalDate localDate21 = localDate13.withFields((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate16.minus(readablePeriod22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology25 = null;
        boolean boolean26 = durationFieldType24.isSupported(chronology25);
        boolean boolean27 = localDate16.isSupported(durationFieldType24);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDate16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime.Property property3 = localTime0.millisOfDay();
        org.joda.time.LocalTime localTime5 = property3.addNoWrapToCopy(468);
        org.joda.time.LocalTime localTime7 = property3.addWrapFieldToCopy(22);
        org.joda.time.LocalTime localTime8 = property3.roundHalfFloorCopy();
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str11 = locale10.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property3.setCopy("en-GB", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"en-GB\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Taiwan" + "'", str11, "Taiwan");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = chronology2.getDateTimeMillis((long) 717, 932, 23, 474, 32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 932 for hourOfDay must be in the range [0,23]");
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
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.util.Date date5 = dateMidnight4.toDate();
        boolean boolean7 = dateMidnight4.isAfter((long) 118);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime6 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) 781);
        int int9 = dateTime6.getMinuteOfHour();
        int int10 = dateTime6.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        int int12 = dateTime8.getMonthOfYear();
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.weekyears();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology13.getZone();
        java.lang.String str16 = dateTimeZone15.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(40, 740, (int) ' ', 790, 2000, 753, 960, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 790 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Etc/UTC" + "'", str16, "Etc/UTC");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        int int6 = dateTime1.getMonthOfYear();
        org.joda.time.DateTime dateTime8 = dateTime1.plusMonths(282);
        java.util.GregorianCalendar gregorianCalendar9 = dateTime8.toGregorianCalendar();
        org.joda.time.DateTime.Property property10 = dateTime8.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime8.withEra(597);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 597 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        org.joda.time.DateTime dateTime10 = property6.addWrapFieldToCopy((int) 'a');
        org.joda.time.DateTime dateTime11 = property6.getDateTime();
        boolean boolean13 = dateTime11.isBefore((long) 437);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime11.withSecondOfMinute(988);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 988 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        java.lang.String str1 = localTime0.toString();
        org.joda.time.Chronology chronology2 = localTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = dateTimeField3.set((long) 773, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for halfdayOfDay must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14:47:22.695" + "'", str1, "14:47:22.695");
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType9.getField(chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.property(dateTimeFieldType9);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plusYears(386);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = property22.getAsShortText(locale23);
        java.lang.String str25 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDateTime8, locale23);
        org.joda.time.LocalDateTime.Property property26 = localDateTime8.dayOfMonth();
        boolean boolean28 = localDateTime8.equals((java.lang.Object) 584);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime8.minus(readablePeriod29);
        java.lang.String str31 = localDateTime8.toString();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 737 + "'", int19 == 737);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "83" + "'", str24, "83");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2022-02-22T00:00:00.000" + "'", str31, "2022-02-22T00:00:00.000");
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = timeZone0.getDisplayName(true, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 869);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime1.withHourOfDay(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property2.setCopy(73);
        org.joda.time.tz.NameProvider nameProvider6 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider6);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.Chronology chronology10 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType17.getField(chronology18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime16.property(dateTimeFieldType17);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusYears(386);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime16.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfMonth();
        int int27 = localDateTime25.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfYear();
        java.util.Locale locale31 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str32 = property30.getAsShortText(locale31);
        java.lang.String str33 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime16, locale31);
        java.lang.String str36 = nameProvider6.getName(locale31, "14:47:11.830", "zh");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = localDate4.toString("2011-03-23T14:47:06.392", locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(nameProvider6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 859 + "'", int27 == 859);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "83" + "'", str32, "83");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime.Property property5 = dateTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = property5.setCopy("2022-02-21T14:47:12.368Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:47:12.368Z\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.clear(5);
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Locale locale15 = java.util.Locale.UK;
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.lang.String str18 = locale15.getDisplayLanguage(locale16);
        java.lang.String str19 = locale14.getDisplayVariant(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap20 = calendar8.getDisplayNames(202, 307, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 916 + "'", int2 == 916);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=?,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=22,MILLISECOND=916,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u82f1\u6587" + "'", str18, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate7.minus(readablePeriod13);
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtStartOfDay();
        java.lang.String str16 = localDate14.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDate14.getValue(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 31");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter2.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = dateTimeFormatter2.parseLocalTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimePrinter4);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 869);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str5 = dateTimeZone3.getNameKey((long) (short) -1);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime8 = dateTime6.plusSeconds(507);
        int int9 = property2.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.LocalTime localTime10 = property2.getLocalTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime10.minus(readablePeriod11);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        long long9 = calendar8.getTimeInMillis();
        calendar8.set(0, 386, (int) (short) 10);
        calendar8.set((int) (byte) 0, 0, 100, 345, 1970, 4);
        calendar8.setLenient(false);
        calendar8.setMinimalDaysInFirstWeek(32770);
        java.lang.String str25 = calendar8.toString();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 227 + "'", int2 == 227);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=32770,ERA=1,YEAR=0,MONTH=0,WEEK_OF_YEAR=16,WEEK_OF_MONTH=3,DAY_OF_MONTH=100,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=345,MINUTE=1970,SECOND=4,MILLISECOND=227,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645454843227L + "'", long9 == 1645454843227L);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=32770,ERA=1,YEAR=0,MONTH=0,WEEK_OF_YEAR=16,WEEK_OF_MONTH=3,DAY_OF_MONTH=100,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=345,MINUTE=1970,SECOND=4,MILLISECOND=227,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str25, "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=32770,ERA=1,YEAR=0,MONTH=0,WEEK_OF_YEAR=16,WEEK_OF_MONTH=3,DAY_OF_MONTH=100,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=345,MINUTE=1970,SECOND=4,MILLISECOND=227,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime8.plus((long) 32772);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime8.withMinuteOfHour(428);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 428 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(391, 677);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 391 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("00:00:00.000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = timeZone1.getDisplayName(false, 843);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 843");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        java.lang.String str9 = dateTimeField7.getAsShortText((long) 618);
        java.util.Locale locale14 = new java.util.Locale("Jan 1, 1970 12:00:00 AM", "83", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeField7.getAsText(899, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 899");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Jan" + "'", str9, "Jan");
        org.junit.Assert.assertEquals(locale14.toString(), "jan 1, 1970 12:00:00 am_83_hi!");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Etc/UTC" + "'", str5, "Etc/UTC");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) 1);
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        boolean boolean5 = dateTimeFormatter4.isParser();
        java.util.Locale locale6 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withLocale(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withDefaultYear(47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = localDateTime1.toString(dateTimeFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        org.joda.time.LocalDateTime localDateTime9 = property5.addWrapFieldToCopy(404);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks(20);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 393 + "'", int2 == 393);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("yearOfCentury");
        timeZone1.setRawOffset(873);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeZone1.getOffset(437, 53234486, 558, 137, 971, 737);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        java.lang.String str1 = localTime0.toString();
        org.joda.time.LocalTime.Property property2 = localTime0.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime5 = localDateTime4.toDateTime();
        org.joda.time.Chronology chronology6 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.Chronology chronology13 = localDateTime11.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType20.getField(chronology21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime19.property(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plusYears(386);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime19.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfMonth();
        int int30 = localDateTime28.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.dayOfYear();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str35 = property33.getAsShortText(locale34);
        java.lang.String str36 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) localDateTime19, locale34);
        java.lang.String str37 = locale34.getScript();
        java.lang.String str38 = dateTimeField9.getAsText((long) 366, locale34);
        java.lang.String str39 = locale34.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = localTime0.toString("Jan 1, 1970 12:00:00 AM", locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14:47:23.449" + "'", str1, "14:47:23.449");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 449 + "'", int30 == 449);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "83" + "'", str35, "83");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "366" + "'", str38, "366");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("minuteOfDay", "14:47:18.691");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: minuteOfDay [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        int int6 = localDateTime4.getSecondOfMinute();
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
        org.joda.time.LocalDate localDate21 = property20.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDate21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 473 + "'", int2 == 473);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 23 + "'", int6 == 23);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        int int7 = timeZone5.getOffset((long) 747);
        calendar0.setTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str11 = dateTimeZone9.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone12 = dateTimeZone9.toTimeZone();
        int int14 = timeZone12.getOffset(4L);
        java.lang.String str15 = timeZone12.getID();
        java.lang.String str16 = timeZone12.getID();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.Chronology chronology19 = localDateTime17.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.hourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType26.getField(chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime25.property(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plusYears(386);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime25.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfMonth();
        int int36 = localDateTime34.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfYear();
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str41 = property39.getAsShortText(locale40);
        java.lang.String str42 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) localDateTime25, locale40);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone12, locale40);
        calendar0.setTimeZone(timeZone12);
        int int45 = timeZone12.getDSTSavings();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645454843485,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=23,MILLISECOND=485,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Etc/UTC" + "'", str15, "Etc/UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Etc/UTC" + "'", str16, "Etc/UTC");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 486 + "'", int36 == 486);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "83" + "'", str41, "83");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertNotNull(calendar43);
// flaky:         org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=1645454843486,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=23,MILLISECOND=486,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusSeconds(454);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight8);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate11 = localDate7.plusMonths((-1));
        int int12 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(0L, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(0L, dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate20.plus(readablePeriod23);
        org.joda.time.LocalDate localDate25 = localDate17.withFields((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate20.minus(readablePeriod26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology29 = null;
        boolean boolean30 = durationFieldType28.isSupported(chronology29);
        boolean boolean31 = localDate20.isSupported(durationFieldType28);
        org.joda.time.LocalDate localDate32 = localDate2.withFields((org.joda.time.ReadablePartial) localDate20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate34 = localDate20.withDayOfMonth(873);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 873 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(localDate32);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter2.getPrinter();
        java.io.Writer writer5 = null;
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType9.getField(chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.property(dateTimeFieldType9);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plusYears(386);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.monthOfYear();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withSecondOfMinute(12);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime14);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer5, (org.joda.time.ReadablePartial) localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfEvenCopy();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime10 = dateTime7.withFieldAdded(durationFieldType8, 781);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime7.withDayOfYear(706);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 706 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        int int12 = dateTime8.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int14 = dateTime8.get(dateTimeFieldType13);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.Chronology chronology17 = localDateTime15.getChronology();
        boolean boolean18 = dateTimeFieldType13.isSupported(chronology17);
        org.joda.time.DurationField durationField19 = chronology17.millis();
        org.joda.time.Chronology chronology20 = chronology17.withUTC();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(403, 830, 53233784, 851, 345, 462, 924, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 851 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField4 = localDateTime0.getField(499);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 499");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 793 + "'", int2 == 793);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(403, 7, 897, 913);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 403 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        int int6 = localDateTime4.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withField(dateTimeFieldType7, 11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField11 = localDateTime4.getField(677);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 677");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 844 + "'", int2 == 844);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 23 + "'", int6 == 23);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime4 = localDateTime3.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property7 = dateTime4.dayOfMonth();
        int int8 = dateTime4.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int10 = dateTime4.get(dateTimeFieldType9);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.Chronology chronology13 = localDateTime11.getChronology();
        boolean boolean14 = dateTimeFieldType9.isSupported(chronology13);
        org.joda.time.DurationField durationField15 = chronology13.millis();
        org.joda.time.Chronology chronology16 = chronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(939, 53, (int) (short) 10, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(278, 694, 869, 53225018);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 278 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DateTime dateTime9 = dateTime1.withDurationAdded((long) 7, 128);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime9.withDate(733, 60922, 449);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 60922 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType9.getField(chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.property(dateTimeFieldType9);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plusYears(386);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = property22.getAsShortText(locale23);
        java.lang.String str25 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDateTime8, locale23);
        org.joda.time.LocalDateTime.Property property26 = localDateTime8.dayOfMonth();
        boolean boolean28 = localDateTime8.equals((java.lang.Object) 584);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime8.minus(readablePeriod29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withEra(336);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 336 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 107 + "'", int19 == 107);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "83" + "'", str24, "83");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMinutes(53221444);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property5.setCopy(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 124 + "'", int2 == 124);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        long long9 = calendar8.getTimeInMillis();
        calendar8.set(0, 386, (int) (short) 10);
        calendar8.set((int) (byte) 0, 0, 100, 345, 1970, 4);
        calendar8.setLenient(false);
        calendar8.setMinimalDaysInFirstWeek(32770);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: YEAR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 166 + "'", int2 == 166);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=32770,ERA=1,YEAR=0,MONTH=0,WEEK_OF_YEAR=16,WEEK_OF_MONTH=3,DAY_OF_MONTH=100,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=345,MINUTE=1970,SECOND=4,MILLISECOND=167,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645454844167L + "'", long9 == 1645454844167L);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DurationField durationField3 = dateTimeField2.getDurationField();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        int[] intArray11 = new int[] { (byte) -1, (short) 100, (byte) -1, (byte) 100, (short) 0 };
        int[] intArray13 = dateTimeField2.add((org.joda.time.ReadablePartial) localDateTime4, 0, intArray11, 0);
        long long15 = dateTimeField2.roundHalfEven((long) 936);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(0L, dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(0L, dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate27 = localDate23.plusMonths((-1));
        int int28 = localDate18.compareTo((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.DateMidnight dateMidnight29 = localDate18.toDateMidnight();
        org.joda.time.LocalDate localDate31 = localDate18.plusMonths((int) 'u');
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime34 = localDateTime33.toDateTime();
        int[] intArray35 = localDateTime33.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray37 = dateTimeField2.add((org.joda.time.ReadablePartial) localDate31, 53233700, intArray35, 468);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53233700");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 100, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 936L + "'", long15 == 936L);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(intArray35);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[2022, 2, 21, 53244256]");
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(468);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("2022-02-21T14:47:12.368Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-21T14:47:12.368Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        int int12 = dateTime8.getMonthOfYear();
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.weekyears();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        int int20 = dateTime16.getMonthOfYear();
        org.joda.time.Chronology chronology21 = dateTime16.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.weekyears();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology21.getZone();
        org.joda.time.Chronology chronology24 = chronology13.withZone(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter6.withChronology(chronology24);
        boolean boolean26 = dateTimeFormatter25.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime28 = dateTimeFormatter25.parseLocalTime("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.plus(readableDuration7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant6.withDurationAdded(readableDuration9, 22);
        org.joda.time.Chronology chronology12 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(366, 40, 125, 899, 15, 343, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 899 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMinutes(53221444);
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localDateTime4.toString("minuteOfDay", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 545 + "'", int2 == 545);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.format.DateTimeFormatter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getDayOfMonth();
        boolean boolean11 = dateTime9.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds(53221444);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime14.withTime(888, 737, 32769, 788);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 888 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(gregorianCalendar12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (short) 0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(0L, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate16 = localDate12.plusMonths((-1));
        int int17 = localDate7.compareTo((org.joda.time.ReadablePartial) localDate12);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDate7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = chronology2.get(readablePeriod5, (long) 316);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusYears(386);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.minusWeeks(404);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        boolean boolean14 = dateTimeFormatter13.isParser();
        java.util.Locale locale15 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withLocale(locale15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfMonth();
        int int23 = dateTime19.getMonthOfYear();
        org.joda.time.Chronology chronology24 = dateTime19.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.weekyears();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime27 = localDateTime26.toDateTime();
        org.joda.time.DateTime dateTime29 = dateTime27.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property30 = dateTime27.dayOfMonth();
        int int31 = dateTime27.getMonthOfYear();
        org.joda.time.Chronology chronology32 = dateTime27.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.weekyears();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology32.getZone();
        org.joda.time.Chronology chronology35 = chronology24.withZone(dateTimeZone34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter17.withChronology(chronology35);
        boolean boolean37 = dateTimeFormatter36.isOffsetParsed();
        org.joda.time.Chronology chronology38 = dateTimeFormatter36.getChronolgy();
        boolean boolean39 = localDateTime10.equals((java.lang.Object) chronology38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField41 = localDateTime10.getField(642);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 642");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate7.minus(readablePeriod13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate7.withDayOfMonth(781);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 781 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        java.lang.String str9 = dateTimeField7.getAsShortText((long) 618);
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.lang.String str15 = locale12.getDisplayLanguage(locale13);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeField7.set(0L, "14:47:15.786", locale12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"14:47:15.786\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Jan" + "'", str9, "Jan");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u82f1\u6587" + "'", str15, "\u82f1\u6587");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusYears(386);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.minusWeeks(404);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime2.plus(readablePeriod11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime2.withDayOfYear(924);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 924 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DurationField durationField3 = dateTimeField2.getDurationField();
        org.joda.time.DurationField durationField4 = dateTimeField2.getLeapDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = dateTimeField2.set((long) 82, "United Kingdom");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"United Kingdom\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNull(durationField4);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime10 = property6.setCopy(1);
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(199);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 199 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.DateTimeZone dateTimeZone8 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.centuryOfEra();
        java.lang.String str12 = dateTimeField10.getAsShortText((long) 206);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "19" + "'", str12, "19");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        java.lang.String str1 = localTime0.toString();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime0.plus(readablePeriod2);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfDay();
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.lang.String str7 = localTime3.toString("14:47:05.528", locale6);
        int int8 = localTime3.getMinuteOfHour();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField(chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.property(dateTimeFieldType13);
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime18 = dateTime9.withFields((org.joda.time.ReadablePartial) localDateTime17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = localTime3.isEqual((org.joda.time.ReadablePartial) localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00:00:00.000" + "'", str1, "00:00:00.000");
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "14:47:05.528" + "'", str7, "14:47:05.528");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Chronology chronology3 = instant0.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.era();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = dateTimeField4.set((long) 708, "year");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"year\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        int int6 = dateTime5.getMonthOfYear();
        int int7 = dateTime5.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        boolean boolean23 = dateTimeZone16.isLocalDateTimeGap(localDateTime21);
        org.joda.time.DateTime dateTime24 = dateTime11.toDateTime(dateTimeZone16);
        java.lang.String str25 = dateTimeZone16.toString();
        org.joda.time.DateTime dateTime26 = dateTime5.withZoneRetainFields(dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = dateTime5.withTime(89, 3, 574, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 89 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 307 + "'", int19 == 307);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Etc/UTC" + "'", str25, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 790);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTimeISO();
        int int5 = mutableDateTime4.getMillisOfSecond();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 790 + "'", int5 == 790);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.UK;
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale6.getDisplayLanguage(locale7);
        java.lang.String str10 = locale5.getDisplayVariant(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = dateTimeFormatter11.parseLocalTime("2022-02-21T14:10:09.170");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u6587" + "'", str9, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setRegion("20");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 20 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        java.lang.String str1 = localTime0.toString();
        org.joda.time.Chronology chronology2 = localTime0.getChronology();
        org.joda.time.LocalTime.Property property3 = localTime0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(0L, dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(0L, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate11.plus(readablePeriod14);
        org.joda.time.LocalDate localDate16 = localDate8.withFields((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.LocalDate.Property property17 = localDate16.year();
        org.joda.time.LocalDate localDate19 = localDate16.plusWeeks(14);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int23 = localDate21.indexOf(dateTimeFieldType22);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray24 = localDate21.getFieldTypes();
        org.joda.time.LocalDate.Property property25 = localDate21.yearOfEra();
        org.joda.time.LocalDate localDate26 = property25.roundFloorCopy();
        boolean boolean27 = localDate19.isBefore((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean29 = localDate19.isSupported(dateTimeFieldType28);
        org.joda.time.LocalDate localDate31 = localDate19.minusDays(992);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = localTime0.compareTo((org.joda.time.ReadablePartial) localDate19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14:47:25.731" + "'", str1, "14:47:25.731");
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(localDate31);
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
        org.joda.time.LocalDate.Property property13 = localDate12.year();
        org.joda.time.LocalDate localDate15 = localDate12.plusWeeks(14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int19 = localDate17.indexOf(dateTimeFieldType18);
        int int20 = localDate12.compareTo((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.ReadablePartial readablePartial21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDate17.compareTo(readablePartial21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime.Property property3 = localTime0.millisOfDay();
        org.joda.time.LocalTime localTime5 = property3.addNoWrapToCopy(468);
        org.joda.time.LocalTime localTime7 = property3.addWrapFieldToCopy(22);
        org.joda.time.LocalTime.Property property8 = localTime7.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localTime7.getValue(282);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 282");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = localDate5.indexOf(dateTimeFieldType6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localDate5.getFieldTypes();
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfEra();
        org.joda.time.LocalDate localDate10 = property9.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = localDate10.toDateTimeAtStartOfDay();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant12.plus(readableDuration13);
        org.joda.time.Chronology chronology15 = instant12.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str19 = dateTimeZone17.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone20 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.Chronology chronology22 = chronology15.withZone(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = dateTime11.toDateTime(chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(75, 32769, 817, 472, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 75 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(timeZone20);
// flaky:         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.UK;
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale6.getDisplayLanguage(locale7);
        java.lang.String str10 = locale5.getDisplayVariant(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withLocale(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withDefaultYear(501);
        java.lang.Appendable appendable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(appendable14, (long) 122);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u6587" + "'", str9, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) (byte) -1);
        org.joda.time.DateTime dateTime3 = localTime2.toDateTimeToday();
        java.util.Locale locale5 = java.util.Locale.UK;
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = localTime2.toString("83", locale5);
        java.lang.String str8 = locale5.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale5.getUnicodeLocaleType("2011-03-23T14:47:23.549");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 2011-03-23T14:47:23.549");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Royaume-Uni" + "'", str6, "Royaume-Uni");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime7 = property5.roundHalfCeilingCopy();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property5.getAsShortText(locale8);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 113 + "'", int2 == 113);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ap. J.-C." + "'", str9, "ap. J.-C.");
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        java.util.Date date13 = localDate7.toDate();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone17 = dateTimeZone14.toTimeZone();
        java.lang.String str19 = dateTimeZone14.getName((long) (short) -1);
        org.joda.time.DateTime dateTime20 = localDate7.toDateTimeAtStartOfDay(dateTimeZone14);
        org.joda.time.LocalDate localDate22 = localDate7.plusMonths(53225);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate24 = localDate22.withDayOfWeek(292269054);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292269054 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int6 = localDateTime0.get(dateTimeFieldType5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.weekyear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime0.withDayOfMonth(137);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 137 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 136 + "'", int2 == 136);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType9.getField(chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.property(dateTimeFieldType9);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plusYears(386);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = property22.getAsShortText(locale23);
        java.lang.String str25 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDateTime8, locale23);
        org.joda.time.LocalDateTime.Property property26 = localDateTime8.dayOfMonth();
        java.util.Date date27 = localDateTime8.toDate();
        int int28 = localDateTime8.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime8.plusSeconds(437);
        java.lang.String str31 = localDateTime8.toString();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 174 + "'", int19 == 174);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "83" + "'", str24, "83");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Feb 22 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 22 + "'", int28 == 22);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2022-02-22T00:00:00.000" + "'", str31, "2022-02-22T00:00:00.000");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfMonth();
        int int4 = localDateTime2.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 2022, dateTimeZone1);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(96);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 213 + "'", int4 == 213);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(282);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
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
        org.joda.time.LocalDate localDate14 = property13.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate16 = property13.addWrapFieldToCopy(53225018);
        java.util.Locale locale17 = java.util.Locale.ROOT;
        java.lang.String str18 = property13.getAsText(locale17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = property13.setCopy("26 Mar 1970 06:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"26 Mar 1970 06:00:00 GMT\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970" + "'", str18, "1970");
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate12.withWeekOfWeekyear(747);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 747 for weekOfWeekyear must be in the range [1,53]");
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
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        long long9 = calendar8.getTimeInMillis();
        calendar8.set(0, 386, (int) (short) 10);
        calendar8.set((int) (byte) 0, 0, 100, 345, 1970, 4);
        boolean boolean21 = calendar8.isLenient();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 352 + "'", int2 == 352);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=0,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=100,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=345,MINUTE=1970,SECOND=4,MILLISECOND=352,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645454846352L + "'", long9 == 1645454846352L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime6 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) 1015);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime6.withMonthOfYear(2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setTimeInMillis((long) 69);
        java.util.Date date12 = new java.util.Date((long) (byte) 1);
        date12.setMonth((int) (byte) -1);
        calendar8.setTime(date12);
        int int16 = calendar8.getMinimalDaysInFirstWeek();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusMinutes(53221444);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime24 = property22.addWrapFieldToCopy(0);
        org.joda.time.LocalDateTime localDateTime25 = property22.roundHalfEvenCopy();
        boolean boolean26 = calendar8.equals((java.lang.Object) property22);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 636 + "'", int2 == 636);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=-2678399999,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=335,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date12.toString(), "Mon Dec 01 00:00:00 UTC 1969");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 637 + "'", int19 == 637);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear(265);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeFormatter7.parseMillis("en-GB");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = property6.withMaximumValue();
        org.joda.time.DurationField durationField9 = property6.getRangeDurationField();
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str11 = locale10.getDisplayCountry();
        boolean boolean12 = property6.equals((java.lang.Object) locale10);
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.lang.String str15 = locale14.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = property6.setCopy("", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Taiwan" + "'", str11, "Taiwan");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMinutes(53221444);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField7 = localDateTime4.getField(960);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 960");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 754 + "'", int2 == 754);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusYears(386);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusHours(165);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusSeconds(202);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField(874);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 874");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        boolean boolean6 = localDateTime4.equals((java.lang.Object) "0");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withField(dateTimeFieldType7, 12);
        int int10 = localDateTime4.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime16 = dateTime14.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.withZone(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfMonth();
        int int22 = localDateTime20.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        boolean boolean26 = dateTimeZone19.isLocalDateTimeGap(localDateTime24);
        org.joda.time.DateTime dateTime27 = dateTime14.toDateTime(dateTimeZone19);
        java.lang.String str28 = dateTimeZone19.toString();
        boolean boolean29 = localDateTime4.equals((java.lang.Object) dateTimeZone19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = localDateTime4.withDayOfWeek(206);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 206 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 813 + "'", int2 == 813);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 813 + "'", int10 == 813);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 813 + "'", int22 == 813);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Etc/UTC" + "'", str28, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Chronology chronology3 = instant0.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.era();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str7 = dateTimeZone5.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone8 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.Chronology chronology10 = chronology3.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfHour();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2022-02-21T14:10:07.824");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T14:10:07.824\" is malformed at \"T14:10:07.824\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("2022-02-21T14:10:24.180", "Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 2022-02-21T14:10:24.180 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isParser();
        java.util.Locale locale5 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withLocale(locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withOffsetParsed();
        java.lang.Integer int8 = dateTimeFormatter7.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withPivotYear(630);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.parse("130", dateTimeFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) (byte) -1);
        org.joda.time.DateTime dateTime3 = localTime2.toDateTimeToday();
        java.util.Locale locale5 = java.util.Locale.UK;
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = localTime2.toString("83", locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime2.withMinuteOfHour((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Royaume-Uni" + "'", str6, "Royaume-Uni");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("01-Jan-1970 00:00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"01-Jan-1970 00:00:00\" is malformed at \"-Jan-1970 00:00:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguage("83");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 83 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 869);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = localTime1.plusMillis(14);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str6 = dateTimeFieldType5.toString();
        java.lang.String str7 = dateTimeFieldType5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime1.withField(dateTimeFieldType5, 898);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 898 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "minuteOfHour" + "'", str6, "minuteOfHour");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "minuteOfHour" + "'", str7, "minuteOfHour");
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        calendar8.set(224, 100, 73, 404, 403);
        int int18 = calendar8.getActualMinimum((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = calendar8.getTimeInMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 576 + "'", int2 == 576);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=224,MONTH=100,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=73,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=404,MINUTE=403,SECOND=27,MILLISECOND=576,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        int int7 = timeZone5.getOffset((long) 747);
        calendar0.setTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str11 = dateTimeZone9.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone12 = dateTimeZone9.toTimeZone();
        int int14 = timeZone12.getOffset(4L);
        java.lang.String str15 = timeZone12.getID();
        java.lang.String str16 = timeZone12.getID();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.Chronology chronology19 = localDateTime17.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.hourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType26.getField(chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime25.property(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plusYears(386);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime25.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfMonth();
        int int36 = localDateTime34.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfYear();
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str41 = property39.getAsShortText(locale40);
        java.lang.String str42 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) localDateTime25, locale40);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone12, locale40);
        calendar0.setTimeZone(timeZone12);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.set(817, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 817");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645454847588,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=27,MILLISECOND=588,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Etc/UTC" + "'", str15, "Etc/UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Etc/UTC" + "'", str16, "Etc/UTC");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 588 + "'", int36 == 588);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "83" + "'", str41, "83");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertNotNull(calendar43);
// flaky:         org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=1645454847589,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=27,MILLISECOND=589,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.UK;
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale6.getDisplayLanguage(locale7);
        java.lang.String str10 = locale5.getDisplayVariant(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withLocale(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withDefaultYear(501);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = dateTimeFormatter13.parseMutableDateTime("2022-02-21T14:10:08.924");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u6587" + "'", str9, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        long long9 = calendar8.getTimeInMillis();
        java.util.Date date11 = new java.util.Date((long) (byte) 1);
        int int12 = date11.getSeconds();
        calendar8.setTime(date11);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfMonth();
        int int16 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfYear();
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str21 = property19.getAsShortText(locale20);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(locale20);
        long long23 = calendar22.getTimeInMillis();
        boolean boolean24 = calendar8.before((java.lang.Object) long23);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = calendar8.getMinimum((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 658 + "'", int2 == 658);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645454847658L + "'", long9 == 1645454847658L);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 658 + "'", int16 == 658);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "83" + "'", str21, "83");
        org.junit.Assert.assertNotNull(calendar22);
// flaky:         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=1645454847658,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=27,MILLISECOND=658,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1645454847658L + "'", long23 == 1645454847658L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        calendar8.set(988, (int) (short) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = calendar8.getTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 724 + "'", int2 == 724);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=988,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=100,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=27,MILLISECOND=725,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withCenturyOfEra(1970);
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime16.withTime(7, 0, 69, 830);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 760 + "'", int2 == 760);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "83" + "'", str7, "83");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454847760,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=27,MILLISECOND=760,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        int int6 = localDateTime4.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withField(dateTimeFieldType7, 11);
        java.lang.String str10 = localDateTime9.toString();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plus(readableDuration11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withTime(268, 53, 27, 817);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 268 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 873 + "'", int2 == 873);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2011-03-23T14:47:27.873" + "'", str10, "2011-03-23T14:47:27.873");
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(224, 817, 403, 403);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 224 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        int int7 = dateTimeFormatter6.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 679);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfMonth();
        int int15 = localDateTime13.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        boolean boolean19 = dateTimeZone12.isLocalDateTimeGap(localDateTime17);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 2022, dateTimeZone12);
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter10.withZone(dateTimeZone12);
        org.joda.time.Chronology chronology23 = dateTimeFormatter10.getChronology();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.withMinuteOfHour(10);
        boolean boolean28 = dateTime27.isAfterNow();
        int int29 = dateTime27.getYearOfEra();
        org.joda.time.DateTime dateTime31 = dateTime27.plusMinutes(52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = dateTimeFormatter10.print((org.joda.time.ReadableInstant) dateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 944 + "'", int15 == 944);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNull(chronology23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfDay();
        org.joda.time.DurationField durationField7 = chronology4.months();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(0L, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = localDate10.toDateMidnight(dateTimeZone11);
        java.lang.String str13 = dateMidnight12.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = dateMidnight12.toDateTime(dateTimeZone14);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((java.lang.Object) durationField7, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str13, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "United Kingdom" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.FilteringMode filteringMode10 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode10);
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "United Kingdom" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.Locale.FilteringMode filteringMode20 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList18, filteringMode20);
        java.util.stream.Stream<java.lang.String> strStream22 = strList21.stream();
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str26 = dateTimeZone24.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone27 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.lang.String str29 = dateTimeZone28.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) languageRangeList1, dateTimeZone28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.ArrayList");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + filteringMode10 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode10.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + filteringMode20 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode20.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strStream22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertNotNull(timeZone27);
// flaky:         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Etc/UTC" + "'", str29, "Etc/UTC");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate6 = localDate2.plusMonths((-1));
        org.joda.time.LocalDate.Property property7 = localDate6.dayOfWeek();
        org.joda.time.LocalDate.Property property8 = localDate6.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property8.setCopy("ap. J.-C.");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ap. J.-C.\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }
}
