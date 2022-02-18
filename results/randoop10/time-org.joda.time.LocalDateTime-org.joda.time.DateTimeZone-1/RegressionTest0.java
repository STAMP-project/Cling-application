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
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) 'a', (int) (short) 1, 0, (int) 'a', (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        long long6 = java.util.Date.UTC((-1), (int) '4', 1, 1, 0, 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2104009200000L) + "'", long6 == (-2104009200000L));
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (byte) 0, (int) 'a', (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
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
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale0.getExtension('a');
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale0.getUnicodeLocaleType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
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
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
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
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale0.getExtension('a');
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        java.lang.Object obj4 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "zh_TW");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDate1.get(dateTimeFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType7 = localDate1.getFieldType(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate5.withField(dateTimeFieldType6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
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
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
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
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) (byte) -1, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale0.getExtension('a');
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime7 = localTime4.toDateTimeToday(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDate1.compareTo((org.joda.time.ReadablePartial) localTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime9 = localTime6.toDateTimeToday(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = localDate1.isBefore((org.joda.time.ReadablePartial) localTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology7);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean10 = localTime8.isSupported(durationFieldType9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime8.minus(readablePeriod11);
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localTime12, (int) (short) -1, locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = timeZone0.getDisplayName(true, (int) (byte) 100, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime5 = localTime2.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime5.getZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTime5.toString("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate4.minus(readablePeriod5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        java.util.Locale locale9 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str11 = locale9.getExtension('a');
        java.util.Set<java.lang.String> strSet12 = locale9.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localDate6, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(19);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
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
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        int int3 = timeZone0.getOffset((-2104009200000L));
        int int4 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDate5.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withTime((int) (byte) 10, (int) (short) 100, 32772, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate4.minus(readablePeriod5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readablePeriod9);
        org.joda.time.DateTime.Property property11 = dateTime10.year();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str13 = property11.getAsShortText(locale12);
        java.lang.String str14 = locale12.getVariant();
        java.lang.String str15 = timeZone0.getDisplayName(locale12);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572928886,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=48,MILLISECOND=886,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022" + "'", str13, "2022");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u5354\u8abf\u4e16\u754c\u6642\u9593" + "'", str15, "\u5354\u8abf\u4e16\u754c\u6642\u9593");
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        int int14 = dateTimeField2.getMinimumValue(0L);
        org.joda.time.DurationField durationField15 = dateTimeField2.getLeapDurationField();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate17.minus(readablePeriod18);
        org.joda.time.LocalDate localDate21 = localDate17.plusMonths((int) (byte) 0);
        int[] intArray25 = new int[] { 6, '4' };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = dateTimeField2.addWrapField((org.joda.time.ReadablePartial) localDate21, (int) (byte) 100, intArray25, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(durationField15);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[6, 52]");
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) ' ', 70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType(32772);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32772");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = chronology9.get(readablePeriod11, (long) 0, (long) 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfDay(5);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime5.withMinuteOfHour((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        int int14 = dateTimeField2.getMinimumValue(0L);
        long long17 = dateTimeField2.getDifferenceAsLong((long) (short) -1, (long) (byte) 0);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1, chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.year();
        int int24 = localDateTime22.getYearOfCentury();
        int[] intArray26 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = dateTimeField2.set((org.joda.time.ReadablePartial) localDateTime22, 4, intArray26, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 70 + "'", int24 == 70);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDateTime2.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate1.withDayOfMonth(32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean11 = localTime9.isSupported(durationFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime9.minus(readablePeriod12);
        org.joda.time.LocalTime localTime15 = localTime9.plusSeconds(9);
        org.joda.time.Chronology chronology16 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((int) (short) 0, (int) ' ', 7, (int) ' ', (int) (short) 0, (int) 'a', (int) '#', chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setScript("2022");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 2022 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMonthOfYear(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) '4', 2022, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("2022-02-11");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        int int5 = localDateTime4.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField7 = localDateTime4.getField((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plusHours((int) '4');
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime12.plus(readablePeriod13);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.lang.String str16 = timeZone15.getID();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone15);
        boolean boolean18 = localTime14.equals((java.lang.Object) calendar17);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Etc/UTC" + "'", str16, "Etc/UTC");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1644572929728,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=49,MILLISECOND=728,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        int[] intArray16 = new int[] { 22, 6, (short) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            chronology9.validate((org.joda.time.ReadablePartial) localDate11, intArray16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must not be larger than 31");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[22, 6, 100, 1]");
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology10.add(readablePeriod11, (-2L), 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) "Etc/UTC", chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Etc/UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2L) + "'", long14 == (-2L));
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.DateTime.Property property10 = dateTime5.secondOfDay();
        org.joda.time.DurationField durationField11 = property10.getDurationField();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean16 = localTime14.isSupported(durationFieldType15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime18 = localTime14.minus(readablePeriod17);
        org.joda.time.LocalTime localTime20 = localTime14.plusSeconds(9);
        org.joda.time.Chronology chronology21 = localTime14.getChronology();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(chronology21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) durationField11, chronology21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean9 = localTime7.isSupported(durationFieldType8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime7.minus(readablePeriod10);
        org.joda.time.LocalTime localTime13 = localTime7.plusSeconds(9);
        org.joda.time.Chronology chronology14 = localTime7.getChronology();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology14.add(readablePeriod15, (-2L), 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(100, (-292275054), (int) 'a', 0, (int) (short) 100, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-2L) + "'", long18 == (-2L));
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.plus(readablePeriod3);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.lang.String str6 = timeZone5.getID();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone5);
        boolean boolean8 = localTime4.equals((java.lang.Object) calendar7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime4.withMinuteOfHour((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Etc/UTC" + "'", str6, "Etc/UTC");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1644572930077,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=50,MILLISECOND=77,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.LocalTime.Property property15 = localTime9.hourOfDay();
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = property15.setCopy("zh_TW", locale17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"zh_TW\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00:00:00.000" + "'", str13, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
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
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        org.joda.time.DurationField durationField13 = dateTimeField2.getRangeDurationField();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate15.withWeekyear(7);
        org.joda.time.LocalDate localDate21 = localDate19.withWeekOfWeekyear(9);
        int[] intArray24 = new int[] { (-292275054) };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = dateTimeField2.add((org.joda.time.ReadablePartial) localDate21, (int) 'a', intArray24, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-292275054]");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime6 = localTime3.toDateTimeToday(dateTimeZone5);
        int int8 = dateTimeZone5.getOffset((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) ' ', dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str1 = locale0.getDisplayScript();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean4 = locale0.equals((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("+00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.clear();
        java.lang.Object obj3 = calendar1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = calendar1.isSet((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property5.setCopy("hi!", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate14 = localDate9.withFieldAdded(durationFieldType12, (int) (short) 0);
        org.joda.time.LocalDate.Property property15 = localDate9.year();
        org.joda.time.LocalDate localDate16 = property15.roundCeilingCopy();
        boolean boolean17 = calendar1.equals((java.lang.Object) localDate16);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        boolean boolean2 = calendar1.isLenient();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572931366,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=51,MILLISECOND=366,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long9 = dateTimeZone6.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str11 = dateTimeZone6.getNameKey(100L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(11, 3, (int) (short) 100, 20, (int) (short) 1, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-2L) + "'", long9 == (-2L));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.set((int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("2022-02-11", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withEra(13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.DurationField durationField7 = property6.getRangeDurationField();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1, chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfDay((int) (byte) 10);
        int int13 = localDateTime12.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField15 = localDateTime12.getField((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.plusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withYearOfCentury((int) (short) 0);
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = property6.getDifference((org.joda.time.ReadableInstant) dateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3853339199");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.LocalTime.Property property15 = localTime9.hourOfDay();
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str19 = locale17.getExtension('a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = property15.setCopy("Property[year]", locale17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[year]\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00:00:00.000" + "'", str13, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        int int14 = dateTimeField2.getMinimumValue(0L);
        org.joda.time.DurationField durationField15 = dateTimeField2.getLeapDurationField();
        java.util.Locale locale16 = null;
        int int17 = dateTimeField2.getMaximumTextLength(locale16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate21 = localDate19.plus(readablePeriod20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtMidnight(dateTimeZone24);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate28 = localDate23.withFieldAdded(durationFieldType26, (int) (short) 0);
        org.joda.time.LocalDate localDate30 = localDate21.withFieldAdded(durationFieldType26, 19);
        int[] intArray33 = new int[] { (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = dateTimeField2.addWrapPartial((org.joda.time.ReadablePartial) localDate30, 4, intArray33, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(durationField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100]");
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType5.getField(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean12 = localTime10.isSupported(durationFieldType11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = dateTimeField7.getAsShortText((org.joda.time.ReadablePartial) localTime14, (int) (short) -1, locale16);
        int int19 = dateTimeField7.getMinimumValue(0L);
        long long22 = dateTimeField7.getDifferenceAsLong((long) (short) -1, (long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology28);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean31 = localTime29.isSupported(durationFieldType30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime33 = localTime29.minus(readablePeriod32);
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.lang.String str36 = dateTimeField26.getAsShortText((org.joda.time.ReadablePartial) localTime33, (int) (short) -1, locale35);
        java.lang.String str37 = dateTimeField7.getAsShortText((long) (short) -1, locale35);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = dateTimeField2.set((long) 20, "Property[year]", locale35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[year]\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-1" + "'", str36, "-1");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "999" + "'", str37, "999");
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.LocalTime localTime11 = localTime2.minusMinutes(19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField13 = localTime2.getField((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        java.util.TimeZone timeZone8 = calendar1.getTimeZone();
        java.lang.String str9 = calendar1.getCalendarType();
        // The following exception was thrown during execution in test generation
        try {
            calendar1.add(19, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "gregory" + "'", str9, "gregory");
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.LocalTime localTime11 = localTime2.minusMinutes(19);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean16 = localTime14.isSupported(durationFieldType15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = localTime2.withFieldAdded(durationFieldType15, 32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyears' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        int int3 = timeZone0.getOffset((-2104009200000L));
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeZone0.getOffset(13, 10, (int) (byte) 0, 13, 6, 32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hourOfDay", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=32.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.LocalTime localTime11 = localTime2.minusMinutes(19);
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localTime11.compareTo(readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime9.minuteOfDay();
        java.lang.Class<?> wildcardClass15 = dateTime9.getClass();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime5 = localTime2.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str10 = dateTimeZone8.getShortName((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((java.lang.Object) property6, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap12 = calendar1.getDisplayNames((int) (byte) -1, 10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        java.util.TimeZone timeZone8 = calendar1.getTimeZone();
        calendar1.clear();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = calendar1.getDisplayName((int) (byte) 100, 100, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean9 = localTime7.isSupported(durationFieldType8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime7.minus(readablePeriod10);
        org.joda.time.LocalTime localTime13 = localTime7.plusSeconds(9);
        org.joda.time.Chronology chronology14 = localTime7.getChronology();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology14.add(readablePeriod15, (-2L), 1);
        long long22 = chronology14.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((int) (byte) 0, (-292275054), 100, (int) 'x', 0, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-2L) + "'", long18 == (-2L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 20L + "'", long22 == 20L);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        int int5 = localDateTime4.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField7 = localDateTime4.getField((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plusHours((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField11 = localDateTime9.getField((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType2 = localDate0.getFieldType(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long19 = dateTimeZone16.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str21 = dateTimeZone16.getNameKey(100L);
        org.joda.time.DateTime dateTime22 = dateTime13.withZoneRetainFields(dateTimeZone16);
        boolean boolean23 = dateTime22.isAfterNow();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = dateTime22.withWeekOfWeekyear((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-2L) + "'", long19 == (-2L));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime13.withEra((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localDateTime2.getField(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 14");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfHour();
        int int12 = dateTimeField10.getLeapAmount((long) 10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1, chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.year();
        int int19 = localDateTime17.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime21 = property20.withMinimumValue();
        int int22 = localDateTime21.getEra();
        int[] intArray28 = new int[] { 1, 7, ' ', 'x' };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = dateTimeField10.set((org.joda.time.ReadablePartial) localDateTime21, (int) (byte) 10, intArray28, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 70 + "'", int19 == 70);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 7, 32, 120]");
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology9.add(readablePeriod10, (-2L), 1);
        long long17 = chronology9.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTimeZone dateTimeZone18 = chronology9.getZone();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime23 = localTime21.plus(readablePeriod22);
        int[] intArray25 = new int[] { 5 };
        // The following exception was thrown during execution in test generation
        try {
            chronology9.validate((org.joda.time.ReadablePartial) localTime21, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2L) + "'", long13 == (-2L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 20L + "'", long17 == 20L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[5]");
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(4, 4, 13, 100, 5, 35332195);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        int int14 = dateTimeField2.getMinimumValue(0L);
        long long17 = dateTimeField2.getDifferenceAsLong((long) (short) -1, (long) (byte) 0);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1, chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withMillisOfDay((int) (byte) 10);
        int int23 = localDateTime22.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField25 = localDateTime22.getField((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withYearOfCentury((int) (short) 0);
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalTime localTime36 = localTime34.plus(readablePeriod35);
        java.util.TimeZone timeZone37 = java.util.TimeZone.getDefault();
        java.lang.String str38 = timeZone37.getID();
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone37);
        boolean boolean40 = localTime36.equals((java.lang.Object) calendar39);
        int[] intArray41 = localTime36.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType43.getField(chronology44);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology47);
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean50 = localTime48.isSupported(durationFieldType49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalTime localTime52 = localTime48.minus(readablePeriod51);
        java.util.Locale locale54 = java.util.Locale.KOREA;
        java.lang.String str55 = dateTimeField45.getAsShortText((org.joda.time.ReadablePartial) localTime52, (int) (short) -1, locale54);
        int int57 = dateTimeField45.getMinimumValue(0L);
        long long60 = dateTimeField45.getDifferenceAsLong((long) (short) -1, (long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTimeField dateTimeField64 = dateTimeFieldType62.getField(chronology63);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalTime localTime67 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology66);
        org.joda.time.DurationFieldType durationFieldType68 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean69 = localTime67.isSupported(durationFieldType68);
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.LocalTime localTime71 = localTime67.minus(readablePeriod70);
        java.util.Locale locale73 = java.util.Locale.KOREA;
        java.lang.String str74 = dateTimeField64.getAsShortText((org.joda.time.ReadablePartial) localTime71, (int) (short) -1, locale73);
        java.lang.String str75 = dateTimeField45.getAsShortText((long) (short) -1, locale73);
        java.util.Locale locale77 = java.util.Locale.GERMANY;
        java.lang.String str78 = dateTimeField45.getAsText(32770, locale77);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray79 = dateTimeField2.set((org.joda.time.ReadablePartial) localDateTime29, 1970, intArray41, "hi!", locale77);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Etc/UTC" + "'", str38, "Etc/UTC");
        org.junit.Assert.assertNotNull(calendar39);
// flaky:         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=1644572933875,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=53,MILLISECOND=875,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "-1" + "'", str55, "-1");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "-1" + "'", str74, "-1");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "999" + "'", str75, "999");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "32770" + "'", str78, "32770");
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plus((-25L));
        int int8 = dateTime3.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.LocalDate localDate8 = localDate5.withField(dateTimeFieldType6, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType9.getField(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDate5.get(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-2L) + "'", long4 == (-2L));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        int int5 = localDateTime4.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.plusSeconds((int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = localDateTime7.toString(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:32.010" + "'", str9, "1970-01-01T00:00:32.010");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) ' ', (int) (byte) 0, (int) (short) -1, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("hourOfDay", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hourofday");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        org.joda.time.LocalDateTime localDateTime9 = property5.addToCopy((int) '4');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.hourOfDay();
        int int11 = property10.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 23 + "'", int11 == 23);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        int int12 = localDate11.getWeekOfWeekyear();
        int int13 = property8.compareTo((org.joda.time.ReadablePartial) localDate11);
        int int14 = localDate11.getEra();
        org.joda.time.LocalDate.Property property15 = localDate11.dayOfMonth();
        org.joda.time.LocalDate localDate16 = property15.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = property15.setCopy("2022");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setVariant("1970-01-01T00:00:32.010");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 1970-01-01T00:00:32.010 [at index 5]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = calendar2.getGreatestMinimum((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572934589,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=54,MILLISECOND=589,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeZone2.getOffset(5, (int) (short) 1, 14, 10, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology7);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean10 = localTime8.isSupported(durationFieldType9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime8.minus(readablePeriod11);
        org.joda.time.LocalTime localTime14 = localTime8.plusSeconds(9);
        org.joda.time.Chronology chronology15 = localTime8.getChronology();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology15.add(readablePeriod16, (-2L), 1);
        long long23 = chronology15.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType5.getField(chronology15);
        org.joda.time.DateTimeField dateTimeField26 = chronology15.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(100, 13, 59, 3, 35332195, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35332195 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-2L) + "'", long19 == (-2L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 20L + "'", long23 == 20L);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        int int6 = localDateTime4.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.yearOfCentury();
        int int8 = property7.getMinimumValue();
        org.joda.time.DurationField durationField9 = property7.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property7.setCopy("2022-02-11");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1, chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMillisOfDay((int) (byte) 10);
        int int18 = localDateTime17.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField20 = localDateTime17.getField((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.plusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMillisOfDay(100);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.minusMonths((int) (byte) 0);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology29);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean32 = localTime30.isSupported(durationFieldType31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalTime localTime34 = localTime30.minus(readablePeriod33);
        org.joda.time.LocalTime localTime36 = localTime30.plusSeconds(9);
        org.joda.time.Chronology chronology37 = localTime30.getChronology();
        org.joda.time.Chronology chronology38 = chronology37.withUTC();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.era();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology41);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean44 = localTime42.isSupported(durationFieldType43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalTime localTime46 = localTime42.minus(readablePeriod45);
        int[] intArray48 = chronology38.get((org.joda.time.ReadablePartial) localTime42, 1L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray50 = dateTimeField2.add((org.joda.time.ReadablePartial) localDateTime22, (int) ' ', intArray48, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 0, 1]");
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(0, 20, (int) (byte) 1, 0, 3, 12, 14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0, (int) 'x', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean13 = localTime11.isSupported(durationFieldType12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime11.minus(readablePeriod14);
        org.joda.time.LocalTime localTime17 = localTime11.plusSeconds(9);
        org.joda.time.Chronology chronology18 = localTime11.getChronology();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology18.add(readablePeriod19, (-2L), 1);
        long long26 = chronology18.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology18);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) 9, chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) interval7, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Interval");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-2L) + "'", long22 == (-2L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 20L + "'", long26 == 20L);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        int int14 = dateTimeField2.getMinimumValue(0L);
        long long17 = dateTimeField2.getDifferenceAsLong((long) (short) -1, (long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType19.getField(chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology23);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean26 = localTime24.isSupported(durationFieldType25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime28 = localTime24.minus(readablePeriod27);
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.lang.String str31 = dateTimeField21.getAsShortText((org.joda.time.ReadablePartial) localTime28, (int) (short) -1, locale30);
        java.lang.String str32 = dateTimeField2.getAsShortText((long) (short) -1, locale30);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone35 = dateTimeZone34.toTimeZone();
        int int37 = dateTimeZone34.getStandardOffset((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((java.lang.Object) (short) -1, dateTimeZone34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1" + "'", str31, "-1");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "999" + "'", str32, "999");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6 + "'", int37 == 6);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfDay(5);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime5.withDate(7, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.plus(readablePeriod3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMillisOfDay((int) (byte) 10);
        int int10 = localDateTime9.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusDays(9);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withSecondOfMinute(6);
        int int17 = localDateTime16.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localTime4.compareTo((org.joda.time.ReadablePartial) localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1, chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.year();
        org.joda.time.LocalDateTime localDateTime21 = property20.getLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withPeriodAdded(readablePeriod22, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = localTime9.isAfter((org.joda.time.ReadablePartial) localDateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00:00:00.000" + "'", str13, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        int int12 = localDate11.getWeekOfWeekyear();
        int int13 = property8.compareTo((org.joda.time.ReadablePartial) localDate11);
        int int14 = localDate11.getEra();
        org.joda.time.LocalDate.Property property15 = localDate11.dayOfMonth();
        java.util.Date date16 = localDate11.toDate();
        java.lang.String str17 = date16.toString();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Fri Feb 11 00:00:00 UTC 2022" + "'", str17, "Fri Feb 11 00:00:00 UTC 2022");
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.LocalTime.Property property15 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime17 = property15.addNoWrapToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime18 = property15.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = property15.addNoWrapToCopy((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00:00:00.000" + "'", str13, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (short) 100, 100, 14, 15, (int) (byte) 0, 0, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfDay(5);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.ReadablePartial readablePartial8 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime12.plus(readablePeriod13);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.lang.String str16 = timeZone15.getID();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone15);
        boolean boolean18 = localTime14.equals((java.lang.Object) calendar17);
        int[] intArray19 = localTime14.getValues();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate22.minus(readablePeriod23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.minus(readablePeriod27);
        org.joda.time.DateTime.Property property29 = dateTime28.year();
        java.lang.String str30 = property29.getAsString();
        java.lang.String str31 = property29.toString();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate35 = localDate33.minus(readablePeriod34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localDate35.toDateTimeAtMidnight(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.plusMillis(32772);
        org.joda.time.DateTime dateTime41 = dateTime37.withMillis((long) ' ');
        org.joda.time.DateTime dateTime43 = dateTime37.minusMillis(5);
        int int44 = dateTime37.getDayOfMonth();
        int int45 = property29.getDifference((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime47 = property29.addToCopy((int) (short) 0);
        java.util.Locale locale48 = java.util.Locale.US;
        int int49 = property29.getMaximumShortTextLength(locale48);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray50 = dateTimeField7.set(readablePartial8, 32772, intArray19, "2022-02-11", locale48);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Etc/UTC" + "'", str16, "Etc/UTC");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1644572935441,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=55,MILLISECOND=441,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2022" + "'", str30, "2022");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Property[year]" + "'", str31, "Property[year]");
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 11 + "'", int44 == 11);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withFieldAdded(durationFieldType9, 19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withWeekOfWeekyear(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 1, chronology2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfDay((int) (byte) 10);
        int int6 = localDateTime5.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField8 = localDateTime5.getField((int) (short) 0);
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = dateTimeField8.getAsText((long) (byte) 10, locale10);
        java.lang.String str12 = locale0.getDisplayCountry(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale10.getUnicodeLocaleType("+00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: +00:00:00.001");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970" + "'", str11, "1970");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.lang.String str7 = timeZone6.getID();
        java.time.ZoneId zoneId8 = timeZone6.toZoneId();
        boolean boolean9 = dateTime5.equals((java.lang.Object) timeZone6);
        java.util.TimeZone.setDefault(timeZone6);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType11.getField(chronology12);
        boolean boolean14 = dateTimeField13.isLenient();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate16.minus(readablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.DateTime.Property property23 = dateTime22.year();
        java.lang.String str24 = property23.getAsString();
        java.lang.String str25 = property23.toString();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(chronology26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate27.minus(readablePeriod28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate29.toDateTimeAtMidnight(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.plusMillis(32772);
        org.joda.time.DateTime dateTime35 = dateTime31.withMillis((long) ' ');
        org.joda.time.DateTime dateTime37 = dateTime31.minusMillis(5);
        int int38 = dateTime31.getDayOfMonth();
        int int39 = property23.getDifference((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime41 = property23.addToCopy((int) (short) 0);
        java.util.Locale locale42 = java.util.Locale.US;
        int int43 = property23.getMaximumShortTextLength(locale42);
        int int44 = dateTimeField13.getMaximumShortTextLength(locale42);
        java.lang.String str45 = timeZone6.getDisplayName(locale42);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Etc/UTC" + "'", str7, "Etc/UTC");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022" + "'", str24, "2022");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Property[year]" + "'", str25, "Property[year]");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 11 + "'", int38 == 11);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Coordinated Universal Time" + "'", str45, "Coordinated Universal Time");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        java.util.TimeZone timeZone8 = calendar1.getTimeZone();
        java.lang.String str9 = calendar1.getCalendarType();
        java.lang.Object obj10 = calendar1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "gregory" + "'", str9, "gregory");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        java.lang.Class<?> wildcardClass6 = dateTime5.getClass();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        boolean boolean8 = dateTimeField7.isSupported();
        int int11 = dateTimeField7.getDifference(4L, (long) (-1));
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = timeZone2.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644572935951,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.006,offset=6,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=55,MILLISECOND=957,ZONE_OFFSET=6,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale0.getExtension('a');
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str5 = locale0.getDisplayScript(locale4);
        java.lang.String str6 = locale4.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh_CN" + "'", str6, "zh_CN");
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate6 = localDate1.withFieldAdded(durationFieldType4, (int) (short) 0);
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtMidnight(dateTimeZone11);
        java.util.Date date13 = localDate10.toDate();
        calendar8.setTime(date13);
        boolean boolean15 = localDate1.equals((java.lang.Object) calendar8);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = calendar8.getActualMinimum(70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 70");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean12 = localTime10.isSupported(durationFieldType11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime10.plusSeconds(9);
        org.joda.time.Chronology chronology17 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfDay();
        boolean boolean20 = dateTimeFieldType7.isSupported(chronology17);
        org.joda.time.DurationField durationField21 = chronology17.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(1, 32772, 0, 70, (int) (byte) 100, 13, (int) '4', chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        int int6 = localDateTime4.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = property7.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfMonth(22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMonthOfYear((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate4.minus(readablePeriod5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMillis(32772);
        org.joda.time.DateTime dateTime12 = dateTime8.withMillis((long) ' ');
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(8, 32, 32769, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.clear();
        int int3 = calendar1.getWeeksInWeekYear();
        boolean boolean4 = calendar1.isLenient();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("2022-02-11");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 2022-02-11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        int int6 = localDate5.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property7 = localDate5.weekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long12 = dateTimeZone9.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight14 = localDate5.toDateMidnight(dateTimeZone9);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate5.withPeriodAdded(readablePeriod15, 32769);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType18.getField(chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean25 = localTime23.isSupported(durationFieldType24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime27 = localTime23.minus(readablePeriod26);
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.lang.String str30 = dateTimeField20.getAsShortText((org.joda.time.ReadablePartial) localTime27, (int) (short) -1, locale29);
        java.lang.String str31 = localTime27.toString();
        int int32 = localTime27.size();
        org.joda.time.LocalTime.Property property33 = localTime27.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int34 = localDate17.compareTo((org.joda.time.ReadablePartial) localTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-2L) + "'", long12 == (-2L));
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1" + "'", str30, "-1");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "00:00:00.000" + "'", str31, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.DateTime dateTime11 = dateTime5.minusMillis(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime11.withDate(42, (-292275054), 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology9.add(readablePeriod10, (-2L), 1);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = chronology9.getDateTimeMillis(999, 2022, 32772, 999, 70, (int) (byte) 0, 32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2L) + "'", long13 == (-2L));
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate6 = localDate1.withFieldAdded(durationFieldType4, (int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.centuryOfEra();
        org.joda.time.LocalDate.Property property8 = localDate6.dayOfMonth();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1, chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.year();
        org.joda.time.LocalDateTime localDateTime15 = property14.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDate6.compareTo((org.joda.time.ReadablePartial) localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(32770, 12, 2022, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension('a', "yearOfEra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: yearOfEra [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        boolean boolean3 = dateTimeField2.isLenient();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean8 = localTime6.isSupported(durationFieldType7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime10 = localTime6.minus(readablePeriod9);
        org.joda.time.LocalTime localTime12 = localTime6.plusSeconds(9);
        org.joda.time.Chronology chronology13 = localTime6.getChronology();
        org.joda.time.Chronology chronology14 = chronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.era();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology17);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean20 = localTime18.isSupported(durationFieldType19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime18.minus(readablePeriod21);
        int[] intArray24 = chronology14.get((org.joda.time.ReadablePartial) localTime18, 1L);
        int[] intArray29 = new int[] { 20, ' ', 35332195 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = dateTimeField2.set((org.joda.time.ReadablePartial) localTime18, (int) 'x', intArray29, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 120");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[20, 32, 35332195]");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate4.minus(readablePeriod5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.Chronology chronology9 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long14 = dateTimeZone12.nextTransition((long) 4);
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(0, (int) (short) 0, 19, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 4L + "'", long14 == 4L);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("1970-01-01T00:00:32.010", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1970-01-01t00:00:32.010");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.DateTime dateTime10 = property8.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property8.setCopy("00:00:00.000");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"00:00:00.000\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtMidnight(dateTimeZone3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate7 = localDate2.withFieldAdded(durationFieldType5, (int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology8);
        java.lang.String str10 = durationFieldType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime0.withFieldAdded(durationFieldType5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyears' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "weekyears" + "'", str10, "weekyears");
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(1900);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDateTime6.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int3 = timeZone2.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfDay(5);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayScript();
        java.lang.String str11 = locale9.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeField7.getAsText((int) (byte) 10, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese (China)" + "'", str11, "Chinese (China)");
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology9.add(readablePeriod10, (-2L), 1);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = chronology9.getDateTimeMillis((long) (byte) 100, (-292275054), 5, (int) (short) 1, 8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2L) + "'", long13 == (-2L));
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.006' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime7.withHourOfDay(42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate16.minus(readablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.DateMidnight dateMidnight23 = dateTime22.toDateMidnight();
        org.joda.time.DateTime dateTime24 = dateTime22.withEarlierOffsetAtOverlap();
        int int25 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = dateTime13.toString(dateTimeFormatter26);
        long long28 = dateTime13.getMillis();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2022-05-10T23:59:59.990Z" + "'", str27, "2022-05-10T23:59:59.990Z");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1652227199990L + "'", long28 == 1652227199990L);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.LocalDate localDate8 = localDate5.withField(dateTimeFieldType6, (int) 'a');
        org.joda.time.DateTime dateTime9 = localDate5.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate5.withMonthOfYear(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-2L) + "'", long4 == (-2L));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.LocalTime.Property property15 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime17 = property15.addNoWrapToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime19 = property15.setCopy(22);
        org.joda.time.LocalTime localTime20 = property15.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property22 = localTime20.property(dateTimeFieldType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00:00:00.000" + "'", str13, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        int int3 = timeZone0.getOffset((-2104009200000L));
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtMidnight(dateTimeZone8);
        java.util.Date date10 = localDate7.toDate();
        calendar5.setTime(date10);
        java.util.TimeZone timeZone12 = calendar5.getTimeZone();
        boolean boolean13 = timeZone0.hasSameRules(timeZone12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = timeZone12.getDisplayName(true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setExtension('4', "+00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguage("weekyears");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: weekyears [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate6 = localDate1.withFieldAdded(durationFieldType4, (int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate1.year();
        org.joda.time.LocalDate localDate8 = property7.withMaximumValue();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        java.util.TimeZone timeZone8 = calendar1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calendar1.getGreatestMinimum(53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        int int6 = localDate5.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property7 = localDate5.weekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long12 = dateTimeZone9.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight14 = localDate5.toDateMidnight(dateTimeZone9);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate5.withPeriodAdded(readablePeriod15, 32769);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField19 = localDate5.getField((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-2L) + "'", long12 == (-2L));
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.plus(readablePeriod3);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.lang.String str6 = timeZone5.getID();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone5);
        boolean boolean8 = localTime4.equals((java.lang.Object) calendar7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calendar7.getMaximum(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32769");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Etc/UTC" + "'", str6, "Etc/UTC");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1644572937997,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=57,MILLISECOND=997,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0);
        long long3 = calendar2.getTimeInMillis();
        boolean boolean4 = calendar2.isLenient();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572938028,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=58,MILLISECOND=28,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1644572938028L + "'", long3 == 1644572938028L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        org.joda.time.LocalDateTime localDateTime9 = property5.addToCopy((int) '4');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.hourOfDay();
        java.util.Locale locale12 = java.util.Locale.US;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = property10.setCopy("centuryOfEra", locale12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"centuryOfEra\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str3 = dateTimeZone1.getShortName(0L);
        java.lang.String str5 = dateTimeZone1.getName((long) 6);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime11 = localTime8.toDateTimeToday(dateTimeZone10);
        int int12 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.LocalDate.Property property4 = localDate1.dayOfWeek();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.LocalDate localDate6 = property4.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate6.withMonthOfYear((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withMillisOfDay(5);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfWeek();
        boolean boolean17 = dateTime5.equals((java.lang.Object) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime5.withWeekyear((-292275054));
        org.joda.time.DateTime.Property property20 = dateTime5.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = dateTime5.withDayOfWeek(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Etc/UTC", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=etc/utc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        java.util.Date date4 = localDate1.toDate();
        long long5 = date4.getTime();
        int int6 = date4.getMinutes();
        java.util.Date date7 = new java.util.Date();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.fromDateFields(date7);
        int int9 = date4.compareTo(date7);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1644537600000L + "'", long5 == 1644537600000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Feb 11 09:48:58 UTC 2022");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(1970, 32770, 8, (int) 'a', 1970, 9, 32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean8 = localTime6.isSupported(durationFieldType7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime10 = localTime6.minus(readablePeriod9);
        org.joda.time.LocalTime localTime12 = localTime6.plusSeconds(9);
        org.joda.time.Chronology chronology13 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.hourOfDay();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) 35332195, chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((int) 'a', 15, 6, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        int int3 = timeZone0.getOffset((-2104009200000L));
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtMidnight(dateTimeZone8);
        java.util.Date date10 = localDate7.toDate();
        calendar5.setTime(date10);
        java.util.TimeZone timeZone12 = calendar5.getTimeZone();
        boolean boolean13 = timeZone0.hasSameRules(timeZone12);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        java.lang.String str15 = timeZone14.getID();
        java.time.ZoneId zoneId16 = timeZone14.toZoneId();
        boolean boolean17 = timeZone12.hasSameRules(timeZone14);
        int int18 = timeZone12.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Etc/UTC" + "'", str15, "Etc/UTC");
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        int int2 = localDate1.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime3.withDayOfMonth(53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(2, (int) (byte) 10, 2022, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(32772, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = property5.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths(6);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withYearOfCentury((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusYears(35332195);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 327611105 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        int int14 = dateTimeField2.getMinimumValue(0L);
        long long17 = dateTimeField2.getDifferenceAsLong((long) (short) -1, (long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType19.getField(chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology23);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean26 = localTime24.isSupported(durationFieldType25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime28 = localTime24.minus(readablePeriod27);
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.lang.String str31 = dateTimeField21.getAsShortText((org.joda.time.ReadablePartial) localTime28, (int) (short) -1, locale30);
        java.lang.String str32 = dateTimeField2.getAsShortText((long) (short) -1, locale30);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalTime localTime37 = localTime35.plus(readablePeriod36);
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        java.lang.String str39 = timeZone38.getID();
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone38);
        boolean boolean41 = localTime37.equals((java.lang.Object) calendar40);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalTime localTime47 = localTime45.plus(readablePeriod46);
        java.util.TimeZone timeZone48 = java.util.TimeZone.getDefault();
        java.lang.String str49 = timeZone48.getID();
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone48);
        boolean boolean51 = localTime47.equals((java.lang.Object) calendar50);
        int[] intArray52 = localTime47.getValues();
        java.util.Locale locale55 = java.util.Locale.forLanguageTag("zh_TW");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray56 = dateTimeField2.set((org.joda.time.ReadablePartial) localTime37, 10, intArray52, "centuryOfEra", locale55);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"centuryOfEra\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1" + "'", str31, "-1");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "999" + "'", str32, "999");
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Etc/UTC" + "'", str39, "Etc/UTC");
        org.junit.Assert.assertNotNull(calendar40);
// flaky:         org.junit.Assert.assertEquals(calendar40.toString(), "java.util.GregorianCalendar[time=1644572939117,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=59,MILLISECOND=117,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Etc/UTC" + "'", str49, "Etc/UTC");
        org.junit.Assert.assertNotNull(calendar50);
// flaky:         org.junit.Assert.assertEquals(calendar50.toString(), "java.util.GregorianCalendar[time=1644572939117,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=59,MILLISECOND=117,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime11 = dateTime7.withCenturyOfEra((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime7.withField(dateTimeFieldType12, 32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for weekyearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.plus(readablePeriod2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate5.toDateTimeAtMidnight(dateTimeZone6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate10 = localDate5.withFieldAdded(durationFieldType8, (int) (short) 0);
        org.joda.time.LocalDate localDate12 = localDate3.withFieldAdded(durationFieldType8, 19);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.minus(readablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.minus(readablePeriod19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime22.withMonthOfYear(5);
        org.joda.time.DateTime.Property property27 = dateTime26.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long32 = dateTimeZone29.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str34 = dateTimeZone29.getNameKey(100L);
        org.joda.time.DateTime dateTime35 = dateTime26.withZoneRetainFields(dateTimeZone29);
        boolean boolean36 = dateTime35.isAfterNow();
        org.joda.time.DateTime dateTime37 = localDate3.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDate.Property property38 = localDate3.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType40.getField(chronology41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology44);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean47 = localTime45.isSupported(durationFieldType46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalTime localTime49 = localTime45.minus(readablePeriod48);
        java.util.Locale locale51 = java.util.Locale.KOREA;
        java.lang.String str52 = dateTimeField42.getAsShortText((org.joda.time.ReadablePartial) localTime49, (int) (short) -1, locale51);
        int int54 = dateTimeField42.getMinimumValue(0L);
        long long57 = dateTimeField42.getDifferenceAsLong((long) (short) -1, (long) (byte) 0);
        int int58 = dateTimeField42.getMaximumValue();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalTime localTime64 = localTime62.plus(readablePeriod63);
        java.lang.String str65 = localTime64.toString();
        java.util.Locale locale67 = java.util.Locale.GERMAN;
        java.lang.String str68 = localTime64.toString("1970", locale67);
        java.lang.String str69 = dateTimeField42.getAsText((int) (byte) 1, locale67);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate70 = property38.setCopy("gregory", locale67);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"gregory\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-2L) + "'", long32 == (-2L));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "-1" + "'", str52, "-1");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 999 + "'", int58 == 999);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "00:00:00.000" + "'", str65, "00:00:00.000");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "de");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "1970" + "'", str68, "1970");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1" + "'", str69, "1");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setExtension('4', "2022-02-11T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
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
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withWeekOfWeekyear(1);
        org.joda.time.Chronology chronology12 = localDateTime6.getChronology();
        int int13 = localDateTime6.getYearOfEra();
        int int14 = localDateTime6.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime6.withDate((int) '#', 13, 13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        long long6 = java.util.Date.UTC(3, 0, (int) (short) 0, 59, (-292275054), 22);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-19649634818000L) + "'", long6 == (-19649634818000L));
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("1439");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1439");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        int int15 = localTime9.getMillisOfSecond();
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localTime9.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType18 = localTime9.getFieldType((-2731));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -2731");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00:00:00.000" + "'", str13, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology15);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean18 = localTime16.isSupported(durationFieldType17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime20 = localTime16.minus(readablePeriod19);
        org.joda.time.LocalTime localTime22 = localTime16.plusSeconds(9);
        int[] intArray24 = new int[] { 32 };
        // The following exception was thrown during execution in test generation
        try {
            chronology11.validate((org.joda.time.ReadablePartial) localTime22, intArray24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32]");
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        int int6 = localDate5.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property7 = localDate5.weekyear();
        int int8 = localDate5.getYearOfEra();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        java.util.TimeZone timeZone8 = calendar1.getTimeZone();
        calendar1.clear();
        calendar1.setTimeInMillis((long) (-292275054));
        // The following exception was thrown during execution in test generation
        try {
            int int13 = calendar1.getActualMinimum((-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -292275054");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=-292275054,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=362,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=48,SECOND=44,MILLISECOND=946,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        int int13 = localTime9.getMillisOfDay();
        org.joda.time.LocalTime localTime15 = localTime9.plusMinutes(6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = localTime9.toString(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "00:00:00.000" + "'", str17, "00:00:00.000");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((-2731), 10, 35332195);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2731 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        java.lang.String str8 = calendar1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str8, "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate1.withWeekyear((int) (short) -1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1, chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.year();
        org.joda.time.LocalDateTime localDateTime14 = property13.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.era();
        org.joda.time.LocalDateTime localDateTime16 = property15.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = localDate7.isAfter((org.joda.time.ReadablePartial) localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology9.add(readablePeriod10, (-2L), 1);
        long long17 = chronology9.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.Chronology chronology18 = chronology9.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = chronology18.getDateTimeMillis((-1L), 0, 19, 32770, 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2L) + "'", long13 == (-2L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 20L + "'", long17 == 20L);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0);
        long long3 = calendar2.getTimeInMillis();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.lang.String str5 = timeZone4.getID();
        int int6 = timeZone4.getRawOffset();
        calendar2.setTimeZone(timeZone4);
        int int8 = timeZone4.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572940297,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=0,MILLISECOND=297,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1644572940297L + "'", long3 == 1644572940297L);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Etc/UTC" + "'", str5, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        java.lang.String str2 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coordinated Universal Time" + "'", str2, "Coordinated Universal Time");
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        calendar3.setWeekDate(0, 11, 7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar3.getMaximum((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=-62161135859559,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.006,offset=6,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=73,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=0,MILLISECOND=447,ZONE_OFFSET=6,DST_OFFSET=0]");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        calendar3.set(53, 2, 59);
        int int9 = calendar3.get(1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=-60484630259493,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.006,offset=6,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=53,MONTH=3,WEEK_OF_YEAR=17,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=118,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=0,MILLISECOND=513,ZONE_OFFSET=6,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime11 = dateTime7.withCenturyOfEra((int) (byte) 0);
        java.util.Date date12 = dateTime11.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime11.withField(dateTimeFieldType13, 32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Fri Feb 13 00:00:00 UTC 22");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(1970, 53, 32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long10 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str12 = dateTimeZone7.getNameKey(100L);
        long long14 = dateTimeZone7.previousTransition(100L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(2000, 59, (int) (short) 100, 23, 1970, 32772, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (byte) 0, 12, (int) (short) 10, 1, (int) (byte) 100, 622);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Collection<java.lang.String> strCollection1 = null;
        java.util.Locale.FilteringMode filteringMode2 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = java.util.Locale.filterTags(languageRangeList0, strCollection1, filteringMode2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + filteringMode2 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode2.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        int int12 = localDate11.getWeekOfWeekyear();
        int int13 = property8.compareTo((org.joda.time.ReadablePartial) localDate11);
        int int14 = localDate11.getEra();
        org.joda.time.LocalDate.Property property15 = localDate11.dayOfMonth();
        java.util.Date date16 = localDate11.toDate();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1, chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMillisOfDay((int) (byte) 10);
        int int22 = localDateTime21.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.plusSeconds((int) ' ');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusDays(9);
        int int27 = localDateTime24.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = localDate11.compareTo((org.joda.time.ReadablePartial) localDateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 19 + "'", int22 == 19);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        org.joda.time.LocalDateTime localDateTime9 = property5.addToCopy((int) '4');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.plusDays(1970);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime9.withDate(11, 100, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        int int9 = dateTime5.getMillisOfDay();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfHour();
        boolean boolean11 = dateTimeField10.isSupported();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        java.util.Date date16 = localDate13.toDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = localDate13.toString(dateTimeFormatter17);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime24 = localTime22.plus(readablePeriod23);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        java.lang.String str26 = timeZone25.getID();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone25);
        boolean boolean28 = localTime24.equals((java.lang.Object) calendar27);
        int[] intArray29 = localTime24.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = dateTimeField10.add((org.joda.time.ReadablePartial) localDate13, 7, intArray29, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2022-02-11" + "'", str18, "2022-02-11");
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Etc/UTC" + "'", str26, "Etc/UTC");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1644572940986,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=0,MILLISECOND=986,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0, 0]");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        int int14 = dateTimeField2.getMinimumValue(0L);
        org.joda.time.DurationField durationField15 = dateTimeField2.getLeapDurationField();
        java.util.Locale locale16 = null;
        int int17 = dateTimeField2.getMaximumTextLength(locale16);
        long long19 = dateTimeField2.roundHalfCeiling((-25L));
        java.util.Locale locale22 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = locale22.getExtension('a');
        java.util.Set<java.lang.String> strSet25 = locale22.getUnicodeLocaleAttributes();
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str27 = locale22.getDisplayScript(locale26);
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.lang.String str29 = locale26.getDisplayVariant(locale28);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = dateTimeField2.set((long) 9, "yearOfEra", locale26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"yearOfEra\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(durationField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-25L) + "'", long19 == (-25L));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property14 = localTime10.property(dateTimeFieldType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.LocalTime.Property property15 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime17 = property15.addNoWrapToCopy((int) (short) 1);
        java.util.Locale locale19 = java.util.Locale.US;
        org.joda.time.LocalTime localTime20 = property15.setCopy("7", locale19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        long long22 = property15.getDifferenceAsLong(readableInstant21);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00:00:00.000" + "'", str13, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-456825L) + "'", long22 == (-456825L));
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.util.Date date5 = new java.util.Date(86399, 10, 3, 53, 3);
        org.junit.Assert.assertEquals(date5.toString(), "Sun Nov 05 05:03:00 UTC 88299");
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate6 = localDate1.withFieldAdded(durationFieldType4, (int) (short) 0);
        int int7 = localDate1.getDayOfMonth();
        org.joda.time.LocalDate localDate9 = localDate1.minusYears(11);
        org.joda.time.LocalDate.Property property10 = localDate1.year();
        org.joda.time.DateTime dateTime11 = localDate1.toDateTimeAtCurrentTime();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.minutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate1.withFieldAdded(durationFieldType12, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minutes' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.LocalTime.Property property15 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime17 = property15.addNoWrapToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime19 = property15.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.LocalTime localTime21 = property15.addWrapFieldToCopy((-292275054));
        org.joda.time.LocalTime localTime23 = property15.addCopy(7);
        org.joda.time.LocalTime localTime25 = localTime23.plusMillis(999);
        java.util.Locale locale27 = java.util.Locale.ENGLISH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = localTime25.toString("Etc/UTC", locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00:00:00.000" + "'", str13, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        int int3 = localDateTime2.size();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear(19);
        int int6 = localDateTime5.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withMillisOfDay(32772);
        int int9 = localDateTime8.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("2022-02-11", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        int int5 = localDateTime4.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField7 = localDateTime4.getField((int) (short) 0);
        org.joda.time.DurationField durationField8 = dateTimeField7.getRangeDurationField();
        java.lang.String str10 = dateTimeField7.getAsText((long) 5);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970" + "'", str10, "1970");
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withWeekOfWeekyear(1);
        org.joda.time.Chronology chronology12 = localDateTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = chronology12.getDateTimeMillis(0L, (int) 'a', (int) (short) 100, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeFieldType0, chronology12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.LocalDate localDate8 = localDate5.withField(dateTimeFieldType6, (int) 'a');
        org.joda.time.DateTime dateTime9 = localDate5.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate5.withDayOfWeek(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-2L) + "'", long4 == (-2L));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.plus(readablePeriod2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology5 = null;
        boolean boolean6 = dateTimeFieldType4.isSupported(chronology5);
        boolean boolean7 = localDate3.isSupported(dateTimeFieldType4);
        int int8 = localDate3.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate3.withWeekOfWeekyear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1, chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.year();
        int int14 = localDateTime12.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime16 = property15.withMinimumValue();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology19);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean22 = localTime20.isSupported(durationFieldType21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime24 = localTime20.minus(readablePeriod23);
        org.joda.time.LocalTime localTime26 = localTime20.plusSeconds(9);
        org.joda.time.Chronology chronology27 = localTime20.getChronology();
        org.joda.time.Chronology chronology28 = chronology27.withUTC();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.era();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology31);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean34 = localTime32.isSupported(durationFieldType33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalTime localTime36 = localTime32.minus(readablePeriod35);
        int[] intArray38 = chronology28.get((org.joda.time.ReadablePartial) localTime32, 1L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray40 = dateTimeField7.set((org.joda.time.ReadablePartial) localDateTime16, 17, intArray38, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 70 + "'", int14 == 70);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 0, 1]");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        java.util.TimeZone timeZone8 = calendar1.getTimeZone();
        calendar1.clear();
        calendar1.clear();
        calendar1.setTimeInMillis((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = calendar1.getGreatestMinimum(59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 59");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate6 = localDate1.withFieldAdded(durationFieldType4, (int) (short) 0);
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtMidnight(dateTimeZone11);
        java.util.Date date13 = localDate10.toDate();
        calendar8.setTime(date13);
        boolean boolean15 = localDate1.equals((java.lang.Object) calendar8);
        java.lang.String str16 = calendar8.getCalendarType();
        boolean boolean18 = calendar8.equals((java.lang.Object) 6);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "gregory" + "'", str16, "gregory");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.LocalTime.Property property15 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime17 = property15.addNoWrapToCopy((int) (short) 1);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(locale18);
        java.lang.String str20 = property15.getAsText(locale18);
        java.util.Locale locale21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = locale18.getDisplayLanguage(locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00:00:00.000" + "'", str13, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1644572942321,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=2,MILLISECOND=321,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.plus(readablePeriod12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology15 = null;
        boolean boolean16 = dateTimeFieldType14.isSupported(chronology15);
        boolean boolean17 = localDate13.isSupported(dateTimeFieldType14);
        int int18 = dateTime9.get(dateTimeFieldType14);
        java.util.Date date19 = dateTime9.toDate();
        int int20 = date19.getMinutes();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("1", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0);
        long long3 = calendar2.getTimeInMillis();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.lang.String str5 = timeZone4.getID();
        int int6 = timeZone4.getRawOffset();
        calendar2.setTimeZone(timeZone4);
        calendar2.setTimeInMillis((long) 32);
        calendar2.clear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.setWeekDate((int) (short) 0, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=32,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1644572942404L + "'", long3 == 1644572942404L);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Etc/UTC" + "'", str5, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology10.add(readablePeriod11, (-2L), 1);
        long long18 = chronology10.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.Chronology chronology19 = chronology10.withUTC();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (-292275054), chronology10);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology22);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime26 = localTime23.toDateTimeToday(dateTimeZone25);
        java.util.Date date27 = dateTime26.toDate();
        boolean boolean29 = dateTime26.isBefore(1644537600000L);
        boolean boolean30 = localTime20.equals((java.lang.Object) 1644537600000L);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(chronology31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDate localDate34 = localDate32.minus(readablePeriod33);
        org.joda.time.LocalDate localDate36 = localDate32.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate38 = localDate32.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property39 = localDate32.dayOfWeek();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(chronology40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDate localDate43 = localDate41.minus(readablePeriod42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate43.toDateTimeAtMidnight(dateTimeZone44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.minus(readablePeriod46);
        org.joda.time.DateTime dateTime49 = dateTime47.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = dateTime49.toDateTime(chronology50);
        org.joda.time.DateTime dateTime53 = dateTime49.withMonthOfYear(5);
        org.joda.time.DateTime.Property property54 = dateTime53.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long59 = dateTimeZone56.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str61 = dateTimeZone56.getNameKey(100L);
        org.joda.time.DateTime dateTime62 = dateTime53.withZoneRetainFields(dateTimeZone56);
        org.joda.time.DateTime dateTime63 = localDate32.toDateTimeAtStartOfDay(dateTimeZone56);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = localTime20.compareTo((org.joda.time.ReadablePartial) localDate32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2L) + "'", long14 == (-2L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 20L + "'", long18 == 20L);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Feb 10 23:59:59 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-2L) + "'", long59 == (-2L));
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime63);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        java.util.Locale.Category category8 = java.util.Locale.Category.FORMAT;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readablePeriod15);
        org.joda.time.DateTime.Property property17 = dateTime16.year();
        java.util.Locale locale18 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str19 = property17.getAsShortText(locale18);
        java.lang.String str20 = locale18.getVariant();
        java.util.Locale.setDefault(category8, locale18);
        java.util.Locale locale22 = java.util.Locale.getDefault(category8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = property5.setCopy("year", locale22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"year\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.FORMAT + "'", category8.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2022" + "'", str19, "2022");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.plus(readablePeriod2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology5 = null;
        boolean boolean6 = dateTimeFieldType4.isSupported(chronology5);
        boolean boolean7 = localDate3.isSupported(dateTimeFieldType4);
        int int8 = localDate3.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate3.withPeriodAdded(readablePeriod9, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate3.withEra((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        int int12 = localDate11.getWeekOfWeekyear();
        int int13 = property8.compareTo((org.joda.time.ReadablePartial) localDate11);
        int int14 = localDate11.getEra();
        org.joda.time.LocalDate.Property property15 = localDate11.dayOfMonth();
        java.util.Date date16 = localDate11.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = localDate11.withEra(11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 11 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Fri Feb 11 00:00:00 UTC 2022");
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(2000, 999, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        boolean boolean9 = strSet2.addAll((java.util.Collection<java.lang.String>) strList7);
        java.util.Iterator<java.lang.String> strItor10 = strSet2.iterator();
        java.util.Iterator<java.lang.String> strItor11 = strSet2.iterator();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = strSet14.addAll((java.util.Collection<java.lang.String>) strList19);
        java.util.Iterator<java.lang.String> strItor22 = strSet14.iterator();
        org.joda.time.tz.Provider provider23 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet24 = provider23.getAvailableIDs();
        java.util.Set[] setArray26 = new java.util.Set[2];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray27 = (java.util.Set<java.lang.String>[]) setArray26;
        strSetArray27[0] = strSet14;
        strSetArray27[1] = strSet24;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String>[] strSetArray32 = strSet2.toArray(strSetArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(provider23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(setArray26);
        org.junit.Assert.assertNotNull(strSetArray27);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 6, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate4.plus(readablePeriod5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology8 = null;
        boolean boolean9 = dateTimeFieldType7.isSupported(chronology8);
        boolean boolean10 = localDate6.isSupported(dateTimeFieldType7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localTime2.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime5.withFieldAdded(durationFieldType9, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.era();
        org.joda.time.LocalDateTime localDateTime8 = property7.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property7.setCopy("seconds");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"seconds\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        int int3 = timeZone0.getOffset((-2104009200000L));
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtMidnight(dateTimeZone8);
        java.util.Date date10 = localDate7.toDate();
        calendar5.setTime(date10);
        java.util.TimeZone timeZone12 = calendar5.getTimeZone();
        boolean boolean13 = timeZone0.hasSameRules(timeZone12);
        java.lang.String str14 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType3 = localDate0.getFieldType(40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 40");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        int int11 = localTime10.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime10.withField(dateTimeFieldType12, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35343490 + "'", int11 == 35343490);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("German (Germany)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"German (Germany)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("2022-02-11T00:00:00.000Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.util.Locale locale3 = new java.util.Locale("zh_CN", "1908-01-10T00:00:06.010", "yearOfEra");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for zh_cn");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "zh_cn_1908-01-10T00:00:06.010_yearOfEra");
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withWeekOfWeekyear(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.plusHours(5);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withWeekOfWeekyear(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        java.util.TimeZone timeZone8 = calendar1.getTimeZone();
        java.lang.String str9 = calendar1.getCalendarType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = calendar1.isSet((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "gregory" + "'", str9, "gregory");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        int int12 = localDate11.getWeekOfWeekyear();
        int int13 = property8.compareTo((org.joda.time.ReadablePartial) localDate11);
        int int14 = localDate11.getEra();
        org.joda.time.LocalDate.Property property15 = localDate11.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate11.withEra((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("1970-01-01T00:00:32.010");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1970-01-01t00:00:32.010");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(0, 42, 1900, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1900 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        int int3 = localDateTime2.size();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear(19);
        int int6 = localDateTime5.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withMillisOfDay(32772);
        int int9 = localDateTime8.getSecondOfMinute();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readableDuration10);
        java.lang.Class<?> wildcardClass12 = localDateTime11.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology7);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean10 = localTime8.isSupported(durationFieldType9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime8.minus(readablePeriod11);
        org.joda.time.LocalTime localTime14 = localTime8.plusSeconds(9);
        org.joda.time.Chronology chronology15 = localTime8.getChronology();
        org.joda.time.Chronology chronology16 = chronology15.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(20, (int) (short) 1, 1, 53, (int) (byte) 0, 32772, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale0.getExtension('a');
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        int int4 = strSet3.size();
        java.util.Iterator<java.lang.String> strItor5 = strSet3.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = strSet3.add("+00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strItor5);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setMinimalDaysInFirstWeek((int) 'a');
        int int5 = calendar1.get((int) (short) 1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572944191,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=97,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=4,MILLISECOND=191,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime11 = dateTime7.withCenturyOfEra((int) (byte) 0);
        java.util.Date date12 = dateTime11.toDate();
        java.time.Instant instant13 = date12.toInstant();
        java.lang.String str14 = date12.toString();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Fri Feb 13 00:00:00 UTC 22");
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Fri Feb 13 00:00:00 UTC 22" + "'", str14, "Fri Feb 13 00:00:00 UTC 22");
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) ' ', 17, 2, 32769, (int) (byte) 100, 9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.plus(readableDuration6);
        org.joda.time.DateTime dateTime10 = dateTime5.withDurationAdded((long) 0, (int) (byte) 10);
        int int11 = dateTime10.getDayOfMonth();
        org.joda.time.DurationFieldType durationFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime10.withFieldAdded(durationFieldType12, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("340", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("German (Germany)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=german(germany)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        int int5 = localDateTime4.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField7 = localDateTime4.getField((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withMillisOfDay(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime9.withDate(3, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.util.Date date6 = new java.util.Date(15, 12, (int) (byte) 10, (int) (byte) 1, 2, (int) (short) 0);
        java.lang.String str7 = date6.toString();
        org.junit.Assert.assertEquals(date6.toString(), "Mon Jan 10 01:02:00 UTC 1916");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mon Jan 10 01:02:00 UTC 1916" + "'", str7, "Mon Jan 10 01:02:00 UTC 1916");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        int int2 = timeZone0.getRawOffset();
        boolean boolean3 = timeZone0.observesDaylightTime();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeZone0.getOffset((int) (byte) 100, 70, 1900, 0, (int) (short) 100, 1900);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str3 = dateTimeZone1.getShortName(0L);
        java.lang.String str4 = dateTimeZone1.toString();
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        java.lang.Object obj6 = timeZone5.clone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "java.util.SimpleTimeZone[id=+00:00:00.001,offset=1,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "java.util.SimpleTimeZone[id=+00:00:00.001,offset=1,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "java.util.SimpleTimeZone[id=+00:00:00.001,offset=1,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate1.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property8 = localDate1.dayOfMonth();
        org.joda.time.LocalDate localDate10 = property8.addToCopy(1970);
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = property8.setCopy("999", locale12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology9.add(readablePeriod10, (-2L), 1);
        long long17 = chronology9.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTimeZone dateTimeZone18 = chronology9.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = chronology9.getDateTimeMillis((long) 19, 6, (int) (short) -1, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2L) + "'", long13 == (-2L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 20L + "'", long17 == 20L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        int int6 = localDateTime4.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = property7.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfMonth(22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withDate((-4), (int) (byte) 0, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime3.withDate(11, 0, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean12 = localTime10.isSupported(durationFieldType11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime10.plusSeconds(9);
        org.joda.time.Chronology chronology17 = localTime10.getChronology();
        org.joda.time.Chronology chronology18 = chronology17.withUTC();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType7.getField(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(17, 3, (int) (byte) 100, (int) (byte) 10, 32770, 32772, (int) 'u', chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.minus(readablePeriod7);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds(9);
        org.joda.time.Chronology chronology11 = localTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.hourOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj1, chronology11);
        org.joda.time.DurationField durationField15 = chronology11.halfdays();
        org.joda.time.DurationField durationField16 = durationFieldType0.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField17 = chronology11.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField17.set(1644537600000L, 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.plus(readablePeriod12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology15 = null;
        boolean boolean16 = dateTimeFieldType14.isSupported(chronology15);
        boolean boolean17 = localDate13.isSupported(dateTimeFieldType14);
        int int18 = dateTime9.get(dateTimeFieldType14);
        java.util.Date date19 = dateTime9.toDate();
        java.lang.String str20 = date19.toString();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Thu Jan 01 00:00:00 UTC 1970" + "'", str20, "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.plus(readablePeriod3);
        java.lang.String str5 = localTime4.toString();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = localTime4.toString("1970", locale7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtMidnight(dateTimeZone11);
        org.joda.time.LocalDate.Property property13 = localDate10.dayOfWeek();
        org.joda.time.LocalDate localDate14 = property13.getLocalDate();
        org.joda.time.LocalDate localDate15 = property13.roundFloorCopy();
        org.joda.time.LocalDate.Property property16 = localDate15.centuryOfEra();
        org.joda.time.LocalDate localDate17 = property16.roundHalfCeilingCopy();
        int int18 = localDate17.getYear();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate17.plus(readablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str24 = dateTimeZone22.getShortName((long) 10);
        org.joda.time.DateMidnight dateMidnight25 = localDate17.toDateMidnight(dateTimeZone22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) localTime4, dateTimeZone22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "00:00:00.000" + "'", str5, "00:00:00.000");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970" + "'", str8, "1970");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2000 + "'", int18 == 2000);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateMidnight25);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("hourOfDay", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("yearOfEra", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology7);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean10 = localTime8.isSupported(durationFieldType9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime8.minus(readablePeriod11);
        org.joda.time.LocalTime localTime14 = localTime8.plusSeconds(9);
        org.joda.time.Chronology chronology15 = localTime8.getChronology();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology15.add(readablePeriod16, (-2L), 1);
        long long23 = chronology15.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTimeField dateTimeField24 = chronology15.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(7, 59, 23, 999, (-4), 3, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-2L) + "'", long19 == (-2L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 20L + "'", long23 == 20L);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = property5.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = property5.addToCopy((long) 22);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMonths((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readableDuration12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((-2731));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2731 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean11 = localTime9.isSupported(durationFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime9.minus(readablePeriod12);
        org.joda.time.LocalTime localTime15 = localTime9.plusSeconds(9);
        org.joda.time.Chronology chronology16 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(16, (-1), 1900, 5, 7, (-292275054), 7, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.plus(readableDuration6);
        org.joda.time.DateTime dateTime10 = dateTime5.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        org.joda.time.DateTime.Property property19 = dateTime18.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology21 = null;
        boolean boolean22 = dateTimeFieldType20.isSupported(chronology21);
        int int23 = dateTime18.get(dateTimeFieldType20);
        boolean boolean24 = dateTime5.isSupported(dateTimeFieldType20);
        org.joda.time.Instant instant25 = dateTime5.toInstant();
        java.util.Date date26 = instant25.toDate();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Fri Feb 11 00:00:00 UTC 2022");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime2.withHourOfDay(365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        int int6 = localDate5.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property7 = localDate5.weekyear();
        org.joda.time.Chronology chronology8 = localDate5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology8.getDateTimeMillis(2, 9, (int) (short) 0, 17, (int) (byte) 1, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(86399, (-292275054), (int) (byte) 0, 32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime5 = localTime2.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime5.getZone();
        int int8 = dateTimeZone6.getStandardOffset((long) 70);
        boolean boolean9 = dateTimeZone6.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        calendar3.set(53, 2, 59);
        // The following exception was thrown during execution in test generation
        try {
            calendar3.set(86399, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 86399");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.006,offset=6,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=53,MONTH=2,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=59,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=5,MILLISECOND=374,ZONE_OFFSET=6,DST_OFFSET=0]");
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        int int3 = localDateTime2.size();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear(19);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime2.withMinuteOfHour(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology11 = null;
        boolean boolean12 = dateTimeFieldType10.isSupported(chronology11);
        org.joda.time.Chronology chronology13 = null;
        boolean boolean14 = dateTimeFieldType10.isSupported(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime9.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime9.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime5 = localTime2.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.hourOfDay();
        org.joda.time.DateTime dateTime8 = property6.addToCopy(59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        int int3 = timeZone0.getOffset((-2104009200000L));
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtMidnight(dateTimeZone8);
        java.util.Date date10 = localDate7.toDate();
        calendar5.setTime(date10);
        java.util.TimeZone timeZone12 = calendar5.getTimeZone();
        boolean boolean13 = timeZone0.hasSameRules(timeZone12);
        boolean boolean14 = timeZone12.observesDaylightTime();
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str17 = locale15.getExtension('a');
        java.util.Set<java.lang.String> strSet18 = locale15.getUnicodeLocaleAttributes();
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone12, locale15);
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        calendar21.set(5, (int) 'x', 23);
        int int26 = calendar19.compareTo(calendar21);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1644572945541,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=5,MILLISECOND=541,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=5,MONTH=120,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=23,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=5,MILLISECOND=541,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("Property[year]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        org.joda.time.LocalDateTime localDateTime9 = property5.setCopy((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property5.addToCopy((long) 292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292280963 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((java.lang.Object) locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572945623,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=5,MILLISECOND=623,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        calendar3.setMinimalDaysInFirstWeek(22);
        java.lang.String str6 = calendar3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644572945672,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.006,offset=6,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=22,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=5,MILLISECOND=678,ZONE_OFFSET=6,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.util.GregorianCalendar[time=1644572945672,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.006,offset=6,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=22,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=5,MILLISECOND=678,ZONE_OFFSET=6,DST_OFFSET=0]" + "'", str6, "java.util.GregorianCalendar[time=1644572945672,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.006,offset=6,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=22,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=5,MILLISECOND=678,ZONE_OFFSET=6,DST_OFFSET=0]");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfHour();
        boolean boolean11 = dateTimeField10.isSupported();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale locale15 = builder14.build();
        int int16 = dateTimeField10.getMaximumShortTextLength(locale15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeField10.getAsText((long) 9, locale18);
        int int20 = dateTimeField10.getMaximumValue();
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 59 + "'", int20 == 59);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate16.minus(readablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.DateMidnight dateMidnight23 = dateTime22.toDateMidnight();
        org.joda.time.DateTime dateTime24 = dateTime22.withEarlierOffsetAtOverlap();
        int int25 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime.Property property26 = dateTime13.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = dateTime13.withEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        int int10 = localTime2.getMillisOfSecond();
        int int11 = localTime2.getSecondOfMinute();
        int int12 = localTime2.size();
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.DateTime.Property property10 = dateTime5.secondOfDay();
        org.joda.time.DurationField durationField11 = property10.getDurationField();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate13.minus(readablePeriod14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.plus(readableDuration18);
        org.joda.time.DateTime dateTime22 = dateTime17.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate24.minus(readablePeriod25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate26.toDateTimeAtMidnight(dateTimeZone27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.minus(readablePeriod29);
        org.joda.time.DateTime.Property property31 = dateTime30.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology33 = null;
        boolean boolean34 = dateTimeFieldType32.isSupported(chronology33);
        int int35 = dateTime30.get(dateTimeFieldType32);
        boolean boolean36 = dateTime17.isSupported(dateTimeFieldType32);
        org.joda.time.Instant instant37 = dateTime17.toInstant();
        int int38 = property10.compareTo((org.joda.time.ReadableInstant) instant37);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20 + "'", int35 == 20);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(0, 13, 32770, 1, 2022, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.lang.Class<?> wildcardClass2 = locale1.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set(5, (int) 'x', 23);
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1, chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMillisOfDay((int) (byte) 10);
        int int14 = localDateTime13.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField16 = localDateTime13.getField((int) (short) 0);
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str19 = dateTimeField16.getAsText((long) (byte) 10, locale18);
        java.lang.String str20 = locale8.getDisplayCountry(locale18);
        java.util.Set<java.lang.String> strSet21 = locale8.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap22 = calendar1.getDisplayNames(2, 8, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=5,MONTH=120,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=23,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=6,MILLISECOND=166,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970" + "'", str19, "1970");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        int int6 = localDateTime4.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = property7.withMinimumValue();
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.minus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.minus(readablePeriod16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int21 = dateTime19.get(dateTimeFieldType20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime8.withField(dateTimeFieldType20, 365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for weekyearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22 + "'", int21 == 22);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology10.add(readablePeriod11, (-2L), 1);
        long long18 = chronology10.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology10);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) 9, chronology10);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = chronology21.get(readablePeriod22, 1644572941634L, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2L) + "'", long14 == (-2L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 20L + "'", long18 == 20L);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.lang.String str7 = timeZone6.getID();
        java.time.ZoneId zoneId8 = timeZone6.toZoneId();
        boolean boolean9 = dateTime5.equals((java.lang.Object) timeZone6);
        boolean boolean10 = timeZone6.useDaylightTime();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Etc/UTC" + "'", str7, "Etc/UTC");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        int int6 = localDate5.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property7 = localDate5.weekyear();
        org.joda.time.LocalDate localDate8 = property7.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate8.withEra((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        java.util.TimeZone timeZone8 = calendar1.getTimeZone();
        java.lang.String str9 = calendar1.getCalendarType();
        calendar1.set((int) (byte) 0, 0);
        boolean boolean13 = calendar1.isLenient();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=0,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "gregory" + "'", str9, "gregory");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (short) 1, 9, (-1), (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.plus(readablePeriod2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate5.toDateTimeAtMidnight(dateTimeZone6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate10 = localDate5.withFieldAdded(durationFieldType8, (int) (short) 0);
        org.joda.time.LocalDate localDate12 = localDate3.withFieldAdded(durationFieldType8, 19);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.minus(readablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.minus(readablePeriod19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime22.withMonthOfYear(5);
        org.joda.time.DateTime.Property property27 = dateTime26.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long32 = dateTimeZone29.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str34 = dateTimeZone29.getNameKey(100L);
        org.joda.time.DateTime dateTime35 = dateTime26.withZoneRetainFields(dateTimeZone29);
        boolean boolean36 = dateTime35.isAfterNow();
        org.joda.time.DateTime dateTime37 = localDate3.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDate.Property property38 = localDate3.era();
        org.joda.time.LocalDate localDate39 = property38.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate41 = property38.setCopy("hi!");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-2L) + "'", long32 == (-2L));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDate39);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList5, strMap6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList5, strMap8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str15 = locale13.getExtension('a');
        java.util.Set<java.lang.String> strSet16 = locale13.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str19 = locale17.getExtension('a');
        java.util.Set<java.lang.String> strSet20 = locale17.getUnicodeLocaleAttributes();
        java.util.Locale[] localeArray21 = new java.util.Locale[] { locale13, locale17 };
        java.util.ArrayList<java.util.Locale> localeList22 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList22, localeArray21);
        java.util.List<java.util.Locale> localeList24 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList22);
        java.util.Locale locale25 = java.util.Locale.lookup(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList22);
        java.util.Locale.FilteringMode filteringMode26 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList27 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList22, filteringMode26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(localeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(localeList24);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertTrue("'" + filteringMode26 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode26.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        calendar3.setMinimalDaysInFirstWeek(22);
        int int7 = calendar3.getLeastMaximum(13);
        boolean boolean8 = calendar3.isLenient();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644572946495,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.006,offset=6,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=22,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=6,MILLISECOND=501,ZONE_OFFSET=6,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.plus(readablePeriod2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate5.toDateTimeAtMidnight(dateTimeZone6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate10 = localDate5.withFieldAdded(durationFieldType8, (int) (short) 0);
        org.joda.time.LocalDate localDate12 = localDate3.withFieldAdded(durationFieldType8, 19);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.minus(readablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.minus(readablePeriod19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime22.withMonthOfYear(5);
        org.joda.time.DateTime.Property property27 = dateTime26.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long32 = dateTimeZone29.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str34 = dateTimeZone29.getNameKey(100L);
        org.joda.time.DateTime dateTime35 = dateTime26.withZoneRetainFields(dateTimeZone29);
        boolean boolean36 = dateTime35.isAfterNow();
        org.joda.time.DateTime dateTime37 = localDate3.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDate.Property property38 = localDate3.era();
        org.joda.time.LocalDate localDate40 = localDate3.minusWeeks((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(43L, dateTimeZone42);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = localDate40.isEqual((org.joda.time.ReadablePartial) localTime43);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-2L) + "'", long32 == (-2L));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDate40);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.lang.String str2 = timeZone1.getID();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone1);
        long long4 = calendar3.getTimeInMillis();
        boolean boolean5 = locale0.equals((java.lang.Object) long4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Etc/UTC" + "'", str2, "Etc/UTC");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644572946564,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=6,MILLISECOND=564,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1644572946564L + "'", long4 == 1644572946564L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfDay(5);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType8.getField(chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology12);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean15 = localTime13.isSupported(durationFieldType14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime17 = localTime13.minus(readablePeriod16);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = dateTimeField10.getAsShortText((org.joda.time.ReadablePartial) localTime17, (int) (short) -1, locale19);
        int int22 = dateTimeField10.getMinimumValue(0L);
        long long24 = dateTimeField10.remainder((long) 5);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = dateTimeField10.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = dateTime5.withField(dateTimeFieldType25, 32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1" + "'", str20, "-1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        boolean boolean9 = strSet2.addAll((java.util.Collection<java.lang.String>) strList7);
        java.util.Iterator<java.lang.String> strItor10 = strSet2.iterator();
        java.util.Iterator<java.lang.String> strItor11 = strSet2.iterator();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology14);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean17 = localTime15.isSupported(durationFieldType16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime19 = localTime15.minus(readablePeriod18);
        org.joda.time.LocalTime localTime21 = localTime15.plusSeconds(9);
        org.joda.time.Chronology chronology22 = localTime15.getChronology();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = chronology22.add(readablePeriod23, (-2L), 1);
        long long30 = chronology22.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology22);
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType12.getField(chronology22);
        boolean boolean33 = strSet2.equals((java.lang.Object) dateTimeField32);
        java.lang.String str35 = dateTimeField32.getAsText(1644572942340L);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology39);
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean42 = localTime40.isSupported(durationFieldType41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalTime localTime44 = localTime40.minus(readablePeriod43);
        org.joda.time.LocalTime localTime46 = localTime40.plusSeconds(9);
        org.joda.time.Chronology chronology47 = localTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.minuteOfHour();
        boolean boolean49 = dateTimeField48.isSupported();
        java.util.Locale.Builder builder50 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder51 = builder50.clear();
        java.util.Locale.Builder builder52 = builder51.clearExtensions();
        java.util.Locale locale53 = builder52.build();
        int int54 = dateTimeField48.getMaximumShortTextLength(locale53);
        // The following exception was thrown during execution in test generation
        try {
            long long55 = dateTimeField32.set((long) (byte) 1, "+00:00:00.006", locale53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"+00:00:00.006\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-2L) + "'", long26 == (-2L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 20L + "'", long30 == 20L);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "340" + "'", str35, "340");
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.plus(readablePeriod3);
        java.lang.String str5 = localTime4.toString();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = localTime4.toString("1970", locale7);
        java.lang.Object obj9 = locale7.clone();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "00:00:00.000" + "'", str5, "00:00:00.000");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970" + "'", str8, "1970");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "de");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "de");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "de");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(79200000, (int) (byte) 10, 40, (int) 'u', (int) 'a', 17, 1900);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        int int10 = localTime2.getMillisOfSecond();
        int int11 = localTime2.getSecondOfMinute();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 1, chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMillisOfDay((int) (byte) 10);
        int int17 = localDateTime16.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plusSeconds((int) ' ');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusDays(9);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withSecondOfMinute(6);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.withPeriodAdded(readablePeriod24, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = localTime2.compareTo((org.joda.time.ReadablePartial) localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 19 + "'", int17 == 19);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.minus(readablePeriod7);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds(9);
        org.joda.time.Chronology chronology11 = localTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.hourOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj1, chronology11);
        org.joda.time.DurationField durationField15 = chronology11.halfdays();
        org.joda.time.DurationField durationField16 = durationFieldType0.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField17 = chronology11.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long22 = dateTimeZone19.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str24 = dateTimeZone19.getNameKey(100L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeField17, dateTimeZone19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.GJMonthOfYearDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-2L) + "'", long22 == (-2L));
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = property5.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = property5.addToCopy((long) 22);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMonths((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withSecondOfMinute((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) '4');
        org.joda.time.Chronology chronology14 = dateTime11.getChronology();
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.DurationField durationField16 = property15.getLeapDurationField();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNull(durationField16);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean11 = localTime9.isSupported(durationFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime9.minus(readablePeriod12);
        org.joda.time.LocalTime localTime15 = localTime9.plusSeconds(9);
        org.joda.time.Chronology chronology16 = localTime9.getChronology();
        org.joda.time.Chronology chronology17 = chronology16.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(14, 365, 0, (int) (short) 1, 9, 53, 4, chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate1.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property8 = localDate1.dayOfWeek();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readablePeriod15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime18.withMonthOfYear(5);
        org.joda.time.DateTime.Property property23 = dateTime22.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long28 = dateTimeZone25.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str30 = dateTimeZone25.getNameKey(100L);
        org.joda.time.DateTime dateTime31 = dateTime22.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTime dateTime32 = localDate1.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.LocalDate localDate34 = localDate1.withYearOfEra(2);
        java.util.Locale locale36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = localDate34.toString("zh_TW", locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-2L) + "'", long28 == (-2L));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDate34);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder5 = builder2.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setVariant("999");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 999 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long9 = dateTimeZone6.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime4, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.withMillisOfDay(5);
        org.joda.time.Chronology chronology13 = localDateTime4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime4.withMonthOfYear(86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-2L) + "'", long9 == (-2L));
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.LocalTime.Property property15 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime17 = property15.addNoWrapToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime18 = property15.roundCeilingCopy();
        org.joda.time.LocalTime localTime19 = property15.getLocalTime();
        org.joda.time.DateTimeField dateTimeField20 = property15.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = property15.setCopy("900");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 900 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00:00:00.000" + "'", str13, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate6 = localDate1.withFieldAdded(durationFieldType4, (int) (short) 0);
        int int7 = localDate1.getDayOfMonth();
        org.joda.time.LocalDate localDate9 = localDate1.minusYears(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDate1.getFieldType(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology10.add(readablePeriod11, (-2L), 1);
        long long18 = chronology10.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType0.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField21 = chronology10.dayOfYear();
        org.joda.time.DurationField durationField22 = chronology10.seconds();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = chronology10.get(readablePeriod23, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2L) + "'", long14 == (-2L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 20L + "'", long18 == 20L);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.LocalTime.Property property15 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime17 = property15.addNoWrapToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime18 = property15.roundCeilingCopy();
        org.joda.time.LocalTime localTime20 = property15.addCopy(86399);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = property15.setCopy("Fri Feb 11 00:00:00 UTC 2022");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Fri Feb 11 00:00:00 UTC 2022\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00:00:00.000" + "'", str13, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        int int3 = timeZone0.getOffset((-2104009200000L));
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtMidnight(dateTimeZone8);
        java.util.Date date10 = localDate7.toDate();
        calendar5.setTime(date10);
        java.util.TimeZone timeZone12 = calendar5.getTimeZone();
        boolean boolean13 = timeZone0.hasSameRules(timeZone12);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        java.lang.String str15 = timeZone14.getID();
        java.time.ZoneId zoneId16 = timeZone14.toZoneId();
        boolean boolean17 = timeZone12.hasSameRules(timeZone14);
        int int18 = timeZone14.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Etc/UTC" + "'", str15, "Etc/UTC");
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate1.withYearOfCentury(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate6 = localDate1.withFieldAdded(durationFieldType4, (int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.centuryOfEra();
        org.joda.time.LocalDate.Property property8 = localDate6.dayOfMonth();
        java.lang.String str9 = property8.toString();
        java.util.Locale locale11 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = property8.setCopy("zh_TW", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"zh_TW\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[dayOfMonth]" + "'", str9, "Property[dayOfMonth]");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate1.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property8 = localDate1.dayOfMonth();
        org.joda.time.LocalDate localDate10 = property8.addToCopy(1970);
        int int11 = localDate10.getMonthOfYear();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("+00:00:00.006", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTime.Property property9 = dateTime7.dayOfMonth();
        boolean boolean10 = dateTime7.isEqualNow();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime7.withCenturyOfEra((-4));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.plus(readablePeriod3);
        org.joda.time.LocalTime localTime6 = localTime2.minusMinutes((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) localTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.minus(readablePeriod12);
        org.joda.time.LocalDate localDate15 = localDate11.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate17 = localDate11.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate localDate19 = localDate11.minusYears((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = localTime2.isEqual((org.joda.time.ReadablePartial) localDate11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.hourOfHalfday();
        boolean boolean17 = dateTimeField16.isSupported();
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plus(readablePeriod9);
        int int11 = localDateTime10.getDayOfYear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.dayOfYear();
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localDateTime10.toString("1908-01-10T00:00:06.010", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(100, 16, (int) (short) 1, (int) '4', 17, 15, 32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime11 = dateTime7.withCenturyOfEra((int) (byte) 0);
        java.util.Date date12 = dateTime11.toDate();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.minus(readablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMillis(32772);
        org.joda.time.DateTime dateTime22 = dateTime18.withMillis((long) ' ');
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate24.plus(readablePeriod25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology28 = null;
        boolean boolean29 = dateTimeFieldType27.isSupported(chronology28);
        boolean boolean30 = localDate26.isSupported(dateTimeFieldType27);
        int int31 = dateTime22.get(dateTimeFieldType27);
        java.util.Date date32 = dateTime22.toDate();
        date32.setTime((-2L));
        int int35 = date12.compareTo(date32);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Fri Feb 13 00:00:00 UTC 22");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 19 + "'", int31 == 19);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 23:59:59 UTC 1969");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime10 = localTime7.toDateTimeToday(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime10.getZone();
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str15 = locale13.getExtension('a');
        java.util.Set<java.lang.String> strSet16 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str17 = dateTimeZone11.getShortName((long) ' ', locale13);
        long long20 = dateTimeZone11.adjustOffset((long) (byte) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(79200000, 1, (-292275054), 8, 292278993, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        int int5 = localDateTime4.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField7 = localDateTime4.getField((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plusHours((int) '4');
        org.joda.time.LocalDateTime.Property property10 = localDateTime4.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy(1644572944232L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1644572944232 * 86400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        java.util.TimeZone timeZone8 = calendar1.getTimeZone();
        java.lang.String str9 = calendar1.getCalendarType();
        calendar1.set((int) (byte) 0, 0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate19 = localDate14.withFieldAdded(durationFieldType17, (int) (short) 0);
        org.joda.time.LocalDate.Property property20 = localDate14.year();
        boolean boolean21 = calendar1.after((java.lang.Object) property20);
        int int22 = calendar1.getFirstDayOfWeek();
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap26 = calendar1.getDisplayNames(9, (-4), locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=0,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "gregory" + "'", str9, "gregory");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja_JP");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.plus(readablePeriod2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate5.toDateTimeAtMidnight(dateTimeZone6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate10 = localDate5.withFieldAdded(durationFieldType8, (int) (short) 0);
        org.joda.time.LocalDate localDate12 = localDate3.withFieldAdded(durationFieldType8, 19);
        java.util.Locale locale14 = null;
        java.lang.String str15 = localDate12.toString("32770", locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate12.withCenturyOfEra((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32770" + "'", str15, "32770");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        int int10 = localTime2.getMillisOfSecond();
        int int11 = localTime2.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localTime2.getValue((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plus((-25L));
        org.joda.time.DateTime dateTime9 = dateTime3.withMillisOfDay(2022);
        org.joda.time.DateTime dateTime11 = dateTime9.plusDays(5);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        java.util.Date date16 = localDate13.toDate();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate13.withPeriodAdded(readablePeriod17, (-1));
        org.joda.time.LocalDate localDate21 = localDate13.minusYears(6);
        org.joda.time.DateTime dateTime22 = dateTime11.withFields((org.joda.time.ReadablePartial) localDate21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = dateTime22.withEra(11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 11 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate1.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property8 = localDate1.dayOfWeek();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readablePeriod15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime18.withMonthOfYear(5);
        org.joda.time.DateTime.Property property23 = dateTime22.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long28 = dateTimeZone25.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str30 = dateTimeZone25.getNameKey(100L);
        org.joda.time.DateTime dateTime31 = dateTime22.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTime dateTime32 = localDate1.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone25);
        long long36 = dateTimeZone25.adjustOffset((long) '#', true);
        long long38 = dateTimeZone25.nextTransition(1644572938526L);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-2L) + "'", long28 == (-2L));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 35L + "'", long36 == 35L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1644572938526L + "'", long38 == 1644572938526L);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        int int6 = localDateTime4.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusSeconds(8);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = property9.addToCopy(2022);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        int int12 = localDate11.getWeekOfWeekyear();
        int int13 = property8.compareTo((org.joda.time.ReadablePartial) localDate11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate11.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        int int3 = localDateTime2.size();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear(19);
        int int6 = localDateTime5.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withMillisOfDay(32772);
        int int9 = localDateTime8.getSecondOfMinute();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readableDuration10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.weekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long17 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str19 = dateTimeZone14.getNameKey(100L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) localDateTime11, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-2L) + "'", long17 == (-2L));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        int int12 = localDate11.getWeekOfWeekyear();
        int int13 = property8.compareTo((org.joda.time.ReadablePartial) localDate11);
        int int14 = localDate11.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate11.withEra(42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundCeilingCopy();
        java.lang.String str7 = property5.getName();
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property5.setCopy("", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "year" + "'", str7, "year");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtMidnight(dateTimeZone3);
        java.util.Date date5 = localDate2.toDate();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate7.minus(readablePeriod8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.minus(readablePeriod12);
        org.joda.time.DateTime.Property property14 = dateTime13.year();
        java.lang.String str15 = property14.getAsString();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        int int18 = localDate17.getWeekOfWeekyear();
        int int19 = property14.compareTo((org.joda.time.ReadablePartial) localDate17);
        int int20 = localDate17.getEra();
        org.joda.time.LocalDate.Property property21 = localDate17.dayOfMonth();
        java.util.Date date22 = localDate17.toDate();
        boolean boolean23 = date5.before(date22);
        java.util.Calendar.Builder builder24 = builder0.setInstant(date5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder29 = builder24.setTimeOfDay(20, 3, 32770, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022" + "'", str15, "2022");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfDay(5);
        org.joda.time.DateTime.Property property6 = dateTime5.millisOfDay();
        org.joda.time.DateTime dateTime7 = property6.getDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime7.withSecondOfMinute(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        int int6 = localDate5.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property7 = localDate5.weekyear();
        org.joda.time.LocalDate localDate8 = property7.withMaximumValue();
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate8.withMonthOfYear((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.era();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withTime(22, 23, 14, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        calendar3.setWeekDate(0, 11, 7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar3.get(32772);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32772");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=-62161135851244,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.006,offset=6,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=73,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=8,MILLISECOND=762,ZONE_OFFSET=6,DST_OFFSET=0]");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("-1");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: -1 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        boolean boolean9 = strSet2.addAll((java.util.Collection<java.lang.String>) strList7);
        java.util.Iterator<java.lang.String> strItor10 = strSet2.iterator();
        boolean boolean12 = strSet2.equals((java.lang.Object) 1644572932963L);
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str15 = locale13.getExtension('a');
        java.util.Set<java.lang.String> strSet16 = locale13.getUnicodeLocaleAttributes();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        boolean boolean26 = strSet19.addAll((java.util.Collection<java.lang.String>) strList24);
        java.util.Iterator<java.lang.String> strItor27 = strSet19.iterator();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 1, chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.year();
        int int34 = localDateTime32.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property35 = localDateTime32.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime36 = property35.withMinimumValue();
        int int37 = localDateTime36.getEra();
        boolean boolean38 = strSet19.remove((java.lang.Object) localDateTime36);
        boolean boolean39 = strSet16.removeAll((java.util.Collection<java.lang.String>) strSet19);
        boolean boolean40 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet19);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 1, chronology42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.year();
        org.joda.time.LocalDateTime localDateTime47 = property46.getLocalDateTime();
        org.joda.time.DateTimeField dateTimeField48 = property46.getField();
        org.joda.time.LocalDateTime localDateTime50 = property46.addToCopy((int) '4');
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.secondOfMinute();
        org.joda.time.Interval interval52 = property51.toInterval();
        org.joda.time.base.BaseInterval[] baseIntervalArray53 = new org.joda.time.base.BaseInterval[] { interval52 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.base.BaseInterval[] baseIntervalArray54 = strSet2.toArray(baseIntervalArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 70 + "'", int34 == 70);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(baseIntervalArray53);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.plus(readablePeriod2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate5.toDateTimeAtMidnight(dateTimeZone6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate10 = localDate5.withFieldAdded(durationFieldType8, (int) (short) 0);
        org.joda.time.LocalDate localDate12 = localDate3.withFieldAdded(durationFieldType8, 19);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.minus(readablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.minus(readablePeriod19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime22.withMonthOfYear(5);
        org.joda.time.DateTime.Property property27 = dateTime26.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long32 = dateTimeZone29.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str34 = dateTimeZone29.getNameKey(100L);
        org.joda.time.DateTime dateTime35 = dateTime26.withZoneRetainFields(dateTimeZone29);
        boolean boolean36 = dateTime35.isAfterNow();
        org.joda.time.DateTime dateTime37 = localDate3.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDate.Property property38 = localDate3.era();
        org.joda.time.LocalDate localDate40 = localDate3.minusWeeks((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType41.getField(chronology42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology45);
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean48 = localTime46.isSupported(durationFieldType47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalTime localTime50 = localTime46.minus(readablePeriod49);
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.lang.String str53 = dateTimeField43.getAsShortText((org.joda.time.ReadablePartial) localTime50, (int) (short) -1, locale52);
        int int56 = dateTimeField43.getDifference((long) 7, (long) 11);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = dateTimeField43.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int58 = localDate40.get(dateTimeFieldType57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-2L) + "'", long32 == (-2L));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-1" + "'", str53, "-1");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-4) + "'", int56 == (-4));
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = chronology11.get(readablePeriod14, 0L, (long) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis(35332195);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTime7.toString("Fri Feb 11 00:00:00 UTC 2022");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: F");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plus((-25L));
        org.joda.time.DateTime dateTime9 = dateTime3.withMillisOfDay(2022);
        org.joda.time.DateTime dateTime11 = dateTime9.plusDays(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property13 = dateTime11.property(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime11.plusMinutes(32010);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        int int5 = localDateTime4.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.plusSeconds((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfMonth((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        java.lang.String str8 = property5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property5.setCopy("\u65e5\u672c");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[year]" + "'", str8, "Property[year]");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 86399);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean9 = localTime7.isSupported(durationFieldType8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime7.minus(readablePeriod10);
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) localTime11, (int) (short) -1, locale13);
        int int15 = localTime11.getMillisOfDay();
        org.joda.time.LocalTime localTime17 = localTime11.plusMinutes(6);
        org.joda.time.LocalTime.Property property18 = localTime11.minuteOfHour();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = localDate1.isAfter((org.joda.time.ReadablePartial) localTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set(5, (int) 'x', 23);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = calendar1.getActualMinimum(23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 23");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=5,MONTH=120,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=23,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=9,MILLISECOND=293,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        org.joda.time.DurationField durationField13 = dateTimeField2.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = dateTimeField2.getType();
        int int15 = dateTimeField2.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 999 + "'", int15 == 999);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.hourOfDay();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj0, chronology10);
        org.joda.time.DurationField durationField14 = chronology10.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = chronology10.getDateTimeMillis(1644572944232L, 5, 5, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.era();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.plus(readableDuration15);
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate21.minus(readablePeriod22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtMidnight(dateTimeZone24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.minus(readablePeriod26);
        org.joda.time.DateTime.Property property28 = dateTime27.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology30 = null;
        boolean boolean31 = dateTimeFieldType29.isSupported(chronology30);
        int int32 = dateTime27.get(dateTimeFieldType29);
        boolean boolean33 = dateTime14.isSupported(dateTimeFieldType29);
        org.joda.time.Instant instant34 = dateTime14.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            long long35 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20 + "'", int32 == 20);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(instant34);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.era();
        org.joda.time.LocalDateTime localDateTime8 = property7.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = property7.withMinimumValue();
        int int10 = localDateTime9.size();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plusSeconds(32010);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localDateTime12.toString("English");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate5.withField(dateTimeFieldType6, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.LocalTime.Property property15 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime17 = property15.addNoWrapToCopy((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = localTime17.toString("java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00:00:00.000" + "'", str13, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setLanguageTag("1439");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 1439 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0);
        long long3 = calendar2.getTimeInMillis();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate7 = localDate5.minus(readablePeriod6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtMidnight(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMillis(32772);
        org.joda.time.DateTime dateTime13 = dateTime9.withMillis((long) ' ');
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate15.plus(readablePeriod16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology19 = null;
        boolean boolean20 = dateTimeFieldType18.isSupported(chronology19);
        boolean boolean21 = localDate17.isSupported(dateTimeFieldType18);
        int int22 = dateTime13.get(dateTimeFieldType18);
        java.util.Date date23 = dateTime13.toDate();
        calendar2.setTime(date23);
        calendar2.set((int) (short) 1, 622, (int) (byte) -1, 9, (int) 'x');
        boolean boolean31 = calendar2.isLenient();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=622,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=-1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=9,MINUTE=120,SECOND=0,MILLISECOND=32,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1644572949921L + "'", long3 == 1644572949921L);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 19 + "'", int22 == 19);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Property[year]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=property[year]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.Chronology chronology10 = chronology9.withUTC();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        java.lang.String str12 = chronology10.toString();
        long long16 = chronology10.add((long) 32, (long) (-2731), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = chronology10.getDateTimeMillis(79200000, 32772, (int) '4', 15, (int) 'a', 20, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ISOChronology[UTC]" + "'", str12, "ISOChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-273068L) + "'", long16 == (-273068L));
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean9 = localTime7.isSupported(durationFieldType8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime7.minus(readablePeriod10);
        org.joda.time.LocalTime localTime13 = localTime7.plusSeconds(9);
        org.joda.time.Chronology chronology14 = localTime7.getChronology();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology14.add(readablePeriod15, (-2L), 1);
        long long22 = chronology14.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType4.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField25 = chronology14.dayOfYear();
        org.joda.time.DurationField durationField26 = chronology14.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(19, (int) (byte) 1, 292278993, (int) (byte) 100, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-2L) + "'", long18 == (-2L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 20L + "'", long22 == 20L);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        int int5 = dateTimeZone2.getStandardOffset((long) (short) 0);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(0L, dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localTime6.getValue(365);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 365");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.plus(readablePeriod2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology5 = null;
        boolean boolean6 = dateTimeFieldType4.isSupported(chronology5);
        boolean boolean7 = localDate3.isSupported(dateTimeFieldType4);
        int int8 = localDate3.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate3.withPeriodAdded(readablePeriod9, 2);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate13.minus(readablePeriod14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.minus(readablePeriod18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int23 = dateTime21.get(dateTimeFieldType22);
        boolean boolean24 = localDate3.isSupported(dateTimeFieldType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate26 = localDate3.withDayOfWeek(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 22 + "'", int23 == 22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        java.util.Date date4 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate7 = localDate1.withPeriodAdded(readablePeriod5, (-1));
        org.joda.time.LocalDate localDate9 = localDate1.minusYears(6);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1, chronology11);
        int int13 = localDateTime12.size();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDate1.compareTo((org.joda.time.ReadablePartial) localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguage("999");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 999 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.006' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644572950554,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.006,offset=6,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=10,MILLISECOND=560,ZONE_OFFSET=6,DST_OFFSET=0]");
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate6 = localDate1.withFieldAdded(durationFieldType4, (int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate1.year();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.withMaximumValue();
        org.joda.time.LocalDate localDate11 = property7.addToCopy(7);
        int int12 = localDate11.getDayOfYear();
        java.lang.String str13 = localDate11.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate11.withEra(4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2029-02-11" + "'", str13, "2029-02-11");
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        int int3 = timeZone0.getOffset((-2104009200000L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = timeZone0.getDisplayName(false, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("0022-02-11T00:00:00.000Z", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=0022-02-11t00:00:00.000z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setVariant("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ISOChronology[UTC] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        int int6 = localDateTime4.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusSeconds(8);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType9.getField(chronology10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean16 = localTime14.isSupported(durationFieldType15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime18 = localTime14.minus(readablePeriod17);
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.lang.String str21 = dateTimeField11.getAsShortText((org.joda.time.ReadablePartial) localTime18, (int) (short) -1, locale20);
        java.lang.String str22 = localTime18.toString();
        int int23 = localTime18.size();
        org.joda.time.LocalTime.Property property24 = localTime18.hourOfDay();
        org.joda.time.LocalTime localTime26 = property24.addNoWrapToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime28 = property24.setCopy(22);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            int int30 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localTime28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1" + "'", str21, "-1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00:00:00.000" + "'", str22, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setLanguageTag("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Coordinated Universal Time [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        int int5 = localDateTime4.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.plusSeconds((int) ' ');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays(9);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withSecondOfMinute(6);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withPeriodAdded(readablePeriod12, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withDate(59, 0, (-4));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        long long6 = java.util.Date.UTC(32770, 292278993, 622, (-4), (int) '4', 19);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 769651478715139000L + "'", long6 == 769651478715139000L);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readablePeriod15);
        org.joda.time.DateMidnight dateMidnight17 = dateTime16.toDateMidnight();
        org.joda.time.DateTime dateTime18 = dateTime16.withEarlierOffsetAtOverlap();
        boolean boolean19 = dateTime7.isBefore((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate21.minus(readablePeriod22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtMidnight(dateTimeZone24);
        boolean boolean26 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology31);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean34 = localTime32.isSupported(durationFieldType33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalTime localTime36 = localTime32.minus(readablePeriod35);
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.lang.String str39 = dateTimeField29.getAsShortText((org.joda.time.ReadablePartial) localTime36, (int) (short) -1, locale38);
        java.lang.String str40 = localTime36.toString();
        int int41 = localTime36.size();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology43);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime47 = localTime44.toDateTimeToday(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime47.getZone();
        int int50 = dateTimeZone48.getStandardOffset((long) 70);
        org.joda.time.DateTime dateTime51 = localTime36.toDateTimeToday(dateTimeZone48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((java.lang.Object) boolean26, dateTimeZone48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-1" + "'", str39, "-1");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "00:00:00.000" + "'", str40, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(dateTime51);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        org.joda.time.LocalTime localTime14 = localTime9.withSecondOfMinute(1);
        java.lang.Object obj15 = null;
        boolean boolean16 = localTime9.equals(obj15);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.lang.String str7 = timeZone6.getID();
        java.time.ZoneId zoneId8 = timeZone6.toZoneId();
        boolean boolean9 = dateTime5.equals((java.lang.Object) timeZone6);
        java.util.Date date16 = new java.util.Date(32, (int) (short) 0, 4, 15, 15, 3);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.fromDateFields(date16);
        boolean boolean18 = dateTime5.equals((java.lang.Object) date16);
        java.lang.Object obj19 = date16.clone();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Etc/UTC" + "'", str7, "Etc/UTC");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals(date16.toString(), "Mon Jan 04 15:15:03 UTC 1932");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "Mon Jan 04 15:15:03 UTC 1932");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "Mon Jan 04 15:15:03 UTC 1932");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "Mon Jan 04 15:15:03 UTC 1932");
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 86399);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localDate1.getValue(59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 59");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        int int5 = localDateTime4.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField7 = localDateTime4.getField((int) (short) 0);
        org.joda.time.Chronology chronology8 = localDateTime4.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withDayOfMonth((int) (short) 1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfWeek();
        int int12 = localDateTime10.getDayOfMonth();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??? (???????)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("2029-02-11");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(13, 4, 0, (int) 'u', 1970, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        int int14 = dateTimeField2.getMinimumValue(0L);
        long long17 = dateTimeField2.getDifferenceAsLong((long) (short) -1, (long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType19.getField(chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology23);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean26 = localTime24.isSupported(durationFieldType25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime28 = localTime24.minus(readablePeriod27);
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.lang.String str31 = dateTimeField21.getAsShortText((org.joda.time.ReadablePartial) localTime28, (int) (short) -1, locale30);
        java.lang.String str32 = dateTimeField2.getAsShortText((long) (short) -1, locale30);
        long long35 = dateTimeField2.addWrapField(0L, 53);
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        java.lang.String str39 = locale38.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            long long40 = dateTimeField2.set((long) 11, "1970", locale38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1" + "'", str31, "-1");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "999" + "'", str32, "999");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 53L + "'", long35 == 53L);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "fra" + "'", str39, "fra");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.minus(readablePeriod7);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds(9);
        org.joda.time.Chronology chronology11 = localTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.hourOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj1, chronology11);
        org.joda.time.DurationField durationField15 = chronology11.halfdays();
        org.joda.time.DurationField durationField16 = durationFieldType0.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField17 = chronology11.monthOfYear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate19.toDateTimeAtMidnight(dateTimeZone20);
        java.util.Date date22 = localDate19.toDate();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate25 = localDate19.withPeriodAdded(readablePeriod23, (-1));
        org.joda.time.LocalDate localDate27 = localDate19.minusYears(6);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology30);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean33 = localTime31.isSupported(durationFieldType32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime35 = localTime31.minus(readablePeriod34);
        org.joda.time.LocalTime localTime37 = localTime31.plusSeconds(9);
        org.joda.time.Chronology chronology38 = localTime31.getChronology();
        org.joda.time.Chronology chronology39 = chronology38.withUTC();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.era();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology42);
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean45 = localTime43.isSupported(durationFieldType44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalTime localTime47 = localTime43.minus(readablePeriod46);
        int[] intArray49 = chronology39.get((org.joda.time.ReadablePartial) localTime43, 1L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray51 = dateTimeField17.addWrapPartial((org.joda.time.ReadablePartial) localDate27, (int) (short) 10, intArray49, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 0, 1]");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(0, 2000, 1900, (-4));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.setScript("0");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 0 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar1.getLeastMaximum(86399);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 86399");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        int int12 = localDate11.getWeekOfWeekyear();
        int int13 = property8.compareTo((org.joda.time.ReadablePartial) localDate11);
        int int14 = localDate11.getEra();
        org.joda.time.LocalDate.Property property15 = localDate11.dayOfMonth();
        org.joda.time.LocalDate localDate16 = property15.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDate16.get(dateTimeFieldType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        calendar3.set(53, 2, 59);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar3.getMaximum(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32769");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.006,offset=6,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=53,MONTH=2,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=59,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=11,MILLISECOND=973,ZONE_OFFSET=6,DST_OFFSET=0]");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0);
        long long3 = calendar2.getTimeInMillis();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.lang.String str5 = timeZone4.getID();
        int int6 = timeZone4.getRawOffset();
        calendar2.setTimeZone(timeZone4);
        calendar2.setTimeInMillis((long) 32);
        calendar2.clear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromCalendarFields(calendar2);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.setWeekDate(4, 6, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 59");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=32,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=32,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1644572952029L + "'", long3 == 1644572952029L);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Etc/UTC" + "'", str5, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.LocalTime.Property property15 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime17 = property15.addNoWrapToCopy((int) (short) 1);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate19.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate24 = localDate19.withFieldAdded(durationFieldType22, (int) (short) 0);
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate28.toDateTimeAtMidnight(dateTimeZone29);
        java.util.Date date31 = localDate28.toDate();
        calendar26.setTime(date31);
        boolean boolean33 = localDate19.equals((java.lang.Object) calendar26);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDate localDate37 = localDate35.plus(readablePeriod36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology39 = null;
        boolean boolean40 = dateTimeFieldType38.isSupported(chronology39);
        boolean boolean41 = localDate37.isSupported(dateTimeFieldType38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(chronology42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDate localDate45 = localDate43.minus(readablePeriod44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.plusMillis(32772);
        org.joda.time.DateTime dateTime51 = dateTime47.withMillis((long) ' ');
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(chronology52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDate localDate55 = localDate53.plus(readablePeriod54);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology57 = null;
        boolean boolean58 = dateTimeFieldType56.isSupported(chronology57);
        boolean boolean59 = localDate55.isSupported(dateTimeFieldType56);
        int int60 = dateTime51.get(dateTimeFieldType56);
        boolean boolean61 = localDate37.isSupported(dateTimeFieldType56);
        int int62 = localDate19.get(dateTimeFieldType56);
        org.joda.time.LocalDate localDate64 = localDate19.withYearOfEra(23);
        // The following exception was thrown during execution in test generation
        try {
            int int65 = localTime17.compareTo((org.joda.time.ReadablePartial) localDate19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00:00:00.000" + "'", str13, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar26);
        org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 19 + "'", int60 == 19);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 20 + "'", int62 == 20);
        org.junit.Assert.assertNotNull(localDate64);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        int int2 = timeZone0.getRawOffset();
        boolean boolean3 = timeZone0.observesDaylightTime();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone0);
        java.lang.String str5 = calendar4.toString();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1644572952113,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=12,MILLISECOND=113,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.util.GregorianCalendar[time=1644572952113,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=12,MILLISECOND=113,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str5, "java.util.GregorianCalendar[time=1644572952113,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=12,MILLISECOND=113,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.hourOfDay();
        boolean boolean13 = dateTimeFieldType0.isSupported(chronology10);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(chronology10);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1, chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.year();
        int int21 = localDateTime19.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int24 = localDateTime19.get(dateTimeFieldType23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property25 = localTime14.property(dateTimeFieldType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 70 + "'", int21 == 70);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        int int6 = localDateTime4.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = property7.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfMonth(22);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withMonthOfYear(7);
        java.lang.Class<?> wildcardClass13 = localDateTime12.getClass();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.LocalDate localDate8 = localDate5.withField(dateTimeFieldType6, (int) 'a');
        org.joda.time.DateTime dateTime9 = localDate5.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDate5.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-2L) + "'", long4 == (-2L));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withWeekOfWeekyear(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.plusHours(5);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.monthOfYear();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField17 = localDateTime15.getField(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType18.getField(chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean25 = localTime23.isSupported(durationFieldType24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime27 = localTime23.minus(readablePeriod26);
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.lang.String str30 = dateTimeField20.getAsShortText((org.joda.time.ReadablePartial) localTime27, (int) (short) -1, locale29);
        java.lang.String str31 = localTime27.toString();
        int int32 = localTime27.size();
        org.joda.time.LocalTime.Property property33 = localTime27.hourOfDay();
        org.joda.time.LocalTime localTime35 = property33.addNoWrapToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime37 = property33.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.LocalTime localTime39 = property33.addWrapFieldToCopy((-292275054));
        org.joda.time.LocalTime localTime41 = property33.setCopy(23);
        int[] intArray44 = new int[] { 2022 };
        java.util.Locale.Category category46 = java.util.Locale.Category.FORMAT;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDate localDate50 = localDate48.minus(readablePeriod49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = localDate50.toDateTimeAtMidnight(dateTimeZone51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.DateTime dateTime54 = dateTime52.minus(readablePeriod53);
        org.joda.time.DateTime.Property property55 = dateTime54.year();
        java.util.Locale locale56 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str57 = property55.getAsShortText(locale56);
        java.lang.String str58 = locale56.getVariant();
        java.util.Locale.setDefault(category46, locale56);
        java.util.Locale locale60 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category46, locale60);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray62 = dateTimeField17.set((org.joda.time.ReadablePartial) localTime41, 999, intArray44, "1", locale60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 999");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1" + "'", str30, "-1");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "00:00:00.000" + "'", str31, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[2022]");
        org.junit.Assert.assertTrue("'" + category46 + "' != '" + java.util.Locale.Category.FORMAT + "'", category46.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "2022" + "'", str57, "2022");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "de_DE");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        java.util.TimeZone timeZone8 = calendar1.getTimeZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType11.getField(chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology15);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean18 = localTime16.isSupported(durationFieldType17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime20 = localTime16.minus(readablePeriod19);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localTime20, (int) (short) -1, locale22);
        java.lang.String str24 = localTime20.toString();
        int int25 = localTime20.size();
        org.joda.time.LocalTime.Property property26 = localTime20.hourOfDay();
        org.joda.time.LocalTime localTime28 = property26.addNoWrapToCopy((int) (short) 1);
        java.util.Locale locale30 = java.util.Locale.US;
        org.joda.time.LocalTime localTime31 = property26.setCopy("7", locale30);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap32 = calendar1.getDisplayNames(16, 9, locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1" + "'", str23, "-1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00:00:00.000" + "'", str24, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(localTime31);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withWeekOfWeekyear(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.plusHours(5);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.monthOfYear();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField17 = localDateTime15.getField(0);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(locale18);
        int int20 = dateTimeField17.getMaximumTextLength(locale18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate22.minus(readablePeriod23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.minus(readablePeriod27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.toDateTime(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime32.withWeekOfWeekyear((int) '4');
        org.joda.time.Chronology chronology35 = dateTime32.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) int20, chronology35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1644572952424,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=12,MILLISECOND=424,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(79200000, 1900, 79200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1900 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.plus(readablePeriod2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate1.withEra(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        int int3 = localDateTime2.size();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear(19);
        int int6 = localDateTime5.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withMillisOfDay(32772);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withDayOfMonth(622);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 622 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setExtension(' ', "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime13 = dateTime9.withDurationAdded((long) (short) 100, 35332195);
        org.joda.time.DateTime dateTime15 = dateTime13.plusWeeks(32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime13.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        java.util.Date date4 = localDate1.toDate();
        date4.setDate(0);
        date4.setMinutes((-1));
        int int9 = date4.getHours();
        int int10 = date4.getTimezoneOffset();
        int int11 = date4.getHours();
        java.lang.String str12 = date4.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sun Jan 30 23:59:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 23 + "'", int9 == 23);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 23 + "'", int11 == 23);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Sun Jan 30 23:59:00 UTC 2022" + "'", str12, "Sun Jan 30 23:59:00 UTC 2022");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.plus(readablePeriod2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate5.toDateTimeAtMidnight(dateTimeZone6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate10 = localDate5.withFieldAdded(durationFieldType8, (int) (short) 0);
        org.joda.time.LocalDate localDate12 = localDate3.withFieldAdded(durationFieldType8, 19);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.minus(readablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.minus(readablePeriod19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime22.withMonthOfYear(5);
        org.joda.time.DateTime.Property property27 = dateTime26.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long32 = dateTimeZone29.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str34 = dateTimeZone29.getNameKey(100L);
        org.joda.time.DateTime dateTime35 = dateTime26.withZoneRetainFields(dateTimeZone29);
        boolean boolean36 = dateTime35.isAfterNow();
        org.joda.time.DateTime dateTime37 = localDate3.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDate.Property property38 = localDate3.era();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology40);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean43 = localTime41.isSupported(durationFieldType42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalTime localTime45 = localTime41.minus(readablePeriod44);
        org.joda.time.LocalTime localTime47 = localTime41.plusSeconds(9);
        org.joda.time.Chronology chronology48 = localTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.hourOfDay();
        org.joda.time.DurationField durationField51 = chronology48.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((java.lang.Object) localDate3, chronology48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-2L) + "'", long32 == (-2L));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(durationField51);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtMidnight(dateTimeZone3);
        java.util.Date date5 = localDate2.toDate();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate7.minus(readablePeriod8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.minus(readablePeriod12);
        org.joda.time.DateTime.Property property14 = dateTime13.year();
        java.lang.String str15 = property14.getAsString();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        int int18 = localDate17.getWeekOfWeekyear();
        int int19 = property14.compareTo((org.joda.time.ReadablePartial) localDate17);
        int int20 = localDate17.getEra();
        org.joda.time.LocalDate.Property property21 = localDate17.dayOfMonth();
        java.util.Date date22 = localDate17.toDate();
        boolean boolean23 = date5.before(date22);
        java.util.Calendar.Builder builder24 = builder0.setInstant(date5);
        java.util.Calendar.Builder builder26 = builder0.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder29 = builder0.set(2, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022" + "'", str15, "2022");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfDay(0);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = localTime12.withSecondOfMinute((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("1992-01-01T00:00:00.010", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1992-01-01t00:00:00.010");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        int int5 = localDateTime4.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField7 = localDateTime4.getField((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withMillisOfDay(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDateTime9.toString("English");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 15);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone4 = dateTimeZone3.toTimeZone();
        int int6 = dateTimeZone3.getStandardOffset((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 15, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        java.util.TimeZone timeZone8 = calendar1.getTimeZone();
        calendar1.clear();
        calendar1.setTimeInMillis((long) (-292275054));
        calendar1.set(12, 1900, 52);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.setWeekDate(32769, 100, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=12,MONTH=1900,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=52,DAY_OF_YEAR=362,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=48,SECOND=44,MILLISECOND=946,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        java.util.TimeZone timeZone8 = calendar1.getTimeZone();
        calendar1.clear();
        calendar1.clear();
        calendar1.set((-2731), 2022, 32769, (int) (short) 1, 100, 12);
        int int19 = calendar1.getActualMaximum(3);
        java.util.TimeZone timeZone20 = calendar1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = calendar1.getActualMinimum(42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 42");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=-2731,MONTH=2022,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=32769,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=1,MINUTE=100,SECOND=12,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky:         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str4 = locale3.getDisplayScript();
        java.lang.String str5 = locale3.getDisplayName();
        java.lang.String str6 = timeZone0.getDisplayName(true, (int) (short) 0, locale3);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)" + "'", str5, "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Fri Feb 11 00:00:00 UTC 2022", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=frifeb1100:00:00utc2022");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set(16, 100, 52, (int) ' ', 59);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType8.getField(chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology12);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean15 = localTime13.isSupported(durationFieldType14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime17 = localTime13.minus(readablePeriod16);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = dateTimeField10.getAsShortText((org.joda.time.ReadablePartial) localTime17, (int) (short) -1, locale19);
        java.lang.String str21 = localTime17.toString();
        int int22 = localTime17.size();
        org.joda.time.LocalTime.Property property23 = localTime17.hourOfDay();
        org.joda.time.LocalTime localTime25 = property23.addNoWrapToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime26 = property23.withMinimumValue();
        boolean boolean27 = calendar1.equals((java.lang.Object) localTime26);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=16,MONTH=100,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=52,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=32,MINUTE=59,SECOND=13,MILLISECOND=542,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1" + "'", str20, "-1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "00:00:00.000" + "'", str21, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plus(readablePeriod9);
        int int11 = localDateTime10.getDayOfYear();
        org.joda.time.DateTime dateTime12 = localDateTime10.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDateTime10.getValue(79200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 79200000");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(622);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.plus(readablePeriod2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology5 = null;
        boolean boolean6 = dateTimeFieldType4.isSupported(chronology5);
        boolean boolean7 = localDate3.isSupported(dateTimeFieldType4);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.minus(readablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMillis(32772);
        org.joda.time.DateTime dateTime17 = dateTime13.withMillis((long) ' ');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate21 = localDate19.plus(readablePeriod20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology23 = null;
        boolean boolean24 = dateTimeFieldType22.isSupported(chronology23);
        boolean boolean25 = localDate21.isSupported(dateTimeFieldType22);
        int int26 = dateTime17.get(dateTimeFieldType22);
        boolean boolean27 = localDate3.isSupported(dateTimeFieldType22);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate29.toDateTimeAtMidnight(dateTimeZone30);
        boolean boolean32 = localDate3.isEqual((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.LocalDate localDate34 = localDate29.minusMonths(32770);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.minutes();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology38);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean41 = localTime39.isSupported(durationFieldType40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalTime localTime43 = localTime39.minus(readablePeriod42);
        org.joda.time.LocalTime localTime45 = localTime39.plusSeconds(9);
        org.joda.time.Chronology chronology46 = localTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.hourOfDay();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(obj36, chronology46);
        org.joda.time.DurationField durationField50 = chronology46.halfdays();
        org.joda.time.DurationField durationField51 = durationFieldType35.getField(chronology46);
        org.joda.time.DateTimeField dateTimeField52 = chronology46.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((java.lang.Object) localDate29, chronology46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 19 + "'", int26 == 19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 1);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        int int2 = timeZone0.getRawOffset();
        boolean boolean3 = timeZone0.observesDaylightTime();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone0);
        calendar4.clear(9);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean11 = localTime9.isSupported(durationFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime9.minus(readablePeriod12);
        org.joda.time.LocalTime localTime15 = localTime9.plusSeconds(9);
        org.joda.time.Chronology chronology16 = localTime9.getChronology();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(chronology16);
        org.joda.time.Chronology chronology18 = chronology16.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 9, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=?,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=13,MILLISECOND=688,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(2000, 0, 1286, (int) (short) -1, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.minus(readablePeriod7);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds(9);
        org.joda.time.Chronology chronology11 = localTime4.getChronology();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = chronology11.add(readablePeriod12, (-2L), 1);
        long long19 = chronology11.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType1.getField(chronology11);
        org.joda.time.DurationField durationField22 = chronology11.minutes();
        org.joda.time.DateTimeField dateTimeField23 = chronology11.yearOfEra();
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology11);
        org.joda.time.LocalTime localTime26 = localTime24.plusSeconds((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime28 = localTime26.withHourOfDay((-2731));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2731 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-2L) + "'", long15 == (-2L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 20L + "'", long19 == 20L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        java.lang.Object obj8 = date6.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "Fri Feb 11 00:00:00 UTC 2022");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "Fri Feb 11 00:00:00 UTC 2022");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        int int9 = dateMidnight8.getYear();
        boolean boolean10 = dateMidnight8.isBeforeNow();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition((long) 4);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localDateTime4.getField((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4L + "'", long3 == 4L);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        int int5 = localDateTime4.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.plusSeconds((int) ' ');
        int int8 = localDateTime4.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.minusSeconds((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField12 = localDateTime10.getField(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 15");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder5 = builder2.setLanguage("");
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale10 = builder8.build();
        java.util.Locale.Builder builder11 = builder5.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setLanguageTag("weekyears");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: weekyears [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("Mon Jan 10 01:02:00 UTC 1916", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.Chronology chronology6 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long11 = dateTimeZone9.nextTransition((long) 4);
        org.joda.time.Chronology chronology12 = chronology6.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = chronology6.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = chronology6.getDateTimeMillis((int) (short) 100, (int) (short) -1, 32772, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4L + "'", long11 == 4L);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.era();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime11 = dateTime7.minus(0L);
        int int12 = dateTime11.getWeekyear();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
    }
}
